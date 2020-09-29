package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    public static final Object d = new Object();
    private static int e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public final AtomicLong a = new AtomicLong();
    public final int b;
    public AtomicReferenceArray<Object> c;
    private int f;
    private long g;
    private int h;
    private AtomicReferenceArray<Object> i;
    private AtomicLong j = new AtomicLong();

    public SpscLinkedArrayQueue(int i2) {
        int a2 = Pow2.a(Math.max(8, i2));
        int i3 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.c = atomicReferenceArray;
        this.b = i3;
        this.f = Math.min(a2 / 4, e);
        this.i = atomicReferenceArray;
        this.h = i3;
        this.g = (long) (i3 - 1);
        a(0);
    }

    public static int a(long j2, int i2) {
        return ((int) j2) & i2;
    }

    public static <E> Object a(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    public static void a(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.c = atomicReferenceArray2;
        this.g = (j3 + j2) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        a(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, d);
        a(j2 + 1);
    }

    public static void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        atomicReferenceArray.lazySet(i2, t);
        a(j2 + 1);
        return true;
    }

    private void b(long j2) {
        this.j.lazySet(j2);
    }

    public void a(long j2) {
        this.a.lazySet(j2);
    }

    public final boolean a(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.c;
            long j2 = this.a.get();
            int i2 = this.b;
            int i3 = ((int) j2) & i2;
            if (j2 < this.g) {
                return a(atomicReferenceArray, t, j2, i3);
            }
            long j3 = ((long) this.f) + j2;
            if (atomicReferenceArray.get(((int) j3) & i2) == null) {
                this.g = j3 - 1;
                return a(atomicReferenceArray, t, j2, i3);
            } else if (atomicReferenceArray.get(((int) (1 + j2)) & i2) == null) {
                return a(atomicReferenceArray, t, j2, i3);
            } else {
                a(atomicReferenceArray, j2, i3, t, (long) i2);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public final T ba_() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.i;
        long j2 = this.j.get();
        int i2 = this.h;
        int i3 = ((int) j2) & i2;
        T t = atomicReferenceArray.get(i3);
        boolean z = t == d;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            b(j2 + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i4 = i2 + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
            atomicReferenceArray.lazySet(i4, null);
            this.i = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i3);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i3, null);
                b(j2 + 1);
            }
            return t2;
        }
    }

    public final boolean d() {
        return this.a.get() == this.j.get();
    }

    public final void e() {
        while (true) {
            if (ba_() == null && d()) {
                return;
            }
        }
    }
}
