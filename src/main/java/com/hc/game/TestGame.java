package com.hc.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {

		// 真心话 大冒险
		// 产生 随机对象
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Zuocheng zc = new Zuocheng();
		List<Student> list = new ArrayList<Student>();
		list.add(new XQQ());
		Student wang = new Wang();
		list.add(wang);
		list.add(zc);
		while (true) {
			int index = random.nextInt(list.size());
			Student s = list.get(index);
			String name = s.getName();
			String statement = s.getWords();
			System.out.println("=======================================================");
			System.out.println(name + "的真心话是 ");
			scanner.nextLine();
			System.out.println(statement);
		}
	}

}
