package issLab.radarSystem.domain.models;

import issLab.radarSystem.domain.concrete.LedConcrete;
import issLab.radarSystem.domain.interfaces.ILed;
import issLab.radarSystem.domain.mock.LedMock;
import issLab.radarSystem.domain.utils.ColorsOut;
import issLab.radarSystem.domain.utils.DomainSystemConfig;

public abstract class LedModel implements ILed {
    private boolean state = false;

    public static ILed create() {
        ILed led ;
        if( DomainSystemConfig.simulation ){
            led = createLedMock();
        }else{
            led = createLedConcrete();
        }

        return led;
    }

    public static ILed createLedMock() {
        return new LedMock();

    }
    public static ILed createLedConcrete() {
        ColorsOut.out("createLedConcrete", ColorsOut.BLUE);
        return new LedConcrete();
    }

    protected abstract void ledActivate( boolean val);

    protected void setState( boolean val ) {
        state = val;
        ledActivate( state );
    }

    @Override
    public void turnOn(){
        setState( true );
    }

    @Override
    public void turnOff() {
        setState(  false );
    }

    @Override
    public boolean getState(){
        return state;
    }
}
