package br.ufrn.imd.edb2.aula06;

public class Sorter {
    public void sort(int[] numeros) {
        mergerSort(numeros, 0, numeros.length - 1);
    }

    private void mergerSort(int[] numeros, int inicio, int fim) {
        if(fim <= inicio){
            return; // T(1) = c'
        }
        // T(n) =
        int meio = Math.floorDiv(inicio + fim, 2);

        mergerSort(numeros, inicio, meio); // T(n/2)
        mergerSort(numeros, meio + 1, fim); // T(n/2)
        merge(numeros, inicio, meio, fim); // cn


    }

    private void merge(int[] numeros, int inicio, int meio, int fim) {
        int t1 = meio - inicio + 1;
        int t2 = fim - meio;

        int [] aux1 = new int[t1];
        int [] aux2 = new int[t2];

        for(int i = 0; i < t1; ++i){
            aux1[i] = numeros[inicio + i];
        }

        for(int j = 0; j < t2; ++j){
            aux2[j] = numeros[meio + j + 1];
        }

        int l1 = 0;
        int l2 = 0;
        int ig = inicio;

        while(l1 < t1 && l2 < t2){
            if(aux1[l1] < aux2[l2]){
                numeros[ig] = aux1[l1];
            } else {
                numeros[ig] = aux2[l2];
                l2++;
            }
            ig++;
        }

        while(l1 < t1){
            numeros[ig] = aux1[l1];
            l1++;
            ig++;
        }

        while(l2 < t2){
            numeros[ig] = aux2[l2];
            l2++;
            ig++;
        }
    }
}
