package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.follow.FollowManager;

/* renamed from: gvw reason: default package */
public final class gvw implements vua<gvv> {
    private final wlc<vol> a;
    private final wlc<gwb> b;
    private final wlc<FollowManager> c;
    private final wlc<gvq> d;
    private final wlc<HubsGlueImageDelegate> e;

    private gvw(wlc<vol> wlc, wlc<gwb> wlc2, wlc<FollowManager> wlc3, wlc<gvq> wlc4, wlc<HubsGlueImageDelegate> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static gvw a(wlc<vol> wlc, wlc<gwb> wlc2, wlc<FollowManager> wlc3, wlc<gvq> wlc4, wlc<HubsGlueImageDelegate> wlc5) {
        gvw gvw = new gvw(wlc, wlc2, wlc3, wlc4, wlc5);
        return gvw;
    }

    public final /* synthetic */ Object get() {
        gvv gvv = new gvv((vol) this.a.get(), (gwb) this.b.get(), (FollowManager) this.c.get(), (gvq) this.d.get(), (HubsGlueImageDelegate) this.e.get());
        return gvv;
    }
}
