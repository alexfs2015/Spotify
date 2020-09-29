package defpackage;

import android.app.Activity;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: jlw reason: default package */
public final class jlw implements jmb {
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

    public jlw(wlc<iwt> wlc, wlc<jsz> wlc2, wlc<jxo> wlc3, wlc<jyj> wlc4, wlc<jno> wlc5, wlc<ToastieManager> wlc6, wlc<jjf> wlc7, wlc<kxg> wlc8, wlc<rgz> wlc9, wlc<twu> wlc10, wlc<uqi> wlc11, wlc<hdb> wlc12, wlc<FollowManager> wlc13, wlc<Scheduler> wlc14, wlc<uab> wlc15, wlc<FireAndForgetResolver> wlc16, wlc<gbd> wlc17, wlc<tcn> wlc18, wlc<Flowable<PlayerState>> wlc19, wlc<ruz> wlc20, wlc<Activity> wlc21, wlc<izg> wlc22) {
        wlc<iwt> wlc23 = wlc;
        this.a = (wlc) a(wlc, 1);
        wlc<jsz> wlc24 = wlc2;
        this.b = (wlc) a(wlc2, 2);
        wlc<jxo> wlc25 = wlc3;
        this.c = (wlc) a(wlc3, 3);
        wlc<jyj> wlc26 = wlc4;
        this.d = (wlc) a(wlc4, 4);
        wlc<jno> wlc27 = wlc5;
        this.e = (wlc) a(wlc5, 5);
        wlc<ToastieManager> wlc28 = wlc6;
        this.f = (wlc) a(wlc6, 6);
        wlc<jjf> wlc29 = wlc7;
        this.g = (wlc) a(wlc7, 7);
        wlc<kxg> wlc30 = wlc8;
        this.h = (wlc) a(wlc8, 8);
        wlc<rgz> wlc31 = wlc9;
        this.i = (wlc) a(wlc9, 9);
        wlc<twu> wlc32 = wlc10;
        this.j = (wlc) a(wlc10, 10);
        wlc<uqi> wlc33 = wlc11;
        this.k = (wlc) a(wlc11, 11);
        wlc<hdb> wlc34 = wlc12;
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
        this.o = (wlc) a(wlc15, 15);
        this.p = (wlc) a(wlc16, 16);
        this.q = (wlc) a(wlc17, 17);
        this.r = (wlc) a(wlc18, 18);
        this.s = (wlc) a(wlc19, 19);
        this.t = (wlc) a(wlc20, 20);
        this.u = (wlc) a(wlc21, 21);
        this.v = (wlc) a(wlc22, 22);
    }

    public final ContextMenuHelper a(udr udr, sih sih, ContextMenuViewModel contextMenuViewModel, jnu jnu, fpt fpt) {
        ContextMenuHelper contextMenuHelper = new ContextMenuHelper((iwt) a(this.a.get(), 1), (jsz) a(this.b.get(), 2), (jxo) a(this.c.get(), 3), (jyj) a(this.d.get(), 4), (jno) a(this.e.get(), 5), (ToastieManager) a(this.f.get(), 6), (jjf) a(this.g.get(), 7), (kxg) a(this.h.get(), 8), (rgz) a(this.i.get(), 9), (twu) a(this.j.get(), 10), (uqi) a(this.k.get(), 11), (hdb) a(this.l.get(), 12), (FollowManager) a(this.m.get(), 13), (Scheduler) a(this.n.get(), 14), (uab) a(this.o.get(), 15), (FireAndForgetResolver) a(this.p.get(), 16), (gbd) a(this.q.get(), 17), (tcn) a(this.r.get(), 18), (Flowable) a(this.s.get(), 19), (ruz) a(this.t.get(), 20), (Activity) a(this.u.get(), 21), (izg) a(this.v.get(), 22), (udr) a(udr, 23), (sih) a(sih, 24), (ContextMenuViewModel) a(contextMenuViewModel, 25), (jnu) a(jnu, 26), (fpt) a(fpt, 27));
        return contextMenuHelper;
    }

    private static <T> T a(T t2, int i2) {
        if (t2 != null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
