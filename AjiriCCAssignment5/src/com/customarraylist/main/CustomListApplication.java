package com.customarraylist.main;

import com.customarraylist.list.CustomArrayList;
import com.customarraylist.list.CustomList;

public class CustomListApplication 

{
	
	public static void main(String[] args) 
	
	{
		System.out.println("Welcome to Custom List Application.");	
		CustomList<String> list = new CustomArrayList<>();
		
		System.out.println(list.add("Jepp"));
		System.out.println(list.add("Oneo"));
		list.add("Salvatore");
		list.add("Gemini");
		list.add("Watchman");
		list.add("Gaara");
		list.add("Venturi");
		list.add("Passo");
		list.add("Bikini");
		list.add("Denora");
		list.add("King");
		list.add("Calypso");
		list.add("Bridget");
		list.add("Ingerwood");
		list.add("Telaviv");
		list.add("Spotted");
		list.add("Carat");
		list.add("Physis");
		list.add("Cherish");
		list.add("Bazaar");
		list.add("Scale");
		list.add("Tropica");
		list.add("Zen");
		list.add("Kleptos");
		list.add("Ginger");
		list.add("Jeepers");
		System.out.println(list.get(21));
		System.out.println(list.getSize());
		String result = list.get(13);
		System.out.println(result + "\n__________________________________");
		
		for (int count = 0; count < list.getSize(); count++)
		{
			System.out.println(list.get(count));
		}
	}

}
