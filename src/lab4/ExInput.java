package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter an integer:");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);

        System.out.print("Please, enter an Double:");
        Double b = scanner.nextDouble();

        System.out.println("Your entered Double: "+b);


        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Please, enter you name: ");
        String n = scanner.nextLine();

        System.out.println("Your name is: " +n);




    }


}
