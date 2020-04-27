package com.company;

public class SuccessorRemoveMain {
    public static void main(String[] args){
        SuccessorRemove myObjects = new SuccessorRemove(10);

        myObjects.removeX(4);
        System.out.println(myObjects.smallestY(7));
    }
}
