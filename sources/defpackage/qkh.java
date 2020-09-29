package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.follow.FollowManager;
import io.reactivex.Scheduler;

/* renamed from: qkh reason: default package */
public final class qkh implements vua<qkg> {
    private final wlc<FollowManager> a;
    private final wlc<rcu> b;
    private final wlc<qho> c;
    private final wlc<Scheduler> d;
    private final wlc<a> e;

    private qkh(wlc<FollowManager> wlc, wlc<rcu> wlc2, wlc<qho> wlc3, wlc<Scheduler> wlc4, wlc<a> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qkh a(wlc<FollowManager> wlc, wlc<rcu> wlc2, wlc<qho> wlc3, wlc<Scheduler> wlc4, wlc<a> wlc5) {
        qkh qkh = new qkh(wlc, wlc2, wlc3, wlc4, wlc5);
        return qkh;
    }

    public final /* synthetic */ Object get() {
        qkg qkg = new qkg((FollowManager) this.a.get(), (rcu) this.b.get(), (qho) this.c.get(), (Scheduler) this.d.get(), (a) this.e.get());
        return qkg;
    }
}
