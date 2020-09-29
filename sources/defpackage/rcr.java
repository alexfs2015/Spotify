package defpackage;

import com.spotify.music.follow.FollowManager;

/* renamed from: rcr reason: default package */
public final class rcr implements vua<rcq> {
    private final wlc<jsz> a;
    private final wlc<FollowManager> b;
    private final wlc<rcs> c;

    private rcr(wlc<jsz> wlc, wlc<FollowManager> wlc2, wlc<rcs> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rcr a(wlc<jsz> wlc, wlc<FollowManager> wlc2, wlc<rcs> wlc3) {
        return new rcr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rcq((jsz) this.a.get(), (FollowManager) this.b.get(), (rcs) this.c.get());
    }
}
