package guru.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("Correct number");
        } else
            System.out.print("Incorrect number");
    }
}
