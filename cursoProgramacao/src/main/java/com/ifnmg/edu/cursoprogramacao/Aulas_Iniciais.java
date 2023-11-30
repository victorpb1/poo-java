package com.ifnmg.edu.cursoprogramacao;

import java.util.Locale;

public class Aulas_Iniciais {
    
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5390;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.00;
        double measure = 53.234567;
        
        System.out.printf("Produts:%n%s which price is %.2f%n", product1, price1);
        System.out.printf("%s which price is %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d, and gender %c%n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
