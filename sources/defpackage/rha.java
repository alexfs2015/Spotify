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

/* renamed from: rha reason: default package */
public final class rha {
    /* access modifiers changed from: private */
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> c = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.b("music_pages_prefs");
    public final jtz a;
    public final PublishSubject<rhe> b;
    private final rwi d;
    private final b e;
    private final Observable<String> f;
    private final Scheduler g;
    private final Scheduler h;
    private final SerialDisposable i;
    /* access modifiers changed from: private */
    public rhg j;
    private Observable<rhg> k;

    /* renamed from: rha$a */
    interface a {
        com.spotify.mobile.android.util.ui.Lifecycle.a a();

        boolean b();
    }

    /* renamed from: rha$b */
    interface b {
        String a(String str);

        void a(String str, String str2);
    }

    public rha(final Activity activity, final jyg jyg, jtz jtz, rwl rwl, hxx hxx, Scheduler scheduler, Scheduler scheduler2, com.spotify.mobile.android.util.ui.Lifecycle.a aVar) {
        Activity activity2 = activity;
        final com.spotify.mobile.android.util.ui.Lifecycle.a aVar2 = aVar;
        jyg jyg2 = jyg;
        this(new a() {
            public final com.spotify.mobile.android.util.ui.Lifecycle.a a() {
                return aVar2;
            }

            public final boolean b() {
                return ((q) activity).a.a() == State.RESUMED;
            }
        }, new b() {
            public final String a(String str) {
                return jyg.a(activity, str).a(rha.c, (String) null);
            }

            public final void a(String str, String str2) {
                jyg.a(activity, str).a().a(rha.c, str2).b();
            }
        }, jtz, rwl, hxx.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).j(), scheduler, scheduler2);
    }

    private rha(a aVar, b bVar, jtz jtz, rwl rwl, Observable<String> observable, Scheduler scheduler, Scheduler scheduler2) {
        this.b = PublishSubject.a();
        this.i = new SerialDisposable();
        this.e = bVar;
        this.a = jtz;
        this.d = new rwi(rwl) {
            public final rwj a(rwj rwj) {
                return rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        this.f = observable;
        this.g = scheduler;
        this.h = scheduler2;
        if (aVar.b()) {
            b();
        }
        aVar.a().a(new c() {
            public final void a() {
                rhg c = rha.this.j;
                if (c != null && c.b().b() && c.c().b()) {
                    rha.a(rha.this, (String) c.b().c(), (PrefsModel) c.c().c());
                }
            }

            public final void e() {
                rha.this.b();
            }

            public final void f() {
                rha.this.i.a(Disposables.b());
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PagePrefs a(String str, long j2, rhg rhg) {
        return (PagePrefs) fdd.f(((PrefsModel) fbp.a(rhg.c().d())).pagePrefs(), new $$Lambda$rha$tZCMvKblJaMDVWJj209kiSGrpFE(str)).a(PagePrefs.builderWithDefault().a(str).a(Long.valueOf(j2)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$rha$XKIsdFD37iCk9WIDFYHmoBq5abE<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(defpackage.rhd.b bVar) {
        return this.f.c(1).c((Function<? super T, ? extends R>) $$Lambda$AoxTGjMOplpfLMXch_tYXNpCQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rhe a(defpackage.rhd.a aVar) {
        return new defpackage.rhe.b(b(aVar.a));
    }

    static /* synthetic */ void a(rha rha, String str, PrefsModel prefsModel) {
        String str2;
        try {
            str2 = rha.d.a().writeValueAsString(prefsModel);
        } catch (JsonProcessingException e2) {
            Assertion.a("Failed writing your library prefs.", (Throwable) e2);
            str2 = null;
        }
        if (str2 != null) {
            rha.e.a(str, str2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rhg rhg) {
        this.j = rhg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel b(java.lang.String r3) {
        /*
            r2 = this;
            rha$b r0 = r2.e
            java.lang.String r3 = r0.a(r3)
            boolean r0 = defpackage.fbo.a(r3)
            if (r0 != 0) goto L_0x0021
            rwi r0 = r2.d     // Catch:{ IOException -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rha.b(java.lang.String):com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Observable observable) {
        return observable.h(new $$Lambda$rha$vbJllZX0wzEGgixxEhepAGBJbUA(this));
    }

    /* access modifiers changed from: private */
    public void b() {
        this.i.a(c().a(this.h).a((Consumer<? super T>) new $$Lambda$rha$JfcqkQhx9EgmjLobEvlEYfAhShg<Object>(this), (Consumer<? super Throwable>) $$Lambda$rha$Dm5OBm03PrAOckmpAh7BmE5kjck.INSTANCE));
    }

    private Observable<rhg> c() {
        if (this.k == null) {
            this.k = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$rha$cT3dF6lGnXO4eaO3erAM9OATSo<Object>(this)).a(this.h).a(1).a();
        }
        return this.k;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe d() {
        return new kom(this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe e() {
        return new kom(this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource f() {
        rhg rhg = this.j;
        if (rhg == null) {
            rhg = new defpackage.rhc.a().a(Optional.e()).b(Optional.e()).a(ImmutableList.d()).a(100).a();
        }
        return Observable.d().a(kok.a((c<M, E, F>) kok.a((kni<M, E, F>) $$Lambda$qlmQauow4ekcwFwtHL_4LsJBFg.INSTANCE, kok.a().a(defpackage.rhd.b.class, (ObservableTransformer<G, E>) new $$Lambda$rha$DSt8GRY6JTCDQycunIyb1XfAMQ<G,E>(this)).a(defpackage.rhd.a.class, (ObservableTransformer<G, E>) new $$Lambda$rha$eybU3pU7ytNpgcFQYjMV8lH2M<G,E>(this)).a()).a((kmx<M, F>) $$Lambda$SAHBZ39COl5ysRWuzo7x2Qo18c.INSTANCE).b(new $$Lambda$rha$W4e0Om65qsEPSzTQmo1lcHWDNBg(this)).a((kny<koe>) new $$Lambda$rha$_hSIesapfu4qvH_StBboGjlOGoo<koe>(this)).a(koj.a(this.b)), rhg));
    }

    public final Observable<PagePrefs> a(String str) {
        Observable c2 = c();
        long a2 = this.a.a();
        this.b.onNext(new defpackage.rhe.a(str, Long.valueOf(a2)));
        return c2.a((Predicate<? super T>) $$Lambda$rha$zzT1q3pBSQNfUl3LArgaCl2AwnA.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$rha$RBtIR_ki7GoE9f7N2QariIQgAho<Object,Object>(str, a2)).a(this.h).a((BiPredicate<? super T, ? super T>) $$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E.INSTANCE);
    }
}
