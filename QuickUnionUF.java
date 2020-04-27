package com.company;

public class QuickUnionUF {
    public int[] id;
    public int[] sz;
    public int[] largest;

    public QuickUnionUF(int N) {
        id = new int[N];
        sz = new int[N];
        largest = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        for (int i = 0; i < N; i++) sz[i] = 1;
        for (int i = 0; i < N; i++) largest[i] = 0;
    }

    private int root(int i) {
        while (i != id[i])
        {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        int bigger = larger(p, q);
        if (i==j) return;
        if (sz[i] < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
            if (largest[j] < bigger)
            {largest[j] = bigger;}
        }
        else
        {
            id[j] = i;
            sz[i] += sz[j];
            if (largest[i] < bigger)
            {largest[i] = bigger;}
        }

    }
    public int find(int p){
        int r = root(p);
        return largest[r];

    }
    private int larger(int a, int b){
        if (a<b) return b;
        else return a;
    }
}