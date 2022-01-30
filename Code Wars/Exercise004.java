public class Exercise004 {

    //Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

    //doubleChar("String") ==> "SSttrriinngg"

    //doubleChar("Hello World") ==> "HHeelllloo  WWoorrlldd"

    //doubleChar("1234!_ ") ==> "11223344!!__  "

    //Good Luck!

    public static String doubleChar(String s){

        String string = "";
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++){
            string += array[i];
            string += array[i];
        }

        return string;
    }
}
