package com.rojee;

public class EvenDigits {


    public static void main(String[] args) {
        int[] nums={12,34,78,56};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            String s= Integer.toString(i);
            if(s.length()%2 == 0){
                count++;
            }
        }
        return count;
    }
}
