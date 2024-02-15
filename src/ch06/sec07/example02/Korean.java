package ch06.sec07.example02;

public class Korean {
    //필드(속성)
    String nation = "대한민국";
    String name;
    String ssn;//주민번호

    //생성자
    Korean(String name, String ssn) {
        //this를 없얼경우 매개 변수로 보기 떄문에, 매개 변수에 명확히 선언하게 만들기 위해 this를 쓴다
        //this는 현재객체를 가리킨다. 즉, 이 객체가 가지고 있는 필드를 의미한다.
        //생성자의 매개변수의 이름과 필드의 이름이 동일할 때 사용한다.
       this.name = name; //n변수의 값을 name필드에 넣어준다.
        this.ssn = ssn; //s변수의 값을 ssn필드에 넣어준다
    }

    //메소드 생략
}
