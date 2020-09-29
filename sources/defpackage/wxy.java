package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wxy reason: default package */
public final class wxy<E> extends wxv<E> {
    private static final Integer c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private AtomicLong d = new AtomicLong();
    private long e;
    private AtomicLong f = new AtomicLong();
    private int g;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public wxy(int i) {
        super(i);
        this.g = Math.min(i / 4, c.intValue());
    }

    public final boolean offer(E e2) {
        if (e2 != null) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            int i = this.b;
            long j = this.d.get();
            int i2 = ((int) j) & i;
            if (j >= this.e) {
                long j2 = ((long) this.g) + j;
                if (atomicReferenceArray.get(i & ((int) j2)) == null) {
                    this.e = j2;
                } else if (atomicReferenceArray.get(i2) != null) {
                    return false;
                }
            }
            atomicReferenceArray.lazySet(i2, e2);
            this.d.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E poll() {
        long j = this.f.get();
        int a = a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        E e2 = atomicReferenceArray.get(a);
        if (e2 == null) {
            return null;
        }
        atomicReferenceArray.lazySet(a, null);
        this.f.lazySet(j + 1);
        return e2;
    }

    public final E peek() {
        return a(a(this.f.get()));
    }

    public final int size() {
        long j = this.f.get();
        while (true) {
            long j2 = this.d.get();
            long j3 = this.f.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public final boolean isEmpty() {
        return this.d.get() == this.f.get();
    }
}
