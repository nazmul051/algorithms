package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int n = 12;
	    QuickUnionUF myObjects = new QuickUnionUF(10);
	    myObjects.union(3,4);
        myObjects.union(8,4);
        myObjects.union(9,4);
        myObjects.union(0,6);
        myObjects.union(1,2);
        myObjects.union(2,7);
        myObjects.union(5,6);

        int result = myObjects.find(1);
        System.out.println(result);
        System.out.println(Arrays.toString(myObjects.id));
        System.out.println(Arrays.toString(myObjects.sz));
        System.out.println(Arrays.toString(myObjects.largest));
    }
}
