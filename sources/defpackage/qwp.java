package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qwp reason: default package */
public final class qwp implements vua<qwo> {
    private final wlc<lkn> a;
    private final wlc<a> b;

    private qwp(wlc<lkn> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qwp a(wlc<lkn> wlc, wlc<a> wlc2) {
        return new qwp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qwo((lkn) this.a.get(), (a) this.b.get());
    }
}
