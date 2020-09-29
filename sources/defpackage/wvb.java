package defpackage;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: wvb reason: default package */
public abstract class wvb implements wvo {
    private static final AtomicIntegerFieldUpdater<wvb> a;
    private volatile int refCnt = 1;

    static {
        Class<wvb> cls = wvb.class;
        String str = "refCnt";
        AtomicIntegerFieldUpdater<wvb> b = PlatformDependent.b(cls, str);
        if (b == null) {
            b = AtomicIntegerFieldUpdater.newUpdater(cls, str);
        }
        a = b;
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

    /* access modifiers changed from: protected */
    public abstract void d();

    public wvo e() {
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

    public final int z() {
        return this.refCnt;
    }
}
