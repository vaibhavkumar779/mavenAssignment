import java.util.Scanner;

public class Application {

    public static void main(String args[]) {
        System.out.println("Enter a string :");
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringFunction sf = new StringFunction();
        do {
            System.out.println("\nPress 1 to reverse the string: \nPress 2 to find length of string: \npress 0 to Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Reverse of string : ");
                    sf.reverseString(str);
                    break;
                case 2:
                    System.out.print("Length of string : ");
                    sf.lengthOfString(str);
                    break;
                case 0:
                    cont = 0;
                    break;
                default:
                    System.out.println("wrong choice entered by user:");
            }
        } while (cont == 1);
    }
}