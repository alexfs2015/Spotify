package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: hvi reason: default package */
public final class hvi implements vua<wud<SessionState>> {
    private final wlc<hvl> a;

    private hvi(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static hvi a(wlc<hvl> wlc) {
        return new hvi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(vun.a((wrf<T>) ((hvl) this.a.get()).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
