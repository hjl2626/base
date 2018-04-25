package com.hjl.guava.retry;

import java.util.concurrent.ExecutionException;

/**
 * 尝试获取接
 * @param <V>
 */
public interface Attempt<V> {
    /**
     * 获取执行结果
     * @return
     */
    V get() throws ExecutionException;

    boolean hasResult();

    V getResult() throws IllegalStateException;

    boolean hasExption();

    Throwable getExptionCause() throws IllegalStateException;

    long getAttemptNumber();

    long getDelaySinceFirstAttempt();

}
