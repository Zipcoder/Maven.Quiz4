package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuffer result = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            int mid = str.length() / 2;
            result.setCharAt(mid, Character.toUpperCase(str.charAt(mid)));
        }
        return result.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuffer result = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            int mid = str.length() / 2;
            result.setCharAt(mid, Character.toLowerCase(str.charAt(mid)));
        }
        return result.toString();
    }

    public static Boolean isIsogram(String str) {
        int length = str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i - 1) + str.substring(i + 1);
                i = 0;
            }
        }
        return str;
    }

    public static String invertCasing(String str) {
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }
        }
        return new String(array);
    }
}