package com.rojee;

public class LinearSeach {
    public static void main(String[] args) {
        int[] arr={1,5,34,56};
        int target=34;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int index=0; index<arr.length; index++){
            int element=arr[index];
            if(element==target){
                return  index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
