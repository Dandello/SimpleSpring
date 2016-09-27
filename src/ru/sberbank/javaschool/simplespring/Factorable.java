package ru.sberbank.javaschool.simplespring;

public interface Factorable {

    <T> T getBean(Class<T> cls);

    void close();

    void registryShutdownHook();
}
