import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        //7.Write a menu driven Java program with following option:
        //Accept elements of an array
        //Display elements of an array
        //Search the element within array
        //Sort the array
        //To Stop
        //the size of the array should be entered by the user.
        try { // done
            int size = 0;
            int[] arrayy = null;
            boolean stop = false;

            while (!stop) {
                System.out.println("Menu:");
                System.out.println("1. Accept elements of an array");
                System.out.println("2. Display elements of an array");
                System.out.println("3. Search element within array");
                System.out.println("4. Sort the array");
                System.out.println("5. Stop");
                System.out.print("Enter choice: ");
                int choice = S.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.print("Enter size of the array: ");
                        size = S.nextInt();
                        arrayy = new int[size];
                        System.out.println("Enter elements of the array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print("Element " + (i + 1) + ": ");
                            arrayy[i] = S.nextInt();
                        }
                        System.out.println("Array elements accepted.");
                        break;
                    case 2:
                        if (arrayy != null) {
                            System.out.println("Array elements:");
                            for (int i = 0; i < size; i++) {
                                System.out.print(arrayy[i] + " ");
                            }
                            System.out.println();
                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter element to search: ");
                        int searchElement = S.nextInt();
                        if (arrayy != null) {
                            boolean found = false;
                            for (int i = 0; i < size; i++) {
                                if (arrayy[i] == searchElement) {
                                    System.out.println(searchElement + " found at index " + i);
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println(searchElement + " not found in the array.");
                            }
                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 4:
                        if (arrayy != null) {
                            Arrays.sort(arrayy);
                            System.out.println("Array has been sorted.");
                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 5:
                        stop = true;
                        System.out.println("stopped.");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                System.out.println();
            }
        } catch (InputMismatchException e1){
            System.out.println("An error occurred: " + e1.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            S.close();
        }
    }
}

