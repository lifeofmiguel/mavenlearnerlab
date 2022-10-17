import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    People people;
    @BeforeEach
    public void setUpBeforeEach(){
        people = new People();
    }

    @Test
    public void TestAdd(){
        int expected = 1;
        people.add(new Person("Person1", 1));
        Assertions.assertEquals(expected, people.count());
    }

    @Test
    public void testRemove(){
        int expected = 0;
        Person person = new Person("Person2", 2);
        people.add(person);
        people.remove(person);
        Assertions.assertEquals(expected, people.count());
    }

    @Test
    public void FindId(){
        People people = new People();
        List<Person> personList = new ArrayList<>();

        long expected = 1;
        Person person1 = new Person("Person1", 1);
        person1.getId();
        Assertions.assertEquals(expected, person1.getId());
    }
}