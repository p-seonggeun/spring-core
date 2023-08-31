package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration // 설정정보에 붙이는거
@ComponentScan( // 컴포넌트 스캔 이용 @Component 붙은 거 다 찾아서 스프링 빈으로 자동으로 등록해줌
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // Configuration 붙은 애노테이션 빼고 등록 @Bean은 수동으로 등록하는 거라 AppConfig가 등록되면 충돌이 남
)
public class AutoAppConfig {

}
