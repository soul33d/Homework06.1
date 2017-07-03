package com.homelearning.factory;

import org.jetbrains.annotations.NotNull;

/**@throws  IllegalArgumentException if {@code runnable == null}*/
public interface ThreadFactory extends java.util.concurrent.ThreadFactory {
    Thread newThread(@NotNull Runnable runnable);
}
