package com.liuxch.sort;

/**
 * 基本排序包括冒泡排序，选择排序，直接插入排序
 * @author mac
 *
 */
public class BasicSort {
	
	public static void print(int[] arr){
		for(int v :arr){
			System.out.print(v+"->");
		}
		System.out.println();
	}
	
	/***
	 * 冒泡排序
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		int len = arr.length;
		int i,j;
		for(i=0;i<len-1;i++){
			for(j=i+1;j<len;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		print(arr);
	}
	
	/***
	 * 选择排序
	 */
	public static void selectSort(int[] arr){
		int i,j;
		int len = arr.length;
		for(i=0;i<len-1;i++){
			int index = i;
			for( j=i+1;j<len;j++){
				if(arr[j]<arr[index]){
					index = j;
				}
			}
			
			if(index!=i){
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		print(arr);
	}
	
	/**
	 * 直接插入排序
	 * @param arr
	 */
	public static void insertSort(int[] arr){
		int len = arr.length;
		int i,j;
		for(i=1;i<len;i++){
			int key = arr[i];
			for(j=i-1;j>=0;j--){
			   if(key<arr[j])	{
				   arr[j+1] = arr[j];
			   }else{
				   break;
			   }
			}
			arr[j+1] = key;
			
		}
		print(arr);
	}

	public static void main(String[] args) {
		int[] arr = {1,6,5,3,4,2,7,9,8,10};
		System.out.println("冒泡排序：");
		bubbleSort(arr);
		System.out.println("选择排序：");
		selectSort(arr);
		System.out.println("插入排序：");
		insertSort(arr);

	}

}
