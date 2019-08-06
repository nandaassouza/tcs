/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0608;

/**
 *
 * @author senai
 */
public class Atividade {
    static int vetor[] = {12,11,13,5,6,7,9,50};
    
    public static void main(String Args[]){
        System.out.println("array de entrada \n");
        printArray(vetor, vetor.length);
        mergeSort(vetor, 0, (vetor.length-1));
        System.out.println("\nArray Ordenado\n");
        printArray(vetor, vetor.length);
    }
    
    public static void printArray(int aux[], int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print(aux[i]+" ");
        }
    }
    
    public static void mergeSort(int vetor[], int inicio, int fim){
        if (inicio < fim) {
            int meio = (inicio + fim)/2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, (meio+1), fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    public static void merge(int vetor[], int inicio, int meio, int fim){
        int aux[] = new int[(fim-inicio+1)];
        int i = inicio;
        int j = meio+1;
        int k = 0;
        while(i<=meio && j <= fim){
            if (vetor[i] <= vetor[j]) {
                aux[k] = vetor[i];
                k++;
                i++;
            }else{
                aux[k] = vetor[j];
                k++;
                j++;
            }
        }
        while (i <= meio) {
            aux[k] = vetor[i];
            k++;
            i++;
        }
        while (j <= fim) {
            aux[k] = vetor[j];
            k++;
            j++;
        }
        i=inicio;
        while (i <= fim) {
            vetor[i] = aux[i - inicio];
            i++;
        }
    }
    
}
