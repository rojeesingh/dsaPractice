package com.rojee;

public class PrimeNumber {
    public static void main(String[] args) {
      prime(12);
    }
    static void prime(int n){
        if(n==2 || n==1){
            System.out.println("not prime");

        }
        for (int i=2;i*i<n;i++) {
            if (n % i == 0) {
                System.out.println("not Prime");
                break;
            }else{
                System.out.println("prime");
                break;
            }

        }

    }
}
