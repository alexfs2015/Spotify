package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: ljl reason: default package */
public final class ljl implements vua<wud<String>> {
    private final wlc<wud<SessionState>> a;

    private ljl(wlc<wud<SessionState>> wlc) {
        this.a = wlc;
    }

    public static ljl a(wlc<wud<SessionState>> wlc) {
        return new ljl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((wud) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
