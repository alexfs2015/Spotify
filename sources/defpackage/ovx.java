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

/* renamed from: ovx reason: default package */
final class ovx implements jor<ovg>, tvw {
    final CompositeDisposable a = new CompositeDisposable();
    oxw b;
    final ouo c;
    final ous d;
    final owf e;
    final CompletableSubject f = CompletableSubject.f();
    owb g;
    private final Scheduler h;
    private final a i;
    private final ItemListConfiguration j;
    private final BehaviorSubject<ho<oqf, oqg>> k = BehaviorSubject.a();
    private final SerialDisposable l = new SerialDisposable();

    public ovx(Scheduler scheduler, a aVar, a aVar2, owf owf, ous ous, ItemListConfiguration itemListConfiguration) {
        this.h = scheduler;
        this.d = ous;
        this.i = aVar;
        this.j = itemListConfiguration;
        this.e = owf;
        this.c = aVar2.a(itemListConfiguration);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        oqg oqg = (oqg) fbp.a(hoVar.b);
        List a2 = oqf.a();
        if (this.j.r()) {
            a2 = ImmutableList.a(fcp.a((Iterable<E>) a2).a((fbq<? super E>) $$Lambda$ovx$NDG1Dl7woi4qRpRnbPkv8ZuMGRQ.INSTANCE).a());
        }
        List list = a2;
        this.g.a(oqg.a(), list);
        this.b.a(list, this.j.j(), this.j.h(), this.j.i(), this.j.k(), this.j.l(), 0, new $$Lambda$ovx$2qxtyBR16Rlx6j5QNZ6u1P_mY(this));
        owb owb = this.g;
        boolean z = false;
        if (!this.e.b.a(owf.a, false) && this.j.y()) {
            z = true;
        }
        owb.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.g.a(num.intValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vle vle) {
        return (vle == null || vle.a() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.k.onNext(hoVar);
        this.f.onComplete();
    }

    public final void a(int i2, vle vle) {
        this.c.a(i2, vle);
    }

    public final void a(int i2, vle vle, boolean z) {
        this.c.a(i2, vle, z);
    }

    public final void a(a aVar) {
        this.b = this.i.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(this.h);
        $$Lambda$ovx$y8M3bADAiUY0N_D4l0WNf4Iv170 r2 = new $$Lambda$ovx$y8M3bADAiUY0N_D4l0WNf4Iv170(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.c.a(aVar);
    }

    public final void a(owb owb) {
        this.g = owb;
        this.c.a((ova) owb);
        if (owb != null) {
            this.l.a(this.k.d((Consumer<? super T>) new $$Lambda$ovx$RapzS_bzeiQKALGG1wDpPW2yhC0<Object>(this)));
        } else {
            this.l.a(Disposables.a());
        }
    }

    public final void b(int i2, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.c.a(i2, vle, b2.inCollection(), true);
        }
    }

    public final void c(int i2, vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            this.c.b(i2, vle, b2.isBanned(), true);
        }
    }

    public final void d(int i2, vle vle) {
        this.c.b(i2, vle);
    }

    public final void e(int i2, vle vle) {
        this.c.c(i2, vle);
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
        return this.c.a((ovg) obj);
    }
}
