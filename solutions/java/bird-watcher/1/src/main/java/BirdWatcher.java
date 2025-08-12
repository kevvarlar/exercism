class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return birdsPerDay;
  }

  public int getToday() {
    return this.birdsPerDay[this.birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
  }

  public boolean hasDayWithoutBirds() {
    for (int bird : this.birdsPerDay) {
      if (bird == 0) {
        return true;
      }
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    if (numberOfDays > this.birdsPerDay.length) {
      numberOfDays = this.birdsPerDay.length;
    }
    int sum = 0;
    for (int i = 0; i < numberOfDays; i++) {
      sum += this.birdsPerDay[i];
    }
    return sum;
  }

  public int getBusyDays() {
    int count = 0;
    for (int bird : this.birdsPerDay) {
      if (bird >= 5) {
        count++;
      }
    }
    return count;
  }
}
