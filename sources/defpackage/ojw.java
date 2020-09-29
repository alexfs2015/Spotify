package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: ojw reason: default package */
final class ojw {
    final CompositeDisposable a = new CompositeDisposable();
    final ojs b;
    final OffliningLogger c;
    final tij d;
    final spi e;
    final CompletableSubject f = CompletableSubject.f();
    ojc g;
    private final Scheduler h;
    private final uxh i;
    private final til j;
    private final BehaviorSubject<ojc> k = BehaviorSubject.a();
    private final SerialDisposable l = new SerialDisposable();
    private okd m;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public ojw(ojs ojs, OffliningLogger offliningLogger, Scheduler scheduler, final String str, final uxt uxt, uxh uxh, til til, spi spi) {
        this.h = scheduler;
        this.i = uxh;
        this.b = ojs;
        this.c = offliningLogger;
        this.j = til;
        this.e = spi;
        this.d = new tij(new $$Lambda$ojw$v1PpDno02ZEsWpyZSV_ZGp6_oJs(this), new tih() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final void a(boolean z) {
                ojw.this.a.a(ojw.this.i.a(ojw.this.g.a().getUri(), ojw.this.g.b().b(), z).a((Action) $$Lambda$ojw$uPSVcy2XIUt_kLL1Vt9XWk6PP08.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ojw$ZLNoX3E8yVhsWAfBkKKsRai8FRA.INSTANCE));
            }

            public final void b(boolean z) {
                Completable completable;
                if (z) {
                    completable = uxt.a(str);
                } else {
                    completable = uxt.b(str);
                }
                ojw.this.a.a(completable.a((Action) $$Lambda$ojw$1$kmFUaCrlQTJTxRzU1m78mYGWmdU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ojw$1$fx94mcYB0a09NkZ2h6rTu3mh4.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzf uzf) {
        okd okd = this.m;
        if (okd != null) {
            okd.updateDownloadViewState(uzf);
        }
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = aVar.b().c().a(this.h);
        $$Lambda$ojw$rtpoKhiFlZv18jidgHV71xpCpeA r1 = new $$Lambda$ojw$rtpoKhiFlZv18jidgHV71xpCpeA(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.k.onNext(ojc);
        this.f.onComplete();
    }

    public final void a(okd okd) {
        this.m = okd;
        if (okd != null) {
            this.l.a(this.k.d((Consumer<? super T>) new $$Lambda$ojw$72hnkgOWz65M9Pj15H37oSDHo<Object>(this)));
            this.j.a((a) this.d);
            this.j.a();
            return;
        }
        this.l.a(Disposables.a());
        this.j.b();
        this.j.b(this.d);
    }

    /* access modifiers changed from: private */
    public void a(final ojc ojc) {
        this.g = ojc;
        this.d.a((tig) new tig() {
            public final uzf a() {
                return ojc.a().s();
            }

            public final boolean b() {
                return !ojc.a().k() && !ojc.a().h();
            }
        });
        boolean z = !ojc.h();
        boolean z2 = false;
        this.m.a(!ojc.n() && z);
        okd okd = this.m;
        if (!ojc.n() && !z) {
            z2 = true;
        }
        okd.b(z2);
        this.m.c(!ojc.g());
    }
}
