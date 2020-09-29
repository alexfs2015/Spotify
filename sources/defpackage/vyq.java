package defpackage;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: vyq reason: default package */
public abstract class vyq extends vym {
    private static final AtomicIntegerFieldUpdater<vyq> e;
    volatile int f = 1;

    /* renamed from: a */
    public vyv b(Object obj) {
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void aZ_();

    static {
        Class<vyq> cls = vyq.class;
        AtomicIntegerFieldUpdater<vyq> b = PlatformDependent.b(cls, "refCnt");
        if (b == null) {
            b = AtomicIntegerFieldUpdater.newUpdater(cls, "f");
        }
        e = b;
    }

    protected vyq(int i) {
        super(i);
    }

    public int z() {
        return this.f;
    }

    public vyv A() {
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
        aZ_();
        return true;
    }
}
