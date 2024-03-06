package ch12.sec12;

//어노테이션 정의

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 괄호안에 여러개를 쓸 때 중괄호를 붙여주어야 하고, 하나만 쓸 때에는 중괄호를 생략해주어도 된다
//메소드에서만 해당 어노테이션 사용가능 하도록 지정
@Target({ElementType.METHOD, ElementType.FIELD})
//실행 중 계속 어노테이션 정보(어떻게 처리해야할 지)를 유지한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
