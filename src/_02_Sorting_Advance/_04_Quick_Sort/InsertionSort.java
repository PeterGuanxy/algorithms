package _02_Sorting_Advance._04_Quick_Sort;

import _02_Sorting_Advance._02_Merge_Sort_Advance.SortTestHelper;

/**
 * description
 *
 * @author guanxy
 * @date 2018/5/23
 */
public class InsertionSort {

  // 我们的算法类不允许产生任何实例
  private InsertionSort() {
  }

  //对整个数组使用InsertionSort排序
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



  //对arr[l...r]的区间使用InsertionSort排序
  public static void sort(Comparable[] arr, int l, int r) {

    assert l >= 0 && l <= r && r < arr.length;

    for (int i = l + 1; i <= r; i++) {
      Comparable e = arr[i];
      int j = i;
      for (; j > l && arr[j - 1].compareTo(e) > 0; j--) {
        arr[j] = arr[j-1];
      }
      arr[j] = e;
    }
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  // 测试InsertionSort
  public static void main(String[] args) {

    int N = 10000;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.InsertionSort", arr);

    return;
  }
}
