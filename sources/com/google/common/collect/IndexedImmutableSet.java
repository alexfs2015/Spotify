package com.google.common.collect;

import java.util.Iterator;

abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    /* access modifiers changed from: 0000 */
    public abstract E a(int i);

    IndexedImmutableSet() {
    }

    public final fdh<E> R_() {
        return f().R_();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> i() {
        return new ImmutableList<E>() {
            public E get(int i) {
                return IndexedImmutableSet.this.a(i);
            }

            /* access modifiers changed from: 0000 */
            public final boolean c() {
                return IndexedImmutableSet.this.c();
            }

            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public /* synthetic */ Iterator iterator() {
        return f().R_();
    }
}
