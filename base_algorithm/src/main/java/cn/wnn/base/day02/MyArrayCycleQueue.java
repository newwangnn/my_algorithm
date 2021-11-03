package cn.wnn.base.day02;

import java.util.Scanner;

public class MyArrayCycleQueue {

    private int limit;
    private int pushIndex;
    private int popIndex;
    private int size;
    private int[] arr;

    public MyArrayCycleQueue(int lenght) {
        arr=new int[lenght];
        limit=lenght;
        size=0;
        pushIndex=0;
        popIndex=0;
    }
    //    模拟环形队列
    public void push(int value){
        if(size==limit)
            System.out.println("栈满了，不能加了");
        size++;
        arr[pushIndex]=value;
        pushIndex=nextIndex(pushIndex);

    }

    private int nextIndex(int i) {
        return i<limit-1?i+1:0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int pop(){
        if(size==0){
            throw new RuntimeException("栈空了，不能拿了");
        }
        size--;
        int value=arr[popIndex];
        popIndex=nextIndex(popIndex);
        return value;
    }

    public void show(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayCycleQueue arr = new MyArrayCycleQueue(5);

        while (true){
            System.out.println("1 push");
            System.out.println("2 pop");
            System.out.println("3 show");
            System.out.println("=========================");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("添加数：");
                    int a = scanner.nextInt();
                    arr.push(a);
                    break;
                case 2:
                    int pop = arr.pop();
                    System.out.println(pop);
                    break;
                case 3:
                    arr.show();
                    break;
            }

            System.out.println("--------------------------");
        }

    }

}
