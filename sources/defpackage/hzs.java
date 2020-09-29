package defpackage;

import android.content.res.Resources;

/* renamed from: hzs reason: default package */
public final class hzs implements vua<hzr> {
    private final wlc<Resources> a;

    private hzs(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static hzs a(wlc<Resources> wlc) {
        return new hzs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hzr((Resources) this.a.get());
    }
}
