package com.rojee;

public class RotatingBinarySearch {
    public static void main(String[] args) {
      int[] arr={3,4,5,6,7,8,0,1};  //rotating array
        System.out.println(findPivot(arr));
    }
     static int search(int[] nums, int target){
        int pivot=findPivot(nums);
        //if you don't find pivot it means array is not rotating
         if(pivot==-1){
             //just do normal binary search as array is not rotating
             return binarySearch(nums,target,0,nums.length-1);
         }
         //if you have found pivot , it means you found ascending sorted arrays
         //here three cases possible.
         if(nums[pivot]==target){   /* case1 */
             return target;
         }
         if(target>=nums[0]){   //nums[0] means start of array
            return binarySearch(nums,target,0,pivot - 1);
         }
         return binarySearch(nums,target,pivot +1,nums.length-1);
    }
    static int binarySearch(int[] arr,int target, int start,int end){
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
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
                       //4 cases
           if(mid<end && arr[mid]>arr[mid+1]){         /*case1 */   //here we have added mid<end because if mid is last ele then mid+1 will be index out of bound , so.
               return mid;
           }
           if(mid>start && arr[mid]<arr[mid-1]){      /*case2 */  //similarly here.
               return mid-1;
           }
           if(arr[start]>=arr[mid]){                 /*case3 */
               end=mid-1;
           }else{                                   /* case 4 */
               start=mid+1;
           }
        }
        return -1;
    }
}
