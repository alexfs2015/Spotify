package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: iqz reason: default package */
public final class iqz implements vua<iqy> {
    private final wlc<Context> a;
    private final wlc<Handler> b;

    private iqz(wlc<Context> wlc, wlc<Handler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static iqz a(wlc<Context> wlc, wlc<Handler> wlc2) {
        return new iqz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new iqy((Context) this.a.get(), (Handler) this.b.get());
    }
}
