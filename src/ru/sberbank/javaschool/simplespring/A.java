package ru.sberbank.javaschool.simplespring;

import ru.sberbank.javaschool.simplespring.x.CImlp;

/**
 * Created by svetlana on 25.09.16.
 */
@Component
public class A {

    @Autowired
    private B b;

    @Autowired
    private CImlp d;

    public void execute() {
        System.out.println(b.getSomeData());
        System.out.println(d.getSomeStr());
    }

}
