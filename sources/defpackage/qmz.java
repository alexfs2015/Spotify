package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: qmz reason: default package */
public final class qmz implements a {
    private final jjn a;
    private final qlz b;
    private final Scheduler c;
    private final qnb d;
    private final Observable<Boolean> e;
    private final CompositeDisposable f = new CompositeDisposable();
    private final qho g;
    private final qhr h;
    private final SpSharedPreferences<Object> i;
    private final boolean j;
    private final boolean k;

    public qmz(jjn jjn, qlz qlz, Scheduler scheduler, qnb qnb, boolean z, Observable<Boolean> observable, qho qho, qhr qhr, boolean z2, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = jjn;
        this.b = qlz;
        this.c = scheduler;
        this.d = qnb;
        this.j = z;
        this.e = observable;
        this.g = qho;
        this.h = qhr;
        this.k = z2;
        this.i = spSharedPreferences;
    }

    public final void a(b bVar) {
        if (!this.k && this.j) {
            bVar.a(this.d.a(this.g.a()));
        }
        this.f.a(this.b.a().a(this.c).a((Action) new $$Lambda$qmz$rUXLHoWD13IWFrfCjNrcQ4dCIk(this), (Consumer<? super Throwable>) $$Lambda$qmz$zenDNyBImGBe8hmFPwnrd4irSko.INSTANCE));
        this.f.a(this.e.a((Consumer<? super T>) new $$Lambda$qmz$0dnPyKIytewsD4OTPuT6sQ9CEn0<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qmz$LGkYXHomcUrjVvafQwH4calL7do<Object>(this)));
        this.h.b.a().a(qhr.a).b();
    }

    public final void a() {
        this.f.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.i.a().a(rhb.a, true).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.a.a.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a.finish();
    }
}
