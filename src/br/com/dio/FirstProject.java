package br.com.dio;

import br.com.dio.model.Cat;

public class FirstProject {
	public static void main(String[] args) {
		Book book = new Book();
		Cat cat = new Cat(null, null, null);
		
		System.out.println(cat);
		System.out.println(book);

	}
	
}

class Book{
	private String name;
	private String pagenum;
}

