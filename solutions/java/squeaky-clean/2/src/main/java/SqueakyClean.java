import java.lang.StringBuilder;
class SqueakyClean {
    static String clean(String identifier) {
      StringBuilder result = new StringBuilder(identifier);
      int length = result.length();
      for (int i = 0; i < length; i++) {
        switch (result.charAt(i)) {
          case ' ':
            result.setCharAt(i, '_');
            break;
          case '-':
            result.deleteCharAt(i);
            result.replace(i, i+1, String.valueOf(Character.toUpperCase(result.charAt(i))));
            length--;
            i--;
            break;
          case '0':
            result.replace(i, i+1, "o");
            break; 
          case '1':
            result.replace(i, i+1, "l");
            break;
          case '3':
            result.replace(i, i+1, "e");
            break;
          case '4':
            result.replace(i, i+1, "a");
            break;
          case '7':
            result.replace(i, i+1, "t");
            break;
          default:
            if (!(Character.isLetter(result.charAt(i)))) {
              result.deleteCharAt(i);
              length--;
              i--;
            }
            break;
        }
      }
      return result.toString();
    }
}
