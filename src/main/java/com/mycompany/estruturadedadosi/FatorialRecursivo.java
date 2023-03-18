package com.mycompany.estruturadedadosi;

public class FatorialRecursivo {
    
    public static void main (String[] args){
        System.out.println(fatorialRecursivo(20));
    }
    
    public static int fatorialRecursivo(int numero) {
        System.out.println("Fatorial número: " + numero);
        if(numero == 1){
            return 1;
        }
        return numero * fatorialRecursivo(numero - 1);
    }
}
