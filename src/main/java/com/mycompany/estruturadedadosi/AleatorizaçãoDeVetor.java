package com.mycompany.estruturadedadosi;
import java.util.ArrayList;
import java.util.Random;

public class AleatorizaçãoDeVetor {
    public static void main(String args[]){
        ArrayList lista = new ArrayList();
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        System.out.println("Lista original: ");
        mostraLista(lista);
        System.out.println("Lista desordenada: ");
        desordenada(lista);
    } 
    
    public static void mostraLista(ArrayList Lista) {
        for(int i = 0; i < Lista.size(); i++) {
            System.out.println("Lista ordenada: " + Lista.get(i));
        }
    }
    
    public static void desordenada (ArrayList Lista) {
        ArrayList listaTemp = new ArrayList();
        Random rdn = new Random();
        for(int i = 0;Lista.size() > 1; i++) {
            int pos = rdn.nextInt(Lista.size());
            listaTemp.add(Lista.get(pos));
            Lista.remove(pos);
        }
        listaTemp.add(Lista.get(0));
        Lista.clear();
        
        for(int i = 0; i < listaTemp.size(); i++) {
            System.out.println("Aleatorizado: " + listaTemp.get(i));
        }
    }
}
