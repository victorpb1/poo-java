package com.ifnmg.edu.cursoprogramacao;

import java.util.Scanner;


public class ExercicioEstruturaSequencial {
    public static void main(String[] args) {
        
    /* Exercício 1 - Faça um programa para ler dois valores inteiros, depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
    
       int x, y;
       Scanner newScanner = new Scanner(System.in);
       
       x = newScanner.nextInt();
       y = newScanner.nextInt();
       
       int soma = x + y;
       
       System.out.println("SOMA = " + soma);
    */
    /* Exercício 2 - Faça um programa para ler o valor do raio de círculo e depois mostrar o valor da área deste círculo com casas decimais conforme exemplos. Area = pi * raio^2.
        Scanner newScanner = new Scanner(System.in);
    
        double pi, raio, area;
    
        pi = 3.14159;
        System.out.println("Insira o valor do raio: ");
        raio = newScanner.nextDouble();
        
        area = pi * raio * raio;
        
        System.out.printf("A area mediante raio inserido: %.4f", area);
        // tem que ser printf, println dá erro
        */
    /* Exercício 3 - Faça um programa para ler quatro valores inteiros A, B, C e D. A seguir calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a formula DIFERENÇA = (A * B - C * D).
        
        Scanner newScanner = new Scanner(System.in);
        
        int A, B, C, D, diferenca;
        
        System.out.println("Digite os valores para A, B, C e D: ");
        A = newScanner.nextInt();
        B = newScanner.nextInt();
        C = newScanner.nextInt();
        D = newScanner.nextInt();
        diferenca = (A * B - C * D);
        
        System.out.println("A diferenca de produtos: " + diferenca);
        */
    /* Exercício 4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir mostre o número e o salário do funcionário com duas casas decimais. */
    
    Scanner newScanner = new Scanner(System.in);
    
    int numFuncionario, horas;
    float valorHora;
    
    System.out.println("Digite o numero do funcionario, o numero de horas trabalhadas e o valor de cada hora: ");
    numFuncionario = newScanner.nextInt();
    horas = newScanner.nextInt();
    
    valorHora = newScanner.nextFloat();
    
    float salario;
    
    salario = horas * valorHora;
    
    System.out.println("Número = " + numFuncionario);
    System.out.printf("Salário = %.2f", salario);
    
    }
}
