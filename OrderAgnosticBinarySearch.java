package com.rojee;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,56,67,99};
        int target=67;
        int ans=orderAgnostic(arr,target);
        System.out.println("Index of the target element "+target+" is "+ ans);
    }
    static int orderAgnostic(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        //find whether the array is sorted in ascending or descending
          boolean isAsc=arr[start]<arr[end];

        while(start<=end) {
//             int mid= (start+end)/2;         for lengthy series of elements , int cannot store, so use
            int mid = start + (end - start) / 2;
            if (mid == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
