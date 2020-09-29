package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: ttx reason: default package */
public final class ttx implements vua<ttw> {
    private final wlc<lkn> a;
    private final wlc<a> b;

    private ttx(wlc<lkn> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ttx a(wlc<lkn> wlc, wlc<a> wlc2) {
        return new ttx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ttw((lkn) this.a.get(), (a) this.b.get());
    }
}
