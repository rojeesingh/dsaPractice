package com.rojee;

public class Reverse {
    public static void main(String[] args) {
        int n=3456;
        int rem=0;
        int temp=0;
        while(n>0){
            rem=n%10;
            temp=temp*10+rem;
            n=n/10;
        }
        System.out.println(temp);
    }
}
