package Sorting_Basic.selection_sort_generate_test_case;

/**
 * description  测试用例
 *
 * @author guanxy
 * @date 2018/4/26
 */
public class SelectionSort {

  public static <T extends Comparable<T>> void sort(T[] arr) {

    int n = arr.length;
    for (int i=0;i<n;i++) {
      int minIndex = i;
      for (int j=i+1;j<n;j++) {
        if (arr[j].compareTo(arr[minIndex]) <0) {
          minIndex = j;
        }
      }
      swap(arr , i ,minIndex);
    }
  }

  private static void swap(Object[] arr ,int i,int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public static void main(String[] args) {
    int n = 1000;
    Integer[] arr = SortTestHelper.generateRandomArray(n,0,1000);
    sort(arr);
    SortTestHelper.printArray(arr);
  }
}
