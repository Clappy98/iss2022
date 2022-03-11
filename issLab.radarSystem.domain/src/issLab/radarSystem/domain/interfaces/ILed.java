package issLab.radarSystem.domain.interfaces;

public interface ILed extends IDevice{

    public void turnOn();

    public void turnOff();

    public boolean getState();
}
