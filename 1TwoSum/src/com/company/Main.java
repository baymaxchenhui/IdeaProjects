package com.company;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] numarr = new int[2];
        for (int i = 0; i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++){
                int res = nums[i]+nums[j];
                if (res == target){
                    numarr[0]=i;
                    numarr[1]=j;
                }
            }
        }
        return numarr;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = new int[4];
        int target = 9;
        nums[0]=2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;
        int[] res = new int[2];
        res = twoSum(nums,target);
        System.out.println("res[0]:"+res[0]+",res[1]:"+res[1]);
    }
}
