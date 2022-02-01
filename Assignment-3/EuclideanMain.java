package km222pw_assign3;

import java.util.Scanner;


public class EuclideanMain {

    static boolean controller;
    static int a = 0;


    public static void main(String[] args) {
        controller = true;

        Scanner sc = new Scanner(System.in);
        while (controller == true) {
            try {
                while (a == 0) {

                    System.out.println("Please insert first number to find the GCD");
                    int first_Input = sc.nextInt();
                    System.out.println("Please insert second number to find the GCD");
                    int second_Input = sc.nextInt();
                    int result = Euclidean(first_Input, second_Input);
                    System.out.println("GCD(" + first_Input + " , " + second_Input + ") " + "= " + result);
                    a = 1;
                }
                while (a == 1) {
                    System.out.println("Do you want to do another calculation!! (Enter (y) for yes or (n) to exit the program");

                    String ex = sc.next();
                    if (ex.equals("y")) {
                        a = 0;

                    } else if (ex.equals("n")) {

                        System.out.println("Exiting program....");
                        System.exit(0);
                    }
                }


            } catch (Exception e) {
                System.out.printf("only numbers are allowed");
            }


        }

    }

    private static int Euclidean(int first, int second) {
        if (first == 0) {
            return second;
        }
        return Euclidean(second % first, first);
    }

}
