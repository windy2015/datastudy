package com.liuxch.datastruct;

/***
 * 数组常用数据结构，寻址快，插入，删除耗内存
 * @author mac
 *
 */
public class ArrayTest {

	public static void main(String[] args) {
		//声明分配内存
		int[] arr = new int[10];
		//int[] arr = {2,3,4}
		for(int i=0, len = arr.length;i<len;i++){
			arr[i] = i;
		}
		
		for(int x : arr){
			System.out.println(x);
		}
	}

}
