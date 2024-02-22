package java8stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//https://javabypatel.blogspot.com/2018/06/java-8-stream-practice-problems.html
public class Java_8_Stream_Practice_Problems {
    public static void main(String[] args) {
    Student student = new Student("Neha Tiwari",23,"NG Park", "9769162427");
        Student student1 = new Student("Sakshi Tiwari",20,"NG Park", "9930509669");
        Student student2 = new Student("Atiya Choudhary",23,"Andheri", "9769162427");
        Student student3 = new Student("Devi Dinesh",30,"Goregoan123500000", "9769162427");
        Student student4 = new Student("Aditya",24,"Virar 12345", "9769162427");
        Student student5 = new Student("Ashay",23,"NG Park", "9769163333");


        List<Student> studentList = List.of(student,student1,student2,student3,student4,student5);

        Optional<Student> neha = studentList.stream().filter(stud -> stud.getName().equals("Neha Tiwari")).findFirst();
        System.out.println(neha.isPresent()?neha.get():"Not found ....");

        Optional<Student> address = studentList.stream().filter(stud -> stud.getAddress().contains("1235")).findFirst();
        System.out.println(address.isPresent()?address.get():"Not found .....");

/*
Get all student having mobile numbers 3333.
Get all student having mobile number 1233 and 1234
Create a List<Student> from the List<TempStudent>
* */
        List<Student> mobileNumber3333 = studentList.stream().filter(stud -> stud.getMobileNumber().contains("3333")).toList();
        System.out.println(mobileNumber3333);

        Predicate<Student> studentPredicate = stud -> stud.getMobileNumber().contains("1233");
        List<Student> list = studentList.stream().filter(studentPredicate.and(stud -> stud.getMobileNumber().contains("1234"))).toList();
        System.out.println(list);


        List<TempStudent> tempStudents = studentList.stream().map(stud -> {
            TempStudent tempStudent = new TempStudent();
            tempStudent.setName(stud.getName());
            tempStudent.setAge(stud.getAge());
            return tempStudent;
        }).toList();

        System.out.println("tempStudents "+tempStudents);

/*
* Convert List<Student> to List<String> of student name
Convert List<students> to String
Change the case of List<String>
Sort List<String>

* */
        List<String> studentName = studentList.stream().map(Student::getName).toList();

        String studentListInString = studentName.stream().collect(Collectors.joining(" :: ", "{", "}"));
        System.out.println(studentListInString);

    }
}


class TempStudent{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "TempStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public TempStudent() {
    }

    public TempStudent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
class Student {
    private String name;
    private Integer age;
    private String address;
    private String mobileNumber;


    public Student(String name, Integer age, String address, String mobileNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
