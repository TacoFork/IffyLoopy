import java.util.Scanner;
public class IffyLoopy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String storage = "";
        for (int index = 1; index <= 5; index++){
            System.out.print("Enter a String: ");
            storage += keyboard.next() + " ";
        }
        System.out.println(storage);

        boolean redEyes;
        String response = "";
        while (!response.equals("n")){
            System.out.print("Are your eyes red?: ");
            String eyes = keyboard.next().toLowerCase();
            if (eyes.equals("y") || eyes.equals("yes")){
                System.out.println("Get some sleep!");
            }
            else{
                System.out.println("You look great!");
            }
            System.out.print("Do you want to try again?: ");
            response = keyboard.next().toLowerCase();
        }
    }
}
