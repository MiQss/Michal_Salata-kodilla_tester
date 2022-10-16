package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldReturnTeacherNullName(){
        Student jakub = new Student ("Jakub Wolny",null);
        assertEquals("<undefined>",Application.getTeacherName(jakub));
    }
    @Test
    public void shouldReturnTeacherName(){
        Teacher teacher = new Teacher("Piotr Polski");
        Student aneta = new Student ("Aneta Kowalska",teacher);
        assertEquals("Piotr Polski",Application.getTeacherName(aneta));
    }
}

