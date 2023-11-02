import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>  result=new ArrayList<Integer>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                boolean continueMenu = true;

                while (continueMenu) {

                        System.out.println("\nMenu:");
                    System.out.println("1. Enter 1 to addition the numbers");
                    System.out.println("2. Enter 2 to subtraction the numbers");
                    System.out.println("3. Enter 3 to multiplication the number");
                    System.out.println("4. Enter 4 to division the numbers");
                    System.out.println("5. Enter 5 to modulus the numbers");
                    System.out.println("6. Enter 6 to find minimum number");
                    System.out.println("7. Enter 7 to find maximum number");
                    System.out.println("8. Enter 8 to find the average of numbers");
                    System.out.println("9. Enter 9 to print the last result in calculator");
                    System.out.println("10.Enter 10 to print the list of all results in calculator");
                    System.out.println("11. Enter 11 to exit");

                    System.out.print("Enter your choice: ");


scanner.next();
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                try {

                                    System.out.println("please enter the number 1:");
                                    int num1C1 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C1 = scanner.nextInt();

                                    add(num1C1, num2C1);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }

                                break;
                            case 2:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C2 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C2 = scanner.nextInt();
                                    sub(num1C2, num2C2);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;

                            case 3:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C3 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C3 = scanner.nextInt();
                                    mul(num1C3, num2C3);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;

                            case 4:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C4 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C4 = scanner.nextInt();
                                    divi(num1C4, num2C4);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;

                            case 5:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C5 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C5 = scanner.nextInt();

                                    mod(num1C5, num2C5);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;
                            case 6:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C6 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C6 = scanner.nextInt();
                                    mini(num1C6, num2C6);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;
                            case 7:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C7 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C7 = scanner.nextInt();
                                    max(num1C7, num2C7);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;
                            case 8:
                                try {
                                    System.out.println("please enter the number 1:");
                                    int num1C8 = scanner.nextInt();
                                    System.out.println("please enter the number 2:");
                                    int num2C8 = scanner.nextInt();
                                    aver(num1C8, num2C8);
                                } catch (InputMismatchException e) {
                                    System.out.println("please enter number format ");

                                }
                                break;
                            case 9:
                                System.out.println(result.get(result.size() - 1));
                                break;
                            case 10:
                                System.out.println(result);
                                break;
                            case 11:
                                continueMenu = false;
                                System.out.println("Exiting calculator...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }

                }

}
public static void add(int num1, int num2){

          int sum =num1+num2;
    System.out.println(num1 +"+"+num2+"="+sum);
    result.add(sum);

}
    public static void sub(int num1, int num2){
        int sum =num1-num2;
        System.out.println(num1 +"-"+num2+"="+sum);
        result.add(sum);
    }
    public static void mul(int num1, int num2){

        int sum =num1*num2;
        System.out.println(num1 +"*"+num2+"="+sum);
        result.add(sum);
    }
    public static void divi(int num1, int num2){

        int sum =num1/num2;
        System.out.println(num1 +"/"+num2+"="+sum);
        result.add(sum);

    }
    public static void mod(int num1, int num2){
        int sum =num1%num2;
        System.out.println(num1 +"%"+num2+"="+sum);
        result.add(sum);

    }

    public static void mini(int num1 , int num2 ){

        if (num1<=num2){
            System.out.println("the minimum number : "+num1);
            result.add(num1);
        }
        else {
            System.out.println("the minimum number : "+num2);
        result.add(num2);
        }

    }
    public static void max(int num1 , int num2 ){
        if (num1>num2){
            System.out.println("the maximum number : "+num1);
            result.add(num1);

        }
        else { System.out.println("the maximum number : "+num2);
        result.add(num2);
        }

    }

    public static void aver(int num1, int num2){

        int ave =num1+num2/2;
        System.out.println("The average of numbers = "+ave);
        result.add(ave);

    }

}