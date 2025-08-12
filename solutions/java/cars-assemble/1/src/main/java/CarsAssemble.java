public class CarsAssemble {

  private static final int baseProductionRate = 221;

  public double productionRatePerHour(int speed) {
    int ratePerHour = baseProductionRate * speed;
    if (speed >= 0 && speed <= 4) {
      return ratePerHour;
    } else if (speed >= 5 && speed <= 8) {
      return ratePerHour * 0.9;
    } else if (speed == 9) {
      return ratePerHour * 0.8;
    } else if (speed == 10) {
      return ratePerHour * 0.77;
    }
    return 0;
  }

  public int workingItemsPerMinute(int speed) {
    int ratePerMinute = (baseProductionRate * speed) / 60;
    if (speed >= 0 && speed <= 4) {
      return ratePerMinute;
    } else if (speed >= 5 && speed <= 8) {
      return (int) Math.floor(ratePerMinute * 0.9);
    } else if (speed == 9) {
      return (int) Math.floor(ratePerMinute * 0.8);
    } else if (speed == 10) {
      return (int) Math.floor(ratePerMinute * 0.77);
    }
    return 0;
  }
}
