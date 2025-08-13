class NeedForSpeed {
  public int speed;
  public int batteryDrain;
  private int batteryPercentage = 100;
  private int totalDistance = 0;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return batteryPercentage < batteryDrain;
  }

  public int distanceDriven() {
    return totalDistance;
  }

  public void drive() {
    if (!batteryDrained()) {
      totalDistance += speed;
      batteryPercentage -= batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  private int distance;

  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    return this.distance <= car.speed * 100 / car.batteryDrain;
  }
}
