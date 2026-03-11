package modulo07;

import java.util.Scanner;

public class Whiletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga seu nome");
        String nome = sc.nextLine();

        while(!nome.equals("Maki")){
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
        }
        System.out.println("Oi Maki!");
    }
}
