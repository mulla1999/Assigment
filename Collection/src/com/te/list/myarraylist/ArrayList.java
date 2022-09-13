package com.te.list.myarraylist;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {
	private Object[] array;
	private int index;

	public ArrayList() {
		array = new Object[10];

	}

	public int size() {
		return index;
	}

//logic for increase the length of array
	public void add(Object obj) {
		if (index >= array.length - 1) {
			increasecapacity();

		}
		array[index] = obj;
		index++;
	}

	private void increasecapacity() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];

		}
		array = temp;

	}

	public Object get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		return "ArrayList [array=" + Arrays.toString(array) + ", index=" + index + "]";
	}

//logic for remove the element
	public void remove(Object obj) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];

				}

				index--;
				return;
			}

		}

	}

	public Iterator<Object> iterator() {
		return new myItr();
	}

	class myItr implements Iterator<Object> {
		private int index;

		@Override
		public boolean hasNext() {
			if (array[index] != null)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}

	}

}
