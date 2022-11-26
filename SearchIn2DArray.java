package com.rojee;
//search an element in 2d array
//to find minimum , similarly can do to find maximum
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{17,34,21,45},{12,56,55}};
        System.out.println(search(arr));
    }
    static int search(int[][] arr){
       int min=Integer.MAX_VALUE;
        for(int[] i: arr){
            for(int j:i){
                if(j<min){
                    min=j;

                }
            }
        }
        return min;
    }
}
