package cn.wnn.base.day02;

import java.util.Stack;
//如何用栈结构实现队列
public class MyStackToQueue
{
    public Stack<Integer> pushStack;
    public Stack<Integer> popStack;

    public MyStackToQueue() {
        pushStack=new Stack<Integer>();
        popStack=new Stack<Integer>();
    }

    public void push(int value){
        pushStack.push(value);
        pushToPop();
    }

    private void pushToPop() {
        if(popStack.empty()){
            while (!pushStack.empty()){
                popStack.push(pushStack.pop());
            }
        }
    }

    public int pop(){
        if(popStack.empty() && pushStack.empty()){
            throw  new RuntimeException("queue is empty!");
        }
        pushToPop();
        return popStack.pop();
    }

    public int peek(){
        if(popStack.empty() && pushStack.empty()){
            throw  new RuntimeException("queue is empty!");
        }
        pushToPop();
        return popStack.peek();
    }

    public static void main(String[] args) {
        MyStackToQueue queue = new MyStackToQueue();
        queue.push(1);
        queue.push(2);

        System.out.println("----------");
        int value = queue.pop();
        System.out.println(value);
        value = queue.pop();
        System.out.println(value);
        value = queue.pop();
        System.out.println(value);

    }
}
