package work.coderluka.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import work.coderluka.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
