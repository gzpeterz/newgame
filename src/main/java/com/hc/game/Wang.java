package com.hc.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wang implements Student {
	
	private String name;
	@Override
	public String getName() {
		name = "王俊朋";
		return name;
	}

	@Override
	public String getWords() {
		List<String> list = new ArrayList<String>();
		list.add("你猜我是谁");
		list.add("to be or not to be");
		list.add("you are so beautiful!");
		list.add("卡哇伊");
		
		Random random = new Random();
		int word = random.nextInt(list.size());
		return list.get(word);
	}

}
