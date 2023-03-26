package com.yzxc.common.enums;

import java.util.concurrent.*;

public enum BlockingQueueEnum {
    ARRAY("array"),
    LINKED("linked"),
    SYNC("sync"),
    PRIORITY("priority");

    private final String name;

    BlockingQueueEnum(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public BlockingQueue<Runnable> queue(Integer... capacity) {
        int initCapacity = 100;
        if (capacity != null && capacity.length == 1) {
            initCapacity = capacity[0];
        }
        if (this.name.equals(ARRAY.name))
            return new ArrayBlockingQueue<>(initCapacity);
        if (this.name.equals(LINKED.name))
            return new LinkedBlockingDeque<>(initCapacity);
        if (this.name.equals(SYNC.name))
            return new SynchronousQueue<>();
        if (this.name.equals(PRIORITY.name))
            return new PriorityBlockingQueue<>(initCapacity);
        return new SynchronousQueue<>();
    }
}
