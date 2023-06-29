package com.company.Exercise3;

public class App {

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            Student s = new Student();
            s.percentage = 58 + i;
            students[i] = s;
        }

        StudentService studentService = new StudentService();
        float above60 = 60;
        Student[] s = studentService.findStudentAbove60(students, above60);

        for (Student st : s) {
            if (st != null)
                System.out.println(st.percentage);
        }
    }
}