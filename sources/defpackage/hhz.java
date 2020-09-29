package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: hhz reason: default package */
public final class hhz implements vua<Handler> {
    private final wlc<Looper> a;

    private hhz(wlc<Looper> wlc) {
        this.a = wlc;
    }

    public static hhz a(wlc<Looper> wlc) {
        return new hhz(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Handler) vuf.a(new Handler((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
