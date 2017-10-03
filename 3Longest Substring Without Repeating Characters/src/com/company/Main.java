package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "dvdf";
        int res = lengthOfLongestSubstring(s);
        System.out.println("res:"+res);
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int len = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int temp = 0;
        boolean ck = false;
        for(i = 0;i<s.length();){
            for(j= i+ 1;j<s.length();j++){
                for(k=i;k<j;k++){
                    if(s.charAt(j)==s.charAt(k)){
                        ck = true;
                        break;
                    }
                }
                temp = j-i;
                if(temp>=len){
                    len = temp;
                }
                if(ck){
                    break;
                }
                else{
                    temp = temp+1;
                    if(temp>=len){
                        len = temp;
                    }

                }

            }
            i++;
            ck = false;
        }
        return len;
    }
}
