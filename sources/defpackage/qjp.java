package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.search.podcasts.tabs.SearchTab;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: qjp reason: default package */
public final class qjp implements qjt {
    private final boolean A;
    private Disposable B;
    private Disposable C;
    private Disposable D;
    private hcs E;
    private final saq F;
    private a G;
    private String H = UUID.randomUUID().toString();
    private final a I = new a() {
        public final void a(String str) {
            String[] split;
            String trim = str.trim();
            if (jva.h(trim)) {
                for (String str2 : Uri.parse(jva.a(trim).toString()).getEncodedPath().split("/")) {
                    String encode = Uri.encode(str2);
                    if (!str2.equals(encode)) {
                        trim = trim.replace(str2, encode);
                    }
                }
            }
            if (jva.h(trim)) {
                qjp.this.a.a(trim);
            }
            qjp.this.p().q();
        }
    };
    protected final skq a;
    private final Flowable<Boolean> b;
    private final Scheduler c;
    private gwp d;
    private final hbe e;
    private hbh f;
    private qlt g;
    private final sod h;
    private final spr i;
    private final spq j;
    private sqe k;
    private final qkw l;
    private final sim m;
    private final sin n;
    private final soq o;
    private final Function<Optional<hcs>, Optional<hcs>> p;
    private final boolean q;
    private final qie r;
    private final qjm s;
    private final qkp t;
    private srq u;
    private String v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private boolean z;

    public qjp(hbe hbe, hbh hbh, sod sod, spr spr, spq spq, skq skq, sqe sqe, qkw qkw, sim sim, sin sin, srq srq, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, saq saq, Flowable<Boolean> flowable, Scheduler scheduler, soq soq, Function<Optional<hcs>, Optional<hcs>> function, boolean z7, qie qie, qjm qjm, qkp qkp) {
        this.a = (skq) fbp.a(skq);
        this.e = (hbe) fbp.a(hbe);
        this.f = hbh;
        this.h = (sod) fbp.a(sod);
        this.i = (spr) fbp.a(spr);
        this.j = (spq) fbp.a(spq);
        this.k = (sqe) fbp.a(sqe);
        this.l = (qkw) fbp.a(qkw);
        this.m = (sim) fbp.a(sim);
        this.n = (sin) fbp.a(sin);
        this.u = srq;
        this.v = (String) fbp.a(str);
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = z5;
        this.A = z6;
        this.F = saq;
        this.b = flowable;
        this.c = scheduler;
        this.o = soq;
        this.p = function;
        this.q = z7;
        this.r = qie;
        this.s = qjm;
        this.t = qkp;
    }

    private void a(Flowable<sql> flowable) {
        a(this.C);
        this.C = this.h.a(flowable).a(this.c).a((Consumer<? super T>) new $$Lambda$yBNNqFj5SkTpnsoA145kWmdPFA<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qjp$HIOG7LzMvHyajRcqfs7WjH6p05s<Object>(this));
    }

    private static void a(Disposable disposable) {
        if (disposable != null && !disposable.b()) {
            disposable.bd_();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        p().k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.s.a(this.E, this.v, str);
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "SearchPresenter results onError = %s", th.getClass().getSimpleName());
    }

