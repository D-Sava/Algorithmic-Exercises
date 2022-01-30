public class Exercise003 {

    //Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

    static String removeExclamationMarks(String s) {
        return s.replaceAll("[!]", "");
    }
}
