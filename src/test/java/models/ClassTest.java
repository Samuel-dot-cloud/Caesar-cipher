package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTest {




    @Test
    public void statement_checksStatement_true() throws Exception{
        ClassTest cryptic = new ClassTest();
        assertEquals(true, cryptic instanceof ClassTest);
    }

}