package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: sro reason: default package */
public final class sro implements vua<srn> {
    private final wlc<uab> a;
    private final wlc<a> b;

    private sro(wlc<uab> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sro a(wlc<uab> wlc, wlc<a> wlc2) {
        return new sro(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new srn((uab) this.a.get(), (a) this.b.get());
    }
}
