package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Character getMiddleCharacter(String string) {
        int middle = string.length() / 2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (i == str.length()/2) {
                result = result.concat(String.valueOf(str.toUpperCase().charAt(i)));
            } else {
                result = result.concat(String.valueOf(str.charAt(i)));
            }
        }

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}