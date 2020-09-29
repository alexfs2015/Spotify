package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset.a;
import java.io.Serializable;

class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> a = new RegularImmutableMultiset<>(new fdj());
    final transient fdj<E> b;
    private final transient int c;
    private transient ImmutableSet<E> d;

    final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        /* synthetic */ ElementSet(RegularImmutableMultiset regularImmutableMultiset, byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final E a(int i) {
            return RegularImmutableMultiset.this.b.b(i);
        }

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return true;
        }

        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        public final int size() {
            return RegularImmutableMultiset.this.b.c;
        }
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        SerializedForm(fdh<?> fdh) {
            int size = fdh.S_().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (a aVar : fdh.S_()) {
                this.elements[i] = aVar.b();
                this.counts[i] = aVar.a();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            a aVar = new a(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return aVar.a();
                }
                aVar.a(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    RegularImmutableMultiset(fdj<E> fdj) {
        this.b = fdj;
        long j = 0;
        for (int i = 0; i < fdj.c; i++) {
            j += (long) fdj.c(i);
        }
        this.c = fev.b(j);
    }

    public final int a(Object obj) {
        return this.b.b(obj);
    }

    /* access modifiers changed from: 0000 */
    public final a<E> a(int i) {
        return this.b.d(i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    /* renamed from: e */
    public final ImmutableSet<E> d() {
        ImmutableSet<E> immutableSet = this.d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet(this, 0);
        this.d = elementSet;
        return elementSet;
    }

    public int size() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
