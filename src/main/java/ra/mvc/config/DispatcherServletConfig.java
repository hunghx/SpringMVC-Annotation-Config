package ra.mvc.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // Cấu hình các cơ sở hạ tầng không liên quan tới web
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //Cấu hình các cơ sở hạ tầng liên quan tới web (MVC)
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // mapping theo pattern (/api/*,/example/*)
        // mac dinh {"/"} maping voi tat ca duong dan
        return new String[]{"/"};
    }
}
