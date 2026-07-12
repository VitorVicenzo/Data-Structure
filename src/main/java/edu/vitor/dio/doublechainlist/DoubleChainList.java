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

    public void add(T element){
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);
        if (firstNode == null){
            firstNode = newNode;
        }
        if (lastNode != null){
             lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T element){
        DoubleNode<T> auxiliarNode = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(auxiliarNode);

        if (newNode.getNextNode() != null){
            newNode.setPreviousNode(auxiliarNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        if (index == 0){
            firstNode = newNode;
        }else{
            newNode.getPreviousNode().setNextNode(newNode);
        }
        listSize++;
    }

    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.getNextNode();
            if(firstNode != null){
                firstNode.setPreviousNode(null);
            }
        }else{
            DoubleNode<T> auxiliarNode = getNode(index);
            auxiliarNode.getPreviousNode().setNextNode(auxiliarNode.getNextNode());
            if (auxiliarNode != lastNode){
                auxiliarNode.getNextNode().setPreviousNode(auxiliarNode.getPreviousNode());
            }else{
                lastNode = auxiliarNode;
            }
        }

        this.listSize--;
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> auxiliarNode = firstNode;
        for (int i = 0; (i < index) && (auxiliarNode != null); i++) {
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return auxiliarNode;
    }

    public int size(){
        return this.listSize;
    }


}
