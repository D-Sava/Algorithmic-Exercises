public class Main {

    public static void main(String[] args) {

        String[] stringArray01 = {"Part1", "Part2"};
        String[] stringArray02 = {"ABC", "DEF"};

        int[] integerArray01 = {1,3,5,7};
        int[] integerArray02 = {2,4,6,8};

        char[] charArray01 = {'a', 'b', 'c'};
        char[] charArray02 = {'d', 'e', 'f'};

        //Exercises > 8 kyu: Beginner Series #1 School Paperwork TODO#001 - DONE.
        System.out.println("EXERCISE #1 - Output:\n");
        System.out.println(Exercise001.paperWork(5,5));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Opposites Attract TODO#002 - DONE.
        System.out.println("EXERCISE #2 - Output:\n");
        System.out.println(Exercise002.isLove(1,4));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Remove exclamation marks TODO#003 - DONE.
        System.out.println("EXERCISE #3 - Output:\n");
        System.out.println(Exercise003.removeExclamationMarks("aisjd! iasjdi! asjd"));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Double Char TODO#004 - DONE.
        System.out.println("EXERCISE #4 - Output:\n");
        System.out.println(Exercise004.doubleChar("Car!"));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Thinkful - Logic Drills: Traffic light TODO#005 - DONE.
        System.out.println("EXERCISE #5 - Output:\n");
        System.out.println(Exercise005.updateLight("yellow"));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Count Odd Numbers below n TODO#006 - DONE.
        System.out.println("EXERCISE #6 - Output:\n");
        System.out.println(Exercise006.oddCount(7));
        System.out.println("\nSuccess!\n");

        //Exercises > 8 kyu: Keep up the hoop TODO#007 - DONE.
        System.out.println("EXERCISE #7 - Output:\n");
        System.out.println(Exercise007.hoopCount(3));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Twice as old TODO#008 - DONE.
        System.out.println("EXERCISE #8 - Output:\n");
        System.out.println(Exercise008.TwiceAsOld(30,7));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Third Angle of a Triangle TODO#009 - DONE.
        System.out.println("EXERCISE #9 - Output:\n");
        System.out.println(Exercise009.otherAngle(30,40));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Sort and Star TODO#010 - DONE.
        System.out.println("EXERCISE #10 - Output:\n");
        System.out.println(Exercise010.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Unfinished Loop - Bug Fixing #1 TODO#011 - DONE.
        System.out.println("EXERCISE #11 - Output:\n");
        System.out.println(Exercise011.CreateList(1));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Difference of Volumes of Cuboids TODO#012 - DONE.
        System.out.println("EXERCISE #12 - Output:\n");
        System.out.println(Exercise012.findDifference(new int[] {3,5,7}, new int[] {5,7,8}));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Cat years, Dog years TODO#013 - DONE.
        System.out.println("EXERCISE #13 - Output:\n");
        System.out.println(Exercise013.humanYearsCatYearsDogYears(7));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: My head is at the wrong end! TODO#014 - DONE.
        System.out.println("EXERCISE #14 - Output:\n");
        System.out.println(Exercise014.fixTheMeerkat(new String[]{"three", "two", "one"}));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Get Nth Even Number TODO#015 - DONE.
        System.out.println("EXERCISE #15 - Output:\n");
        System.out.println(Exercise015.nthEven(1988));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: Well of Ideas - Easy Version TODO#016 - DONE.
        System.out.println("EXERCISE #16 - Output:\n");
        System.out.println(Exercise016.well(new String[] {"bad", "bad", "bad"}));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 8 kyu: To square(root) or not to square(root) TODO#017 - WORK IN PROGRESS!
        System.out.println("EXERCISE #17 - Output:\n");
        System.out.println(Exercise017.squareOrSquareRoot(new int[] { 100, 101, 5, 5, 1, 1 }));
        System.out.println("\nSuccess!\n");
        System.out.println("---------------------------------\n");

        //Exercises > 0 kyu: TEMPLATE TODO#000 - WORK IN PROGRESS!
        //System.out.println("EXERCISE #000 - Output:\n");
        //System.out.println(Exercise000);
        //System.out.println("\nSuccess!\n");
        //System.out.println("---------------------------------\n");

    }
}
