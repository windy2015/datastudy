package com.liuxch.inner;

/**
 * 内部类例子
 * @author landingbj
 *
 */
public class OuterClassTest {
	
	public static void main(String[] args){
		OuterClass outer = new OuterClass("nick",25);
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.visit();
	}

}

/***
 * 普通内部类可以直接访问外部类成员
 * @author landingbj
 *
 */
class OuterClass{
	
	private String name;
	
	private int age;
	
	public OuterClass(String name ,int age){
		this.age = age;
		this.name = name;
	}
	
	class InnerClass{
		
		/***
		 * 访问外部类成员变量
		 */
		public void visit(){
			System.out.println(name);
			System.out.println(age);
		}
		
	}
}
