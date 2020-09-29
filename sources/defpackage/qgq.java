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

/* renamed from: qgq reason: default package */
public final class qgq implements c, a {
    public b a;
    public final CompositeDisposable b = new CompositeDisposable();
    public EntityResultsPageResponse c;
    private final qgk d;
    private final Observable<String> e;
    private final Scheduler f;
    private final Scheduler g;
    private final Flowable<fpt> h;
    private final SpSharedPreferences<Object> i;
    private final qge j;
    private boolean k;

    /* access modifiers changed from: private */
    public static /* synthetic */ void g() {
    }

    public qgq(qgk qgk, Flowable<fpt> flowable, Observable<String> observable, SpSharedPreferences<Object> spSharedPreferences, Scheduler scheduler, Scheduler scheduler2, qge qge) {
        this.d = qgk;
        this.h = flowable;
        this.e = observable;
        this.i = spSharedPreferences;
        this.g = scheduler2;
        this.f = scheduler;
        this.j = qge;
    }

    public void e() {
        this.b.c();
        Observable a2 = this.h.j().a((Predicate<? super T>) $$Lambda$Csyu3lQfzG5vNBh7EuOZWCagxxU.INSTANCE).a((Predicate<? super T>) new $$Lambda$qgq$kQZFlk2Yfa5iQ5IdEvh87moF8mg<Object>(this)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qgq$apnxhkZxKCGSzJiFRvYveo3dF9c<Object,Object>(this), false).a(Functions.a()).a((Predicate<? super T>) new $$Lambda$qgq$ASXTTZ8D6yB2feGBM10oENom44<Object>(this)).a((Predicate<? super T>) new $$Lambda$qgq$BlMAcZcA7C_6RjgscQCjwHS15Iw<Object>(this));
        qgk qgk = this.d;
        qgk.getClass();
        this.b.a(a2.c((Function<? super T, ? extends MaybeSource<? extends R>>) new $$Lambda$LyaRiFBPRLJnx0MTaSrnZAyiLVc<Object,Object>(qgk), false).a((Predicate<? super T>) $$Lambda$qgq$eMTMsqxTlM3psT28Fy3eOikWv8g.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$qgq$ecQpZpL5Bd1JHCxhJauROH1tzN8<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$qgq$HuRb4j9RbaSwh3Ky58WXbZi3KNQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$dG5FsUUMIsFzKJHq_9ZF0rWmbYM.INSTANCE).a((Predicate<? super T>) new $$Lambda$qgq$Bu1OOudL3Mpsda0hJGjuYBilLyk<Object>(this)).a(this.g).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$qgq$3y3rcM2GLT7JsAM_E1Kp5mv6ApY<Object,Object>(this), false).a((Action) $$Lambda$qgq$MwukCZlbsfPo3tJVz9ofRSwIKo.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qgq$E4juXb39fUOfcBYjwbhaHEuywu0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(fpt fpt) {
        return f() < 3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(fpt fpt) {
        return this.e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(String str) {
        return !(this.d.a.b != null);
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
    public /* synthetic */ Payload a(EntityResultsPageResponse entityResultsPageResponse) {
        this.c = entityResultsPageResponse;
        return entityResultsPageResponse.payload();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Payload payload) {
        return payload.fulfillment() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(qhf qhf) {
        return !this.k;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(qhf qhf) {
        this.j.a(ViewUris.bT.toString(), ImpressionType.BANNER, RenderType.BANNER);
        this.a.aG_();
        this.a.a(qhf.c());
        return Completable.a(60, TimeUnit.SECONDS, this.f).a(this.g).b((Action) new $$Lambda$qgq$iInW6t1VspYGi8aDAl2dHHwuTu8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.a.b();
    }

    public final void c() {
        EntityResultsPageResponse entityResultsPageResponse = this.c;
        if (entityResultsPageResponse != null) {
            String uid = entityResultsPageResponse.uid();
            if (uid != null) {
                this.j.a(uid, ViewUris.bT.toString(), 0, "", InteractionType.TAP, InteractionIntent.CLOSE, "", "");
            }
        }
        this.a.b();
        this.i.a().a(qgf.b, f() + 1).b();
    }

    public final void d() {
        EntityResultsPageResponse entityResultsPageResponse = this.c;
        if (entityResultsPageResponse != null) {
            String uid = entityResultsPageResponse.uid();
            if (uid != null) {
                this.j.a(uid, ViewUris.bT.toString(), 0, "", InteractionType.TAP, InteractionIntent.NAVIGATE, "", "show-more-results");
            }
            this.a.a(this.c);
        }
        this.a.b();
    }

    public final void a() {
        this.k = false;
        e();
    }

    public final void b() {
        this.k = true;
    }

    private int f() {
        return this.i.a(qgf.b, 0);
    }
}
