package Scanner;

import java.util.Scanner;

public class Values {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter value for a");
        int b = sc.nextInt();
        System.out.println("Please enter value for b");

        if (a == b) {
            System.out.println("a and b are same");
        } else {
            System.out.println("b is greater than a");
        }
    }
}