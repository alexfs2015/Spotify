package com.squareup.wire.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class MutableOnWriteList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final List<T> immutableList;
    public List<T> mutableList;

    public MutableOnWriteList(List<T> list) {
        this.immutableList = list;
        this.mutableList = list;
    }

    private Object writeReplace() {
        return new ArrayList(this.mutableList);
    }

    public final void add(int i, T t) {
        List<T> list = this.mutableList;
        List<T> list2 = this.immutableList;
        if (list == list2) {
            this.mutableList = new ArrayList(list2);
        }
        this.mutableList.add(i, t);
    }

    public final T get(int i) {
        return this.mutableList.get(i);
    }

    public final T remove(int i) {
        List<T> list = this.mutableList;
        List<T> list2 = this.immutableList;
        if (list == list2) {
            this.mutableList = new ArrayList(list2);
        }
        return this.mutableList.remove(i);
    }

    public final T set(int i, T t) {
        List<T> list = this.mutableList;
        List<T> list2 = this.immutableList;
        if (list == list2) {
            this.mutableList = new ArrayList(list2);
        }
        return this.mutableList.set(i, t);
    }

    public final int size() {
        return this.mutableList.size();
    }
}
