import java.util.Scanner;

public class NumberList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (enter -1 to stop):");
        
        int number;
        do {
            number = scanner.nextInt();
            if (number != -1) {
                System.out.println("You entered: " + number);
            }
        } while (number != -1);
        
        System.out.println("End of input.");
        
        scanner.close();
    }
}
