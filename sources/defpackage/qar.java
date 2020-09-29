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

/* renamed from: qar reason: default package */
public final class qar implements qav {
    private final boolean A;
    private Disposable B;
    private Disposable C;
    private Disposable D;
    private gzz E;
    private final rrj F;
    private a G;
    private String H = UUID.randomUUID().toString();
    private final a I = new a() {
        public final void a(String str) {
            String[] split;
            String trim = str.trim();
            if (jst.h(trim)) {
                for (String str2 : Uri.parse(jst.a(trim).toString()).getEncodedPath().split("/")) {
                    String encode = Uri.encode(str2);
                    if (!str2.equals(encode)) {
                        trim = trim.replace(str2, encode);
                    }
                }
            }
            if (jst.h(trim)) {
                qar.this.a.a(trim);
            }
            qar.this.p().q();
        }
    };
    protected final saj a;
    private final Flowable<Boolean> b;
    private final Scheduler c;
    private gup d;
    private final gyl e;
    private gyo f;
    private qcq g;
    private final sdw h;
    private final sfk i;
    private final sfj j;
    private sfx k;
    private final qbw l;
    private final ryy m;
    private final ryz n;
    private final sej o;
    private final Function<Optional<gzz>, Optional<gzz>> p;
    private final boolean q;
    private final pzg r;
    private final qao s;
    private final qbr t;
    private shj u;
    private String v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private boolean z;

    public final void c() {
    }

    public final boolean onBackPressed() {
        return false;
    }

    public qar(gyl gyl, gyo gyo, sdw sdw, sfk sfk, sfj sfj, saj saj, sfx sfx, qbw qbw, ryy ryy, ryz ryz, shj shj, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, rrj rrj, Flowable<Boolean> flowable, Scheduler scheduler, sej sej, Function<Optional<gzz>, Optional<gzz>> function, boolean z7, pzg pzg, qao qao, qbr qbr) {
        this.a = (saj) fay.a(saj);
        this.e = (gyl) fay.a(gyl);
        this.f = gyo;
        this.h = (sdw) fay.a(sdw);
        this.i = (sfk) fay.a(sfk);
        this.j = (sfj) fay.a(sfj);
        this.k = (sfx) fay.a(sfx);
        this.l = (qbw) fay.a(qbw);
        this.m = (ryy) fay.a(ryy);
        this.n = (ryz) fay.a(ryz);
        this.u = shj;
        this.v = (String) fay.a(str);
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = z5;
        this.A = z6;
        this.F = rrj;
        this.b = flowable;
        this.c = scheduler;
        this.o = sej;
        this.p = function;
        this.q = z7;
        this.r = pzg;
        this.s = qao;
        this.t = qbr;
    }

    public final void a(gup gup, qcq qcq) {
        this.d = gup;
        this.g = qcq;
        this.r.a(qcq.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.s.a(this.E, this.v, str);
    }

    public final void i() {
        this.n.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e(th, "Failed loading history.", new Object[0]);
        a(Collections.emptyList());
    }

    private static void a(Disposable disposable) {
        if (disposable != null && !disposable.b()) {
            disposable.bf_();
        }
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
            a((gzz) a2.c());
        } else {
            a(this.l.a(this.A));
        }
    }

    public final void onIntroAnimationComplete() {
        if (this.u != null) {
            l();
            this.u = null;
        }
    }

    private void l() {
        m();
        Flowable a2 = this.o.a(p().g(), p().h(), this.I, this.i, this.j, this.v, n());
        if (!fax.a(this.v)) {
            this.s.a(this.E, "", this.v);
        }
        a(a2);
    }

    private void a(Flowable<sge> flowable) {
        a(this.C);
        this.C = this.h.a(flowable).a(this.c).a((Consumer<? super T>) new $$Lambda$k9hPSgatw_ImGG5tf5MH7dRumok<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qar$lrOOBVRIx7t_qPG4X_XmCKgWzJ4<Object>(this));
    }

