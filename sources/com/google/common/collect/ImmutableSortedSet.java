package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements fcx<E>, NavigableSet<E> {
    final transient Comparator<? super E> a;
    private transient ImmutableSortedSet<E> b;

    static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return new a(this.comparator).c((E[]) this.elements).b();
        }
    }

    public static final class a<E> extends com.google.common.collect.ImmutableSet.a<E> {
        private final Comparator<? super E> d;

        public a(Comparator<? super E> comparator) {
            this.d = (Comparator) fay.a(comparator);
        }

        public final a<E> c(E... eArr) {
            super.a(eArr);
            return this;
        }

        /* renamed from: c */
        public final ImmutableSortedSet<E> b() {
            ImmutableSortedSet<E> a = ImmutableSortedSet.a(this.d, this.b, this.a);
            this.b = a.size();
            this.c = true;
            return a;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.a b(Iterator it) {
            super.a(it);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.a b(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.a b(Object[] objArr) {
            super.a((E[]) objArr);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet.a c(Object obj) {
            super.b(obj);
            return this;
        }

        public final /* synthetic */ b a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final /* synthetic */ b a(Object[] objArr) {
            super.a((E[]) objArr);
            return this;
        }

        public final /* synthetic */ a a(Object obj) {
            super.b(obj);
            return this;
        }

        public final /* synthetic */ b a(Iterator it) {
            super.a(it);
            return this;
        }

        public final /* synthetic */ b b(Object obj) {
            super.b(obj);
            return this;
        }
    }

    /* renamed from: R_ */
    public abstract fdh<E> iterator();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> a(E e, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> a(E e, boolean z, E e2, boolean z2);

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> b();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> b(E e, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract int c(Object obj);

    /* renamed from: e */
    public abstract fdh<E> descendingIterator();

    static <E> RegularImmutableSortedSet<E> a(Comparator<? super E> comparator) {
        if (fct.b().equals(comparator)) {
            return RegularImmutableSortedSet.b;
        }
        return new RegularImmutableSortedSet<>(ImmutableList.d(), comparator);
    }

    static <E> ImmutableSortedSet<E> a(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return a(comparator);
        }
        fcq.a((Object[]) eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator.compare(e, eArr[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr[i2] = e;
                i2 = i4;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.b(eArr, i2), comparator);
    }

    public static <E extends Comparable<?>> a<E> k() {
        return new a<>(fct.b());
    }

    /* access modifiers changed from: 0000 */
    public final int c(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    ImmutableSortedSet(Comparator<? super E> comparator) {
        this.a = comparator;
    }

    public Comparator<? super E> comparator() {
        return this.a;
    }

    /* renamed from: b */
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    /* renamed from: d */
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return b(fay.a(e), z);
    }

    /* renamed from: a */
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    /* renamed from: b */
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        fay.a(e);
        fay.a(e2);
        fay.a(this.a.compare(e, e2) <= 0);
        return a(e, z, e2, z2);
    }

    /* renamed from: a */
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* renamed from: c */
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return a((E) fay.a(e), z);
    }

    public E lower(E e) {
        return Iterators.b((Iterator<? extends T>) headSet(e, false).descendingIterator(), null);
    }

    public E floor(E e) {
        return Iterators.b((Iterator<? extends T>) headSet(e, true).descendingIterator(), null);
    }

    public E ceiling(E e) {
        return fcl.a((Iterable<? extends T>) tailSet(e, true), null);
    }

    public E higher(E e) {
        return fcl.a((Iterable<? extends T>) tailSet(e, false), null);
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.b;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> b2 = b();
        this.b = b2;
        b2.b = this;
        return b2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this.a, toArray());
    }
}
