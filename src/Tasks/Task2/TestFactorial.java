package Tasks.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorial {

    @Test
    public void testFactorial(){
        assertEquals(6, Factorial.factorialCounter(3));
        assertEquals(120, Factorial.factorialCounter(5));
    }

    @Test
    public void testUn(){
        assertEquals(1.375, Factorial.countUn(4));
        assertEquals(1.5, Factorial.countUn(3)); //первоначальные значения считал
        assertEquals(1.275, Factorial.countUn(5));// в своем калькуляторе (ссылка в резюме на гит)
    }

}
