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

/* renamed from: nul reason: default package */
final class nul implements jmf<ooa>, nue, tke {
    final CompositeDisposable a = new CompositeDisposable();
    final oni b;
    final CompletableSubject c = CompletableSubject.f();
    private final Scheduler d;
    private final spi e;
    private final BehaviorSubject<ho<ojb, ojc>> f = BehaviorSubject.a();
    private final SerialDisposable g = new SerialDisposable();
    private nuh h;

    public final void a(int i, uzb uzb, boolean z) {
    }

    public final void c(int i, uzb uzb) {
    }

    public final void e(int i, uzb uzb) {
    }

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        return this.b.a((ooa) obj);
    }

    public nul(Scheduler scheduler, a aVar, spi spi, ItemListConfiguration itemListConfiguration) {
        this.d = scheduler;
        this.e = spi;
        this.b = aVar.a(itemListConfiguration);
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$VXu11YQ9u2WEimH2XJKkQl3hTqY.INSTANCE).a(this.d);
        $$Lambda$nul$01qc2cz55rdtwpGAOAtxaOnNvDo r2 = new $$Lambda$nul$01qc2cz55rdtwpGAOAtxaOnNvDo(this);
        CompletableSubject completableSubject = this.c;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.b.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.f.onNext(hoVar);
        this.c.onComplete();
    }

    public final void a(nuh nuh) {
        this.h = nuh;
        this.b.a((onu) nuh);
        if (nuh != null) {
            this.g.a(this.f.d((Consumer<? super T>) new $$Lambda$nul$CHXFdpYAptd3Q6hVJH28dRExWk<Object>(this)));
        } else {
            this.g.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojb ojb = (ojb) fay.a(hoVar.a);
        ojc ojc = (ojc) fay.a(hoVar.b);
        this.h.a(ojc.a(), ojb.a());
    }

    public final void a(int i, uzb uzb) {
        this.b.a(i, uzb);
    }

    public final void b(int i, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.b.a(i, uzb, b2.inCollection(), true);
        }
    }

    public final void d(int i, uzb uzb) {
        this.b.b(i, uzb);
    }

    public final void a(String str, String str2) {
        this.e.a(spd.a(str).b(str2).a());
    }
}
