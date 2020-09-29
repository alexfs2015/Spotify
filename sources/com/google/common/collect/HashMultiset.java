package com.google.common.collect;

import java.util.Set;

public class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    public final /* bridge */ /* synthetic */ Set S_() {
        return super.S_();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    private HashMultiset(int i) {
        super(i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.a = new fcr(i);
    }

    public static <E> HashMultiset<E> g() {
        return new HashMultiset<>(3);
    }
}
