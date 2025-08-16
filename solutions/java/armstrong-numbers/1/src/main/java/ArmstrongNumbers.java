class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    String digits = Integer.toString(numberToCheck);
    int sum = 0;
    for (int i = 0; i < digits.length(); i++) {
      sum += Math.pow(digits.charAt(i) - '0', digits.length());
    }
    return sum == numberToCheck;
  }
}
