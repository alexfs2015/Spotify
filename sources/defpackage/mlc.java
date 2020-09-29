package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;

/* renamed from: mlc reason: default package */
public final class mlc {
    CompositeDisposable a;
    Disposable b = Disposables.b();
    boolean c;
    private final mla d;
    private final rqd e;
    private final wlc<mmb> f;
    private final mlz g;
    private final Scheduler h;
    private mmb i;

    mlc(mla mla, rqd rqd, mlz mlz, wlc<mmb> wlc, Scheduler scheduler) {
        this.d = (mla) fay.a(mla);
        this.e = (rqd) fay.a(rqd);
        this.g = (mlz) fay.a(mlz);
        this.f = (wlc) fay.a(wlc);
        this.h = (Scheduler) fay.a(scheduler);
        this.a = new CompositeDisposable();
        this.a.bf_();
    }

    public final void a() {
        if (this.a.b()) {
            this.a = new CompositeDisposable();
            this.a.a(this.d.a.a((BiPredicate<? super T, ? super T>) $$Lambda$9bRgsMTAugR91KdeeTaZobmwtwA.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$mlc$sNO3plcDRBFTEttdJjnV7sEMBM<Object>(this), (Consumer<? super Throwable>) $$Lambda$mlc$oitjYzJgpUiE12AjZ8evZX1UOcQ.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    public void a(mlh mlh) {
        mmb mmb = this.i;
        if (mmb == null) {
            mmb = (mmb) this.f.get();
            this.i = mmb;
        }
        if (this.c) {
            if (mlh.b()) {
                mmb.a().a(mmb.a);
            } else {
                mmb.b().a(mmb.a);
            }
        }
        this.c = true;
        if (this.b.b()) {
            mlz mlz = this.g;
            DebugFlag debugFlag = DebugFlag.DATA_SAVER_MODE_SYNC_WITH_ANDROID;
            Observable c2 = Observable.c();
            rqd rqd = this.e;
            rqd.getClass();
            this.b = c2.a((Consumer<? super T>) new $$Lambda$4dJdlUaXI2R4ZtZJbl7bhW4SPcg<Object>(rqd), (Consumer<? super Throwable>) $$Lambda$mlc$BKXg6jtxf2U4B1alsfNAk_PdZg.INSTANCE);
        }
    }
}
