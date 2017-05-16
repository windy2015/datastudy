package com.liuxch.datastruct;

/***
 * 
 * @author landingbj
 *
 */
public class LinkStack {
	
	public static void main(String[] args){
		MyStack myStack = new MyStack();
		Node node1 = new Node("1");
		Node node2 = new Node("2");
		Node node3 = new Node("3");
		myStack.push(node1);
		myStack.push(node2);
		myStack.push(node3);
		myStack.display();
	}

}

/***
 * 链式栈数据结构
 * @author landingbj
 *
 */
class MyStack{
	
	Node top;
	
	public void clear(){
		this.top = null;
	}
	
	public boolean isEmpty(){
		return this.top == null;
	}
	
	public Object peek(){
		if(!this.isEmpty()){
			return this.top.getData();
		}else{
			return null;
		}
	}
	
	public int length(){
		int len = 0;
		Node node =  this.top;
		while(node!=null){
			node = node.getNext();
			len++;
		}
		return len;
	}
	
	public Object pop(){
		if(!this.isEmpty()){
			Node node = top;
			top =top.getNext();
			return node.getData();
		}else{
			return null;
		}
		
	}
	
	public void push(Object data){
		Node node = new Node(data);
		node.setNext(top);
		top = node;
	}
	
	public void display(){
		while(!this.isEmpty()){
			System.out.print(pop()+"->");
		}
	}
	
}
