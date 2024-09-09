
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 7) {
            System.out.println("Main Menu:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("You selected Movies.");

                    break;
                case 2:
                    System.out.println("You selected Series.");

                    break;
                case 3:
                    System.out.println("You selected Books.");


                    break;
                case 4:
                    System.out.println("You selected Magazines.");

                    break;
                case 5:
                    System.out.println("You selected Report.");

                    break;
                case 6:
                    System.out.println("You selected Report Today.");

                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
