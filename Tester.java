import java.util.Random;
import java.util.Arrays;

public class Tester {
  public static boolean DEBUG = true;

  public static void dprint(String s){
    if(DEBUG){
      System.out.println("" + s);
    }
  }

  public static void dprint(boolean b){
    if(DEBUG){
      System.out.println("" + b);
    }
  }

  public static void main(String[] args) {
    int[] nums = new int[10];
    int[] numsT = new int[10];
    Random rng = new Random(100);
    for(int i =  0; i < 10; i++) {
      int n = (rng.nextInt() % 1000);
      nums[i] = n;
      numsT[i] = n;
    }

    dprint(Arrays.toString(nums));
    dprint("");

    Sorts.bubbleSort(nums);
    dprint(Arrays.toString(nums));

    Arrays.sort(numsT);
    dprint(Arrays.toString(numsT));

    dprint(Arrays.equals(nums, numsT));

    for (int j = 0; j<200; j++) {
      rng = new Random(j);
      for (int i =  0; i < 10; i++) {
        int n = (rng.nextInt() % 1000);
        nums[i] = n;
        numsT[i] = n;
      }
      Sorts.bubbleSort(nums);
      Arrays.sort(numsT);
      //dprint(Arrays.equals(nums, numsT));

      if (!Arrays.equals(nums, numsT)) {
        dprint(Arrays.equals(nums, numsT));
      }
    }

    int[] a = {1};
    int[] b = {};
    dprint("");
    dprint(Arrays.toString(a));
    Sorts.bubbleSort(a);
    dprint(Arrays.toString(a));
    dprint("");
    dprint(Arrays.toString(b));
    Sorts.bubbleSort(b);
    dprint(Arrays.toString(b));

    a = new int[] {2, 0};
    dprint("");
    dprint(Arrays.toString(a));
    Sorts.bubbleSort(a);
    dprint(Arrays.toString(a));
  }
}
