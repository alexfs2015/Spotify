package defpackage;

import android.app.Activity;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: jlx reason: default package */
public final class jlx implements vua<jlw> {
    private final wlc<iwt> a;
    private final wlc<jsz> b;
    private final wlc<jxo> c;
    private final wlc<jyj> d;
    private final wlc<jno> e;
    private final wlc<ToastieManager> f;
    private final wlc<jjf> g;
    private final wlc<kxg> h;
    private final wlc<rgz> i;
    private final wlc<twu> j;
    private final wlc<uqi> k;
    private final wlc<hdb> l;
    private final wlc<FollowManager> m;
    private final wlc<Scheduler> n;
    private final wlc<uab> o;
    private final wlc<FireAndForgetResolver> p;
    private final wlc<gbd> q;
    private final wlc<tcn> r;
    private final wlc<Flowable<PlayerState>> s;
    private final wlc<ruz> t;
    private final wlc<Activity> u;
    private final wlc<izg> v;

    private jlx(wlc<iwt> wlc, wlc<jsz> wlc2, wlc<jxo> wlc3, wlc<jyj> wlc4, wlc<jno> wlc5, wlc<ToastieManager> wlc6, wlc<jjf> wlc7, wlc<kxg> wlc8, wlc<rgz> wlc9, wlc<twu> wlc10, wlc<uqi> wlc11, wlc<hdb> wlc12, wlc<FollowManager> wlc13, wlc<Scheduler> wlc14, wlc<uab> wlc15, wlc<FireAndForgetResolver> wlc16, wlc<gbd> wlc17, wlc<tcn> wlc18, wlc<Flowable<PlayerState>> wlc19, wlc<ruz> wlc20, wlc<Activity> wlc21, wlc<izg> wlc22) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
        this.n = wlc14;
        this.o = wlc15;
        this.p = wlc16;
        this.q = wlc17;
        this.r = wlc18;
        this.s = wlc19;
        this.t = wlc20;
        this.u = wlc21;
        this.v = wlc22;
    }

    public static jlx a(wlc<iwt> wlc, wlc<jsz> wlc2, wlc<jxo> wlc3, wlc<jyj> wlc4, wlc<jno> wlc5, wlc<ToastieManager> wlc6, wlc<jjf> wlc7, wlc<kxg> wlc8, wlc<rgz> wlc9, wlc<twu> wlc10, wlc<uqi> wlc11, wlc<hdb> wlc12, wlc<FollowManager> wlc13, wlc<Scheduler> wlc14, wlc<uab> wlc15, wlc<FireAndForgetResolver> wlc16, wlc<gbd> wlc17, wlc<tcn> wlc18, wlc<Flowable<PlayerState>> wlc19, wlc<ruz> wlc20, wlc<Activity> wlc21, wlc<izg> wlc22) {
        jlx jlx = new jlx(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18, wlc19, wlc20, wlc21, wlc22);
        return jlx;
    }

    public final /* synthetic */ Object get() {
        jlw jlw = new jlw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
        return jlw;
    }
}
