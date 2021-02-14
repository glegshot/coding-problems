package org.challenges;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ImmutableDemo {

    public static void main(String[] args) {

        Map<String,String> metaData = new HashMap<>();
        metaData.put("PC","AlienWare M17");
        metaData.put("Skill","Pentester");

        Student student = new Student("Sreekumar",26,metaData);
        System.out.println("Real Student");
        System.out.println(student);

        Student anotherStudent = new Student(student.getName(), student.getAge(), student.getMetaData());
        System.out.println("doppleganger");
        System.out.println(anotherStudent);

        student.getMetaData().put("Java","Skill in java programming");
        System.out.println("Student upskilled to stand out from doppleganger");
        System.out.println(student);

        System.out.println("doppleganger");
        System.out.println(anotherStudent);

        System.out.println("with the constructor of student modified");
        //System.out.println("doppleganger alternatively tries to copy with least effort,he uses the metaData to get hold of the metaData");
        //anotherStudent.metaData = student.metaData;
        //System.out.println("doppleganger");
        //System.out.println(anotherStudent);

        System.out.println("with the member instance access modifier made to private now dopplegagner tries to just get hold of metadata and start manipulating it ");
        Map<String,String> manipulateMap = student.getMetaData();
        manipulateMap.put("Illegal Access","We are watching");

        System.out.println("student feels something wrong and then checks its metadata");
        System.out.println(student);

        System.out.println("student then modified the getMetaData to return a copy to avoid manipulation effecting its copy");
        System.out.println(student);

        System.out.println("The student is finally relaxed,knowing it can protect its integrity and give a hard time for doppleganger to pirate");

    }

}

//student makes itself final as well to prevent anyone faking to inherit its data as its child
final class Student{

    //make all member instances as private
    private String name;
    private int age;
    private Map<String,String> metaData;

    //objects should be copied and set to instance members rather than making them reference
    public Student(String name, int age, Map<String,String> metaData){
        this.name = name;
        this.age = age;
        this.metaData = metaData;
        //to avoid having reference to same map,create a new instance
        Map<String,String> tempMap = new HashMap<>();
        tempMap.putAll(metaData);
        this.metaData = tempMap;
    }

    //all setter methods removed to avoid manipulation during runtime
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //return a copy of the metaData rather than reference to avoid manipulation
    public Map<String, String> getMetaData() {
        Map<String,String> tempMap = new HashMap<>();
        tempMap.putAll(metaData);
        return tempMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", metaData=" + internMetaData() +
                '}';
    }

    public String internMetaData(){
        String metaData = this.metaData.entrySet().stream().map(entry -> entry.getKey()+":"+entry.getValue()).collect(Collectors.joining(","));
        return metaData;
    }
}
