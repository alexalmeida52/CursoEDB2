package br.ufrn.imd.edb2.aula05;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {
                10,
                20,
                30,
                40
        };
        Searcher s = new Searcher();
        int pos = s.search(numbers, 40);
        System.out.println(pos);
    }
}