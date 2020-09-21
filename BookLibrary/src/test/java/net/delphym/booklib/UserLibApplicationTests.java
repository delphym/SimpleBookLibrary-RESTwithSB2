package net.delphym.booklib;

import net.delphym.booklib.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyIterable;

@SpringBootTest
class UserLibApplicationTests {

	@Autowired
	private UserRepository userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void persistanceWorks() {
		assertThat(userRepo.findAll(), not(emptyIterable()));
	}
}
