package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: gvr reason: default package */
public final class gvr implements vua<gvq> {
    private final wlc<FollowManager> a;

    private gvr(wlc<FollowManager> wlc) {
        this.a = wlc;
    }

    public static gvr a(wlc<FollowManager> wlc) {
        return new gvr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gvq((FollowManager) this.a.get());
    }
}
