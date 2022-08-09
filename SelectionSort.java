import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
      int[] arr={1,3,4,6,7,2,4,8,9,5,6};
      System.out.println(Arrays.toString(arr));
      selectionSort(arr);
      System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        if (arr ==null || arr.length<2){//数组为空或者数组只有一个就不用排序
            return;
        }
        //0~N-1选择一个最小值放到最前面
        //1~N-1选择一个最小值放到最前面
        //2~N-1选择一个最小值放到最前面
        //N~N-1选择一个最小值放到最前面
        int N =arr.length;
        for(int i = 0; i < N; i++) {
          //不断的往后推，在n~n-1范围内找最小值
            int MinValue=i;//默认情况下i位置是最小位置的数
            for(int j = i+1; j < N; j++) {
              //i往后所有东西都看一遍，现在是i和i+1范围
                if (arr[j] < arr[MinValue])//找到最小的数, 如果前面的数字大
                    MinValue = j;//则最小值变成后面的数字
            }
            int temp = arr[MinValue];//进行交换
            arr[MinValue] = arr[i];
            arr[i] = temp;
            //再进行下一个循环
        }
    }
}
