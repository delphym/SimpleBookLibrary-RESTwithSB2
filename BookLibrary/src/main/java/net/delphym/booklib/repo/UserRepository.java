package net.delphym.booklib.repo;

import net.delphym.booklib.model.WebsiteUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<WebsiteUser, Long> {

	@Override
	@RestResource(exported = false)
	void delete(WebsiteUser entity);

	@Override
	@RestResource(exported = false)
	void deleteAll();

	@Override
	@RestResource(exported = false)
	void deleteAll(Iterable<? extends WebsiteUser> entities);

	@Override
	@RestResource(exported = false)
	void deleteById(Long aLong);

	@RestResource(path = "byEmail", rel = "customFindByEmail")
	WebsiteUser findByEmail(@Param("email") String email);

	@RestResource(path = "byName", rel = "customFindByName")
	List<WebsiteUser> findByName(@Param("name") String name);
}
