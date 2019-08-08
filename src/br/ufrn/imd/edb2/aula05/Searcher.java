package br.ufrn.imd.edb2.aula05;

public class Searcher {

    public int search(int[] numbers, int value) {
        return binarySearch(numbers, value, 0, numbers.length);
    }

    private int binarySearch(int [] numeros, int value, int start, int end){
        if(end < start){
            return -1;
        }

        int meio = Math.floorDiv(start + end, 2);

        if(value == numeros[meio]){
            return meio;
        }
        if(value < numeros[meio]){
            return binarySearch(numeros, value, start, meio-1);
        } else {
            return binarySearch(numeros, value, meio+1, end);
        }
    }
}