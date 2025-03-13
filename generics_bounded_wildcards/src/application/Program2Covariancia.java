package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2Covariancia {
	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}
	/*Vamos fazer um método que copia os elementos de uma lista para uma
	outra lista que pode ser mais genérica que a primeira. */
	public static void copy(List<? extends Number> source, List<? super Number> target) {
			for(Number number: source) {
				target.add(number);
			}
	}
	
	// method to print list
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println(); // just to break one line
	}
}
