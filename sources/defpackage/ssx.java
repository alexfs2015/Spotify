package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: ssx reason: default package */
public final class ssx implements vua<ssw> {
    private final wlc<a> a;

    private ssx(wlc<a> wlc) {
        this.a = wlc;
    }

    public static ssx a(wlc<a> wlc) {
        return new ssx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ssw((a) this.a.get());
    }
}