    /* access modifiers changed from: protected */
    public final void a(gzz gzz) {
        String str;
        a(this.B);
        gzz gzz2 = this.E;
        String str2 = "";
        if (gzz2 == null) {
            str = str2;
        } else {
            str = rzj.b(gzz2);
        }
        String b2 = rzj.b(gzz);
        this.v = rzj.a(gzz);
        if (fax.a(this.v) && this.g != null) {
            p().l();
        }
        this.s.a(this.E, gzz);
        this.E = gzz;
        Logger.a("SearchPresenter results onNext: query = %s, requestId = %s", this.v, b2);
        p().i();
        p().n();
        o().a(gzz, true ^ this.m.a(gzz));
        p().a(rzj.a(gzz, "backgroundUri", str2));
        if (fax.a(this.v) && !fax.a(str) && !((gzz) fay.a(gzz)).custom().boolValue("isQuack", false)) {
            this.k.a(str);
        }
        if (this.f != null && this.z && !fax.a(b2)) {
            this.f.a(sgu.a((Iterable<? extends gzt>) gzz.body()), (String) null);
            this.f = null;
            this.z = false;
        }
    }

    private void m() {
        if (this.q) {
            p().a((List<SearchTab>) ImmutableList.a((E[]) SearchTab.a));
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "SearchPresenter results onError = %s", th.getClass().getSimpleName());
    }

    public final String j() {
        return this.v;
    }

    private boolean n() {
        return this.E == null;
    }

    public final void f() {
        this.e.a();
        this.e.a(o());
    }

    public final void h() {
        this.e.b();
        this.e.b(o());
    }

    public final boolean k() {
        String str;
        sfx sfx = this.k;
        if (this.y) {
            str = ViewUris.C.toString();
        } else if (this.w) {
            str = ViewUris.H.toString();
        } else {
            str = ViewUris.af.toString();
        }
        sfx.b(str);
        p().j();
        return true;
    }

    private gup o() {
        return (gup) fay.a(this.d);
    }

    /* access modifiers changed from: private */
    public qcq p() {
        return (qcq) fay.a(this.g);
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            this.a.a(intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT"));
        }
    }

    public final void d() {
        this.t.a();
    }

    public final void g() {
        if (p().m()) {
            a(this.D);
            this.D = this.b.a((Consumer<? super T>) new $$Lambda$qar$Dg6qSakTmTbv8VMqUY9Fad33Mo<Object>(this), (Consumer<? super Throwable>) $$Lambda$qar$F8aLmS3RrUyQcZYa50oPsPvkT8.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        p().k();
    }

    public final void a() {
        this.G = new $$Lambda$qar$BC43U9uyOoRzCa9ljAfIcxerU(this);
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
        this.B = this.n.a().c().a(this.c).a((Consumer<? super T>) new $$Lambda$qar$ep8sZz8E1IpdUWscAifFEkhXncc<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qar$aJbbxujhN0xlfRLjwh4HzxGZ0g<Object>(this));
    }

    public final void b() {
        qcq qcq = this.g;
        if (!(qcq == null || this.G == null)) {
            qcq.g().b(this.G);
        }
        a(this.C);
        a(this.B);
        a(this.D);
    }

    public final Parcelable e() {
        gup o2 = o();
        this.F.a(this.H, (gzz) o().d.a());
        return new rri(this.H, o2.a());
    }

    public final void a(Parcelable parcelable) {
        Parcelable parcelable2 = (Parcelable) fay.a(parcelable);
        gup o2 = o();
        if (parcelable2 instanceof rri) {
            rri rri = (rri) parcelable2;
            this.H = rri.a;
            gzz a2 = this.F.a(this.H);
            if (a2 != null) {
                o2.a(a2, false);
            }
            o2.a(rri.b);
        }
        gzz gzz = (gzz) o().d.a();
        this.E = gzz;
        if (gzz != null) {
            this.v = rzj.a(gzz);
        }
    }
}
