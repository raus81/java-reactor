package domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Person {
    private Integer age;
    private String name;

    public String myName() {
        log.info("domain.Person::myName invoked");
        return "Hi, I'm " + name + ", I'm " + age + "years old";
    }



}
