import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    private Student stuTester;
    private Cohort tester;
    @Before
    public void setUp() {
        this.stuTester = new Student(123, "Stu Tester");
        stuTester.addGrade(100);
        stuTester.addGrade(80);
        this.tester = new Cohort();
    }
    @Test
    public void testCohortAddStudent() {
//        Student test1 = new Student(123, "test1");
//        Cohort tester = new Cohort();
        tester.addStudent(stuTester);
        Assert.assertEquals(stuTester, tester.getStudents().get(0));
    }

       @Test
    public void testGetStudents() {
//        Student test2 = new Student(456, "test2");
//        Cohort tester = new Cohort();
        tester.addStudent(stuTester);
           Assert.assertTrue(tester.getStudents().contains(stuTester));
    }

    @Test
    public void testCohortAverage(){
        Student test4 = new Student(1011, "test4");
        test4.addGrade(90);
        test4.addGrade(70);
//        Cohort tester = new Cohort();
        tester.addStudent(stuTester);
        tester.addStudent(test4);
        assertEquals(85.0, tester.getCohortAverage(), 0);
    }


}
