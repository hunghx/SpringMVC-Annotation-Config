package ra.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // Chu thich day la Lop cau hinh
@EnableWebMvc // Su dung cau hinh MVC
@ComponentScan("ra.mvc") // Quet package de phat hien component(@Component,@Controller,@Service,@Repository) -> tao BEAN
public class AppConfig implements WebMvcConfigurer {
    //Cấu hình thư mục chứa các file jsp -> truy xuất view đơn giản hơn thong qua viewName
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
