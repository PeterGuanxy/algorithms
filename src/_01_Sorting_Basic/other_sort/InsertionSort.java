package _01_Sorting_Basic.other_sort;

/**
 * description    改进版插入排序
 *
 * @author guanxy
 * @date 2018/5/8
 */
public class InsertionSort {

  public static void sort(Comparable[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      Comparable e = arr[i];
      int j = i;
      for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[j] = e;
    }
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public static void main(String[] args) {
    int N = 20000;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
    SortTestHelper.testSort("_01_Sorting_Basic.insertion_sort_advance.InsertionSort", arr);

    return;
  }
}
