import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student tim = new Student();

    @Before
    public void setUp() {
        tim.setId(123456789011L);
        tim.setName("tim smith");
        tim.grades = new ArrayList<>();
        tim.addGrade(85);
        tim.addGrade(95);
        tim.addGrade(75);
    }


    @Test
    public void testGetId() {
        Assert.assertEquals(123456789011L, tim.getId());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("tim smith", tim.getName());
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(85);
        expected.add(95);
        expected.add(75);

        Assert.assertEquals(expected, tim.getGrades());
    }

    @Test
        public void testGetGradeAverage() {
            Assert.assertEquals(85.0, tim.getGradeAverage(), 0);
        }

}
