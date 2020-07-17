package com.avi.devlopeapps;
import java.util.Arrays;
import java.util.Scanner;

public class MicroAndArrayUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr =new int[n];
            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(""+ (Math.max(k - arr[0], 0)));
        }


    }
}

