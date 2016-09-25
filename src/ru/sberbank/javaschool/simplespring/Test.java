package ru.sberbank.javaschool.simplespring;

/**
 * Created by svetlana on 25.09.16.
 */
public class Test {

    public static void main(String[] args) {
        Factory f = Factory.createNew(ru.sberbank.javaschool.simplespring.Test.class);
        A a = f.getBean(A.class);
        a.execute();

        D d = f.getBean(D.class);
        System.out.println(d.getSomeStr());

        //Object o = f.getBean(Object.class);
    }


}
