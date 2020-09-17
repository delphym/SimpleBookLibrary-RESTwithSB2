package net.delphym.booklib;

import net.delphym.booklib.model.Book;
import net.delphym.booklib.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BookLibraryApplication {

	@Autowired
	BookRepository bookRepo;

	@Component
	class DataSetup implements ApplicationRunner {

		@Override
		public void run(ApplicationArguments args) {
			bookRepo.save(Book.builder().title("Gone with the Wind").isbn("12345").build());
			bookRepo.save(Book.builder().title("Effective Java").isbn("45678").build());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApplication.class, args);
	}

}
