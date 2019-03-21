package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str){
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if (VowelUtils.startsWithVowel(word)){
                builder.append(word + "way" + " ");
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == null) {
                    builder.append(word + "ay" + " ");
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    String finalWord = ending + beginning + "ay";
                    builder.append(finalWord + " ");
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
    /*private char[] merge(char[] array1, char[] array2) {
        char[] mergedArray = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }
    public String translate(String str) {
        char[] stringArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        Integer startingInt = 0;
        if (!str.matches("[a-zA-Z]")){
            return null;
        } else if (!str.contains("[a,e,i,o,u,A,E,I,O,U]")){
            return str + "ay";
        } else if (stringArray[0] == 'a' || stringArray[0] == 'e' || stringArray[0] == 'i' ||stringArray[0] == 'o' ||stringArray[0] ==  'u') {
            for (char c: stringArray) {
                builder.append(c);
            }
            builder.append("way");
        } else {
            char[] rotatedArray = new char[stringArray.length];
            for(int i = 0; i < stringArray.length; i++){
                if (stringArray[i] == 'a' || stringArray[i] == 'e' || stringArray[i] == 'i' ||stringArray[i] == 'o' ||stringArray[i] ==  'u'){
                    startingInt = i;
                    break;
                }
            }
            char[] arrayFirstHalf = Arrays.copyOfRange(stringArray, startingInt, stringArray.length);
            char[] arraySecondHalf = Arrays.copyOfRange(stringArray, 0, startingInt);
            rotatedArray = merge(arrayFirstHalf, arraySecondHalf);
            for (char c : rotatedArray){
                builder.append(c);
            }
            builder.append("ay");
        }
        return builder.toString();
    }
    */
}
