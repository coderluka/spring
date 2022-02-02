package work.coderluka.spring5webapp.repositories;

import work.coderluka.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {

}
