package array.easy;

// https://leetcode.com/problems/two-sum/
// twoSumVer3() fastest
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumVer3(new int[]{2, 7, 11, 15}, 9)));
    }
    // Runtime: 48 ms, faster than 32.31% of Java online submissions for Two Sum.
    // Memory Usage: 39.3 MB, less than 53.91% of Java online submissions for Two Sum.
    public int[] twoSumVer2(int[] nums, int target) {

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){

                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[0];
    }

    // Runtime: 4 ms, faster than 55.00% of Java online submissions for Two Sum.
    // Memory Usage: 39.8 MB, less than 29.74% of Java online submissions for Two Sum.
    public static int[] twoSumVer3(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){
                arr[0] = map.get(target-nums[i]);
                arr[1] = i;
            }
            else {
                map.put(nums[i],i);
            }
        }
       return arr;
    }
}
