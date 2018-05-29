package _02_Sorting_Advance._03_Merge_Sort_Bottom_Up;

import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/5/30
 */
public class MergeSortBU {

  private MergeSortBU() {
  }

  private static void merge(Comparable[] arr, int l, int mid, int r) {

    Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);

    int i = l, j = mid + 1;

    for (int k = l; k <= r; k++) {

      if (i > mid) {
        arr[k] = aux[j - l];
        j++;
      } else if (j > r) {
        arr[k] = aux[i - l];
        i++;
      } else if (aux[i - l].compareTo(aux[j - l]) < 0) {
        arr[k] = aux[i - l];
        i++;
      } else {
        arr[k] = aux[j - l];
        j++;
      }
    }
  }

  public static void sort(Comparable[] arr) {
    int n = arr.length;

    //对于小数组使用插入排序优化
    for (int i = 0; i < n; i += 16) {
      InsertionSort.sort(arr, i, Math.min(i + 15, n - 1));
    }

    for (int size = 16; size < n; size += size) {
      for (int i = 0; i < n - size; i += size + size) {
        if (arr[i + size - 1].compareTo(arr[i + size]) > 0) {
          merge(arr, i, i + size - 1, Math.min(i + size + size - 1, n - 1));
        }
      }
    }
  }

  public static void main(String[] args) {
    int N = 100;
    Integer[] arr = SortTestHelper.generateRandomArray(N,0,100);
    SortTestHelper.testSort("_02_Sorting_Advance._03_Merge_Sort_Bottom_Up.MergeSortBU",arr);
    SortTestHelper.printArray(arr);
    return;
  }
}
