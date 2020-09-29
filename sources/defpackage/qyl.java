package defpackage;

import android.app.Activity;
import androidx.lifecycle.Lifecycle.State;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.Callable;

/* renamed from: qyl reason: default package */
public final class qyl {
    /* access modifiers changed from: private */
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> c = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.b("music_pages_prefs");
    public final jrp a;
    public final PublishSubject<qyp> b;
    private final rnc d;
    private final b e;
    private final Observable<String> f;
    private final Scheduler g;
    private final Scheduler h;
    private final Scheduler i;
    private final SerialDisposable j;
    /* access modifiers changed from: private */
    public qyr k;
    private Observable<qyr> l;

    /* renamed from: qyl$a */
    interface a {
        com.spotify.mobile.android.util.ui.Lifecycle.a a();

        boolean b();
    }

    /* renamed from: qyl$b */
    interface b {
        String a(String str);

        void a(String str, String str2);
    }

    private qyl(a aVar, b bVar, jrp jrp, rnf rnf, Observable<String> observable, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.b = PublishSubject.a();
        this.j = new SerialDisposable();
        this.e = bVar;
        this.a = jrp;
        this.d = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        this.f = observable;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = scheduler3;
        if (aVar.b()) {
            b();
        }
        aVar.a().a(new c() {
            public final void e() {
                qyl.this.b();
            }

            public final void f() {
                qyl.this.j.a(Disposables.b());
            }

            public final void a() {
                qyr c = qyl.this.k;
                if (c != null && c.b().b() && c.c().b()) {
                    qyl.a(qyl.this, (String) c.b().c(), (PrefsModel) c.c().c());
                }
            }
        });
    }

    public final Observable<PagePrefs> a(String str) {
        Observable c2 = c();
        long a2 = this.a.a();
        this.b.onNext(new defpackage.qyp.a(str, Long.valueOf(a2)));
        return c2.a((Predicate<? super T>) $$Lambda$qyl$uGt2f0J2e1pUbZF_4PTlTiN4aNo.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$qyl$MKkmCuBfvmrsnmL9Zw5fzaBOo<Object,Object>(str, a2)).a(this.i).a((BiPredicate<? super T, ? super T>) $$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PagePrefs a(String str, long j2, qyr qyr) {
        return (PagePrefs) fcl.f(((PrefsModel) fay.a(qyr.c().d())).pagePrefs(), new $$Lambda$qyl$WR7_5MpfXurCjondleewj42AZeM(str)).a(PagePrefs.builderWithDefault().a(str).a(Long.valueOf(j2)).a());
    }

    /* access modifiers changed from: private */
    public void b() {
        this.j.a(c().a(this.i).a((Consumer<? super T>) new $$Lambda$qyl$EM9JngqGDY8B4jBUi8IQWHr_Jg<Object>(this), (Consumer<? super Throwable>) $$Lambda$qyl$qfL1KdxKIkrQxd3CeJpV4zxg6jU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qyr qyr) {
        this.k = qyr;
    }

    private Observable<qyr> c() {
        if (this.l == null) {
            this.l = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$qyl$hK24PsC20BWRS21KHQZ1ZNDCLhY<Object>(this)).a(this.i).a(1).a();
        }
        return this.l;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource f() {
        qyr qyr = this.k;
        if (qyr == null) {
            qyr = new defpackage.qyn.a().a(Optional.e()).b(Optional.e()).a(ImmutableList.d()).a(100).a();
        }
        return Observable.d().a(klb.a((c<M, E, F>) klb.a((kjz<M, E, F>) $$Lambda$TL5_vdxjTYrro6GZw9yvA4FhZE.INSTANCE, klb.a().a(defpackage.qyo.b.class, (ObservableTransformer<G, E>) new $$Lambda$qyl$sgw4u2qxv0_SqvGk9jtHaVAnWFQ<G,E>(this)).a(defpackage.qyo.a.class, (ObservableTransformer<G, E>) new $$Lambda$qyl$4tgJVry2TiqlEaP5oQ7Z9DFQ4<G,E>(this)).a()).a((kjo<M, F>) $$Lambda$fJ_iljkY2AhNSNNUwYZt9LWHYg0.INSTANCE).b(new $$Lambda$qyl$2RO6St0c7ppFxAp4RSoWnQXkOW8(this)).a((kkp<kkv>) new $$Lambda$qyl$QIr11sA7HtAOZ0cd8O6Omt7a5bM<kkv>(this)).a(kla.a(this.b)), qyr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv e() {
        return new kld(this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv d() {
        return new kld(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Observable observable) {
        return observable.h(new $$Lambda$qyl$OVxnOwKV3tbF8y0Yo01dyf0UbE(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(defpackage.qyo.b bVar) {
        return this.f.c(1).c((Function<? super T, ? extends R>) $$Lambda$IRV8Y6WdarSr9fR2peC6WFJgy74.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$qyl$aopOh_DaZ41hliQBT3jRuXAzrI<Object,Object>(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel b(java.lang.String r3) {
        /*
            r2 = this;
            qyl$b r0 = r2.e
            java.lang.String r3 = r0.a(r3)
            boolean r0 = defpackage.fax.a(r3)
            if (r0 != 0) goto L_0x0021
            rnc r0 = r2.d     // Catch:{ IOException -> 0x001b }
            com.fasterxml.jackson.databind.ObjectMapper r0 = r0.a()     // Catch:{ IOException -> 0x001b }
            java.lang.Class<com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel> r1 = com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.class
            java.lang.Object r3 = r0.readValue(r3, r1)     // Catch:{ IOException -> 0x001b }
            com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel r3 = (com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel) r3     // Catch:{ IOException -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r3 = move-exception
            java.lang.String r0 = "Failed reading music pages prefs."
            com.spotify.mobile.android.util.Assertion.a(r0, r3)
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x0026
            com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel r3 = com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.DEFAULT
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyl.b(java.lang.String):com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel");
    }

    public qyl(final Activity activity, final jvy jvy, jrp jrp, rnf rnf, hvl hvl, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        Activity activity2 = activity;
        final com.spotify.mobile.android.util.ui.Lifecycle.a aVar2 = aVar;
        jvy jvy2 = jvy;
        this(new a() {
            public final com.spotify.mobile.android.util.ui.Lifecycle.a a() {
                return aVar2;
            }

            public final boolean b() {
                return ((q) activity).a.a() == State.RESUMED;
            }
        }, new b() {
            public final void a(String str, String str2) {
                jvy.a(activity, str).a().a(qyl.c, str2).b();
            }

            public final String a(String str) {
                return jvy.a(activity, str).a(qyl.c, (String) null);
            }
        }, jrp, rnf, hvl.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).j(), scheduler, scheduler2, scheduler3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyp a(defpackage.qyo.a aVar) {
        return new defpackage.qyp.b(b(aVar.a));
    }

    static /* synthetic */ void a(qyl qyl, String str, PrefsModel prefsModel) {
        String str2;
        try {
            str2 = qyl.d.a().writeValueAsString(prefsModel);
        } catch (JsonProcessingException e2) {
            Assertion.a("Failed writing your library prefs.", (Throwable) e2);
            str2 = null;
        }
        if (str2 != null) {
            qyl.e.a(str, str2);
        }
    }
}
