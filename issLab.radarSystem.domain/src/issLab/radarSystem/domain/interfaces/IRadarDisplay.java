package issLab.radarSystem.domain.interfaces;

public interface IRadarDisplay extends IDevice{

    public void update(String distance, String angle);

    public int getCurDistance();
}
