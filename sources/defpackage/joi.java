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

/* renamed from: joi reason: default package */
public final class joi implements jon {
    private final wzi<ize> a;
    private final wzi<jvf> b;
    private final wzi<jzo> c;
    private final wzi<kaj> d;
    private final wzi<jqa> e;
    private final wzi<ToastieManager> f;
    private final wzi<jlr> g;
    private final wzi<lap> h;
    private final wzi<rqb> i;
    private final wzi<uix> j;
    private final wzi<vbn> k;
    private final wzi<hfx> l;
    private final wzi<FollowManager> m;
    private final wzi<Scheduler> n;
    private final wzi<umw> o;
    private final wzi<FireAndForgetResolver> p;
    private final wzi<gcb> q;
    private final wzi<tmu> r;
    private final wzi<Flowable<PlayerState>> s;
    private final wzi<sej> t;
    private final wzi<Activity> u;
    private final wzi<jbr> v;

    public joi(wzi<ize> wzi, wzi<jvf> wzi2, wzi<jzo> wzi3, wzi<kaj> wzi4, wzi<jqa> wzi5, wzi<ToastieManager> wzi6, wzi<jlr> wzi7, wzi<lap> wzi8, wzi<rqb> wzi9, wzi<uix> wzi10, wzi<vbn> wzi11, wzi<hfx> wzi12, wzi<FollowManager> wzi13, wzi<Scheduler> wzi14, wzi<umw> wzi15, wzi<FireAndForgetResolver> wzi16, wzi<gcb> wzi17, wzi<tmu> wzi18, wzi<Flowable<PlayerState>> wzi19, wzi<sej> wzi20, wzi<Activity> wzi21, wzi<jbr> wzi22) {
        wzi<ize> wzi23 = wzi;
        this.a = (wzi) a(wzi, 1);
        wzi<jvf> wzi24 = wzi2;
        this.b = (wzi) a(wzi2, 2);
        wzi<jzo> wzi25 = wzi3;
        this.c = (wzi) a(wzi3, 3);
        wzi<kaj> wzi26 = wzi4;
        this.d = (wzi) a(wzi4, 4);
        wzi<jqa> wzi27 = wzi5;
        this.e = (wzi) a(wzi5, 5);
        wzi<ToastieManager> wzi28 = wzi6;
        this.f = (wzi) a(wzi6, 6);
        wzi<jlr> wzi29 = wzi7;
        this.g = (wzi) a(wzi7, 7);
        wzi<lap> wzi30 = wzi8;
        this.h = (wzi) a(wzi8, 8);
        wzi<rqb> wzi31 = wzi9;
        this.i = (wzi) a(wzi9, 9);
        wzi<uix> wzi32 = wzi10;
        this.j = (wzi) a(wzi10, 10);
        wzi<vbn> wzi33 = wzi11;
        this.k = (wzi) a(wzi11, 11);
        wzi<hfx> wzi34 = wzi12;
        this.l = (wzi) a(wzi12, 12);
        this.m = (wzi) a(wzi13, 13);
        this.n = (wzi) a(wzi14, 14);
        this.o = (wzi) a(wzi15, 15);
        this.p = (wzi) a(wzi16, 16);
        this.q = (wzi) a(wzi17, 17);
        this.r = (wzi) a(wzi18, 18);
        this.s = (wzi) a(wzi19, 19);
        this.t = (wzi) a(wzi20, 20);
        this.u = (wzi) a(wzi21, 21);
        this.v = (wzi) a(wzi22, 22);
    }

    private static <T> T a(T t2, int i2) {
        if (t2 != null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final ContextMenuHelper a(uqm uqm, sso sso, ContextMenuViewModel contextMenuViewModel, jqg jqg, fqn fqn) {
        ContextMenuHelper contextMenuHelper = new ContextMenuHelper((ize) a(this.a.get(), 1), (jvf) a(this.b.get(), 2), (jzo) a(this.c.get(), 3), (kaj) a(this.d.get(), 4), (jqa) a(this.e.get(), 5), (ToastieManager) a(this.f.get(), 6), (jlr) a(this.g.get(), 7), (lap) a(this.h.get(), 8), (rqb) a(this.i.get(), 9), (uix) a(this.j.get(), 10), (vbn) a(this.k.get(), 11), (hfx) a(this.l.get(), 12), (FollowManager) a(this.m.get(), 13), (Scheduler) a(this.n.get(), 14), (umw) a(this.o.get(), 15), (FireAndForgetResolver) a(this.p.get(), 16), (gcb) a(this.q.get(), 17), (tmu) a(this.r.get(), 18), (Flowable) a(this.s.get(), 19), (sej) a(this.t.get(), 20), (Activity) a(this.u.get(), 21), (jbr) a(this.v.get(), 22), (uqm) a(uqm, 23), (sso) a(sso, 24), (ContextMenuViewModel) a(contextMenuViewModel, 25), (jqg) a(jqg, 26), (fqn) a(fqn, 27));
        return contextMenuHelper;
    }
}
