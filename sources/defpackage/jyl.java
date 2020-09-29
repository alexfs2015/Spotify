package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: jyl reason: default package */
public class jyl implements xip {
    private static final AtomicIntegerFieldUpdater<jyl> d = AtomicIntegerFieldUpdater.newUpdater(jyl.class, "a");
    volatile int a;
    private final a b;
    private final xir c;
    private volatile boolean e;

    public jyl(xil xil, xir xir) {
        this.b = xil.c();
        this.c = xir;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.b.unsubscribe();
        this.c.call();
        this.e = true;
    }

    public boolean isUnsubscribed() {
        return this.e;
    }

    public void unsubscribe() {
        if (d.getAndSet(this, 1) == 0) {
            this.b.a(new $$Lambda$jyl$3uLY2ntEtv8D9AHKwcbzypyDic(this));
        }
    }
}
