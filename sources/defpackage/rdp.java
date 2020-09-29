package defpackage;

import android.content.res.Resources;

/* renamed from: rdp reason: default package */
public final class rdp implements vua<rdo> {
    private final wlc<hec> a;
    private final wlc<Resources> b;
    private final wlc<rdm> c;

    private rdp(wlc<hec> wlc, wlc<Resources> wlc2, wlc<rdm> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rdp a(wlc<hec> wlc, wlc<Resources> wlc2, wlc<rdm> wlc3) {
        return new rdp(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rdo((hec) this.a.get(), (Resources) this.b.get(), (rdm) this.c.get());
    }
}
