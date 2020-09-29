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
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;

/* renamed from: qsl reason: default package */
public final class qsl extends c implements a, qra {
    private final Scheduler a;
    private final qsz b;
    private final Observable<lbg> c;
    private final qrj d;
    private final qrg e;
    private final qte f;
    private final jlz g;
    private final qqc h;
    private final qqi i;
    private final CompositeDisposable j = new CompositeDisposable();
    private boolean k;
    private boolean l = true;
    private boolean m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private qqz q;

    public qsl(boolean z, boolean z2, int i2, a aVar, Scheduler scheduler, qsz qsz, Observable<lbg> observable, qrj qrj, qrg qrg, qte qte, jlz jlz, qqc qqc, qqi qqi) {
        aVar.a(this);
        this.o = z;
        this.n = z2;
        this.p = i2;
        this.a = scheduler;
        this.b = qsz;
        this.c = observable;
        this.d = qrj;
        this.e = qrg;
        this.f = qte;
        this.g = jlz;
        this.h = qqc;
        this.i = qqi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(lbg lbg) {
        this.k = lbg.a();
        if (!lbg.a()) {
            return h() ? Observable.b(new c()) : Observable.b(new d());
        }
        if (this.d.a()) {
            return this.m ? Observable.b(new f()) : Observable.b(new e());
        }
        qsz qsz = this.b;
        String a2 = qsz.b.a();
        if (!fbo.a(a2)) {
            a2 = jva.a(a2).h();
            if (fbo.a(a2)) {
                a2 = "";
            }
        }
        return (qsz.c ? qsz.a.b(Build.MANUFACTURER, Build.MODEL, a2) : qsz.a.a(Build.MANUFACTURER, Build.MODEL, a2)).d().a((ObservableTransformer<? super T, ? extends R>) new vvv<Object,Object>()).c(1).c((Function<? super T, ? extends R>) $$Lambda$0AvFiO27d4dGE4yDhOJGjy82m8s.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$1EIBRjB25s9xUPw4Wi4jaVliTbg.INSTANCE);
    }

    private void a(int i2) {
        if (b(i2)) {
            this.e.a();
            this.q.i();
            return;
        }
        this.q.j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.d(th, "Error observing connection state changes", new Object[0]);
        this.q.a();
        this.q.a(this.f.a(), this.f.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Assertion.b("Error when trying to load content in taste picker", aVar.a);
        this.e.a((String) null, "to-artist-picker", 0, ImpressionType.ERROR, RenderType.PAGE);
        this.g.a.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.q.f();
        this.q.a();
        this.q.b();
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
    public /* synthetic */ void a(e eVar) {
        this.q.f();
        this.q.a(this.d.a, this.d.b, this.l);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        this.d.a = new ArrayList(gVar.a.items());
        this.d.b = gVar.a.renderType();
        this.q.a(this.d.a, this.d.b, this.l);
        this.l = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qri qri) {
        this.m = false;
        if (!(qri instanceof b)) {
            this.q.aH_();
        }
        qri.a(new $$Lambda$qsl$9yI0PcXcdEJkYjNi10kMi8Q8Z3U(this), new $$Lambda$qsl$IPphECiDFATUC7vKbZ7DIFms22c(this), $$Lambda$qsl$yluMOhyj0DVAvEcy5iDVaX4oq0o.INSTANCE, new $$Lambda$qsl$k8kT1YZP1C8Zs_V5Fh9euVU4tuQ(this), new $$Lambda$qsl$HMgnnJgYVLZrBJSS2AyRcwA5JdE(this), new $$Lambda$qsl$rMwgsE93elyZ7WF4pASGqBlIIp4(this), new $$Lambda$qsl$49JqriS7LsTk6rrISmMwVPOEMgM(this));
    }

    private boolean b(int i2) {
        return this.h.a() >= i2;
    }

    private boolean h() {
        return this.h.a() > 0;
    }

    public final void a() {
        this.j.c();
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean("key-animate-picker", this.l);
    }

    public final void a(qqz qqz) {
        this.q = qqz;
    }

    public final void aG_() {
        this.e.a((String) null, "to-artist-picker", 0, InteractionType.HIT, Intent.SEARCH);
        qqi qqi = this.i;
        qqi.a((Fragment) quf.a(qqi.a), true);
    }

    public final void aN_() {
        this.q = null;
    }

    public final void c() {
        this.q.a(this.f.a(this.p, this.n));
        this.q.b(this.f.a(this.o && !this.n));
        if (this.d.a()) {
            this.m = true;
            this.q.a(this.d.a, this.d.b, this.l);
        }
        this.j.a(this.c.a(Functions.a()).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qsl$bh1k6EFrTBz71da1LKTSEu44Hlk<Object,Object>(this), false).a(this.a).a((Consumer<? super T>) new $$Lambda$qsl$1IWGpUHemEb3Ght4IErl2sqyCm4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qsl$NHUHEaFey1VC2bp49Wt7lHQPW0<Object>(this)));
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        if (bundle != null) {
            this.l = bundle.getBoolean("key-animate-picker");
        }
    }

    public final void d() {
        this.e.a((String) null, "to-artist-picker", 0, InteractionType.HIT, Intent.NAVIGATE_FORWARD);
        if (this.o && !this.n) {
            qqi qqi = this.i;
            qqi.c.startActivity(PodcastOnboardingActivity.a(qqi.c, true));
            this.g.a.finish();
        } else if (!h() || !this.k) {
            this.g.a.finish();
        } else {
            qqi qqi2 = this.i;
            qqi2.a((Fragment) qvj.a(qqi2.a), false);
        }
    }

    public final void e() {
        super.e();
        a(this.p);
    }

    public final void g() {
        a(this.p);
    }
}
