package com.hjl.guava.retry;

public interface StopStrategy {

    boolean shouldStop(Attempt failAttempt);
}
