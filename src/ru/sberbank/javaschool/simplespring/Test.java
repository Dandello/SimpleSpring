package ru.sberbank.javaschool.simplespring;

/**
 * Created by svetlana on 25.09.16.
 */
public class Test {


    //TODO:
    // 1. бин должен быть классом, не интерфейсом, не абстрактным классом
    // 2. PostConstruct - над методом бина - который ничего не возвращает и нкаких параметров не принимает, может быть private,
    // вызывается фабрикой после того как ВСЕ бины проинициализированы, т.к. если возникнет исключение в середине процесса инициализации, а мы уже запустили
    // эти методы для некоторых бинов - может быть неконсистеное состояние.
    // 3. PreDestroy - аналогично, во время вызова close на фабрике
    // 4. Необходимо чтобы фабрика обнаруживала кольцевые зависимости cyclic dependencies и выкидывала исключение а не доводила до StackOverflow.
    // 4*. Для продвунутых - попробовать разрезолвить ситуацию cyclic dependencies и не кидать исключение, а нормально навести ссылки
    // 5*. Для продвинутых реализовать метод registryShutdownHook, которых регестрирует вызов close фабрики на завершение работы программы

    public static void main(String[] args) {
        Factorable f = Factory.createNew(ru.sberbank.javaschool.simplespring.Test.class);
        f.registryShutdownHook();

        //Object o = f.getBean(Object.class);

        A a = f.getBean(A.class);
        a.execute();

        D d = f.getBean(D.class);
        System.out.println(d.getSomeStr());

        f.close();
    }


}
