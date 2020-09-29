package com.google.common.collect;

import java.util.Set;

public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private LinkedHashMultiset(int i) {
        super(i);
    }

    public static <E> LinkedHashMultiset<E> g() {
        return new LinkedHashMultiset<>(3);
    }

    public final /* bridge */ /* synthetic */ Set S_() {
        return super.S_();
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.a = new fdk(i);
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }
}
