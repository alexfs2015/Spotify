package defpackage;

import android.app.Activity;
import com.spotify.music.follow.FollowManager;

/* renamed from: prs reason: default package */
public final class prs implements vua<prr> {
    private final wlc<Activity> a;
    private final wlc<jkf> b;
    private final wlc<mbl> c;
    private final wlc<FollowManager> d;
    private final wlc<hbj> e;

    private prs(wlc<Activity> wlc, wlc<jkf> wlc2, wlc<mbl> wlc3, wlc<FollowManager> wlc4, wlc<hbj> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static prs a(wlc<Activity> wlc, wlc<jkf> wlc2, wlc<mbl> wlc3, wlc<FollowManager> wlc4, wlc<hbj> wlc5) {
        prs prs = new prs(wlc, wlc2, wlc3, wlc4, wlc5);
        return prs;
    }

    public final /* synthetic */ Object get() {
        prr prr = new prr((Activity) this.a.get(), (jkf) this.b.get(), (mbl) this.c.get(), (FollowManager) this.d.get(), (hbj) this.e.get());
        return prr;
    }
}
