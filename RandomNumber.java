import java.util.Random;

public class randomnumber {

    public static void main(String[] args) {
        
        Random r = new Random();

          int a =  r.nextInt(1,6);
        //Double a =  r.nextDouble(1,6);
        //Boolean a =  r.nextBoolean();

        System.out.println(a);
    }

    
}
