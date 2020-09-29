package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xaf reason: default package */
public final class xaf implements wuk {
    private static wum b = new wum() {
        public final void call() {
        }
    };
    private AtomicReference<wum> a;

    public xaf() {
        this.a = new AtomicReference<>();
    }

    private xaf(wum wum) {
        this.a = new AtomicReference<>(wum);
    }

    public static xaf a() {
        return new xaf();
    }

    public static xaf a(wum wum) {
        return new xaf(wum);
    }

    public final boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    public final void unsubscribe() {
        wum wum = (wum) this.a.get();
        wum wum2 = b;
        if (wum != wum2) {
            wum wum3 = (wum) this.a.getAndSet(wum2);
            if (wum3 != null && wum3 != b) {
                wum3.call();
            }
        }
    }
}
