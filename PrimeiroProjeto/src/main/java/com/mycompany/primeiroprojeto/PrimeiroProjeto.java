package com.mycompany.primeiroprojeto;

import java.util.Scanner;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        
        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("A sua idade e: " + idade);
        
        System.out.println("Hello World!");
    }
}
