package com.hjl.shejimoshi.zerenlian;

public class TestFilter implements Filter {

    private String name;
    public TestFilter(String name){
        this.name = name;
    }
    public void print(Filter filterChain) {
        System.out.println("beforeTestFilter" + name);
        filterChain.print(filterChain);
        System.out.println("afterTestFilter" + name);
    }
}
