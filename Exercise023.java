import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise023 {

    //Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
    //Examples:
    //
    //a = "xyaabbbccccdefww"
    //b = "xxxxyyyyabklmopq"
    //longest(a, b) -> "abcdefklmopqwxy"
    //
    //a = "abcdefghijklmnopqrstuvwxyz"
    //longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

    public static String longest (String s1, String s2) {

        char[] array = s1.concat(s2).toCharArray();

        Arrays.sort(array);

        String result = array.
        System.out.println(result);
        return "";
    }
}
