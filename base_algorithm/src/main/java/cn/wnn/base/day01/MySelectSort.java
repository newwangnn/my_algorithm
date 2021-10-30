package cn.wnn.base.day01;

import java.util.Random;

public class MySelectSort {

    public static void main(String[] args) {

        int[] arr = getArray(10);
        show(arr);
        selectSort(arr);
        show(arr);
    }


    public static int[] getArray(int count){
        int[] arr=new int[count];
        for (int i = 0; i <count ; i++) {
            arr[i]=(int)(Math.random()*count);
        }
       return arr;
    }
//选择排序要查找n-1次，每次找到最小或最大的下标之后与当前起始下标交换
    public static void selectSort(int[] arr){
//从前往后依次排好
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
//                降序
                if(arr[index]<arr[j])
                    index=j;
//                升序
//                if(arr[index]>arr[j]){
//                    index=j;
//                }
            }
            if(i!=index)
                swap(arr,i,index);
        }
    }

    public static void selectSort2(int[] arr){
//从后往前依次排好
        for (int i = arr.length-1; i >=0 ; i--) {
            int index = i;
            for (int j = 0; j < i; j++) {
//                降序
                if(arr[index]>arr[j])
                    index=j;
//                升序
//                if(arr[index]>arr[j]){
//                    index=j;
//                }
            }
            if(i!=index)
                swap(arr,i,index);
        }
    }

    private static void swap(int[] arr, int i, int index) {
        arr[i]=arr[i]^arr[index];
        arr[index]=arr[i]^arr[index];
        arr[i]=arr[i]^arr[index];
    }
    private static void swap1(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }

    private static void show(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

}
