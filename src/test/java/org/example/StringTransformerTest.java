package org.example;

import org.junit.jupiter.api.Test;

import static org.example.StringTransformer.transformString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTransformerTest {
    @Test
    public void testTransformString() {
        //Given
        String input = "Hello man";
        //When
        final String result = transformString(input);
        //Then
        final String expected = "HeLlO MaN";
        assertEquals(expected, result);
    }
}
