package com.liuxch;

/***
 * 递归测试
 * @author landingbj
 *
 */
public class RecurTest {
	
	public static void recur_display(int n){
		int temp = n;
		System.out.println("递进:"+temp);
		if(n>0){
		    recur_display(--n);	
		}		   
		System.out.println("回归:"+temp);
	}

	public static void main(String[] args) {
		recur_display(5);

	}

}
