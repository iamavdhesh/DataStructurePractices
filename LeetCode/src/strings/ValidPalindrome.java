package strings;

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    /*
    Fasted solution
    public boolean isPalindrome(String s) {
        //two pointer
        int start = 0, end = s.length() - 1;
        while (start < end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            } else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }*/

    /*
    Optimised memory manged
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < s.length() && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            if(left == s.length()){
                return true;
            }

            while(right >= 0 && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                break;
            }else{
                left++;
                right--;
            }
        }
        return right <= left;
    }*/

    /*Mine Submission*/
    public boolean isPalindrome(String s) {
        StringBuffer strBuffer=new StringBuffer();

        for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);
            if(Character.isLetterOrDigit(ch))
            {
                strBuffer.append(ch);
            }
        }
        String str=strBuffer.toString()+"";
        strBuffer.reverse();

        return str.equalsIgnoreCase(strBuffer.toString());


    }
}
