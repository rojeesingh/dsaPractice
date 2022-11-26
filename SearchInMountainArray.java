package com.rojee;

public class SearchInMountainArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,3,1};
    int target=5;
        System.out.println( search(arr,target));

    }
   static int search(int[ ] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return  firstTry;
        }
        //try to search in second half
      return orderAgnostic(arr, target,peak+1,arr.length-1);
    }

    public  static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of an array
                //this may be ans but look at left
                //this is why end!= mid-1
                end=mid;
            } else{
                //we are in ascending part of array
                start=mid+1;
            }
        }
        //in the end start is going to be start==end, pointing max number
        //start and end wants to find max element in above 2 checks
        //more elaboration: at every point of time for start and end,they have the best possible ans till that time
        //and if we saying that only one item is remaining,hence cuz of above lines, that is the best possible ans
        return start; //or return end as both results same.
    }
    static int orderAgnostic(int[] arr,int target,int start, int end){

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
