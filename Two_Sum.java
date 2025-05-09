import java.util.Arrays;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        outerloop:
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if(i !=j && target == (nums[i]+ nums[j])){
                    if(i<j){
                        result[0] = i;
                        result[1] = j;
                    }else{
                        result[0] = j;
                        result[1] = i;
                    }
                    j++;
                    break outerloop;
                }
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,5,11};
        int target = 10;
        Two_Sum twoSum = new Two_Sum();
        int[] result = twoSum.twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
