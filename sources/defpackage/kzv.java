package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: kzv reason: default package */
public final class kzv implements vua<Handler> {
    private final wlc<Looper> a;

    private kzv(wlc<Looper> wlc) {
        this.a = wlc;
    }

    public static kzv a(wlc<Looper> wlc) {
        return new kzv(wlc);
    }

    public static Handler a(Looper looper) {
        return (Handler) vuf.a(CC.a(looper), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Looper) this.a.get());
    }
}
