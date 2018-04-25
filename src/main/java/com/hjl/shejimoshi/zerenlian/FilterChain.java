package com.hjl.shejimoshi.zerenlian;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<Filter>();

    private int currentIndex = 0;


    public FilterChain setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void print(Filter filter) {
        if(currentIndex == filters.size()){
            return;
        }

        Filter cFilter = this.filters.get(currentIndex);
        ++currentIndex;
        cFilter.print(filter);
    }
}
