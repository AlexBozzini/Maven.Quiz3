package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++){
           if (i == indexToCapitalize){
               String ch = Character.toString(charArray[i]);
               builder.append(ch.toUpperCase());
           } else {
               builder.append(charArray[i]);
           }
        }
        return builder.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (characterToCheckFor.equals(baseString.charAt(indexOfString)));
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
