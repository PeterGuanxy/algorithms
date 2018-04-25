package Sorting_Basic.selection_sort;

/**
 * Created by guanxy on 2018/4/25.
 *
 * 排序算法
 */
public class SelectionSort {

  public static void sort(int[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      swap(arr, i , minIndex);
    }
  }

  public static void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = {1,3,4,5,2,8,6,7,9};
    sort(arr);
    for (int i=0 ; i<arr.length;i++) {
      System.out.print(arr[i]);
      System.out.print(",");
    }
  }

}
