package com.rojee;

public class SearchString {
    public static void main(String[] args) {
        String str="Rojee";
        char target='R';
        System.out.println(stringSearch(str,target));
    }
    static char stringSearch(String str, char target) {
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return ch;
            }
        }
        return '0';
    }
}
