package net.delphym.booklib;

import net.delphym.booklib.model.Book;
import net.delphym.booklib.model.WebsiteUser;
import net.delphym.booklib.repo.BookRepository;
import net.delphym.booklib.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BookLibraryApplication {

	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private UserRepository userRepo;

	@Component
	class DataSetup implements ApplicationRunner {

		@Override
		public void run(ApplicationArguments args) {
			bookRepo.save(Book.builder().title("Gone with the Wind").isbn("12345").build());
			bookRepo.save(Book.builder().title("Effective Java").isbn("45678").build());

			userRepo.save(WebsiteUser.builder().email("franta@user.org").name("Frantisek Dobrota").build());
			userRepo.save(WebsiteUser.builder().email("lama@user.com").name("Lame User").build());
			}
	}

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApplication.class, args);
	}

}
