package pl.sda.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.javalondek4springdemo.controller.DummyController;
import pl.sda.javalondek4springdemo.repository.DummyRepository;
import pl.sda.javalondek4springdemo.service.DummyService;
import pl.sda.javalondek4springdemo.service.SecondDummyService;

@Configuration
public class ApplicationConfig {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);

// not this way
//    @Bean
//    public DummyController dummyController() {
//        return new DummyController(new DummyService(new DummyRepository()));
//    }

    @Bean
    public DummyController dummyController(DummyService dummyService) {
        logger.info("dummyController()");
        return new DummyController(dummyService);
    }

    @Bean
    public DummyService dummyService(DummyRepository dummyRepository) {
        logger.info("dummyService()");
        return new DummyService(dummyRepository);
    }

    @Bean
    public DummyRepository dummyRepository() {
        logger.info("DummyRepository()");
        return new DummyRepository();
    }

    @Bean
    public SecondDummyService secondDummyService() {
        logger.info("SecondDummyService()");
        return new SecondDummyService(dummyRepository());
    }

}
