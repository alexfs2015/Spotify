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

/* renamed from: mjs reason: default package */
public final class mjs implements jmf<ooa>, tke {
    final CompositeDisposable a = new CompositeDisposable();
    final oni b;
    final miy c;
    ojc d;
    final CompletableSubject e = CompletableSubject.f();
    private mjo f;
    private final BehaviorSubject<ho<ojb, ojc>> g = BehaviorSubject.a();
    private final SerialDisposable h = new SerialDisposable();

    public final void e(int i, uzb uzb) {
    }

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        return this.b.a((ooa) obj);
    }

    public mjs(a aVar, miy miy, ItemListConfiguration itemListConfiguration) {
        this.b = aVar.a(itemListConfiguration);
        this.c = miy;
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$VXu11YQ9u2WEimH2XJKkQl3hTqY.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$mjs$4wSH_QwU4FEnWABSv2cq1WcnEwM r2 = new $$Lambda$mjs$4wSH_QwU4FEnWABSv2cq1WcnEwM(this);
        CompletableSubject completableSubject = this.e;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.b.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.g.onNext(hoVar);
        this.e.onComplete();
    }

    public final void a(mjo mjo) {
        this.f = mjo;
        this.b.a((onu) mjo);
        if (mjo != null) {
            this.h.a(this.g.d((Consumer<? super T>) new $$Lambda$mjs$msUgfCPAQP1WMSq63E1X46b9mIA<Object>(this)));
        } else {
            this.h.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojb ojb = (ojb) fay.a(hoVar.a);
        ojc ojc = (ojc) fay.a(hoVar.b);
        this.d = ojc;
        this.f.a(ojc.a(), ojb.a());
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

    public final void c(int i, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.b.b(i, uzb, b2.isBanned(), true);
        }
    }

    public final void d(int i, uzb uzb) {
        this.b.b(i, uzb);
    }

    public final void a(int i, uzb uzb, boolean z) {
        this.b.a(i, uzb, z);
    }
}
