package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Aneta Kowalska",new Teacher("Piotr Polski")));
        studentsList.add(new Student("Igor Nowak",new Teacher("Aga Angielska ")));
        studentsList.add(new Student("Jakub Wolny",null));
        studentsList.add(new Student("Ania Zdolna",new Teacher("Natalia Niemiecka")));
        studentsList.add(new Student("Marcin Boski",null));

        for (Student student : studentsList) {
            String teacherName = getTeacherName(student);
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
        public static String getTeacherName(Student student){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        }
    }

