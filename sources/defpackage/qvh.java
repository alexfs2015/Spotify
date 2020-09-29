package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: qvh reason: default package */
public final class qvh implements a {
    private final jlz a;
    private final quh b;
    private final Scheduler c;
    private final Observable<Boolean> d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final qqf f;
    private final SpSharedPreferences<Object> g;

    public qvh(jlz jlz, quh quh, Scheduler scheduler, Observable<Boolean> observable, qqf qqf, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = jlz;
        this.b = quh;
        this.c = scheduler;
        this.d = observable;
        this.f = qqf;
        this.g = spSharedPreferences;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.a.a.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.g.a().a(rqd.a, true).b();
    }

    public final void a() {
        this.e.a(this.b.a().a(this.c).a((Action) new $$Lambda$qvh$wOuaxYv10AUUouPheywSo1kk3VQ(this), (Consumer<? super Throwable>) $$Lambda$qvh$V7sZHN0qo3ocXbLrXGbyMHMAUI8.INSTANCE));
        this.e.a(this.d.a((Consumer<? super T>) new $$Lambda$qvh$lZxgQogAAD5Ii2YXudgGZiYF7k<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qvh$eXYbCbK71KaWtv7BgQBUw03qJJI<Object>(this)));
        this.f.b.a().a(qqf.a).b();
    }

    public final void b() {
        this.e.c();
    }
}
