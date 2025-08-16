class Darts {
  boolean isInsideCircle(double x, double y, int radius) {
    double distance = Math.sqrt(x * x + y * y);
    return distance <= radius;
  }

  int score(double xOfDart, double yOfDart) {
    if (isInsideCircle(xOfDart, yOfDart, 1)) {
      return 10;
    } else if (isInsideCircle(xOfDart, yOfDart, 5)) {
      return 5;
    } else if (isInsideCircle(xOfDart, yOfDart, 10)) {
      return 1;
    }
    return 0;
  }
}
