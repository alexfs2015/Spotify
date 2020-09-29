package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.follow.FollowManager;

/* renamed from: qxh reason: default package */
public final class qxh implements vua<qxg> {
    private final wlc<rcu> a;
    private final wlc<FollowManager> b;
    private final wlc<qwa> c;
    private final wlc<a> d;

    private qxh(wlc<rcu> wlc, wlc<FollowManager> wlc2, wlc<qwa> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qxh a(wlc<rcu> wlc, wlc<FollowManager> wlc2, wlc<qwa> wlc3, wlc<a> wlc4) {
        return new qxh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qxg((rcu) this.a.get(), (FollowManager) this.b.get(), (qwa) this.c.get(), (a) this.d.get());
    }
}
