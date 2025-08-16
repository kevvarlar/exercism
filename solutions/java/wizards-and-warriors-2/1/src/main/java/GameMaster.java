public class GameMaster {

  public String describe(Character character) {
    return "You're a level "
        + character.getLevel()
        + " "
        + character.getCharacterClass()
        + " with "
        + character.getHitPoints()
        + " hit points.";
  }

  public String describe(Destination destination) {
    return "You've arrived at "
        + destination.getName()
        + ", which has "
        + destination.getInhabitants()
        + " inhabitants.";
  }

  public String describe(TravelMethod travelMethod) {
    switch (travelMethod) {
      case HORSEBACK:
        return "You're traveling to your destination on horseback.";
      case WALKING:
      default:
        return "You're traveling to your destination by walking.";
    }
  }

  public String describe(Character character, Destination destination, TravelMethod travelMethod) {
    switch (travelMethod) {
      case HORSEBACK:
        return "You're a level "
            + character.getLevel()
            + " "
            + character.getCharacterClass()
            + " with "
            + character.getHitPoints()
            + " hit points. "
            + "You're traveling to your destination on horseback. "
            + "You've arrived at "
            + destination.getName()
            + ", which has "
            + destination.getInhabitants()
            + " inhabitants.";
      case WALKING:
      default:
        return "You're a level "
            + character.getLevel()
            + " "
            + character.getCharacterClass()
            + " with "
            + character.getHitPoints()
            + " hit points. "
            + "You're traveling to your destination by walking. "
            + "You've arrived at "
            + destination.getName()
            + ", which has "
            + destination.getInhabitants()
            + " inhabitants.";
    }
  }

  public String describe(Character character, Destination destination) {
    return "You're a level "
        + character.getLevel()
        + " "
        + character.getCharacterClass()
        + " with "
        + character.getHitPoints()
        + " hit points. "
        + "You're traveling to your destination by walking. "
        + "You've arrived at "
        + destination.getName()
        + ", which has "
        + destination.getInhabitants()
        + " inhabitants.";
  }
}
