package P05_logic_1.P02_warmup_2;

public class P15_array667 {
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) count++;
        return count;
    }
}