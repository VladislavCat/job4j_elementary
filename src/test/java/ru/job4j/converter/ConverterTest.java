package ru.job4j.converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140rubleTo2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200rubleTo3dot333Dollar() {
        float in = 200;
        float expected = 3.333333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }
}