import com.grades.GradeCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.powermock.reflect.Whitebox;

public class GradeCalculatorTest {
    @Test
    public void computeGradeTest() throws Exception {
        GradeCalculator gc = new GradeCalculator();

        String actual = Whitebox.invokeMethod(gc, "computeGrade", 56);
        String expected = "pass";

        Assertions.assertEquals(actual, expected);
    }
}
