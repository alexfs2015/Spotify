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

/* renamed from: gnx reason: default package */
public final class gnx<H extends Parcelable, R> implements defpackage.gns.a {
    Disposable a = Disposables.b();
    final d b;
    public c<R> c;
    private final gnl<H> d;
    private final Scheduler e;
    private final a<H, R> f;
    private Disposable g = Disposables.b();
    private final gnz<H, R> h;
    private final b i;
    private defpackage.gns.c j;

    /* renamed from: gnx$a */
    public interface a<H extends Parcelable, R> {
        Single<gny<R>> a(H h, String str);
    }

    /* renamed from: gnx$b */
    public interface b {
        void h();

        void i();

        void j();

        void k();

        void l();
    }

    /* renamed from: gnx$c */
    public interface c<R> {
        void a(gnw gnw);

        void a(String str, R r);

        void b();

        void b(Throwable th);
    }

    /* renamed from: gnx$d */
    public interface d {
        void c();

        void m();

        void n();

        void o();

        void p();
    }

    public gnx(gnl<H> gnl, gnz<H, R> gnz, Scheduler scheduler, a<H, R> aVar, b bVar, d dVar) {
        this.d = (gnl) fbp.a(gnl);
        this.h = (gnz) fbp.a(gnz);
        this.e = (Scheduler) fbp.a(scheduler);
        this.f = (a) fbp.a(aVar);
        this.i = (b) fbp.a(bVar);
        this.b = (d) fbp.a(dVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gny gny) {
        if (gny instanceof defpackage.gny.a) {
            c();
            this.h.d(true);
            return;
        }
        fbp.b(gny instanceof defpackage.gny.b);
        ((defpackage.gns.c) fbp.a(this.j)).a(false);
        this.h.c(false);
        this.h.d(false);
        this.i.h();
        ((c) fbp.a(this.c)).a(str, ((defpackage.gny.b) gny).a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void c() {
        ((defpackage.gns.c) fbp.a(this.j)).a(false);
        this.h.c(true);
        this.h.d(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.h.d(false);
        this.b.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "ValidateOtpPresenter: validation error", new Object[0]);
        c();
        this.i.i();
        ((c) fbp.a(this.c)).b(th);
    }

    public final void a() {
        this.b.n();
        ((defpackage.gns.c) fbp.a(this.j)).a(true);
        this.h.c(false);
        this.h.d(false);
        ((c) fbp.a(this.c)).a(new gnw(this.d, new $$Lambda$gnx$6LBqcFz1ooXt9wbo4TagiHftlJQ(this), this.i));
    }

    public final void a(int i2) {
        ((OtpInputView) fbp.a(this.h.b)).a(i2);
    }

    public final void a(defpackage.gns.c cVar) {
        fbp.b(this.c != null);
        this.j = (defpackage.gns.c) fbp.a(cVar);
        this.h.a = (gnx) fbp.a(this);
        cVar.a((defpackage.gns.b) this.h);
    }

    public final void a(Observable<CharSequence> observable) {
        this.a = observable.a(this.e).c((Function<? super T, ? extends R>) $$Lambda$o0pFIlsUNXLvEOX1QJRnwdVBJFE.INSTANCE).a((Consumer<? super T>) new $$Lambda$gnx$qQedjVdlFdxPi1PL53KFpx3MwU<Object>(this), (Consumer<? super Throwable>) $$Lambda$gnx$qIg2PJpFZ2DgjL45P9P6CV5bdKs.INSTANCE);
    }

    public final void a(String str) {
        this.b.p();
        ((defpackage.gns.c) fbp.a(this.j)).a(true);
        this.h.c(false);
        this.h.d(false);
        fbp.a(str);
        fbp.b(this.d.b());
        this.g.bd_();
        this.g = this.f.a(this.d.e(), str).a(this.e).a((Consumer<? super T>) new $$Lambda$gnx$1a6tp5EJPm8vUntP0eMTg0sjYQU<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$gnx$LKXBPdneNFNG_B6UwaG3kbXyF3g<Object>(this));
    }

    public final void a(String str, String str2) {
        gnz<H, R> gnz = this.h;
        ((TextView) fbp.a(gnz.c)).setText(str);
        ((TextView) fbp.a(gnz.d)).setText(str2);
    }

    public final void a(boolean z) {
        ((defpackage.gns.c) fbp.a(this.j)).a(this.h, z);
        this.b.c();
        c();
    }

    public final void b(boolean z) {
        this.g.bd_();
        ((defpackage.gns.c) fbp.a(this.j)).b(this.h, z);
    }
}
