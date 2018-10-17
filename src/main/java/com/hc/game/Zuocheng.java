package com.hc.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zuocheng implements Student {

	@Override
	public String getName() {

		return "zuocheng";
	}

	@Override
	public String getWords() {
		Random ra = new Random();

		List<String> list = new ArrayList<String>();
		list.add("kjhgkla");
		list.add("389579t");
		list.add("skjbfla");
		list.add("d32jeiopu");
		int index = ra.nextInt(list.size());
		String world = list.get(index);

		return world;
	}

}
