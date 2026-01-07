import java.math.BigInteger;

class Grains {

  BigInteger grainsOnSquare(final int square) throws IllegalArgumentException {
    if (square < 1 || square > 64) {
      throw new IllegalArgumentException("square must be between 1 and 64");
    }
    BigInteger total = new BigInteger("1");
    for (int i = 1; i < square; i++) {
      total = total.multiply(new BigInteger("2"));
    }
    return total;
  }

  BigInteger grainsOnBoard() {
    BigInteger sum = new BigInteger("0");
    for (int i = 1; i <= 64; i++) {
      sum = sum.add(grainsOnSquare(i));
    }
    return sum;
  }
}
