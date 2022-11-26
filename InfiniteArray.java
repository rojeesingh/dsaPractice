package com.rojee;

public class InfiniteArray {
    public static void main(String[] args) {
   int[] arr={12,33,45,56,67,87,99,104};
     int target=56;
     System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
     //first find the range.
        //start with the size of 2.
        int start=0;
        int end=1;

        //condition to find target to lie in the range.
        while(target>arr[end]){
            int newStart=end+1;  //same like swapping
            //double the box value.
            //end= previous end+ sizeofBox*2
            end=end+(end-start +1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr,int target, int start, int end){

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
