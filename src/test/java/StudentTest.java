import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    private Student tim;

    @Before
    public void setUp() {
        this.tim = new Student(123456789011L, "tim smith");
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

        Assert.assertEquals(expected.get(0), tim.getGrades().get(0));
    }

    @Test
        public void testGetGradeAverage() {
            Assert.assertEquals(85.0, tim.getGradeAverage(), 0);
        }

}
