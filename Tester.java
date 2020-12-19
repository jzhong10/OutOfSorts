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
  public static int[] revArray(int[] arr) {
    int[] ttt = new int[arr.length];
    for (int i = 0; i<arr.length; i++) {
      ttt[i] = arr[arr.length-i-1];
    }
    return ttt;
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
/*
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

    a = new int[] {1,1,1,0,1,1};
    dprint("");
    dprint(Arrays.toString(a));
    Sorts.bubbleSort(a);
    dprint(Arrays.toString(a));

    int ha = 100;
    a = new int[ha];
    rng = new Random();
    for(int i =  0; i < ha/2; i++) {
      int n = (rng.nextInt() % 1000);
      a[2*i] = n;
      a[2*i+1] = n;
    }

    dprint("");
    dprint(Arrays.toString(a));
    Sorts.bubbleSort(a);
    dprint(Arrays.toString(a));
    int[] eTest = Arrays.copyOf(a, a.length);
    dprint(Arrays.equals(eTest, a));

    ha = 20;
    a = new int[ha];
    rng = new Random();
    for(int i =  0; i < ha/2; i++) {
      int n = (rng.nextInt() % 1000);
      a[2*i] = n;
      a[2*i+1] = n;
    }

    Arrays.sort(a);
    b = new int[a.length];
    for (int i = 0; i<a.length; i++) {
      b[i] = a[a.length-1-i];
    }
    dprint("");
    dprint(Arrays.toString(b));
    Sorts.bubbleSort(b);
    dprint(Arrays.toString(b));
    eTest = Arrays.copyOf(b, b.length);
    dprint(Arrays.equals(eTest, b));
*/
    dprint(Arrays.toString(nums));
    dprint(Arrays.toString(numsT));
    dprint("");
    Sorts.selectionSort(nums);
    Arrays.sort(numsT);
    dprint(Arrays.toString(nums));
    dprint(Arrays.toString(numsT));
    dprint(Arrays.equals(nums, numsT));

    rng = new Random();
    int n = 1000;
    nums = new int[n];
    numsT = new int[n];
    for(int i =  0; i < n; i++) {
      int x = (rng.nextInt() % 1000);
      nums[i] = x;
      numsT[i] = x;
    }
    Sorts.selectionSort(nums);
    Arrays.sort(numsT);
    dprint(Arrays.equals(nums, numsT));

    rng = new Random(2);
    n = 10;
    nums = new int[n];
    numsT = new int[n];
    for(int i =  0; i < n; i++) {
      int x = (rng.nextInt() % 1000);
      nums[i] = x;
      numsT[i] = x;
    }
    dprint("InsertionSort Testing");
    dprint(Arrays.toString(nums));
    System.out.println();
    //nums = new int[] {-216, -79, 744, 135, 778};
    Sorts.insertionSort(nums);
    Arrays.sort(numsT);
    dprint("");
    dprint(Arrays.toString(nums));
    dprint(Arrays.toString(numsT));

    dprint(Arrays.equals(nums, numsT));
  }
}
