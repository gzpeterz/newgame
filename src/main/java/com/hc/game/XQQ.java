package com.hc.game;

import java.util.Random;

public class XQQ implements Student {
	Random random = new Random();
	@Override
	public String getName() {
		
		return "xqq";
	}

	@Override
	public String getWords() {
	
		String[] arr ={"你好","你们好","嘿嘿","boy","friend"};
		int i = random.nextInt(arr.length);
		return arr[i];
	}

}