    /* access modifiers changed from: private */
    public void a(List<SearchHistoryItem> list) {
        Optional a2 = this.m.a(list);
        try {
            if (this.A) {
                a2 = (Optional) this.p.apply(a2);
            }
        } catch (Exception unused) {
        }
        if (a2.b()) {
            a((hcs) a2.c());
        } else {
            a(this.l.a(this.A));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e(th, "Failed loading history.", new Object[0]);
        a(Collections.emptyList());
    }

    private void l() {
        m();
        Flowable a2 = this.o.a(p().g(), p().h(), this.I, this.i, this.j, this.v, n());
        if (!fbo.a(this.v)) {
            this.s.a(this.E, "", this.v);
        }
        a(a2);
    }

    private void m() {
        if (this.q) {
            p().a((List<SearchTab>) ImmutableList.a((E[]) SearchTab.a));
        }
    }

    private boolean n() {
        return this.E == null;
    }

    private gwp o() {
        return (gwp) fbp.a(this.d);
    }

    /* access modifiers changed from: private */
    public qlt p() {
        return (qlt) fbp.a(this.g);
    }

    public final void a() {
        this.G = new $$Lambda$qjp$8P9Xodoff4QMPrdzhHeyQi3bTDM(this);
        p().g().a(this.G);
        if (this.u == null) {
            l();
            if (!this.x && !p().o()) {
                p().a(200);
            }
            return;
        }
        p().a((a) this);
        if (this.n.c()) {
            a(this.n.a().a());
            return;
        }
        a(this.B);
        this.B = this.n.a().c().a(this.c).a((Consumer<? super T>) new $$Lambda$qjp$NJf9MKAgPzfzEiOx8sFpx1DZQfg<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qjp$_xquxynlCs6bXwI5ResIHpeXSk<Object>(this));
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            this.a.a(intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT"));
        }
    }

    public final void a(Parcelable parcelable) {
        Parcelable parcelable2 = (Parcelable) fbp.a(parcelable);
        gwp o2 = o();
        if (parcelable2 instanceof sap) {
            sap sap = (sap) parcelable2;
            this.H = sap.a;
            hcs a2 = this.F.a(this.H);
            if (a2 != null) {
                o2.a(a2, false);
            }
            o2.a(sap.b);
        }
        hcs hcs = (hcs) o().d.a();
        this.E = hcs;
        if (hcs != null) {
            this.v = six.a(hcs);
        }
    }

    public final void a(gwp gwp, qlt qlt) {
        this.d = gwp;
        this.g = qlt;
        this.r.a(qlt.e());
    }

    /* access modifiers changed from: protected */
    public final void a(hcs hcs) {
        a(this.B);
        hcs hcs2 = this.E;
        String str = "";
        String b2 = hcs2 == null ? str : six.b(hcs2);
        String b3 = six.b(hcs);
        this.v = six.a(hcs);
        if (fbo.a(this.v) && this.g != null) {
            p().l();
        }
        this.s.a(this.E, hcs);
        this.E = hcs;
        Logger.a("SearchPresenter results onNext: query = %s, requestId = %s", this.v, b3);
        p().i();
        p().n();
        o().a(hcs, true ^ this.m.a(hcs));
        p().a(six.a(hcs, "backgroundUri", str));
        if (fbo.a(this.v) && !fbo.a(b2) && !((hcs) fbp.a(hcs)).custom().boolValue("isQuack", false)) {
            this.k.a(b2);
        }
        if (this.f != null && this.z && !fbo.a(b3)) {
            this.f.a(srb.a((Iterable<? extends hcm>) hcs.body()), (String) null);
            this.f = null;
            this.z = false;
        }
    }

    public final void b() {
        qlt qlt = this.g;
        if (!(qlt == null || this.G == null)) {
            qlt.g().b(this.G);
        }
        a(this.C);
        a(this.B);
        a(this.D);
    }

    public final void c() {
    }

    public final void d() {
        this.t.a();
    }

    public final Parcelable e() {
        gwp o2 = o();
        this.F.a(this.H, (hcs) o().d.a());
        return new sap(this.H, o2.a());
    }

    public final void f() {
        this.e.a();
        this.e.a(o());
    }

    public final void g() {
        if (p().m()) {
            a(this.D);
            this.D = this.b.a((Consumer<? super T>) new $$Lambda$qjp$6KsNaBhN1aDrLmfpG_vG5dnA_BM<Object>(this), (Consumer<? super Throwable>) $$Lambda$qjp$zc2Oniz45s3XvTrfz4b5xB7IpMI.INSTANCE);
        }
    }

    public final void h() {
        this.e.b();
        this.e.b(o());
    }

    public final void i() {
        this.n.d();
    }

    public final String j() {
        return this.v;
    }

    public final boolean k() {
        sqe sqe = this.k;
        String str = this.y ? ViewUris.B.toString() : this.w ? ViewUris.G.toString() : ViewUris.ae.toString();
        sqe.b(str);
        p().j();
        return true;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onIntroAnimationComplete() {
        if (this.u != null) {
            l();
            this.u = null;
        }
    }
}
