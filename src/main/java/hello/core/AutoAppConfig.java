package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 컴포넌트 스캔의 대상
        basePackageClasses = AutoAppConfig.class, 
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // 제외
) // @Component 붙은 코드를 자동으로 bean에 등록
public class AutoAppConfig {
}
