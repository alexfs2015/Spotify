package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.c;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: qpe reason: default package */
public final class qpe implements c, a {
    public b a;
    public final CompositeDisposable b = new CompositeDisposable();
    public EntityResultsPageResponse c;
    private final qoy d;
    private final Observable<String> e;
    private final Scheduler f;
    private final Scheduler g;
    private final Flowable<fqn> h;
    private final SpSharedPreferences<Object> i;
    private final qos j;
    private boolean k;

    public qpe(qoy qoy, Flowable<fqn> flowable, Observable<String> observable, SpSharedPreferences<Object> spSharedPreferences, Scheduler scheduler, Scheduler scheduler2, qos qos) {
        this.d = qoy;
        this.h = flowable;
        this.e = observable;
        this.i = spSharedPreferences;
        this.g = scheduler2;
        this.f = scheduler;
        this.j = qos;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Payload a(EntityResultsPageResponse entityResultsPageResponse) {
        this.c = entityResultsPageResponse;
        return entityResultsPageResponse.payload();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(qpt qpt) {
        this.j.a(ViewUris.bS.toString(), ImpressionType.BANNER, RenderType.BANNER);
        this.a.aE_();
        this.a.a(qpt.c());
        return Completable.a(60, TimeUnit.SECONDS, this.f).a(this.g).b((Action) new $$Lambda$qpe$4taOlOR4PIP6yo9mmJh4PKH25k(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(fqn fqn) {
        return this.e;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Payload payload) {
        return payload.fulfillment() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(String str) {
        return !this.k;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(EntityResultsPageResponse entityResultsPageResponse) {
        return entityResultsPageResponse.payload() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(fqn fqn) {
        return f() < 3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(String str) {
        return !(this.d.a.b != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(qpt qpt) {
        return !this.k;
    }

    private int f() {
        return this.i.a(qot.b, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.a.b();
    }

    public final void a() {
        this.k = false;
        e();
    }

    public final void b() {
        this.k = true;
    }

    public final void c() {
        EntityResultsPageResponse entityResultsPageResponse = this.c;
        if (entityResultsPageResponse != null) {
            String uid = entityResultsPageResponse.uid();
            if (uid != null) {
                this.j.a(uid, ViewUris.bS.toString(), 0, "", InteractionType.TAP, InteractionIntent.CLOSE, "", "");
            }
        }
        this.a.b();
        this.i.a().a(qot.b, f() + 1).b();
    }

    public final void d() {
        EntityResultsPageResponse entityResultsPageResponse = this.c;
        if (entityResultsPageResponse != null) {
            String uid = entityResultsPageResponse.uid();
            if (uid != null) {
                this.j.a(uid, ViewUris.bS.toString(), 0, "", InteractionType.TAP, InteractionIntent.NAVIGATE, "", "show-more-results");
            }
            this.a.a(this.c);
        }
        this.a.b();
    }

    public void e() {
        this.b.c();
        Observable a2 = this.h.j().a((Predicate<? super T>) $$Lambda$1sRiR7Y6WuQE4oVxj8ZKbvsMXjE.INSTANCE).a((Predicate<? super T>) new $$Lambda$qpe$MozLCIgdBDdVuSgfDtUxOH96QQ<Object>(this)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qpe$WG0og366VRCkJLjV8VulGwZTlXQ<Object,Object>(this), false).a(Functions.a()).a((Predicate<? super T>) new $$Lambda$qpe$HaPpEbIriCpJuSa0DcB0hJtX2o<Object>(this)).a((Predicate<? super T>) new $$Lambda$qpe$QXvkuYe04s2yT6TI3zRiCmxxM3w<Object>(this));
        qoy qoy = this.d;
        qoy.getClass();
        this.b.a(a2.c((Function<? super T, ? extends MaybeSource<? extends R>>) new $$Lambda$97dYfkCwVzF0qTDAAwKQibFgKcU<Object,Object>(qoy), false).a((Predicate<? super T>) $$Lambda$qpe$E75ooS08HzBjPmuhETRaYCx6Jr8.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$qpe$fXhAoUAL3b8TLh8kyZYBeBgaItI<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$qpe$VZ8Crh8KCTLaOhpWptGLxEZ4vv8.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$NVZcc3AakONnZBhi9txa7nSbIuU.INSTANCE).a((Predicate<? super T>) new $$Lambda$qpe$c5lR76u1TFVlRSXJptDk_o492E<Object>(this)).a(this.g).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$qpe$HAB8kpW_Fz0aKVAvMbI6lLoHqU<Object,Object>(this), false).a((Action) $$Lambda$qpe$SqlFt970Xdy4rxvx2oJN6x2zw.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34.INSTANCE));
    }
}
