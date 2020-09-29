package defpackage;

import android.os.Parcelable;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.otp.ui.OtpInputView;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: gmi reason: default package */
public final class gmi<H extends Parcelable, R> implements defpackage.gmd.a {
    Disposable a = Disposables.b();
    final d b;
    public c<R> c;
    private final glw<H> d;
    private final Scheduler e;
    private final a<H, R> f;
    private Disposable g = Disposables.b();
    private final gmk<H, R> h;
    private final b i;
    private defpackage.gmd.c j;

    /* renamed from: gmi$a */
    public interface a<H extends Parcelable, R> {
        Single<gmj<R>> a(H h, String str);
    }

    /* renamed from: gmi$b */
    public interface b {
        void h();

        void i();

        void j();

        void k();

        void l();
    }

    /* renamed from: gmi$c */
    public interface c<R> {
        void a(gmh gmh);

        void a(String str, R r);

        void b();

        void b(Throwable th);
    }

    /* renamed from: gmi$d */
    public interface d {
        void c();

        void m();

        void n();

        void o();

        void p();
    }

    public gmi(glw<H> glw, gmk<H, R> gmk, Scheduler scheduler, a<H, R> aVar, b bVar, d dVar) {
        this.d = (glw) fay.a(glw);
        this.h = (gmk) fay.a(gmk);
        this.e = (Scheduler) fay.a(scheduler);
        this.f = (a) fay.a(aVar);
        this.i = (b) fay.a(bVar);
        this.b = (d) fay.a(dVar);
    }

    public final void a(int i2) {
        ((OtpInputView) fay.a(this.h.b)).a(i2);
    }

    public final void a(String str, String str2) {
        gmk<H, R> gmk = this.h;
        ((TextView) fay.a(gmk.c)).setText(str);
        ((TextView) fay.a(gmk.d)).setText(str2);
    }

    public final void a() {
        this.b.n();
        ((defpackage.gmd.c) fay.a(this.j)).a(true);
        this.h.c(false);
        this.h.d(false);
        ((c) fay.a(this.c)).a(new gmh(this.d, new $$Lambda$gmi$UTT0DHHpqEGqqoOBpM6wFk1wt8w(this), this.i));
    }

    public final void a(String str) {
        this.b.p();
        ((defpackage.gmd.c) fay.a(this.j)).a(true);
        this.h.c(false);
        this.h.d(false);
        fay.a(str);
        fay.b(this.d.b());
        this.g.bf_();
        this.g = this.f.a(this.d.e(), str).a(this.e).a((Consumer<? super T>) new $$Lambda$gmi$KE0oVSH6QwAb4nPkBBhAbuUFIY<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$gmi$cIt2XRTnH3_aHgfQBG4JNv6cZMM<Object>(this));
    }

    public final void a(Observable<CharSequence> observable) {
        this.a = observable.a(this.e).c((Function<? super T, ? extends R>) $$Lambda$o0pFIlsUNXLvEOX1QJRnwdVBJFE.INSTANCE).a((Consumer<? super T>) new $$Lambda$gmi$H3JPtPUYlMKIfT62DiU1tGo0BU<Object>(this), (Consumer<? super Throwable>) $$Lambda$gmi$sBM3cFxSlT1AJRTLqmSE4Z_d_I.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.h.d(false);
        this.b.m();
    }

    public final void a(defpackage.gmd.c cVar) {
        fay.b(this.c != null);
        this.j = (defpackage.gmd.c) fay.a(cVar);
        this.h.a = (gmi) fay.a(this);
        cVar.a((defpackage.gmd.b) this.h);
    }

    public final void a(boolean z) {
        ((defpackage.gmd.c) fay.a(this.j)).a(this.h, z);
        this.b.c();
        c();
    }

    public final void b(boolean z) {
        this.g.bf_();
        ((defpackage.gmd.c) fay.a(this.j)).b(this.h, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void c() {
        ((defpackage.gmd.c) fay.a(this.j)).a(false);
        this.h.c(true);
        this.h.d(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "ValidateOtpPresenter: validation error", new Object[0]);
        c();
        this.i.i();
        ((c) fay.a(this.c)).b(th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gmj gmj) {
        if (gmj instanceof defpackage.gmj.a) {
            c();
            this.h.d(true);
            return;
        }
        fay.b(gmj instanceof defpackage.gmj.b);
        ((defpackage.gmd.c) fay.a(this.j)).a(false);
        this.h.c(false);
        this.h.d(false);
        this.i.h();
        ((c) fay.a(this.c)).a(str, ((defpackage.gmj.b) gmj).a);
    }
}
