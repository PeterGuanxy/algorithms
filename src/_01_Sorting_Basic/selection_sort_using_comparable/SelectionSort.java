package _01_Sorting_Basic.selection_sort_using_comparable;

/**
 * Created by guanxy on 2018/4/25.
 * <p>
 * 排序算法（泛型）
 */
public class SelectionSort {

  public static void sort(Comparable[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j].compareTo(arr[minIndex]) < 0) {
          minIndex = j;
        }
      }
      swap(arr, i, minIndex);
    }
  }

  public static void swap(Object[] arr, int i, int j) {
    Object temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    Integer[] intArr = {1, 4, 6, 3, 2, 5, 7, 8, 9};
    sort(intArr);
    System.out.println("整数数组测试");
    for (int i = 0; i < intArr.length; i++) {
      System.out.print(intArr[i]);
      System.out.print("  ");
    }
    System.out.println();

    Double[] doubleArr = {0.12, 3.14, 5.168, 1.06};
    sort(doubleArr);
    System.out.println("小数数组测试");
    for (int i = 0; i < doubleArr.length; i++) {
      System.out.print(doubleArr[i]);
      System.out.print("  ");
    }
    System.out.println();

    String[] stringArr = {"A", "D", "C", "B"};
    sort(stringArr);
    System.out.println("字符串数组测试");
    for (int i = 0; i < stringArr.length; i++) {
      System.out.print(stringArr[i]);
      System.out.print("  ");
    }
    System.out.println();

    Student[] stuArr = new Student[4];
    stuArr[0] = new Student("A", 98);
    stuArr[1] = new Student("B", 20);
    stuArr[2] = new Student("C", 99);
    stuArr[3] = new Student("D", 60);
    sort(stuArr);
    for (int i = 0; i < stuArr.length; i++) {
      System.out.println(stuArr[i]);
    }
  }
}
