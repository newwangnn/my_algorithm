package cn.wnn.base.day01;

public class MyInsertSort {

    public static void main(String[] args) {
        int[] arr = genaratorArray(10);
        show(arr);
        process(arr);
        show(arr);
    }

    public static int[] genaratorArray(int count){
        int[] arr=new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*count);
        }
        return arr;
    }
//插入排序：执行N-1次，每次N-1次交换
    public static void process(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 && arr[j]<arr[j-1]; j--) {
                swap(arr,j,j-1);
            }
        }
    }

    public static void swap(int[] arr,int i,int index){
        arr[i]=arr[i]^arr[index];
        arr[index]=arr[i]^arr[index];
        arr[i]=arr[i]^arr[index];
    }
    public static void show(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
