package pl.sda.javalondek4springdemo.model.onetoone.bidirectional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.sda.javalondek4springdemo.repository.onetoone.bidirectional.CatRepository;
import pl.sda.javalondek4springdemo.repository.onetoone.bidirectional.OwnerRepository;

@Profile("onetoone-birectional")
@Component
public class OneToOneBidirectionalExample implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(OneToOneBidirectionalExample.class);

    private final OwnerRepository ownerRepository;

    private final CatRepository catRepository;

    public OneToOneBidirectionalExample(OwnerRepository ownerRepository, CatRepository catRepository) {
        this.ownerRepository = ownerRepository;
        this.catRepository = catRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner me = new Owner();
        me.setFirstName("maniek");
        me.setLastName("p.");

        Cat mruczek = new Cat();
        mruczek.setName("mruczek");
//
//        me.setCat(mruczek);
//        mruczek.setOwner(me);

        // save to db
        ownerRepository.save(me);
    }
}
