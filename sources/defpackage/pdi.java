package defpackage;

import android.content.res.Resources;

/* renamed from: pdi reason: default package */
public final class pdi implements vua<pdh> {
    private final wlc<Resources> a;

    private pdi(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static pdi a(wlc<Resources> wlc) {
        return new pdi(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pdh((Resources) this.a.get());
    }
}
