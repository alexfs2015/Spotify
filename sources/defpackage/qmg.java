package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qmg reason: default package */
public final class qmg implements vua<qmf> {
    private final wlc<a> a;
    private final wlc<qmc> b;

    private qmg(wlc<a> wlc, wlc<qmc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qmg a(wlc<a> wlc, wlc<qmc> wlc2) {
        return new qmg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qmf((a) this.a.get(), (qmc) this.b.get());
    }
}
