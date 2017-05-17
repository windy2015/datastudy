package com.liuxch.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		String[] words = {"hello world","hello mike"};
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		for(String str : words){
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()){
				String key = st.nextToken();
				if(maps.containsKey(key)){
					int count = maps.get(key)+1;
					maps.put(key, count);
				}else{
					maps.put(key, 1);
				}
			}
		}
		
		for(Entry<String,Integer> entry : maps.entrySet()){
			System.out.println(entry.getKey()+"出现次数:"+entry.getValue());
		}

	}

}
