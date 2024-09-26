import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your age");
            int age=0;

            if(in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine();
            }

            if (age>=21){
                System.out.println("You get a wrist band");
            }


            else{
                System.out.println("You do not get a wrist band");
            }
    }
}