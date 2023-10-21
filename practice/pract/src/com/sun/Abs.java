package com.sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class Abs {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 9, 8, 7, 6, 5);		
		Stream<Integer> strm = list.stream();
		strm
			.filter(ele -> {
				System.out.println("filter() -- odd -- " + ele);
				return ele % 2 != 0;
			})
		.map(ele -> {
			System.out.println("map() -- squaring -- " + ele);
				return ele * ele;
		})
			.sorted((x,y) -> {
				System.out.println("sorted() -- comparing -- " + x + ", " + y);
				return x - y;
			})
			.map(ele -> {
				System.out.println("map() -- prefixing -- " + ele);
				return "DAC-" + ele;
		})
			.forEach(ele -> {
				System.out.println("forEach() -- printing -- " + ele);
			});	
		System.out.println("Good bye!");
	}
}
