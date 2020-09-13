package interview;

/***
 * Gaana.com assignment question
 * */

public class FindOccurrences {
    public static String result;
    public static void main(String[] args) {
        System.out.println(findOccurrence("abcdefabcd", "ab", "cd", "e"));
    }

    private static int findOccurrence(String input1, String input2, String input3, String input4) {

        result =input1;

        boolean checking = true;
        do {

            if (result.contains(input2))
                result = result.replaceAll(input2, "");
            else if (result.contains(input3))
                result = result.replaceAll(input3, "");
            else if (result.contains(input4))
                result = result.replaceAll(input4, "");
            else
                checking = false;

        } while (checking);

        return result.length();


    }


}
