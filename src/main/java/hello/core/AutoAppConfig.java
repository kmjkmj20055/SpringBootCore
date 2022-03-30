package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(  // 스프링빈을 긁어서 끌고오는거 // 쭉 긇어오는데 스프링빈으로 등록안할 것을(여기선 Configuration.class) 지정해주는 것
//        basePackages = "hello.core.member",  // hello.core.member 하위 디렉터리만 빈등록하도록 설정
//        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemoryMemberRepository memoryMemberRepository() {
//        return new MemoryMemberRepository();
//    }

}
