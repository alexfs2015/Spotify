package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wkw reason: default package */
public final class wkw<E> extends wku<E> {
    private final AtomicLong c = new AtomicLong();
    private final AtomicLong d = new AtomicLong();
    private volatile long e;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public wkw(int i) {
        super(i);
    }

    public final boolean offer(E e2) {
        long j;
        if (e2 != null) {
            int i = this.b;
            long j2 = (long) (i + 1);
            long j3 = this.e;
            do {
                j = this.d.get();
                long j4 = j - j2;
                if (j3 <= j4) {
                    j3 = this.c.get();
                    if (j3 <= j4) {
                        return false;
                    }
                    this.e = j3;
                }
            } while (!this.d.compareAndSet(j, 1 + j));
            a(i & ((int) j), e2);
            return true;
        }
        throw new NullPointerException();
    }

    public final E peek() {
        AtomicReferenceArray atomicReferenceArray = this.a;
        long j = this.c.get();
        int a = a(j);
        E e2 = atomicReferenceArray.get(a);
        if (e2 != null) {
            return e2;
        }
        if (j == this.d.get()) {
            return null;
        }
        do {
            e2 = atomicReferenceArray.get(a);
        } while (e2 == null);
        return e2;
    }

    public final E poll() {
        long j = this.c.get();
        int a = a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        E e2 = atomicReferenceArray.get(a);
        if (e2 != null) {
            atomicReferenceArray.lazySet(a, null);
            this.c.lazySet(j + 1);
        } else if (j == this.d.get()) {
            return null;
        } else {
            do {
                e2 = atomicReferenceArray.get(a);
            } while (e2 == null);
        }
        atomicReferenceArray.lazySet(a, null);
        this.c.lazySet(j + 1);
        return e2;
    }

    public final int size() {
        long j = this.c.get();
        while (true) {
            long j2 = this.d.get();
            long j3 = this.c.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public final boolean isEmpty() {
        return this.c.get() == this.d.get();
    }
}
