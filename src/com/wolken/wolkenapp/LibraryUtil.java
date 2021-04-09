package com.wolken.wolkenapp;

import com.wolken.wolkenapp.library.*;
import com.wolken.wolkenapp.library.dto.BookDTO;

import java.util.Scanner;

public class LibraryUtil {

	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();

		Library library = new Library(size);

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Book ID");
			int bookId = scanner.nextInt();

			System.out.println("Enter Book Author");
			String bookAuthor = scanner.next();

			System.out.println("Enter Book Name");
			String bookName = scanner.next();

			System.out.println("Enter Book Edition");
			String bookEdition = scanner.next();

			System.out.println("Enter Book Type");
			String bookType = scanner.next();

			System.out.println("Enter Book Price");
			int bookPrice = scanner.nextInt();

			System.out.println("Enter Book Publisher");
			String bookPublisher = scanner.next();

			BookDTO bookDTO = new BookDTO();
			bookDTO.setBookId(bookId);
			bookDTO.setAuthor(bookAuthor);
			bookDTO.setBookName(bookName);
			bookDTO.setEdition(bookEdition);
			bookDTO.setPrice(bookPrice);
			bookDTO.setPublisher(bookPublisher);
			bookDTO.setType(bookType);

			library.addBooks(bookDTO);
		}
		library.getBookDetails();
		BookDTO bookDTO = library.getBookByAuthor("raj");
		System.out.println(bookDTO.getBookId() + " " + bookDTO.getBookName() + " " + bookDTO.getAuthor() + " "
				+ bookDTO.getEdition() + " " + bookDTO.getPrice() + " " + bookDTO.getPublisher() + " "
				+ bookDTO.getType());

		library.updatePriceByBookName("digital", 1000);
		System.out.println("The updated data is:");
		System.out.println(bookDTO.getBookId() + " " + bookDTO.getBookName() + " " + bookDTO.getAuthor() + " "
				+ bookDTO.getEdition() + " " + bookDTO.getPrice() + " " + bookDTO.getPublisher() + " "
				+ bookDTO.getType());

		library.deleteBookByBookId(01);
		System.out.println("Data has been successfully deleted ");
		System.out.println(bookDTO.getBookId() + " " + bookDTO.getBookName() + " " + bookDTO.getAuthor() + " "
				+ bookDTO.getEdition() + " " + bookDTO.getPrice() + " " + bookDTO.getPublisher() + " "
				+ bookDTO.getType());

		scanner.close();
	}

}
