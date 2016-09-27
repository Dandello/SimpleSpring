package ru.sberbank.javaschool.simplespring;

import ru.sberbank.javaschool.simplespring.x.CImlp;

import java.util.List;

/**
 * Created by svetlana on 25.09.16.
 */
@Component
public class A { //TODO: не абстрактный и не интерфейс

    @Autowired
    private B b;

    @Autowired
    private CImlp d;


    @PostConstruct
    public void init() {
        //TODO: some logic
    }

    public void execute() {
        System.out.println(b.getSomeData());
        System.out.println(d.getSomeStr());
    }

    @PreDestroy
    public void destroy() {
        //TODO: some logic
    }

}
