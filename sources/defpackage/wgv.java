package defpackage;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wgv reason: default package */
public abstract class wgv implements whi {
    private static final AtomicIntegerFieldUpdater<wgv> a;
    private volatile int refCnt = 1;

    /* access modifiers changed from: protected */
    public abstract void d();

    static {
        Class<wgv> cls = wgv.class;
        String str = "refCnt";
        AtomicIntegerFieldUpdater<wgv> b = PlatformDependent.b(cls, str);
        if (b == null) {
            b = AtomicIntegerFieldUpdater.newUpdater(cls, str);
        }
        a = b;
    }

    public final int z() {
        return this.refCnt;
    }

    public final boolean B() {
        return a(1);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        int i2;
        do {
            i2 = this.refCnt;
            if (i2 < i) {
                throw new IllegalReferenceCountException(i2, -i);
            }
        } while (!a.compareAndSet(this, i2, i2 - i));
        if (i2 != i) {
            return false;
        }
        d();
        return true;
    }

    public whi e() {
        int i;
        int i2;
        do {
            i = this.refCnt;
            i2 = i + 1;
            if (i2 <= 1) {
                throw new IllegalReferenceCountException(i, 1);
            }
        } while (!a.compareAndSet(this, i, i2));
        return this;
    }
}
