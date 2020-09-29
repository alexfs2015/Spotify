package defpackage;

import android.content.res.Resources;

/* renamed from: srl reason: default package */
public final class srl implements vua<srk> {
    private final wlc<Resources> a;

    private srl(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static srl a(wlc<Resources> wlc) {
        return new srl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new srk((Resources) this.a.get());
    }
}
