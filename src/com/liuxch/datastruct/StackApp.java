package com.liuxch.datastruct;

public class StackApp {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
        System.out.println(stack.pop());
	}

}

/***
 * 线性栈的数据结构
 * @author mac
 *
 */
class Stack{
	
	private int top = -1;
	
	private Object[] datas;
	
	private int size;
	
	public Stack(int size){
		this.size  = size;
		this.datas = new Object[size];
	}
	
	/***
	 * 入栈
	 * @param x
	 */
	public void push(int x){
		datas[++top] = x;
	}
	
	/***
	 * 出栈
	 * @return
	 */
	public Object  pop(){
		Object data = datas[top];
		top = top - 1;
		return data;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	
}
