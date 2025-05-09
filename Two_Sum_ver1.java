import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_ver1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
            System.out.println(map);
        }
        return new int[] {-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,5,11};
        int target = 7;
        Two_Sum_ver1 twoSumVer1 = new Two_Sum_ver1();
        int[] result = twoSumVer1.twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
