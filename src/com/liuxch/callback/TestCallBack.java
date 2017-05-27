package com.liuxch.callback;

public class TestCallBack {

	public static void main(String[] args) {
	    Student stu = new Student();
	    Teacher teah = new Teacher();
	    stu.regist(teah);
        String question = "怎样搜索！";
        stu.askQuestion(question);
	}

}
