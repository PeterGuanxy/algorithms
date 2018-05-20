package _01_Sorting_Basic.other_sort;

/**
 * description  希尔排序
 *
 * @author guanxy
 * @date 2018/5/15
 */
public class ShellSort {

  public static void sort(Comparable[] arr) {

    int n = arr.length;

    int h = 1;
    while (h < n / 3) {
      h = 3 * h + 1;
    }

    while (h >= 1) {
      for (int i = h; i < n; i++) {
        Comparable e = arr[i];
        int j = i;
        for (; j >= h && e.compareTo(arr[j - h]) < 0; j -= h) {
          arr[j] = arr[j - h];
        }
        arr[j] = e;
      }
      h /= 3;
    }
  }
}
