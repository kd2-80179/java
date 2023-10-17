package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02main {

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "gouri", "sagar", 88.8);
		arr[1] = new Student(1, "surya", "bhopal", 88.8);
		arr[2] = new Student(4, "Prashant", "bhopal", 60.0);
		arr[3] = new Student(5, "Prashant", "pune", 60.0);
		arr[4] = new Student(2, "Nitin", "punam ", 70.0);
		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);

		Arrays.sort(arr);

		System.out.println("After Sort by Empno: ");
		for (Student e : arr)
			System.out.println(e);

		class studentnamemarks_Comparator implements Comparator<Student> {
			@Override
			public int compare(Student e1, Student e2) {
				int diff = e2.getName().compareTo(e1.getName());
				if (diff == 0)
					diff = Double.compare(e1.getMarks(), e2.getMarks());
				   if(diff==0)
					   
				diff = e2.getCity().compareTo(e1.getName());
				if (diff == 0)
					diff = e1.getCity().compareTo(e2.getName());
				if (diff == 0)
					diff = - Double.compare(e1.getMarks(), e2.getMarks());
					return diff;
				}
			}
			
	
		studentnamemarks_Comparator marksdescComparator = new studentnamemarks_Comparator();
			Arrays.sort(arr, marksdescComparator);
			System.out.println("After Sort by marks Desc: ");
			for (Student e : arr)
				System.out.println(e);
			
		}	
			
		
	

}
}
}
