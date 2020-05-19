package services;

import domains.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {

    PersonService personService;

    @Mock
    Person person;

    @BeforeEach
    void setUp() {
        personService = new PersonServiceImpl(person);
    }

    @Test
    void myNameReactiveNoCallBeforeBlock() {


        //when
        personService.myNameReactive();

        //then
        verify(person, times(0)).myName();

    }

    @Test
    void myNameReactiveCallOnBlock() {
        personService.myNameReactive().block();

        //then
        verify(person, times(1)).myName();
    }
}