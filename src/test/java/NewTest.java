import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.annotation.processing.SupportedAnnotationTypes;

public class NewTest {
    @Test
    public void newTest(){
        int i = 10;
        System.out.println("This is the best test");
        Assertions.assertTrue(i>2);
    }
}
