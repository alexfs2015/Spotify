package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mep reason: default package */
public final class mep implements vua<meo> {
    private final wlc<a> a;

    private mep(wlc<a> wlc) {
        this.a = wlc;
    }

    public static mep a(wlc<a> wlc) {
        return new mep(wlc);
    }

    public final /* synthetic */ Object get() {
        return new meo((a) this.a.get());
    }
}
