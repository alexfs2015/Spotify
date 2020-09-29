package defpackage;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.podcastonboarding.PodcastOnboardingActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;

/* renamed from: qkc reason: default package */
public final class qkc extends c implements a, qiq {
    private final Scheduler a;
    private final qkq b;
    private final Observable<kxx> c;
    private final qja d;
    private final qix e;
    private final qkv f;
    private final jjn g;
    private final qho h;
    private final qhu i;
    private final CompositeDisposable j = new CompositeDisposable();
    private boolean k;
    private boolean l = true;
    private boolean m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private qip q;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar) {
    }

    public qkc(boolean z, boolean z2, int i2, a aVar, Scheduler scheduler, qkq qkq, Observable<kxx> observable, qja qja, qix qix, qkv qkv, jjn jjn, qho qho, qhu qhu) {
        aVar.a(this);
        this.n = z;
        this.o = z2;
        this.p = i2;
        this.a = scheduler;
        this.b = qkq;
        this.c = observable;
        this.d = qja;
        this.e = qix;
        this.f = qkv;
        this.g = jjn;
        this.h = qho;
        this.i = qhu;
    }

    public final void e() {
        super.e();
        a(this.p);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(kxx kxx) {
        Single single;
        this.k = kxx.a();
        if (!kxx.a()) {
            if (h()) {
                return Observable.b(new c());
            }
            return Observable.b(new d());
        } else if (!this.d.a()) {
            qkq qkq = this.b;
            String a2 = qkq.b.a();
            if (!fax.a(a2)) {
                a2 = jst.a(a2).h();
                if (fax.a(a2)) {
                    a2 = "";
                }
            }
            if (qkq.c) {
                single = qkq.a.b(Build.MANUFACTURER, Build.MODEL, a2);
            } else {
                single = qkq.a.a(Build.MANUFACTURER, Build.MODEL, a2);
            }
            return single.d().a((ObservableTransformer<? super T, ? extends R>) new viq<Object,Object>()).c(1).c((Function<? super T, ? extends R>) $$Lambda$jx1prwHHyrUYxi7yGErrXiVbRII.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$9XxCZx5BdpFHcUWB5e06UwQKPLI.INSTANCE);
        } else if (this.m) {
            return Observable.b(new f());
        } else {
            return Observable.b(new e());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qiz qiz) {
        this.m = false;
        if (!(qiz instanceof b)) {
            this.q.aJ_();
        }
        qiz.a(new $$Lambda$qkc$VcAPeU1dDknH0g31n0IzIiEDP6o(this), new $$Lambda$qkc$zvjtjrIn5_XqUKg_jO0FJn4bns(this), $$Lambda$qkc$IJGtvhrXD8NWSySSVGSKPFb6UhA.INSTANCE, new $$Lambda$qkc$E8afUEcUCcUZC3n0rvp9PYg9KEg(this), new $$Lambda$qkc$Q0XMd9yrlwAXFivtKA_zLx8zYds(this), new $$Lambda$qkc$oQaXugZTEz1f66PmfXA347ROTwM(this), new $$Lambda$qkc$elfIiLtOiFkZBtcRG6bgTUgNARY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.q.f();
        this.q.a();
        this.q.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        this.d.a = new ArrayList(gVar.a.items());
        this.d.b = gVar.a.renderType();
        this.q.a(this.d.a, this.d.b, this.l);
        this.l = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.q.f();
        this.q.a(this.d.a, this.d.b, this.l);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.q.a();
        this.q.a(this.f.c(), this.f.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.q.a();
        this.q.a(this.f.d(), this.f.f());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.d(th, "Error observing connection state changes", new Object[0]);
        this.q.a();
        this.q.a(this.f.a(), this.f.b());
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        if (bundle != null) {
            this.l = bundle.getBoolean("key-animate-picker");
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("key-animate-picker", this.l);
    }

    public final void a() {
        this.j.c();
    }

    public final void aP_() {
        this.q = null;
    }

    public final void a(qip qip) {
        this.q = qip;
    }

    public final void d() {
        this.e.a((String) null, "to-artist-picker", 0, InteractionType.HIT, Intent.NAVIGATE_FORWARD);
        if (this.o && !this.n) {
            qhu qhu = this.i;
            qhu.c.startActivity(PodcastOnboardingActivity.a(qhu.c, true));
            this.g.a.finish();
        } else if (!h() || !this.k) {
            this.g.a.finish();
        } else {
            qhu qhu2 = this.i;
            qhu2.a((Fragment) qnd.a(qhu2.a), false);
        }
    }

    public final void aI_() {
        this.e.a((String) null, "to-artist-picker", 0, InteractionType.HIT, Intent.SEARCH);
        qhu qhu = this.i;
        qhu.a((Fragment) qlw.a(qhu.a), true);
    }

    public final void g() {
        a(this.p);
    }

    private boolean h() {
        return this.h.a() > 0;
    }

    private void a(int i2) {
        if (b(i2)) {
            this.e.a();
            this.q.i();
            return;
        }
        this.q.j();
    }

    private boolean b(int i2) {
        return this.h.a() >= i2;
    }

    public final void c() {
        this.q.a(this.f.a(this.p, this.n));
        this.q.b(this.f.a(this.o && !this.n));
        if (this.d.a()) {
            this.m = true;
            this.q.a(this.d.a, this.d.b, this.l);
        }
        this.j.a(this.c.a(Functions.a()).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qkc$zU6IFNdYGoUAwhkScaS2AVTMB4<Object,Object>(this), false).a(this.a).a((Consumer<? super T>) new $$Lambda$qkc$bFANckHqXJp2OIa4JszgHiIOlq8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qkc$ZlMZUVCmrYajzVSCEABnQxGXFfI<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Assertion.b("Error when trying to load content in taste picker", aVar.a);
        this.e.a((String) null, "to-artist-picker", 0, ImpressionType.ERROR, RenderType.PAGE);
        this.g.a.finish();
    }
}
