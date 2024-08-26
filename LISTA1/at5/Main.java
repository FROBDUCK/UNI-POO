package LISTA1.at5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("diga o nome, tipo de quarto e qunatidade de noites da reserva");
        Reserva r1 = new Reserva(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println("diga o nome, tipo de quarto e qunatidade de noites da reserva");
        Reserva r2 = new Reserva(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println("diga o nome, tipo de quarto e qunatidade de noites da reserva");
        Reserva r3 = new Reserva(s.nextLine(), s.nextLine(), s.nextInt());


        System.out.println(r1.nome + " " + r1.tipo + " " + r1.diarias);
        System.out.println(r2.nome + " " + r2.tipo + " " + r2.diarias);
        System.out.println(r3.nome + " " + r3.tipo + " " + r3.diarias);
        

        s.close();
    }
} 