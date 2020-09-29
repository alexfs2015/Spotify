package com.squareup.wire.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class ImmutableList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final ArrayList<T> list;

    public ImmutableList(List<T> list2) {
        this.list = new ArrayList<>(list2);
    }

    private Object writeReplace() {
        return Collections.unmodifiableList(this.list);
    }

    public final T get(int i) {
        return this.list.get(i);
    }

    public final int size() {
        return this.list.size();
    }

    public final Object[] toArray() {
        return this.list.toArray();
    }
}
