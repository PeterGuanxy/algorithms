package Sorting_Basic.insertion_sort_advance;

import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/5/8
 */
public class Main {

  public static void main(String[] args) {
    int N = 20000;

    //测试1 一般测试
    System.out.println("Test for random array,size=" + N + ",random range [0," + N + "]");

    Integer[] arr1 = SortTestHelper.generateRandomArray(N,0,N);
    Integer[] arr2 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.InsertionSort",arr2);

    System.out.println();

    //测试2  有序性强的测试
    System.out.println("Test for random array,size=" + N + ",random range [0,3]");

    arr1 = SortTestHelper.generateRandomArray(N,0,3);
    arr2 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.InsertionSort",arr2);

    System.out.println();

    //测试3  测试近乎有序的数组
    int swapTimes = 22;
    System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

    arr1 = SortTestHelper.generateNearlyOrderArray(N,swapTimes);
    arr2 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.insertion_sort_advance.InsertionSort",arr2);

    return;

  }
}
