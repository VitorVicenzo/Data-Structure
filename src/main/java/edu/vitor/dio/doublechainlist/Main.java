package edu.vitor.dio.doublechainlist;

public class Main {
    public static void main (String[] args){

        DoubleChainList<String> myChainList = new DoubleChainList<>();

        myChainList.add("c1");
        myChainList.add("c2");
        myChainList.add("c3");
        myChainList.add("c4");
        myChainList.add("c5");
        myChainList.add("c6");
        myChainList.add("c7");

        System.out.println(myChainList);

        myChainList.remove(3);
        myChainList.add(3, "99");

        System.out.println(myChainList);
        System.out.println(myChainList.get(3));
    }
}
