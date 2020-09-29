package defpackage;

import android.content.res.Resources;

/* renamed from: qnc reason: default package */
public final class qnc implements vua<qnb> {
    private final wlc<Resources> a;

    private qnc(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static qnc a(wlc<Resources> wlc) {
        return new qnc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qnb((Resources) this.a.get());
    }
}
