package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: jwd reason: default package */
public class jwd implements wuk {
    private static final AtomicIntegerFieldUpdater<jwd> d = AtomicIntegerFieldUpdater.newUpdater(jwd.class, "a");
    volatile int a;
    private final a b;
    private final wum c;
    private volatile boolean e;

    public jwd(wug wug, wum wum) {
        this.b = wug.c();
        this.c = wum;
    }

    public boolean isUnsubscribed() {
        return this.e;
    }

    public void unsubscribe() {
        if (d.getAndSet(this, 1) == 0) {
            this.b.a(new $$Lambda$jwd$Cph8qFYWdjOjItj7v829FZDPOk(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.b.unsubscribe();
        this.c.call();
        this.e = true;
    }
}
