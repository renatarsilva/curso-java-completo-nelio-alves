package Modulo06;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        switch(x){
            case 1 :
                System.out.println("Segunda");
                    break;
            case 2 :
                System.out.println("Terça");
                    break;
        }
    }
}
