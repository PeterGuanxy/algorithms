package _02_Sorting_Advance._06_Quick_Sort_Deal_With_Identical_Keys;

import _02_Sorting_Advance._02_Merge_Sort_Advance.SortTestHelper;
import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/5/23
 */
public class MergeSort {

  private MergeSort() {
  }

  //将arr[l...mid]和arr[mid+1...r]两部分进行归并
  private static void merge(Comparable[] arr, int l, int mid, int r) {

    Comparable[] aux = Arrays.copyOfRange(arr, l, r +1 );

    //初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
    int i = l, j = mid + 1;
    for (int k = l; k <= r; k++) {

      if (i > mid) {   //如果左半部分元素已经全部处理完成
        arr[k] = aux[j - l];
        j++;
      } else if (j > r) {   //如果右半部分元素已经全部处理完毕
        arr[k] = aux[i - l];
        i++;
      } else if (aux[i - l].compareTo(aux[j - l]) < 0) {  //左半部分所指元素 < 右半部分所指元素
        arr[k] = aux[i - l];
        i++;
      } else {    //左半部分所指元素 >= 右半部分所指元素
        arr[k] = aux[j - l];
        j++;
      }
    }
  }

  private static void sort(Comparable[] arr, int l, int r) {

    if (l >= r) {
      return;
    }
    int mid = (l + r) / 2;
    sort(arr, l, mid);
    sort(arr, mid + 1, r);
    merge(arr, l, mid, r);
  }

  public static void sort(Comparable[] arr) {
    int n = arr.length;
    sort(arr, 0, n - 1);
  }

  public static void main(String[] args) {

    int N = 100;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.MergeSort", arr);
    SortTestHelper.printArray(arr);
    return;
  }
}
