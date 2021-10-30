package cn.wnn.base.day01;



public class MyBubbleSort {

    public static void main(String[] args) {
        int[] arr =  genaratorArray(6);
        show(arr);
        process(arr);
        show(arr);
    }
//冒泡排序，执行N-1轮，每次两两比较交换
    private static void process(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        arr[j]=arr[j]^arr[i];
        arr[i]=arr[j]^arr[i];
        arr[j]=arr[j]^arr[i];
    }

    private static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    private static int[] genaratorArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*count);
        }
        return arr;
    }
}
