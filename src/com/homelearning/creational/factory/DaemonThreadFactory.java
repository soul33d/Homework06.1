package com.homelearning.creational.factory;

import org.jetbrains.annotations.NotNull;

public class DaemonThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }
}
