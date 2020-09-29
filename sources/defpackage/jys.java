package defpackage;

import android.os.Looper;

/* renamed from: jys reason: default package */
public final class jys implements vua<kbs> {
    private final wlc<Looper> a;

    private jys(wlc<Looper> wlc) {
        this.a = wlc;
    }

    public static jys a(wlc<Looper> wlc) {
        return new jys(wlc);
    }

    public final /* synthetic */ Object get() {
        return (kbs) vuf.a(new kbs((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
