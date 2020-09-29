package defpackage;

import android.os.Build.VERSION;

/* renamed from: kpj reason: default package */
public final class kpj implements vua<kpm> {
    private final wlc<kps> a;
    private final wlc<kpq> b;

    private kpj(wlc<kps> wlc, wlc<kpq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kpj a(wlc<kps> wlc, wlc<kpq> wlc2) {
        return new kpj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        wlc<kps> wlc = this.a;
        Object obj = (kpq) this.b.get();
        if (VERSION.SDK_INT >= 25) {
            obj = (kpm) wlc.get();
        }
        return (kpm) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
