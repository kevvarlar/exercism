class ResistorColor {

  private final String[] arrayOfColorCodes =
      new String[] {
        "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
      };

  int colorCode(String color) {
    for (int i = 0; i < arrayOfColorCodes.length; i++) {
      if (arrayOfColorCodes[i] == color) {
        return i;
      }
    }
    return -1;
  }

  String[] colors() {
    return arrayOfColorCodes;
  }
}
