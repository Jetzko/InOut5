import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a new Scanner
        System.out.println("Enter your age:");
        int age = input.nextInt(); // read the integer number input from user
        System.out.println("Your age is: " + age);

        input.close(); // close the scanner (do not read anymore the user input)


    }
}
