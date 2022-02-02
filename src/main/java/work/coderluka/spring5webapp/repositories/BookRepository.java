package work.coderluka.spring5webapp.repositories;

import work.coderluka.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {

}
