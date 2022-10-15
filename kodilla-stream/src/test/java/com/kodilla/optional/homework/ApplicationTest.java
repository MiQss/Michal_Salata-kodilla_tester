package com.kodilla.optional.homework;

import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

