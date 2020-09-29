package defpackage;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wmw reason: default package */
public abstract class wmw extends wms {
    private static final AtomicIntegerFieldUpdater<wmw> e;
    volatile int f = 1;

    static {
        Class<wmw> cls = wmw.class;
        AtomicIntegerFieldUpdater<wmw> b = PlatformDependent.b(cls, "refCnt");
        if (b == null) {
            b = AtomicIntegerFieldUpdater.newUpdater(cls, "f");
        }
        e = b;
    }

    protected wmw(int i) {
        super(i);
    }

    public wnb A() {
        int i;
        int i2;
        do {
            i = this.f;
            i2 = i + 1;
            if (i2 <= 1) {
                throw new IllegalReferenceCountException(i, 1);
            }
        } while (!e.compareAndSet(this, i, i2));
        return this;
    }

    public boolean B() {
        int i;
        do {
            i = this.f;
            if (i <= 0) {
                throw new IllegalReferenceCountException(i, -1);
            }
        } while (!e.compareAndSet(this, i, i - 1));
        if (i != 1) {
            return false;
        }
        aX_();
        return true;
    }

    /* renamed from: a */
    public wnb b(Object obj) {
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void aX_();

    public int z() {
        return this.f;
    }
}
