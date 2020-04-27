package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SocialNetworkConnectivityMain {
    public static void main(String[] args) {
        int N = 0;
        int p = 0;
        int q = 0;
        String timeStamp;
        SocialNetworkConnectivity myObjects = new SocialNetworkConnectivity(10);
        try {
            File theFile = new File("D:\\Courses\\algortithms part1\\Union find\\src\\com\\company\\SocialNetworkConnectivity.txt");
            Scanner pointer = new Scanner(theFile);
            String data = pointer.nextLine();
            N = Integer.parseInt(data);

            int i = 0;
            while (pointer.hasNextLine()) {
                data = pointer.nextLine();
                String[] dataSplit = data.split(",");
                p = Integer.parseInt(dataSplit[0]);
                q = Integer.parseInt(dataSplit[1]);
                timeStamp = dataSplit[2];
                //System.out.println(p + " " +  q + " " +  timeStamp);
                //System.out.println(dataSplit[0] + ">>>" + dataSplit[1] + ">>>" + dataSplit[2]);
                i++;

                boolean result = myObjects.union(p,q);
                if(result==true){
                    System.out.println("All members connected at: " + timeStamp);
                }
                //else{
                   // System.out.println("Not yet all are connected");
                //}
            }
            pointer.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
