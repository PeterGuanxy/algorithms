package Sorting_Basic.insertion_sort_advance;

import java.lang.reflect.Method;

/**
 * description    测试用例构造器
 *
 * @author guanxy
 * @date 2018/5/8
 */
public class SortTestHelper {

  /**
   * 生成有n个元素的数组，每个元素的随机范围为[rangeL,rangeR]
   **/
  public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
    assert rangeL <= rangeR;

    Integer[] arr = new Integer[n];

    for (int i = 0; i < n; i++) {
      arr[i] = new Integer((int) (Math.random() * (rangeR - rangeL + 1) + rangeL));
    }

    return arr;
  }

  /**
   * 生成一个近乎有序的数组
   * 首先生成一个完全有序的数组，之后随即交换swapTimes对数据
   * swapTimes定义了数组的无序程度，=0完全有序，越大越趋于无序
   */
  public static Integer[] generateNearlyOrderArray(int n, int swapTimes) {

    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = new Integer(i);
    }

    for (int i = 0; i < swapTimes; i++) {
      int a = (int) (Math.random() * n);
      int b = (int) (Math.random() * n);
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
    }

    return arr;
  }

  /**
   * 打印arr数组的所有内容
   */
  public static void printArray(Object arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      System.out.print("  ");
    }
    System.out.println();
  }

  /**
   * 判断arr数组是否有序
   */
  public static boolean isSorted(Comparable[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i].compareTo(arr[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }

  public static void testSort(String sortClassName, Comparable[] arr) {
    try {
      //通过sortClassName获得排序函数的Class对象
      Class sortClass = Class.forName(sortClassName);
      //通过排序函数的Class对象获得排序方法
      Method sortMethod = sortClass.getMethod("sort", new Class[]{Comparable[].class});

      Object[] params = new Object[]{arr};

      long startTime = System.currentTimeMillis();

      sortMethod.invoke(null, params);
      long endTime = System.currentTimeMillis();

      assert isSorted(arr);
      System.out.println(sortClass.getSimpleName() + ":" + (endTime - startTime) + "ms");
    } catch (Exception e) {
      System.out.println("error");
      e.printStackTrace();
    }
  }

}
