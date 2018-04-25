package com.hjl.guava.retry;

import java.util.concurrent.Callable;

public interface AttemptTimeLimiter<V> {

    V call(Callable<V> callable) throws Exception;
}
