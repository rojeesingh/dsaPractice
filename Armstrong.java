package com.rojee;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem;
        int original=n;
        while(n>0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if(original==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("no armstrong");
        }
    }
}
