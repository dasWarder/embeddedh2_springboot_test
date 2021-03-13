package ee.babichev.h2demo.repository;

import ee.babichev.h2demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Person, Long> {

}
