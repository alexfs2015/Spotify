package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qln reason: default package */
public final class qln implements vua<qmc> {
    private final wlc<a> a;

    private qln(wlc<a> wlc) {
        this.a = wlc;
    }

    public static qln a(wlc<a> wlc) {
        return new qln(wlc);
    }

    public final /* synthetic */ Object get() {
        return (qmc) vuf.a(new qmb("key_search_session_id", (a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
