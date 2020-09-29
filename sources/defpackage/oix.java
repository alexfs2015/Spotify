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

/* renamed from: oix reason: default package */
public final class oix implements a {
    final oji a;
    Disposable b = Disposables.b();
    CompositeDisposable c = new CompositeDisposable();
    b d;
    String e;
    Observable<CharSequence> f;
    Observable<Object> g;
    Observable<Integer> h;
    private final ojc i;
    private final Scheduler j;
    private final ohk k;
    private final uun l;

    public oix(ojc ojc, Scheduler scheduler, oji oji, ohk ohk, uun uun, a aVar) {
        this.i = ojc;
        this.j = scheduler;
        this.a = oji;
        this.k = ohk;
        this.l = uun;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(Integer num) {
                if (num.intValue() == 6) {
                    oix.this.a(true, false);
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Object obj) {
                oix.this.a(true, true);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void b(CharSequence charSequence) {
                oix.this.e = charSequence.toString();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(Throwable th) {
                oix.this.d.a(false);
            }

            public final void a() {
                super.a();
                oix.this.a.a();
                oix.this.c.bd_();
                oix.this.b.bd_();
            }

            public final void c() {
                super.c();
                oix.this.c = new CompositeDisposable();
                oix.this.a.b(oix.this.f, InputFieldIdentifier.DISPLAY_NAME, ScreenIdentifier.SIGN_UP_STEP_THREE);
                CompositeDisposable compositeDisposable = oix.this.c;
                Observable c = oix.this.f.b((Consumer<? super T>) new $$Lambda$oix$1$HVCLU1h2tx9ZMeRPa2P8D65Lntg<Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$oix$1$NbmSqZa0cDzrPY4ovIGcucERhck.INSTANCE);
                b bVar = oix.this.d;
                bVar.getClass();
                compositeDisposable.a(c.a((Consumer<? super T>) new $$Lambda$vQLRXAf9CBPr3d50IrQB_wlugiE<Object>(bVar), (Consumer<? super Throwable>) new $$Lambda$oix$1$Au76fPIKlDkq9_zZxfhNVqGTGtc<Object>(this)));
                oix.this.c.a(oix.this.h.a((Consumer<? super T>) new $$Lambda$oix$1$1kbuPq6IpoW1qZAUahThNHoBB0c<Object>(this), (Consumer<? super Throwable>) $$Lambda$oix$1$yUuHFjiI0kwgxF_1EP0rGwAG8.INSTANCE));
                oix.this.c.a(oix.this.g.a((Consumer<? super T>) new $$Lambda$oix$1$Ll02rkrhYNsabyPuePhaikDaryo<Object>(this), (Consumer<? super Throwable>) $$Lambda$oix$1$UG1P2AgFjJpGxb8CLIUv_IXcg.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Response response) {
        if (z) {
            this.k.c();
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
        this.b.bd_();
        this.b = a2.a(this.j).a((Consumer<? super T>) new $$Lambda$oix$FubkgVkVrBVFx1e65uMIRQ7uiE<Object>(this, true), (Consumer<? super Throwable>) new $$Lambda$oix$OHC8LHlGmrwbc3Bm67wPNzHC7hA<Object>(this, true));
    }
}
