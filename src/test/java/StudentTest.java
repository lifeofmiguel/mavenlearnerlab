import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void TestImplementation(){
        Student student1 = new Student("Mike", 1);
        boolean actual = student1 instanceof Learner;
        Assertions.assertTrue(actual);
    }

    @Test
    public void TestInheritance(){
        Student student2 = new Student("Noah", 2);
        boolean actual = student2 instanceof Person;
        Assertions.assertTrue(actual);
    }

    @Test
    public void TestLearn(){
        Student student3 =  new Student("Mikey", 3);
        Double expected = 10.0;
        student3.learn(expected);
        Double actual = student3.getTotalStudyTime();
        Assertions.assertEquals(expected, actual);
    }

}