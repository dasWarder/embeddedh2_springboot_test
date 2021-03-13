package ee.babichev.h2demo.repository;

import ee.babichev.h2demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
public class PersonRepository {

    private Repository repository;

    @Autowired
    public PersonRepository(Repository repository) {
        this.repository = repository;
    }

    public Collection<Person> getAll() {
        return (Collection) repository.findAll();
    }

}
