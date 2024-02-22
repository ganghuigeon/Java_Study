package ch07.sec09;

public class InstanceOfExample {
    public static void main(String[] args) {
        Person p1 = new Person("박봉팔");
        personInfo(p1);

        System.out.println();

        //자동타입변환
        Person p2 = new Student("박춘배", 10);
        personInfo(p2);
    }

    public static void personInfo(Person person) { //Person person = new Student()
        System.out.println("name: " + person.name);
        person.walk();

        //강제 타입변환을 하기 전에 instanceof를 사용해 타입을 확인한다.
//        if(person instanceof Student) { //Person person = new Student() 자동타입변환이 된 상태인지 확인을 한다.
//            //person이 Student 객체를 가지고 있을 경우 강제타입변환
//            Student student = (Student) person;
//
//            //Student 객체에 있는 필드, 메.소드 tkdydrksmd
//            System.out.println("studentNo: " + student.studentNo);
//            student.study();}

        //JAVA12버전 이후
        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }

    }

    }

