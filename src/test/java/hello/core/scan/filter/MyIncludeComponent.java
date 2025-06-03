package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 어디에 붙는 에노테이션인가? TYPE : 클래스
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {


}
