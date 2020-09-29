package defpackage;

import com.google.common.collect.ImmutableList;
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
import java.util.List;

/* renamed from: oor reason: default package */
final class oor implements jmf<ooa>, tke {
    final CompositeDisposable a = new CompositeDisposable();
    oqq b;
    final oni c;
    final onm d;
    final ooz e;
    final CompletableSubject f = CompletableSubject.f();
    oov g;
    private final Scheduler h;
    private final a i;
    private final ItemListConfiguration j;
    private final BehaviorSubject<ho<ojb, ojc>> k = BehaviorSubject.a();
    private final SerialDisposable l = new SerialDisposable();

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        return this.c.a((ooa) obj);
    }

    public oor(Scheduler scheduler, a aVar, a aVar2, ooz ooz, onm onm, ItemListConfiguration itemListConfiguration) {
        this.h = scheduler;
        this.d = onm;
        this.i = aVar;
        this.j = itemListConfiguration;
        this.e = ooz;
        this.c = aVar2.a(itemListConfiguration);
    }

    public final void a(a aVar) {
        this.b = this.i.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$VXu11YQ9u2WEimH2XJKkQl3hTqY.INSTANCE).a(this.h);
        $$Lambda$oor$UnHwVCpJFRmHCFbZrf8EOEoU0X0 r2 = new $$Lambda$oor$UnHwVCpJFRmHCFbZrf8EOEoU0X0(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.c.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.k.onNext(hoVar);
        this.f.onComplete();
    }

    public final void a(oov oov) {
        this.g = oov;
        this.c.a((onu) oov);
        if (oov != null) {
            this.l.a(this.k.d((Consumer<? super T>) new $$Lambda$oor$Gz7VmSD95Uq_zQwC4ueKcGEqKL4<Object>(this)));
        } else {
            this.l.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojb ojb = (ojb) fay.a(hoVar.a);
        ojc ojc = (ojc) fay.a(hoVar.b);
        List a2 = ojb.a();
        if (this.j.r()) {
            a2 = ImmutableList.a(fbx.a((Iterable<E>) a2).a((faz<? super E>) $$Lambda$oor$rwN3Cjd9Jkv_X1dgo4qyK3XBfsY.INSTANCE).a());
        }
        List list = a2;
        this.g.a(ojc.a(), list);
        this.b.a(list, this.j.j(), this.j.h(), this.j.i(), this.j.k(), this.j.l(), 0, new $$Lambda$oor$b50Z7SmAYbLlA26AuoENocFRHw(this));
        oov oov = this.g;
        boolean z = false;
        if (!this.e.b.a(ooz.a, false) && this.j.z()) {
            z = true;
        }
        oov.a(z);
    }

    public final void a(int i2, uzb uzb) {
        this.c.a(i2, uzb);
    }

    public final void b(int i2, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.c.a(i2, uzb, b2.inCollection(), true);
        }
    }

    public final void c(int i2, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.c.b(i2, uzb, b2.isBanned(), true);
        }
    }

    public final void d(int i2, uzb uzb) {
        this.c.b(i2, uzb);
    }

    public final void a(int i2, uzb uzb, boolean z) {
        this.c.a(i2, uzb, z);
    }

    public final void e(int i2, uzb uzb) {
        this.c.c(i2, uzb);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(uzb uzb) {
        return (uzb == null || uzb.a() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.g.a(num.intValue());
    }
}
