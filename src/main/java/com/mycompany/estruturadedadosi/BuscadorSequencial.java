package com.mycompany.estruturadedadosi;

public class BuscadorSequencial {

    public static void main(String[] args) {
        int vet[] = new int[10];
        
        for(int i = 0; i < vet.length; i++){
            vet[i] = i * 2;
            System.out.println("vet " + vet[i]);
        }
        int pos = BuscaNumero(vet, 100);
        if (pos != 0) {
            System.out.println("Número encontrado na posição.");
        }else{
            System.out.println("Número não encontrado na posição.");
        }
    }
    
    public static int BuscaNumero(int v[], int vlrPesquisado){
        boolean achou = false;
        int pos = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] == vlrPesquisado){
                achou = true;
                pos = i;
            }
        }
        
        if (achou == true) {
            return pos;
        } else{
            return pos;
        }
    }
}
