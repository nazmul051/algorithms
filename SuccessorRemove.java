package com.company;

public class SuccessorRemove {
    public int[] id;

    public SuccessorRemove(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public void removeX (int x){
        id[x] = -1; //(-1) means this is removed
    }
    public int smallestY (int x){
        if (id[x] == -1){
            return x+1;
        }
        else {
            return x;
        }
    }
}
