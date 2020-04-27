package com.company;


public class SocialNetworkConnectivity {
    private int[] id;
    private int[] sz;
    private int n = 0;


    public SocialNetworkConnectivity(int N) {
        id = new int[N];
        sz = new int[N];
        n = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
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

    public boolean union(int p, int q)
    {
        int i = root(p);
        int j = root(q);

        boolean allConnected = false;

        if (i==j) {;}
        else if (sz[i] < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
            if(sz[j] == n){ allConnected = true;}
        }
        else
        {
            id[j] = i;
            sz[i] += sz[j];
            if(sz[i] == n){ allConnected = true;}
        }
        //System.out.println(sz[i] + "   " + sz[j]);
        return allConnected;

    }

}
