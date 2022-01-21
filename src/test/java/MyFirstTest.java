import org.junit.Test;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void bobisBob() {
        String instructor = "Bob";
        String testWriter = "Bob";
            // CHECKS VALUE //
        Assert.assertEquals(instructor, testWriter);
    }

    // USED WITH OBJECTS //
    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>();
        languages.add("Latin");
//        names.add("Bob");
        names.add("Latin");

            // CHECKS THE OBJECT, NOT VALUE //
        Assert.assertSame(languages, names);
    }

    @Test
    public void arraysAreEqual() {
       int[] nums = {1, 2, 3};
       int[] otherNums = new int[3];
        otherNums[0] = 1;
        otherNums[1] = 2;
        otherNums[2] = 3;


            // EQUALS CANNOT CHECK VALUE OF ARRAY //
//        Assert.assertEquals(nums, otherNums);
            // MUST USE ASSERT ARRAY TO EVAL ARRAYS //
        Assert.assertArrayEquals(nums, otherNums);
    }

    @Test
    public void isTrueIsFalse() {
        String language = "PHP";

        // ALL ASSERTS WITHIN THE TEST HAVE TO PASS FOR IT TO PASS, OTHERWISE IT WILL FAIL //
        Assert.assertTrue(language.contains("H"));
        Assert.assertFalse(language.contains("h"));
    }

}
