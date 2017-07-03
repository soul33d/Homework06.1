package com.homelearning.factory;

import org.jetbrains.annotations.NotNull;

public class RegularThreadFactory implements ThreadFactory {
    /**@throws  IllegalArgumentException if {@code runnable == null}*/
    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable);
    }
}
