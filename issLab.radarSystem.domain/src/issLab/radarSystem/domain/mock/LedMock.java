package issLab.radarSystem.domain.mock;

import issLab.radarSystem.domain.interfaces.ILed;
import issLab.radarSystem.domain.models.LedModel;
import issLab.radarSystem.domain.utils.ColorsOut;

public class LedMock extends LedModel implements ILed {
    @Override
    protected void ledActivate(boolean val) {
        ColorsOut.outappl("LedMock state=" + getState(), ColorsOut.MAGENTA );
    }
}
