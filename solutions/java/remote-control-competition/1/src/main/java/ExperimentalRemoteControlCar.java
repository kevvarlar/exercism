public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int totalDistanceTravelled;

    public void drive() {
        totalDistanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }
}
