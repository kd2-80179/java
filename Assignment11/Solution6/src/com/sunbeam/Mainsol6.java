package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mainsol6 {
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1.Accept");
		System.out.println("2.find in map ");
		
		
		
		return choice;
	}
	public static void main(String[] args) {
		int choice, index, count = 0;
		Student  key;
		String isbn;

		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> map = new HashMap<>();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Student  b = new Student();
				b.accept();
				map.put(b.getIsbn() ,b);
				

				break;
				// TODO Auto-generated method stub

	}

}
