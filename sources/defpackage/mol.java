package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: mol reason: default package */
public final class mol implements jor<ovg>, tvw {
    final CompositeDisposable a = new CompositeDisposable();
    final ouo b;
    final mnr c;
    oqg d;
    final CompletableSubject e = CompletableSubject.f();
    private moh f;
    private final BehaviorSubject<ho<oqf, oqg>> g = BehaviorSubject.a();
    private final SerialDisposable h = new SerialDisposable();

    public mol(a aVar, mnr mnr, ItemListConfiguration itemListConfiguration) {
        this.b = aVar.a(itemListConfiguration);
        this.c = mnr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        oqg oqg = (oqg) fbp.a(hoVar.b);
        this.d = oqg;
        this.f.a(oqg.a(), oqf.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.g.onNext(hoVar);
        this.e.onComplete();
    }

    public final void a(int i, vle vle) {
        this.b.a(i, vle);
    }

    public final void a(int i, vle vle, boolean z) {
        this.b.a(i, vle, z);
    }

    public final void a(moh moh) {
        this.f = moh;
        this.b.a((ova) moh);
        if (moh != null) {
            this.h.a(this.g.d((Consumer<? super T>) new $$Lambda$mol$JcL1JgwpRF2hNJiuS5bc6bHWOSY<Object>(this)));
        } else {
            this.h.a(Disposables.a());
        }
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$mol$fU0FsXk3ATSguplngh_M5EBeWGI r2 = new $$Lambda$mol$fU0FsXk3ATSguplngh_M5EBeWGI(this);
        CompletableSubject completableSubject = this.e;
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
        vlf b2 = vle.b();
        if (b2 != null) {
            this.b.b(i, vle, b2.isBanned(), true);
        }
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
