package springAssign4.assign4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"springAssign4.assign4","service"})
public class AppConfig {
    @Bean
    public Sum sum() {
    	return new Sum();
    }
}
