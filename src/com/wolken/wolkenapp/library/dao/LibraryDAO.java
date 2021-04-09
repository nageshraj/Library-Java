package com.wolken.wolkenapp.library.dao;

import java.util.List;

import com.wolken.wolkenapp.library.dto.BookDTO;

public interface LibraryDAO {
	
	public void save(BookDTO dto);
	
	public List<BookDTO> getAllBooks();
	

}
