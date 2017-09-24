package io.java.ds.algo.dp;

public class MaximumSubarray {


    static int  sumArray(int[] arr){
        int max_sum = Integer.MIN_VALUE ;
        int max_current_pos = 0;
        int start = 0 ;int end = 0 ; int  s = 0;
        for(int i = 0 ; i< arr.length ;i++){
            max_current_pos = max_current_pos + arr[i];

            if (max_sum < max_current_pos)
            {
                max_sum = max_current_pos;
                start = s;
                end =  i;
            }

            if (max_current_pos < 0)
            {
                max_current_pos = 0;
                s = i + 1;
            }

        }
        System.out.println ("start -" +  start + " end  " + end);
        return max_sum ;
    }

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int [] a = {2, -1, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                sumArray(a));


    }
}
