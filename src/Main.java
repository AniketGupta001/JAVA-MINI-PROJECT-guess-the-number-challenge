import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Let’s create a project where we are trying to ask the user to guess a randomly generated number.
        The number is in the range of 1 to 100.*/

        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);

        int userNumber = 0 ;
        do {
            System.out.println("Guess the number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("woohoo ... correct number !!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("its too large");
            } else {
                System.out.println("its too small");
            }
           }while(userNumber >= 0);

            System.out.print("my number was : ");
            System.out.println(myNumber);

    }
}