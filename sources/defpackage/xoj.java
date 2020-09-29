package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xoj reason: default package */
public final class xoj implements xip {
    private static xir b = new xir() {
        public final void call() {
        }
    };
    private AtomicReference<xir> a;

    public xoj() {
        this.a = new AtomicReference<>();
    }

    private xoj(xir xir) {
        this.a = new AtomicReference<>(xir);
    }

    public static xoj a() {
        return new xoj();
    }

    public static xoj a(xir xir) {
        return new xoj(xir);
    }

    public final boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    public final void unsubscribe() {
        xir xir = (xir) this.a.get();
        xir xir2 = b;
        if (xir != xir2) {
            xir xir3 = (xir) this.a.getAndSet(xir2);
            if (xir3 != null && xir3 != b) {
                xir3.call();
            }
        }
    }
}
