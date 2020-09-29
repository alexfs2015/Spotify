package com.google.common.collect;

import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends fdz<T> {
    private State a = State.NOT_READY;
    private T b;

    /* renamed from: com.google.common.collect.AbstractIterator$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator.AnonymousClass1.<clinit>():void");
        }
    }

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.a = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        fbp.b(this.a != State.FAILED);
        int i = AnonymousClass1.a[this.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.a = State.FAILED;
        this.b = a();
        if (this.a == State.DONE) {
            return false;
        }
        this.a = State.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.a = State.NOT_READY;
            T t = this.b;
            this.b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
