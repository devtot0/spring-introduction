package pkocik.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pkocik.springframework.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
