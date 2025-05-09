package com.LeetCode.merge_intervals;

import java.util.Arrays;

public class merge_intervals {

    public static void main(String[] args) {
        int[][] intervals = {
                {1,4},
                {5,6}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    private static int[][] merge(int[][] intervals) {
        int i = 0, j = 1;
        while(j <= intervals.length -1){
            if(intervals[i][1] >= intervals[j][0]){
                intervals[i][0] = intervals[i][0];
                intervals[i][1] = intervals[j][1];
                if(j + 2 <=intervals.length){
                    i += 2;
                    j += 2;
                }else if (j+1 <= intervals.length) {
                    i += 1;
                    j += 1;
                }
            }else {
                intervals[i - 1] = intervals[i];
                intervals[j - 1] = intervals[j];
                i++;
                j++;
            }
        }
        int destination_pointer = intervals.length - 1;
        for (int k = intervals.length - 1; k >= 2; k--) {
            if(intervals[k] == intervals[k-1]){
                break;
            }
            destination_pointer --;
        }
        if(destination_pointer == 0){
            destination_pointer = 1;
        }
        int[][] result = new int[destination_pointer][2];
        System.arraycopy(intervals ,0, result, 0, destination_pointer);
        return result;
    }
}
