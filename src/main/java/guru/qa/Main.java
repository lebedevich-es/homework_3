package guru.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num >= 0.0) {
            System.out.println(num + " is a positive number");
        } else
            System.out.println(num + " is a negative number");
    }
}
