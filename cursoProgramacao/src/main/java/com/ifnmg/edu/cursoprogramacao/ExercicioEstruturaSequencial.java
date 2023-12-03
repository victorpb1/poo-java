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
    /* Exercício 4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir mostre o número e o salário do funcionário com duas casas decimais.
    
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
    System.out.printf("Salário = R$ %.2f", salario);
    */
    /* Exercício 5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2, o valor unitário de cada peça 2. Cálcule e mostre o valor a ser pago. */
    
        Scanner newScanner = new Scanner(System.in);
    
        int codP1, numP1, codP2, numP2;
        double precoP1, precoP2, precoTotal;
    
        System.out.println("Insira o código, quantidade e preço da peça 1: ");
        codP1 = newScanner.nextInt();
        numP1 = newScanner.nextInt();
        precoP1 = newScanner.nextDouble();
        
        System.out.println("Insira o código, quantidade e preço da peça 2: ");
        codP2 = newScanner.nextInt();
        numP2 = newScanner.nextInt();
        precoP2 = newScanner.nextDouble();
        
        precoTotal = numP1 * precoP1 + numP2 * precoP2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", precoTotal);
    
    }
}
