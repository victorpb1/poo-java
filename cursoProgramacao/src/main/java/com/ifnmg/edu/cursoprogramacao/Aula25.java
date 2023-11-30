package com.ifnmg.edu.cursoprogramacao;

import java.util.Scanner;

public class Aula25 {
    public static void main(String[] args) {
        
        Scanner novoScanner = new Scanner(System.in);
        
        char x;
        System.out.println("Digite um caractere: ");
        x = novoScanner.next().charAt(0);
        System.out.println("O caractere digitado: " + x);
        novoScanner.close();
    }
}
