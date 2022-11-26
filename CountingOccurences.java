package com.rojee;

import java.util.Collections;
import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2345555;
       int rem=0;
        int count=0;
        while(n>0){
           rem=n%10;
           if(rem==5){
               count++;
           }
            n=n/10;
        }
        System.out.println(count);
    }
}
