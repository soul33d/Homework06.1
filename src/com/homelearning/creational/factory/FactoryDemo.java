package com.homelearning.creational.factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FactoryDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)
                Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        threadPoolExecutor.setThreadFactory(new RegularThreadFactory());
        threadPoolExecutor.execute(() -> System.out.println("I'm doing something very important."));
        threadPoolExecutor.shutdown();
    }
}
