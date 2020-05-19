package services;

import domains.Person;
import reactor.core.publisher.Mono;

public class PersonServiceImpl implements PersonService {
    private final Person person;

    public PersonServiceImpl(Person person) {
        this.person = person;
    }


    public Mono<String> myNameReactive() {
        return Mono.fromCallable(person::myName);
    }
}
