package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: mws reason: default package */
public final class mws implements vua<mwr> {
    private final wlc<FollowManager> a;

    private mws(wlc<FollowManager> wlc) {
        this.a = wlc;
    }

    public static mws a(wlc<FollowManager> wlc) {
        return new mws(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mwr((FollowManager) this.a.get());
    }
}
