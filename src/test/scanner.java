package test;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
