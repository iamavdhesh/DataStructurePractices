package easy;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println("Number is palindrome or not: "+isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        if(x<0)
            return false;
        if(x<10)
            return true;
        else{
            int tempNumber=x;
            int revNum=0;
            while(x!=0){
                revNum=revNum*10+x%10;
                x/=10;
            }
            return tempNumber==revNum;
        }
    }
}
