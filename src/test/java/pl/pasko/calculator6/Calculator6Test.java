package pl.pasko.calculator6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator6Test {
    @Test
    void shouldAddTwoValuesAndReturn3(){
        //given
        int a = 1;
        int b = 2;
        //when
        int result = Calculator6.add(a,b);
        //then
        assertEquals(3,result);
    }
    @Test
    void shouldAddTwoValuesAndReturnLong(){
        //given
        int a = 2147483647;
        int b = 1;
        //when
        int result = Calculator6.add(a,b);
        //then
        assertEquals(2147483647L,result);
    }
    @Test
    void shouldDivideTwoValuesAndReturnZero(){
        //given
        int a = 2;
        int b = 0;
        //when
        int result = Calculator6.divide(a,b);
        //then
        assertEquals(0,result);
    }


}