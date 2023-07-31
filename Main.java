import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Calculator {
    private static double lastResult = 0;
    private static List<Double> allResults = new ArrayList<>();

    public static void main(String[] args)  {
        Scanner S = new Scanner(System.in);

        while (true) {
            displayMenu();
            try { // done

                int choice = 0;
                choice = S.nextInt();

                if (choice == 9) {
                    System.out.println("Last result: " + lastResult);
                } else if (choice == 10) {
                    System.out.println("All results: " + allResults);
                } else if (choice >= 1 && choice <= 8) {
                    double num1 = 0;
                    double num2 = 0;
                    System.out.print("Enter first number: ");
                    num1 = S.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = S.nextDouble();

                    switch (choice) {
                        case 1:
                            lastResult = add(num1,num2);
                            break;
                        case 2:
                            lastResult = sub(num1, num2);
                            break;
                        case 3:
                            lastResult = multiply(num1, num2);
                            break;
                        case 4:
                            lastResult = divide(num1, num2);
                            break;
                        case 5:
                            lastResult = modulus(num1, num2);
                            break;
                        case 6:
                            lastResult = min(num1, num2);
                            break;
                        case 7:
                            lastResult = max(num1, num2);
                            break;
                        case 8:
                            lastResult = avg(num1, num2);
                            break;
                    }
                    allResults.add(lastResult);
                    System.out.println("Result: " + lastResult);
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
                System.out.println("Do you want to exit? (yes/no)");
                String exitChoice = S.next();
                if (exitChoice.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                S.nextLine();
            } catch (ArithmeticException a){ // لا يقبل القسمه على 0
                System.out.println(a.getMessage());
            } catch (Exception a1){
                System.out.println(a1.getMessage());
            }
        }
    }
    private static void displayMenu() {
        System.out.println("----- Calculator Menu -----");
        System.out.println("Enter 1 to add the numbers");
        System.out.println("Enter 2 to subtract the numbers");
        System.out.println("Enter 3 to multiply the numbers");
        System.out.println("Enter 4 to divide the numbers");
        System.out.println("Enter 5 to find the modulus of the numbers");
        System.out.println("Enter 6 to find the minimum number");
        System.out.println("Enter 7 to find the maximum number");
        System.out.println("Enter 8 to find the average of the numbers");
        System.out.println("Enter 9 to print the last result in calculator");
        System.out.println("Enter 10 to print the list of all results in calculator");
        System.out.println("---------------------------");
        System.out.print("Enter your choice: ");
    }
    public static double add(double num1, double num2) throws Exception { // done
        if(num1 < 0 && num2 < 0) {
            throw new Exception("Negative numbers are not allowed.");
        }
        return num1 + num2;
    }
    public static double sub(double num1, double num2) throws Exception { // done
        if(num1 < 0 && num2 < 0) {
            throw new Exception("Negative numbers are not allowed.");
        }
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) throws Exception { //done
        if(num1 < 0 && num2 < 0) {
            throw new Exception("Negative numbers are not allowed.");
        }
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0 ) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
    }

    public static double modulus(double num1, double num2) throws Exception { // done
        if(num1 < 0 && num2 < 0) {
            throw new Exception("Negative numbers are not allowed.");
        }
        return num1 % num2;
    }
    public static double min(double num1, double num2) {
        return Math.min(num1,num2);
    }
    public static double max(double num1, double num2){
        return Math.min(num1,num2);
    }
    public static double avg(double num1, double num2){
        double res = num1 + num2 / 2;
        return res;
    }
}


