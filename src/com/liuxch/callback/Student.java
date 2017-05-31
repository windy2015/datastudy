package com.liuxch.callback;

/***
 * 学生向老师提问
 * @author landingbj
 *
 */
public class Student implements CallBack{
    
	//持有老师的引用
	private Teacher teacher;
	
	/**
	 * 注册老师
	 * @param teacher
	 */
	public void regist(Teacher teacher){
		this.teacher = teacher;
	}
	
	/***
	 * 用一个线程模拟异步调用
	 */
	public void askQuestion( final String question){
		new Thread(){

			@Override
			public void run() {
				teacher.executeQuestion(Student.this,question);
			}
			
		}.start();
		pratice();
	}
	
	/**
	 * 做其他的练习题
	 */
	public void pratice(){
		System.out.println("练习其他的题目");
	}
	
	
	
	/***
	 * 老师通过这个方法回答学生的问题
	 */
	public void answer(String result) {
		System.out.println("问题的答案是"+result);
		
	}
	
	

}
