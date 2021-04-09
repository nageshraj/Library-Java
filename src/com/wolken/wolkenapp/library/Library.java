package com.wolken.wolkenapp.library;

import com.wolken.wolkenapp.library.dto.*;

public class Library {
	// instance variable
	public BookDTO[] bookDTO;
	public int index;

	public Library(int size) {
		bookDTO = new BookDTO[size];

	}

	public void addBooks(BookDTO bookDTO) {

		if (bookDTO != null)
			this.bookDTO[index++] = bookDTO;
		else
			System.out.println("No Book is added because it's NULL");
	}

	public void getBookDetails() {
		for (int i = 0; i < bookDTO.length; i++) {
			System.out.println(bookDTO[i].getBookId() + " " + bookDTO[i].getBookName() + " " + bookDTO[i].getAuthor()
					+ " " + bookDTO[i].getEdition() + " " + bookDTO[i].getPrice() + " " + bookDTO[i].getPublisher()
					+ " " + bookDTO[i].getType());
		}
	}

	public BookDTO getBookByAuthor(String author) {
		BookDTO bookDTO = null;
		for (int i = 0; i < this.bookDTO.length; i++) {
			if (this.bookDTO[i] != null) {
				if (this.bookDTO[i].getAuthor().equals(author)) {
					bookDTO = this.bookDTO[i];

				} else
					System.out.println("No author found");

			}
		}

		return bookDTO;
	}

	public void updatePriceByBookName(String bookName, int price) {
		for (int i = 0; i < this.bookDTO.length; i++) {
			if (this.bookDTO[i] != null) {
				if (this.bookDTO[i].getBookName().equalsIgnoreCase(bookName)) {
					this.bookDTO[i].setPrice(price);

				} else
					System.out.println("No Book name found");

			}
		}
	}

	public void deleteBookByBookId(int bookId) {
		for (int i = 0; i < this.bookDTO.length; i++) {
			if (this.bookDTO[i] != null) {
				if (this.bookDTO[i].getBookId() == bookId) {
					this.bookDTO[i] = null;

				} else
					System.out.println("No Book id found");

			}
		}
	}
}
