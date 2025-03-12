package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	List<T> list = new ArrayList<>();		
		
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		// if is not empty, print the first separately
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		// continue print array from index 1 now, since index 0 is already there.
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
		
}
