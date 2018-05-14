package Sorting_Basic.other_sort;

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
    Integer[] arr3 = Arrays.copyOf(arr1,arr1.length);
    Integer[] arr4 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.other_sort.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.other_sort.InsertionSort",arr2);
    SortTestHelper.testSort("Sorting_Basic.other_sort.BubbleSort",arr3);
    SortTestHelper.testSort("Sorting_Basic.other_sort.ShellSort",arr4);

    System.out.println();

    //测试2  有序性强的测试
    System.out.println("Test for random array,size=" + N + ",random range [0,3]");

    arr1 = SortTestHelper.generateRandomArray(N,0,3);
    arr2 = Arrays.copyOf(arr1,arr1.length);
    arr3 = Arrays.copyOf(arr1,arr1.length);
    arr4 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.other_sort.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.other_sort.InsertionSort",arr2);
    SortTestHelper.testSort("Sorting_Basic.other_sort.BubbleSort",arr3);
    SortTestHelper.testSort("Sorting_Basic.other_sort.ShellSort",arr4);
    System.out.println();

    //测试3  测试近乎有序的数组
    int swapTimes = 22;
    System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

    arr1 = SortTestHelper.generateNearlyOrderArray(N,swapTimes);
    arr2 = Arrays.copyOf(arr1,arr1.length);
    arr3 = Arrays.copyOf(arr1,arr1.length);
    arr4 = Arrays.copyOf(arr1,arr1.length);

    SortTestHelper.testSort("Sorting_Basic.other_sort.SelectionSort",arr1);
    SortTestHelper.testSort("Sorting_Basic.other_sort.InsertionSort",arr2);
    SortTestHelper.testSort("Sorting_Basic.other_sort.BubbleSort",arr3);
    SortTestHelper.testSort("Sorting_Basic.other_sort.ShellSort",arr4);
    return;

  }
}
