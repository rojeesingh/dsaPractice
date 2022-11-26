package com.rojee;

public class BinarySearch {
    public static void main(String[] args) {
         int[] arr={1,2,5,56,67,99};
         int target=1;
         int ans=binarySearch(arr,target);
        System.out.println("Index of the target element "+target+" is "+ ans);
    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
         int start=0;
         int end= arr.length-1;

         while(start<=end){
//             int mid= (start+end)/2;         for lengthy series of elements , int cannot store, so use
             int mid=start + (end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;
             } else if(target>arr[mid]){
                 start=mid+1;
             } else{
                 //ans found
                 return mid;
             }
         }
         return -1;
    }
}
