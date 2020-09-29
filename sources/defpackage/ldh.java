package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ldh reason: default package */
public final class ldh implements wig<Handler> {
    private final wzi<Looper> a;

    private ldh(wzi<Looper> wzi) {
        this.a = wzi;
    }

    public static Handler a(Looper looper) {
        return (Handler) wil.a(CC.a(looper), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static ldh a(wzi<Looper> wzi) {
        return new ldh(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Looper) this.a.get());
    }
}
