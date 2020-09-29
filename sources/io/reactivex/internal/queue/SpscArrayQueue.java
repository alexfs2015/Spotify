package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(Pow2.a(i));
        this.lookAheadStep = Math.min(i / 4, a.intValue());
    }

    public final boolean a(E e) {
        if (e != null) {
            int i = this.mask;
            long j = this.producerIndex.get();
            int i2 = ((int) j) & i;
            if (j >= this.producerLookAhead) {
                long j2 = ((long) this.lookAheadStep) + j;
                if (get(i & ((int) j2)) == null) {
                    this.producerLookAhead = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.producerIndex.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E bc_() {
        long j = this.consumerIndex.get();
        int i = ((int) j) & this.mask;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.consumerIndex.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    public final boolean d() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public final void e() {
        while (true) {
            if (bc_() == null && d()) {
                return;
            }
        }
    }
}
