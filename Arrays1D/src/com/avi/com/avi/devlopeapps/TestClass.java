package com.avi.devlopeapps;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
        	A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(int N, int[] A){
    Arrays.sort(A);

    int  min=A[0];
    for(int i=0;i<N;i++){
    if(Math.abs(min)>Math.abs(A[i]))
    {
        if (A[i] == -min) {
                min = Math.abs(A[i]);
            } else {
                min = A[i];
            }

    }  
     
    }
    return min;
    }    
}