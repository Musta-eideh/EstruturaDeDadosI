package com.mycompany.estruturadedadosi;

public class PesquisaBinariaRecursiva {
    public static void main (String args[]){
        int vetor[] = {2,3,6,7,8,10};
        int elemento = 8;
        int resultado = buscaBinariaRecursiva(vetor, elemento);
        if(resultado < 0){
            System.out.println("Ellemento não encontrado.");
        }else {
            System.out.println("Elemento encontrado na posição: " + resultado);
        }
    }
    
    public static int buscaBinariaRecursiva(int vetor[], int elemento){
        return buscaRecursiva(vetor, elemento,0, vetor.length - 1);
    }
    
    public static int buscaRecursiva(int vetor[], int elemento, int menor, int maior) {
        int meio = (menor + maior) / 2;
        if(menor > maior) {
            return - 1;
        }
        if(vetor[meio] == elemento){
            return meio;
        }
        if(vetor[meio] < elemento){
            return buscaRecursiva(vetor, elemento, meio + 1, maior);
        }else{
            return buscaRecursiva(vetor,elemento, menor, maior - 1);
        }
    }
}
