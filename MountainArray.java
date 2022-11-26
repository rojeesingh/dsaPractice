package com.rojee;

public class MountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
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
}
