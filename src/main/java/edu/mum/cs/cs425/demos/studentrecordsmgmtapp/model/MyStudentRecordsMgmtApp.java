package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student[] students = {new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
                new Student(110002, "Anna", LocalDate.of(1990, 12, 07)),
                new Student(110003, "Erica", LocalDate.of(1974, 01, 31)),
                new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
                new Student(110005, "Bob", LocalDate.of(1990, 3, 5))
        };

        System.out.println("Order of students");
        printListOfStudents(students);


//        System.out.println("Order of students greater than 30 years");
//        getListOfPlatinumAlumniStudents(students);
//
//        System.out.println("List of integers that prints Hello, World and helloworld is");
//        Integer[] integers = {35,23,45,67};
//        printHelloWorld(integers);
////        System.out.println("The second largest is");
//        int a[] = {1,2,3,4,5};
//        int b[] = {19,9,11,0,12};
//        System.out.println(findSecondLargest(a));
//        System.out.println(findSecondLargest(b));
    }

    public static void printListOfStudents(Student[] students) {

       List<Student> list= Arrays.asList(students);

        list.sort(Comparator.comparing(Student::getName));
        for(Student student: students){
            System.out.println(student.toString());
        }

    }

    public static void  getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> list= Arrays.asList(students);
        list.sort(Comparator.comparing(Student::getDateOfAdmission));
        int currentYear = LocalDate.now().getYear();
        for (Student student : students) {
            int dif = currentYear - student.getDateOfAdmission().getYear();
            if (dif >= 30) {
                System.out.println(student.toString()+",  "+ dif);

            }

        }
    }
    public static void printHelloWorld(Integer[] integers){
        for(Integer integer: integers){
              if(integer %5==0 && integer%7==0){
            System.out.println("HelloWorld");}
            if(integer % 5 ==0) {
                System.out.println("Hello");
            }
                 if(integer % 7==0) {
                System.out.println("World");
            }


                    }
                }

    public static int findSecondLargest(int[] arr){
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > max2)
            {
                max2 = arr[i];
            }

            if (max2 > max1)
            {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        return max2;
    }
}



