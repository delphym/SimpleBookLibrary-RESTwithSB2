package net.delphym.booklib;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.delphym.booklib.repo.BookRepository;

@SpringBootTest
class BookLibraryApplicationTests {

	@Autowired
	private BookRepository bookRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void persistanceWorks() {
		assertThat(bookRepo.findAll(), not(Matchers.emptyIterable()));
	}
}
