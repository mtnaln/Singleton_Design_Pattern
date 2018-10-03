package com.metin.singleton.design.pattern;

public class TestEagerInitialization {

    public static void main(String[] args) {

        SingletonExampleEagerInitialization singletonExampleEagerInitialization1 = SingletonExampleEagerInitialization.getInstance();
        SingletonExampleEagerInitialization singletonExampleEagerInitialization2 = SingletonExampleEagerInitialization.getInstance();

        System.out.println("singletonExampleEagerInitialization1 ==> " + singletonExampleEagerInitialization1);
        System.out.println("singletonExampleEagerInitialization2 ==> " + singletonExampleEagerInitialization2);

        System.out.println(singletonExampleEagerInitialization1 == singletonExampleEagerInitialization2);
    }
}
