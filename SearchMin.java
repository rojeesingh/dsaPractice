package com.rojee;
//linear search in 1D array
public class SearchMin {
    public static void main(String[] args) {
        int[] arr={23,45,12,34};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}
