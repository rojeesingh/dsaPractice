package com.rojee;

public class maxarray {
    public static void main(String[] args) {
        int[] arr={78,6,8,1};
        int m=maxi(arr,1,3);
        System.out.println(m);
    }
    static int maxi(int[] arr,int start, int end){
        int maxs=arr[start];
        for (int i=start;i<=end;i++) {
             maxs =Math.max(maxs,arr[i]);
        }
   return maxs;
    }
}
