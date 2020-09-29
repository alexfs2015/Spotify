package defpackage;

import android.os.Looper;

/* renamed from: jzi reason: default package */
public final class jzi implements vua<kbs> {
    private final wlc<Looper> a;

    private jzi(wlc<Looper> wlc) {
        this.a = wlc;
    }

    public static jzi a(wlc<Looper> wlc) {
        return new jzi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (kbs) vuf.a(new kbs((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
