package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strgs = {"flower", "flow", "floight"};
        System.out.println(longestCommonPrefix(strgs));
    }

    public static String longestCommonPrefix(String[] strs) {

        int len = strs.length;
        String temp = "";
        if (len == 0) {
            return "";
        } else if (len == 1) {
            return strs[0];
        } else {

            String strZero = strs[0];
            boolean isContains = false;
            for (int i = 0; i < strZero.length(); i++) {
                temp = strZero.substring(0, i + 1);
                for (int j = 1; j < len; j++) {
                    if (strs[j].startsWith(temp)) {
                        isContains = true;
                    } else {
                        isContains = false;
                        break;
                    }
                }
                if (!isContains) {
                    temp = temp.substring(0, temp.length() - 1);
                    break;
                }
            }
            return temp;
        }


    }
}
