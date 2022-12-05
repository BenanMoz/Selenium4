package javaStreams;

import Lambda.Person;
import org.apache.commons.collections.map.HashedMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {


    @Test
    public void se() {
        Student stu1 = new Student(35, "Ben", Gender.Male);
        Student stu2 = new Student(50, "Bob", Gender.Male);
        Student stu3 = new Student(4, " jolie", Gender.Female);
        Student stu4 = new Student(7, "Liam", Gender.Male);
        Student stu5 = new Student(11, "Lor", Gender.Female);

        System.out.println( stu5.toString());


        List<Student> students = new ArrayList<>();

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        students.add(new Student(23, "jena", Gender.Female));
        System.out.println(students.get(0).id + students.get(0).getName() + students.get(0).getGender());
        List<Student> students2 = students;


        Map<String,List<Student>> maps = new HashedMap();
        maps.put("ddd", students);
        maps.put("fff", students2);
        System.out.println(maps.get("ddd").get(4));
        //maps.entrySet(0).
        System.out.println("\n");

        ///////////////////////////////////////////////////////// "filter"
        List<Student> males = students.stream().filter(student -> student.getGender().equals(Gender.Male))
                .collect(Collectors.toList());

        for (Student studento : males
        ) {
            System.out.println(studento.getName() + studento.getId() + studento.getGender());
        }
////////////////////////////////////////////////////////////////////////////////// "sort"
        System.out.println("\n");

        List<Student> sort = students.stream().sorted(Comparator.comparing(Student::getId).reversed()).collect(Collectors.toList());
        for (Student studento : sort
        ) {
            System.out.println(studento.getName() + studento.getId() + studento.getGender());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////// "all match"
        System.out.println("\n");

        boolean allMatch = students.stream().allMatch(Student -> Student.getId() < 5);
        System.out.println(allMatch);

///////////////////////////////////////////////////////////////////////////////////////////////// "any match"

        System.out.println("\n");

        boolean anyMatch = students.stream().anyMatch(Student -> Student.getId() < 5);
        System.out.println(anyMatch);

///////////////////////////////////////////////////////////////////////////////////////////// "max"
        System.out.println("\n");

        students.stream().max(Comparator.comparing(Student::getId)).ifPresent(System.out::println);
        //System.out.println(s);

/////////////////////////////////////////////////////////////////// group by Gender

        Map<Gender, List<Student>> gro = students.stream().collect(Collectors.groupingBy(Student::getGender));

        gro.entrySet().stream().forEach(System.out::println);
        //   gro.entrySet().stream().filter(c-> c.getValue().stream().filter(b-> b.getName().equals("Liam"))
        //  .collect(Collectors.toList())).collect(Collectors.toList()))

    }}










