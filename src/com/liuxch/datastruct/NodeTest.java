package com.liuxch.datastruct;

/***
 * 链表数据结构
 * @author mac
 *
 */
public class NodeTest {
	
	public static void main(String[] args){
		NodeList nodeList = new NodeList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		nodeList.addNode(node1);
		nodeList.addNode(node2);
		nodeList.addNode(node3); 
		System.out.println("遍历节点：");
		nodeList.printNodes();
		nodeList.removeNode(node3);
		System.out.println("删除后遍历节点：");
		nodeList.printNodes();
		System.out.println("删除后list长度："+nodeList.getNodeListLen());
		
	}

}

class Node{
	
	private int data;
	
	private Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class NodeList{
	
	//头指针
	Node head,tail;
	
	public NodeList(){
		this.head = null;
		tail = null;
	}
	
	/***
	 * 链表添加节点
	 * @param node
	 */
	public void addNode(Node node){
		if(this.head == null){
			this.head = node;
		    this.tail = node;
		}else{
			tail.setNext(node);
			tail = node;
		}
		
	}
	
	/**
	 * 删除节点
	 * @param node
	 */
   public void removeNode(Node node){
	   Node cur = head;
	   Node pre = head;
	   while(cur.getData() != node.getData()){
		   if(cur.getNext()==null){
			 break;
		   }
		   pre = cur;
		   cur = cur.getNext();
	   }
	   
	   if(cur == head){
		   head = head.getNext();
	   }else{
		   pre.setNext(cur.getNext());
		   
	   }
	   
		   
	   
   }
   
   /***
    * 遍历节点
    */
   public void printNodes(){
	   Node cur = head;
	   while(cur!=null){
		   System.out.print(cur.getData()+"->");
		   cur = cur.getNext();
	   }
	   System.out.println();
   }
   
   /***
    * 获取链表节点个数
    */
   public int getNodeListLen(){
	   Node cur = head;
	   int len = 0;
	   while(cur!=null){
		   len ++;
		   cur = cur.getNext();
	   }
	   return len;
   }
	
}
