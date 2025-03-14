package application;

import java.util.Set;
import java.util.TreeSet;

import entities.TreeSetCompareProduct;

public class TreeSetCompareElements {

	public static void main(String[] args) {
		Set<TreeSetCompareProduct> set = new TreeSet<>();
		set.add(new TreeSetCompareProduct("TV", 900.0));
		set.add(new TreeSetCompareProduct("Notebook", 1200.0));
		set.add(new TreeSetCompareProduct("Tablet", 400.0));
		
		for (TreeSetCompareProduct p : set) {
		System.out.println(p);
		}
	}

}
