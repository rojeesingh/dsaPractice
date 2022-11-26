package com.rojee;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={13,3,67,99,104};
        int target=105;
        int ans=  ceiling(arr,target);
        System.out.println(ans);
    }
    //return smallest number greater than or equal to target
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
// but what if the target is greater than greatest number
        if(target>arr[arr.length-1]){
            return -1;
        }
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target > arr[mid]) {
               start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            } else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
