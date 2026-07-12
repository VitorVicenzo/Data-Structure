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

    public T get(int index){
        return this.getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> auxiliarNode = firstNode;
        for (int i = 0; (i < index) && (auxiliarNode != null); i++) {
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return auxiliarNode;
    }

    public int size(){
        return listSize;
    }


}
