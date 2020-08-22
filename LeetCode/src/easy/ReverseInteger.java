package easy;

public class ReverseInteger {


    public static void main(String[] args) {

        System.out.println("Number: "+reverse(12345));

    }

    public static int reverse(int x) {

        int isNeg=1;
        if(x<0){
            isNeg=-1;
            x*=-1;
        }
        int reversed=0;
        while(x>0){

            if(reversed>Integer.MAX_VALUE/10 )
                return 0;
            reversed=(reversed*10)+x%10;
            x=x/10;
        }


        return reversed*isNeg;

    }


}
