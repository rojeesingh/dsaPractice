package com.rojee;

import java.util.Scanner;

public class ToFindGreatestIntINThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int max = a;
//        if (b > max) {
//            max=b;
//        }
//        if (c > max) {
//            max=c;
//        }
//        System.out.println(max);
// OR
//        int max= Math.max(a,b);
//        if(max==a){
//            System.out.println(a);
//        }if(max==b){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
