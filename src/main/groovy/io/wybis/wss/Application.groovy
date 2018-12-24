package io.wybis.wss

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

//import groovy.text.SimpleTemplateEngine

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

import java.text.DecimalFormat

@EnableAdminServer
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    Properties javaMailProperties() {
        Properties props = new Properties()

        props.setProperty("mail.smtp.timeout", "3000")
        props.setProperty("mail.smtp.connectiontimeout", "3000")
        props.setProperty("mail.smtp.auth", "true")
        props.setProperty("mail.smtp.starttls.enable", "true")

        return props
    }

    @Bean
    DateTimeFormatter dateTimeFormatterAndParser() {
        return DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss")
    }

    @Bean
    DateTimeFormatter dateFormatterAndParser() {
        return DateTimeFormat.forPattern("dd-MM-yyyy")
    }

    @Bean
    DateTimeFormatter timeFormatterAndParser() {
        return DateTimeFormat.forPattern("HH:mm:ss")
    }

    @Bean
    DecimalFormat amountFormatterAndParser() {
        DecimalFormat df = new DecimalFormat()
        df.setMaximumFractionDigits(2)
        return df
    }

//    @Bean
//    public ObjectMapper jsonObjectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper()
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT)
//        return objectMapper
//    }

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate()
        return restTemplate
    }

//    @Bean
//    SimpleTemplateEngine simpleTemplateEngine() {
//        SimpleTemplateEngine ste = new SimpleTemplateEngine()
//        return ste
//    }

    @Bean
    File appHome() {
        File appHome = new File('~/app-home/spring-boot-admin')

        return appHome;
    }
}