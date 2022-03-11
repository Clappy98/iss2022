package issLab.radarSystem.domain.interfaces;

public interface ISonar extends IDevice{

    public void activate();

    public void deactivate();

    public boolean isActive();

    public IDistance getDistance();
}
