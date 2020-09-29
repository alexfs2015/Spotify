package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oay reason: default package */
final class oay implements jor<ovg>, oar, tvw {
    final CompositeDisposable a = new CompositeDisposable();
    final ouo b;
    final CompletableSubject c = CompletableSubject.f();
    private final Scheduler d;
    private final szp e;
    private final BehaviorSubject<ho<oqf, oqg>> f = BehaviorSubject.a();
    private final SerialDisposable g = new SerialDisposable();
    private oau h;

    public oay(Scheduler scheduler, a aVar, szp szp, ItemListConfiguration itemListConfiguration) {
        this.d = scheduler;
        this.e = szp;
        this.b = aVar.a(itemListConfiguration);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        oqg oqg = (oqg) fbp.a(hoVar.b);
        this.h.a(oqg.a(), oqf.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.f.onNext(hoVar);
        this.c.onComplete();
    }

    public final void a(int i, vle vle) {
        this.b.a(i, vle);
    }

    public final void a(int i, vle vle, boolean z) {
    }

    public final void a(String str, String str2) {
        this.e.a(szk.a(str).b(str2).a());
    }

    public final void a(oau oau) {
        this.h = oau;
        this.b.a((ova) oau);
        if (oau != null) {
            this.g.a(this.f.d((Consumer<? super T>) new $$Lambda$oay$0tioLXkZyZP7hOFmgWfl8hi_dC0<Object>(this)));
        } else {
            this.g.a(Disposables.a());
        }
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(this.d);
        $$Lambda$oay$KFxqCz_cj_WRhdmGXKTIHmHNEVE r2 = new $$Lambda$oay$KFxqCz_cj_WRhdmGXKTIHmHNEVE(this);
        CompletableSubject completableSubject = this.c;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.b.a(aVar);
    }

    public final void b(int i, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.b.a(i, vle, b2.inCollection(), true);
        }
    }

    public final void c(int i, vle vle) {
    }

    public final void d(int i, vle vle) {
        this.b.b(i, vle);
    }

    public final void e(int i, vle vle) {
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
        return this.b.a((ovg) obj);
    }
}
