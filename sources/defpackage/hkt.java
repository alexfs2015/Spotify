package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: hkt reason: default package */
public final class hkt implements wig<Handler> {
    private final wzi<Looper> a;

    private hkt(wzi<Looper> wzi) {
        this.a = wzi;
    }

    public static hkt a(wzi<Looper> wzi) {
        return new hkt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Handler) wil.a(new Handler((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
