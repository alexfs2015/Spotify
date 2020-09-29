package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wxz reason: default package */
public final class wxz<T> implements Queue<T> {
    private static int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    private AtomicLong b = new AtomicLong();
    private int c;
    private long d;
    private int e;
    private AtomicReferenceArray<Object> f;
    private int g;
    private AtomicReferenceArray<Object> h;
    private AtomicLong i = new AtomicLong();

    public wxz(int i2) {
        int a2 = wyk.a(i2);
        int i3 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f = atomicReferenceArray;
        this.e = i3;
        this.c = Math.min(a2 / 4, a);
        this.h = atomicReferenceArray;
        this.g = i3;
        this.d = (long) (i3 - 1);
    }

    public final boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long j2 = this.b.get();
        int i2 = this.e;
        int i3 = ((int) j2) & i2;
        if (j2 < this.d) {
            return a(atomicReferenceArray, t, j2, i3);
        }
        long j3 = ((long) this.c) + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.d = j3 - 1;
            return a(atomicReferenceArray, t, j2, i3);
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i2) == null) {
            return a(atomicReferenceArray, t, j2, i3);
        }
        long j5 = (long) i2;
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + j5) - 1;
        atomicReferenceArray2.lazySet(i3, t);
        a(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, j);
        a(j4);
        return true;
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    private static AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
    }

    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long j2 = this.i.get();
        int i2 = this.g & ((int) j2);
        T t = atomicReferenceArray.get(i2);
        boolean z = t == j;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            b(j2 + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            AtomicReferenceArray<Object> a2 = a(atomicReferenceArray);
            this.h = a2;
            T t2 = a2.get(i2);
            if (t2 == null) {
                return null;
            }
            a2.lazySet(i2, null);
            b(j2 + 1);
            return t2;
        }
    }

    public final T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        int i2 = ((int) this.i.get()) & this.g;
        T t = atomicReferenceArray.get(i2);
        if (t != j) {
            return t;
        }
        AtomicReferenceArray<Object> a2 = a(atomicReferenceArray);
        this.h = a2;
        return a2.get(i2);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    private void a(long j2) {
        this.b.lazySet(j2);
    }

    private void b(long j2) {
        this.i.lazySet(j2);
    }

    public final Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    public final T remove() {
        throw new UnsupportedOperationException();
    }

    public final T element() {
        throw new UnsupportedOperationException();
    }

    public final boolean a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long j2 = this.b.get();
        int i2 = this.e;
        long j3 = 2 + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            int i3 = ((int) j2) & i2;
            atomicReferenceArray.lazySet(i3 + 1, t2);
            atomicReferenceArray.lazySet(i3, t);
            a(j3);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f = atomicReferenceArray2;
            int i4 = ((int) j2) & i2;
            atomicReferenceArray2.lazySet(i4 + 1, t2);
            atomicReferenceArray2.lazySet(i4, t);
            a(atomicReferenceArray, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i4, j);
            a(j3);
        }
        return true;
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        atomicReferenceArray.lazySet(i2, t);
        a(j2 + 1);
        return true;
    }

    public final int size() {
        long j2 = this.i.get();
        while (true) {
            long j3 = this.b.get();
            long j4 = this.i.get();
            if (j2 == j4) {
                return (int) (j3 - j4);
            }
            j2 = j4;
        }
    }

    public final boolean isEmpty() {
        return this.b.get() == this.i.get();
    }
}
