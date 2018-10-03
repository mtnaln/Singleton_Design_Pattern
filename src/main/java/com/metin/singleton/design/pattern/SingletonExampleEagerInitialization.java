package com.metin.singleton.design.pattern;

public class SingletonExampleEagerInitialization {

    private static SingletonExampleEagerInitialization instance = new SingletonExampleEagerInitialization();

    private SingletonExampleEagerInitialization(){}

    public static SingletonExampleEagerInitialization getInstance(){
        return instance;
    }
}
