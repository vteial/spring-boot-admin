package io.wybis.wss

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        SecurityCheckInterceptor si = new SecurityCheckInterceptor();
//        registry.addInterceptor(si).addPathPatterns("/**");
//
//        super.addInterceptors(registry);
//    }

//    @Bean
//    Template displayTemplate() throws Exception {
//        Template tmpl = null
//
//        ClassPathResource cpr = new ClassPathResource("templates/display.html")
//        SimpleTemplateEngine ste = this.simpleTemplateEngine()
//        tmpl = ste.createTemplate(cpr.getFile())
//
//        return tmpl
//    }
}
