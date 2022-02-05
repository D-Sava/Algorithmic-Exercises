import java.util.Arrays;

public class Exercise010 {

    //You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
    //
    //The returned value must be a string, and have "***" between each of its letters.
    //
    //You should not remove or add elements from/to the array.

    public static String twoSort(String[] s) {

        String result = "";
        Arrays.sort(s);
        String firstElement = s[0].toLowerCase();

        for(int i = 0; i < firstElement.length(); i++){
            result += firstElement.charAt(i) + "***";
        }

        return result.substring(0,result.length()-3);
    }
}
