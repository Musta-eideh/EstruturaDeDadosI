package com.mycompany.estruturadedadosi;

public class OrdenacaoPorSelecao {
    public static void main(String[] args){
        int vetor[] = {3,2,4,6,5,10};
        
        System.out.println("Vetor original ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor ordenado " + vetor[i]);
        }
        
        System.out.println("Vetor ordenado ");
        int posicao_menor, aux;
        for(int i = 0; i < vetor.length; i++){
            posicao_menor = 1;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
        aux = vetor[posicao_menor];
        vetor[posicao_menor] = vetor[i];
        vetor[i] = aux;
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor ordenado: " + vetor[i]);
        }
    }
}
