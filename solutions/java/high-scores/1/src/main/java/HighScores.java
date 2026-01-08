import java.util.Comparator;
import java.util.List;

class HighScores {

  private List<Integer> highScores;

  public HighScores(List<Integer> highScores) {
    this.highScores = highScores;
  }

  List<Integer> scores() {
    return highScores;
  }

  Integer latest() {
    return highScores.get(highScores.size() - 1);
  }

  Integer personalBest() {
    int max = -1;
    for (Integer score : highScores) {
      if (score > max) {
        max = score;
      }
    }
    return max;
  }

  List<Integer> personalTopThree() {

    return highScores.stream()
        .sorted(Comparator.reverseOrder())
        .toList()
        .subList(0, highScores.size() < 3 ? highScores.size() : 3);
  }
}
