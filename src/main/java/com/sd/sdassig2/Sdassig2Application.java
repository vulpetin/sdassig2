package com.sd.sdassig2;

import com.sd.sdassig2.model.Restaurant;
import com.sd.sdassig2.repository.RestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

//@Configuration
@EnableJpaRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Sdassig2Application {


    public static void main(String[] args) {

        SpringApplication.run(Sdassig2Application.class, args);
    }

//    @Configuration
//   // @ComponentScan({"com.givenproject"})
//   // @EntityScan(basePackages = "com.givenproject")
//    @EnableJpaRepositories(basePackages = "com.sd.sdassig2.repository")
//    public class DataConfig {
//    }
//
//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        return sessionFactory;
//    }



  //  private static final Logger log = LoggerFactory.getLogger(Sdassig2Application.class);



  // @Bean
//    public CommandLineRunner demo(RestaurantRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new Restaurant("abcd", "Somewhere", "A Reastaurant"));
//            repository.save(new Restaurant("b", "Somewhere", "A Reastaurant"));
//            repository.save(new Restaurant("c", "Somewhere", "A Reastaurant"));
//            repository.save(new Restaurant("d", "Somewhere", "A Reastaurant"));
//            repository.save(new Restaurant("e", "Somewhere", "A Reastaurant"));
//
//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Restaurant customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//
//
//
//            // for (Customer bauer : repository.findByLastName("Bauer")) {
//            //  log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }



}
