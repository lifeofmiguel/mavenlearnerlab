import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    @Test
    public void TestImplementation(){
        Instructor instructor1 = new Instructor("Instructor1", 1);
        boolean actual = instructor1 instanceof Teacher;
        Assertions.assertTrue(actual);
    }

    @Test
    public void TestInheritance(){
        Instructor instructor2 = new Instructor("Instructor2", 2);
        boolean actual = instructor2 instanceof Person;
        Assertions.assertTrue(actual);
    }

    @Test
    public void TestTeach(){
        Instructor instructor3 = new Instructor("Instructor3", 3);
        Student student = new Student("Mike", 1);
        double expected = 10.0;
        instructor3.teach(student, expected);
        double actual = student.getTotalStudyTime();
        Assertions.assertEquals(expected, actual);
    }

}