package com.hjl.guava.retry;

public interface BlockStrategy {

    void block(long blockTime) throws InterruptedException;
}
