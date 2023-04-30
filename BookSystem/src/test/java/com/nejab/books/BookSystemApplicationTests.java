package com.nejab.books;

import com.nejab.books.entities.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookSystemApplicationTests {

	Book book=new Book();
	@Test
	public void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test
	public void createBookTest(Book book){
     assertEqauls()
	}
}
