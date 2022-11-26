package com.rojee;

public class EvenDigitsFindNewWay {
    public static void main(String[] args) {
           int[] nums={23,5,343,889};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num: nums) {
                 if(even(num))   {
                     count++;
                 }
        }

        return count;
    }
    //function to check weather a number contains even digits or not.
    static boolean even(int num){
     int numberOfDigits=digits2(num);
//     if(numberOfDigits%2==0){
//         return true;
//     }
     return numberOfDigits%2 == 0;
    }
    //count number of digits in a number
    static int digits(int num){
        int count=0;
     while (num>0){
         count++;
         num=num/10;
     }
        return count;
    }
    //to count a digit in one line of code
    static int digits2(int num){

        if(num<0){
            num=num * -1;
        }

        return (int)(Math.log10(num)) +1;
    }
}
