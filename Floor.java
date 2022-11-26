package com.rojee;

public class Floor {
    public static void main(String[] args) {
        int[] arr={13,33,67,99,104};
        int target=68;
        int ans=  floor(arr,target);
        System.out.println(ans);
    }
    //return greatest number smaller than or equal to target
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
 // but if target is smaller than smallest number
        if(target<arr[0]){
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
        return arr[end];
    }
}
