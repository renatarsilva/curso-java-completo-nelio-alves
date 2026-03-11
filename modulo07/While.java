package modulo07;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int x = sc.nextInt();

        while (x != 0 ){
            x = sc.nextInt();
        }
        sc.close();
    }
}
