public class JedliksToyCar {
    private int totalDistanceDriven;
    private int batteryCharge = 100;
  
    public static JedliksToyCar buy() {
      return new JedliksToyCar();
    }

    public String distanceDisplay() {
      return "Driven " + totalDistanceDriven + " meters"; 
    }

    public String batteryDisplay() {
      if (batteryCharge == 0) {
        return "Battery empty";
      }
      return "Battery at " + batteryCharge + "%";
    }

    public void drive() {
      if (batteryCharge == 0) {
        return;
      }
      totalDistanceDriven += 20;
      batteryCharge -= 1;
    }
}
