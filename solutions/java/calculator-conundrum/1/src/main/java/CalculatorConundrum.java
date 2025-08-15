class CalculatorConundrum {
  public String calculate(int operand1, int operand2, String operation) {
    String result = "" + operand1 + " " + operation + " " + operand2 + " = ";
    int calculation;
    switch (operation) {
      case "+":
        calculation = operand1 + operand2;
        return result + calculation;
      case "*":
        calculation = operand1 * operand2;
        return result + calculation;
      case "/":
        try {
          calculation = operand1 / operand2;
          return result + calculation;
        } catch (ArithmeticException e) {
          throw new IllegalOperationException("Division by zero is not allowed", e);
        }
      case null:
        throw new IllegalArgumentException("Operation cannot be null");
      case "":
        throw new IllegalArgumentException("Operation cannot be empty");
      default:
        String errorMessage = "Operation '" + operation + "' does not exist";
        throw new IllegalOperationException(errorMessage);
    }
  }
}
