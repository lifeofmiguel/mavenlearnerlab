import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPerson {

    @Test
    public void TestConstructor(){
        Person person1 = new Person("Mike", 1);
        long expectedId = 1;
        String expectedName = "Mike";
        Assertions.assertEquals(expectedId, person1.getId());
        Assertions.assertEquals(expectedName, person1.getName());
    }

    @Test
    public void TestSetName(){
        Person person2 = new Person("Noah", 2);
        String expectedName = "Noah";
        person2.setName(expectedName);
        String actual = person2.getName();
        Assertions.assertEquals(expectedName, actual);
    }

}