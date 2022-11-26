package com.rojee;
import java.util.Scanner;

public class FibonacciNthNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1;
        int n3=0;
//        for(int i=2;i<=n;i++){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//        }
        // or
        int count=2;
        while(count<=n){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
        System.out.println(n3);
    }
}
