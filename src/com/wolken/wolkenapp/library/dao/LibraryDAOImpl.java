package com.wolken.wolkenapp.library.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.library.dto.BookDTO;

public class LibraryDAOImpl implements LibraryDAO {

	public List<BookDTO> books = new LinkedList<BookDTO>();
	
	public LibraryDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(BookDTO dto) {
		// TODO Auto-generated method stub
		books.add(dto);
		
	}

	@Override
	public List<BookDTO> getAllBooks() {
		List<BookDTO> bookDTOs = new LinkedList<BookDTO>();
	Iterator<BookDTO> itr = books.iterator();
	while(itr.hasNext()) {
		Object object =  itr.next();
		bookDTOs.add((BookDTO)object);
		System.out.println(object);
	}
	return bookDTOs;
	}
	

}
