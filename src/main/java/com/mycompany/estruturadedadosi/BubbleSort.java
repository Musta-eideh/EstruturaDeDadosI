
package com.mycompany.estruturadedadosi;

public class BubbleSort {
    public static void main (String[] args){
        int vetor [] = {5,4,3,6,1,8,9,7};
        int aux;
        
        for(int i = 0; i < vetor.length; ++i) {
            for (int j = 0; j < (vetor.length - 1); ++j) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor [j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        for(int i = 0; i < vetor.length; ++i) {
            System.out.println(vetor[i]);
        }
    }
}
