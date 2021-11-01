import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result = Addition.add(3, 7);
        int correct_result = 10;
        assertEquals(correct_result, result);
    }
}