package _02_Sorting_Advance._05_Quick_Sort_Deal_With_Nearly_Ordered_Array;

import _02_Sorting_Advance._04_Quick_Sort.SortTestHelper;

/**
 * description
 *
 * @author Peter Guan
 * @date 2018/8/13
 */
public class QuickSort {

  private QuickSort() {
  }

  // 对arr[l...r]部分进行partition操作
  // 返回p，使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
  private static int partition(Comparable[] arr, int l, int r) {

    // 随机在arr[l...r]的范围中，选择一个数值作为标定点pivot
    swap(arr, l, (int) (Math.random() * (r - l + 1)) + l);

    Comparable v = arr[l];

    int j = l;  // arr[l+1...j] < v ; arr[j+1...r] > v
    for (int i = l + 1; i <= r; i++) {
      if (arr[i].compareTo(v) < 0) {
        j++;
        swap(arr, j, i);
      }
    }

    swap(arr, l, j);

    return j;
  }

  // 递归使用快速排序，对arr[l...r]的范围进行排序
  private static void sort(Comparable[] arr, int l, int r) {

    if (r - l <= 15) {
      InsertionSort.sort(arr, l, r);
      return;
    }

    int p = partition(arr, l, r);
    sort(arr, l, p - 1);
    sort(arr, p + 1, r);
  }

  public static void sort(Comparable[] arr) {
    int n = arr.length;
    sort(arr, 0, n - 1);
  }


  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  // 测试
  public static void main(String[] args) {
    int N = 100000;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.QuickSort", arr);
//    SortTestHelper.printArray(arr);
  }
}
