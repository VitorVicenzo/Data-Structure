package edu.vitor.dio.doublechainlist;

public class DoubleChainList<T> {

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int listSize;

    public DoubleChainList(){
        firstNode = null;
        lastNode = null;
        this.listSize = 0;
    }

    public int size(){
        return listSize;
    }
}
