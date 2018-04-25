package com.hjl.guava.retry;

public interface RetryListener {

    void onRetry(Attempt attempt);
}
