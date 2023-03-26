package com.yzxc.common.enums;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public enum  RejectedExecutionHandlerEnum {

    CALLER_RUNS("CallerRuns"),
    ABORT("Abort"),
    DISCARD("Discard"),
    DISCARD_OLDEST("DiscardOldest");

    private final String name;

    RejectedExecutionHandlerEnum(String name) {
        this.name = name;
    }

    public RejectedExecutionHandler handler() {
        if (this.name.equals(CALLER_RUNS.name))
            return new ThreadPoolExecutor.CallerRunsPolicy();
        if (this.name.equals(ABORT.name))
            return new ThreadPoolExecutor.AbortPolicy();
        if (this.name.equals(DISCARD.name))
            return new ThreadPoolExecutor.DiscardPolicy();
        if (this.name.equals(DISCARD_OLDEST.name))
            return new ThreadPoolExecutor.DiscardOldestPolicy();
        return new ThreadPoolExecutor.DiscardPolicy();
    }

}
