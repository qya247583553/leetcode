import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={1,3,4,6,7,2,4,8,9,5,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
    }
        for(int i = 0; i < arr.length; i++) {
            //外循环次数是数组个数
          for(int j = 0; j < arr.length-1-i; j++) {
              //里循环的次数是随着外循环减少而减少
            if (arr[j+1]<arr[j]){
                //如果数组后面一个小于前面一个
                //则用temp把其变成前面一个
                int temp =arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
          }
        }
    }
}
