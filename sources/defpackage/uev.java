package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: uev reason: default package */
public final class uev implements vua<qmc> {
    private final wlc<a> a;

    private uev(wlc<a> wlc) {
        this.a = wlc;
    }

    public static uev a(wlc<a> wlc) {
        return new uev(wlc);
    }

    public final /* synthetic */ Object get() {
        return (qmc) vuf.a(new qmb("key_session_id", (a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
