package ch13.sec05;

public class Course {
    //모든 사람이 수강신청 가능, <?>의 경우 타입에 제한 없이 들어갈 수 있다.
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 Course1을(를) 등록하였습니다.");
    }

    //학생만 수강신창 간응
    //Student클래스와 Student클래스의 하위 클래스만 타입으로 올 수 있다.
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 Course2을(를) 등록하였습니다.");
    }

    //직장인 및 일반인만 수강신청 가능
    //Worker클래스와 Worker클래스의 부모클래스만 타입으로 올 수 있다.
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 Course3을(를) 등록하였습니다.");
    }
}
