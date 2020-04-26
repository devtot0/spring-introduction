package pkocik.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pkocik.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
