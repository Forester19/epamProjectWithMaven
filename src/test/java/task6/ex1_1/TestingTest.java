package task6.ex1_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 28.08.2017.
 */
public class TestingTest {
    Testing testing = new Testing();

    @Test
    public void convertFtoC() throws Exception{
        assertEquals((int)testing.convertFtoC(10),-12);
    }

    @Test
    public void convertCtoF() throws Exception {
        assertEquals((int)testing.convertCtoF(10),50);

    }

    @Test
    public void convertCtoK() throws Exception {
        assertEquals((int)testing.convertFtoC(10),283);

    }

    @Test
    public void convertKtoC() throws Exception {
        assertEquals((int)testing.convertFtoC(10),-263);

    }

    @Test
    public void convertFtoK() throws Exception {
        assertEquals((int)testing.convertFtoC(10),261);

    }

    @Test
    public void convertKtoF() throws Exception {
        assertEquals((int)testing.convertFtoC(10),-442);

    }

}