package com.hjl.shejimoshi.zerenlian;

public class Main {



    public static void main(String[] args){

        FilterChain filterChain = new FilterChain();
        TestFilter testFilter1 = new TestFilter("1");
        TestFilter testFilter2 = new TestFilter("2");
        TestFilter testFilter3 = new TestFilter("3");
        TestFilter testFilter4 = new TestFilter("4");
        filterChain.addFilter(testFilter1)
                .addFilter(testFilter2)
                .addFilter(testFilter3)
                .addFilter(testFilter4);

        filterChain.print(filterChain);
    }
}
