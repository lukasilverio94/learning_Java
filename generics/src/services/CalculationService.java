package services;

import java.util.List;

public class CalculationService<T> {
	
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		T max = list.get(0);
		for (T item : list) {
			// compara item com max, se for > 0 quer dizer que item é maior que max.
			// se retornar negativo, quer dizer que item é menor que max
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
