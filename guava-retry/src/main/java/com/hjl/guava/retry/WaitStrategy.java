package com.hjl.guava.retry;

public interface WaitStrategy {

    long computeBlockTime(Attempt failAttempt);
}
