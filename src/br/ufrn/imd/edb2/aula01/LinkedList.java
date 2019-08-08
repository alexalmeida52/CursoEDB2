package br.ufrn.imd.edb2.aula01;

public class LinkedList {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value){
        Node n = new Node(value);
        if(root == null){
            root = n;
            return;
        }

        Node current = this.getRoot();

        while(current.getNext() != null){
            current = current.getNext();
        }

        current.setNext(n);
    }
    //c es alt enter alt insert
}