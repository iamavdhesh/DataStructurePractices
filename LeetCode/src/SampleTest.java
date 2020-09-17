public class SampleTest {



    public static void main(String[] args) {

    showNumbers(100);



    }

    public static int showNumbers(int number){
        number--;
        if(number==0){
            System.out.println("Thanks for your valuable time");
            return -1;
        }else{
            System.out.println("Hi Your number is"+showNumbers(number));
        }


        return number;

    }

    
}
