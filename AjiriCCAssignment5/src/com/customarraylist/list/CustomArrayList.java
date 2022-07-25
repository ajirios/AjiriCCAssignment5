package com.customarraylist.list;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items;
	private int size;
	
	public CustomArrayList()
	{
		this.items = new Object[10];
		Arrays.fill(this.items, null);
		this.size = 0;
	}

	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		if (this.size < this.items.length)
		{
			this.items[this.size] = item;
			if (this.items[this.size].equals(item))
			{
				isAdded = true;
			}
			this.size++;
		}
		else if (this.size >= this.items.length)
		{
			Object[] nextItems = new Object[this.items.length * 2];
			System.arraycopy(this.items, 0, nextItems, 0, this.size);
			this.items = nextItems;
			this.items[this.size] = item;
			if (this.items[this.size].equals(item))
			{
				isAdded = true;
			}
			this.size++;
		}
		return isAdded;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if (index < this.size)
		{
			return (T) items[index];
		}
		return null;
	}
	
}
