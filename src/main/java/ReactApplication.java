import domains.Person;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
public class ReactApplication {

    static String test() {
        log.info("ReactApplication::test invoked");
        return "Hello world";
    }

    public static void main(String[] args) {

        Mono<String> testString = Mono.fromCallable(() -> test());
        log.info("Mono created");
        log.info(testString.block());
        log.info("Mono.block()");

        Mono<String> person = Mono.just(Person.builder().name("Federico").age(38).build())
                .map(Person::myName);

        log.info("Mono created");
        System.out.println(person.block());

        log.info("Mono.block()");


    }

}
