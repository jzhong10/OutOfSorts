import java.util.Random;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
      int[] nums = new int[10];
      Random rng = new Random(100);
      for(int i =  0; i < 10; i++) {
        nums[i] = Math.abs((rng.nextInt() % 1000));
      }

      System.out.println(Arrays.toString(nums));

      Sorts.bubbleSort(nums);

      System.out.println(Arrays.toString(nums));

    }
}
