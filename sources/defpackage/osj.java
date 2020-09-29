package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: osj reason: default package */
final class osj {
    final CompositeDisposable a = new CompositeDisposable();
    oqb b;
    private final ome c;
    private final Scheduler d;
    private final BehaviorSubject<opy> e = BehaviorSubject.a();
    private final CompositeDisposable f = new CompositeDisposable();
    private osm g;

    public osj(ome ome, Scheduler scheduler) {
        this.c = ome;
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.g.a(true);
    }

    /* access modifiers changed from: private */
    public void a(opy opy) {
        Optional a2 = opy.a();
        String str = "";
        this.g.a((String) a2.a(str), (way) opy.b().a(oqb.a));
        if (!fbo.a((String) a2.a(str))) {
            this.g.a(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.g.f();
    }

    public final void a(a aVar) {
        this.b = aVar.b();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = aVar.b().c().c((Function<? super T, ? extends R>) $$Lambda$vpYxeJ1NbuGPSQW75HqNVf0HfGs.INSTANCE).a(this.d);
        BehaviorSubject<opy> behaviorSubject = this.e;
        behaviorSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$0oCgbYmNTJ0RfJi0F0pGTA5UY<Object>(behaviorSubject), (Consumer<? super Throwable>) $$Lambda$osj$9K7TSQkrf2kCz3foPfB1Slm36jg.INSTANCE));
    }

    public final void a(osm osm) {
        this.g = osm;
        if (osm != null) {
            this.f.c();
            this.f.a(this.e.c(1).d((Consumer<? super T>) new $$Lambda$osj$fsaUhnuXBWpDYSBrT0gbs3AO19c<Object>(this)));
            this.f.a(this.c.a.a(this.d).a((Consumer<? super T>) new $$Lambda$osj$Wi7Lr05SCbDW6A9WAiK8RyLKLpU<Object>(this), (Consumer<? super Throwable>) $$Lambda$osj$oZ0KjfY0Fdw8KdvMWs7Bm9pGm1Q.INSTANCE));
            this.f.a(this.c.b.a(this.d).a((Consumer<? super T>) new $$Lambda$osj$nNDJytE1rhixtud1kq3OGpCwq8<Object>(this), (Consumer<? super Throwable>) $$Lambda$osj$f0DEvyW7WnVOZKmsMoOF7A9m11s.INSTANCE));
            return;
        }
        this.f.c();
    }
}
