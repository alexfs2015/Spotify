package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: qfu reason: default package */
public final class qfu implements a {
    final qfy a;
    Disposable b = Disposables.b();
    CompositeDisposable c = new CompositeDisposable();
    b d;
    String e;
    Observable<CharSequence> f;
    Observable<Object> g;
    Observable<Integer> h;
    private final qfw i;
    private final Scheduler j;
    private final qfs k;
    private final ujc l;

    public qfu(qfw qfw, Scheduler scheduler, qfy qfy, qfs qfs, ujc ujc, a aVar) {
        this.i = qfw;
        this.j = scheduler;
        this.a = qfy;
        this.k = qfs;
        this.l = ujc;
        aVar.a(new c() {
            public final void c() {
                super.c();
                qfu.this.c = new CompositeDisposable();
                qfu.this.a.b(qfu.this.f, InputFieldIdentifier.DISPLAY_NAME, ScreenIdentifier.SIGN_UP_STEP_THREE);
                CompositeDisposable compositeDisposable = qfu.this.c;
                Observable c = qfu.this.f.b((Consumer<? super T>) new $$Lambda$qfu$1$DQiRMEcWrSZ15KjZ2HX0z8HyKl0<Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$qfu$1$CnbrfLBFZprsL34q2D5Z9NfhY5Q.INSTANCE);
                b bVar = qfu.this.d;
                bVar.getClass();
                compositeDisposable.a(c.a((Consumer<? super T>) new $$Lambda$o8fp3_VVUKsmYQwsrwMjjMNhpc<Object>(bVar), (Consumer<? super Throwable>) new $$Lambda$qfu$1$g0WaMKsfsi4Doaq7vrGX0FfGF0<Object>(this)));
                qfu.this.c.a(qfu.this.h.a((Consumer<? super T>) new $$Lambda$qfu$1$1gdtD9xGm6KLo1vRTVM5QCOkI<Object>(this), (Consumer<? super Throwable>) $$Lambda$qfu$1$StMJpGkjEo1Zczn2JtwIGoAYwkA.INSTANCE));
                qfu.this.c.a(qfu.this.g.a((Consumer<? super T>) new $$Lambda$qfu$1$xGvEyQlcCe1deDm9U8C1G_zp3w<Object>(this), (Consumer<? super Throwable>) $$Lambda$qfu$1$zcn03cI8KS3qXPLb_TkhuOg07E.INSTANCE));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void b(CharSequence charSequence) {
                qfu.this.e = charSequence.toString();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(Throwable th) {
                qfu.this.d.a(false);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Integer num) {
                if (num.intValue() == 6) {
                    qfu.this.a(true, false);
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Object obj) {
                qfu.this.a(true, true);
            }

            public final void a() {
                super.a();
                qfu.this.a.a();
                qfu.this.c.bf_();
                qfu.this.b.bf_();
            }
        });
    }

    public final void a(b bVar, Observable<CharSequence> observable, Observable<Object> observable2, Observable<Integer> observable3) {
        this.d = bVar;
        this.f = observable;
        this.g = observable2;
        this.h = observable3;
    }

    public final void a(boolean z, boolean z2) {
        if (z2) {
            this.l.a(ScreenIdentifier.SIGN_UP_STEP_THREE, ClickIdentifier.DISPLAY_NAME_SAVE_BUTTON);
        }
        Observable a2 = this.i.a(this.e);
        this.b.bf_();
        this.b = a2.a(this.j).a((Consumer<? super T>) new $$Lambda$qfu$_uwhW1UT9040KKO6uLnFT5yGO4o<Object>(this, true), (Consumer<? super Throwable>) new $$Lambda$qfu$r3epwJKfqikuQsP6GHnrvPHvN0<Object>(this, true));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Response response) {
        if (z) {
            this.k.ae();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Throwable th) {
        Logger.e(th, "Failed to set name", new Object[0]);
        if (z) {
            this.l.a(ScreenIdentifier.SIGN_UP_STEP_THREE, ErrorTypeIdentifier.DISPLAY_NAME_FAILED_TO_SAVE, (InputFieldIdentifier) null);
            this.d.a();
        }
    }
}
