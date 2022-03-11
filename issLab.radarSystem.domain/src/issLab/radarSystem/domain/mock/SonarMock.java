package issLab.radarSystem.domain.mock;

import issLab.radarSystem.domain.Distance;
import issLab.radarSystem.domain.interfaces.IDistance;
import issLab.radarSystem.domain.interfaces.ISonar;
import issLab.radarSystem.domain.utils.BasicUtils;

public class SonarMock implements ISonar {
    private boolean state = false;
    private IDistance distance = new Distance(90);
    private Thread updateStateThread;

    @Override
    public void activate() {
        this.state = true;

        updateStateThread = new Thread(){
            @Override
            public void run() {
                int d;

                while(! Thread.currentThread().isInterrupted() && distance.getVal()>0){
                    d = distance.getVal() - 1;
                    distance = new Distance(d);
                }
            }
        };

        updateStateThread.start();
    }

    @Override
    public void deactivate() {
        this.state = false;

        updateStateThread.interrupt();
        distance = new Distance(90);
    }

    @Override
    public boolean isActive() {
        return this.state;
    }

    @Override
    public IDistance getDistance() {
        return distance;
    }
}
