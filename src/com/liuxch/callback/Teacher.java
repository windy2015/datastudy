package com.liuxch.callback;

/**
 * 老师回答问题将结果传给学生
 * @author landingbj
 *
 */
public class Teacher {
	
	public void executeQuestion(CallBack callback,String question){
		System.out.println("问题是"+question);
		//模拟老师获取答案
		for(int i=0;i<10000;i++){
			
		}
		String result = "百度一下，你就知道！";
		//使用回调函数，将信息传给学生
		callback.answer(result);
		
	}

}
