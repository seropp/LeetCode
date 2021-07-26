package array.medium;

// https://leetcode.com/problems/3sum/

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{3,3, 42, -11, 21,-10}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);   // Будем рпботать с отсортированным массивом
        int n = nums.length; // переменнтой n присваеваем значение длинны массива nums
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); // Создаем объект, который будем возвращать
        if(n<3) return ans; // в случае, если длина массива 2 и меньше возвращаем пустой объект

        for (int i = 0; i < n-2 ; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue; // избегаем одинаковых знач

            int l = i+1;
            int r = n-1;

            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum>0)r--;
                else if(sum<0)l++;
                else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                    l++; r--;

                    while (l<r && nums[l]==nums[l-1]) {
                        l++;
                    }
                    while (l<r && nums[r]==nums[r+1]) {
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}
