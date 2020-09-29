package com.google.common.collect;

import java.util.Iterator;

abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    IndexedImmutableSet() {
    }

    public final fdz<E> R_() {
        return f().R_();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public abstract E a(int i);

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> i() {
        return new ImmutableList<E>() {
            /* access modifiers changed from: 0000 */
            public final boolean c() {
                return IndexedImmutableSet.this.c();
            }

            public E get(int i) {
                return IndexedImmutableSet.this.a(i);
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
