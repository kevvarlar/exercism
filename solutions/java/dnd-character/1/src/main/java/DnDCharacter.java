import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

  private int strength = 0,
      dexterity = 0,
      constitution = 0,
      intelligence = 0,
      wisdom = 0,
      charisma = 0;

  int ability(List<Integer> scores) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for (Integer roll : scores) {
      if (roll < min) {
        min = roll;
      }
      sum += roll;
    }
    return sum - min;
  }

  List<Integer> rollDice() {
    Random random = new Random();
    List<Integer> dice = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      dice.add(random.nextInt(6) + 1);
    }
    return dice;
  }

  int modifier(int input) {
    return Math.floorDiv(input - 10, 2);
  }

  int getStrength() {
    if (strength == 0) {
      strength = ability(rollDice());
    }
    return strength;
  }

  int getDexterity() {
    if (dexterity == 0) {
      dexterity = ability(rollDice());
    }
    return dexterity;
  }

  int getConstitution() {
    if (constitution == 0) {
      constitution = ability(rollDice());
    }
    return constitution;
  }

  int getIntelligence() {
    if (intelligence == 0) {
      intelligence = ability(rollDice());
    }
    return intelligence;
  }

  int getWisdom() {
    if (wisdom == 0) {
      wisdom = ability(rollDice());
    }
    return wisdom;
  }

  int getCharisma() {
    if (charisma == 0) {
      charisma = ability(rollDice());
    }
    return charisma;
  }

  int getHitpoints() {
    return 10 + modifier(getConstitution());
  }
}
