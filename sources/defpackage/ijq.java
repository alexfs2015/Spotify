package defpackage;

import android.os.Handler;

/* renamed from: ijq reason: default package */
public final class ijq implements wig<ijp> {
    private final wzi<Handler> a;

    private ijq(wzi<Handler> wzi) {
        this.a = wzi;
    }

    public static ijq a(wzi<Handler> wzi) {
        return new ijq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ijp((Handler) this.a.get());
    }
}
