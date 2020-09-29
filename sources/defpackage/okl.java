package defpackage;

import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: okl reason: default package */
final class okl {
    final CompositeDisposable a = new CompositeDisposable();
    final okh b;
    final hbj c;
    final spi d;
    final String e;
    final CompletableSubject f = CompletableSubject.f();
    private final oha g;
    private final ois h;
    private final Scheduler i;
    private final BehaviorSubject<ojc> j = BehaviorSubject.a();
    private final SerialDisposable k = new SerialDisposable();
    private okp l;

    public okl(ois ois, okh okh, hbj hbj, spi spi, String str, Scheduler scheduler, oha oha) {
        this.h = ois;
        this.i = scheduler;
        this.b = okh;
        this.c = hbj;
        this.g = oha;
        this.d = spi;
        this.e = str;
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.h;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.i);
        $$Lambda$okl$xvez9lF1atciAKlHNCqkGIqGw r1 = new $$Lambda$okl$xvez9lF1atciAKlHNCqkGIqGw(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.j.onNext(ojc);
        this.f.onComplete();
    }

    public final void a(okp okp) {
        this.l = okp;
        if (okp != null) {
            this.k.a(this.j.d((Consumer<? super T>) new $$Lambda$okl$eVWZx09x5XQkwD8G8lHv3JWtVzU<Object>(this)));
        } else {
            this.k.a(Disposables.a());
        }
    }

    private void a(boolean z, boolean z2) {
        if (!z2 || !this.g.a()) {
            this.l.b(z);
        } else {
            this.l.c(z);
        }
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        boolean z = ojc.n() && ojc.b().a().b();
        boolean z2 = !z && ojc.n();
        uyz a2 = ojc.a();
        String a3 = a2.a();
        String str = "";
        if (z) {
            this.l.a(true);
            this.l.a((String) ojc.b().a().a(str));
            a(false, ojc.m());
        } else if (z2) {
            this.l.a(false);
            a(true, ojc.m());
            uzd d2 = a2.d();
            if (d2 != null) {
                String c2 = d2.c();
                if (c2 != null) {
                    str = c2;
                } else {
                    str = d2.b();
                }
            }
            if (!ojc.m() || !this.g.a()) {
                this.l.a(a3, str);
                this.l.d(ojc.m());
                this.l.b(a2.getImageUri(Size.LARGE));
            }
        } else {
            this.l.a(false);
            a(false, ojc.m());
        }
    }
}
