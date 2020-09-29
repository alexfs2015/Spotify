package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;

/* renamed from: mpv reason: default package */
public final class mpv {
    CompositeDisposable a;
    Disposable b = Disposables.b();
    boolean c;
    private final mpt d;
    private final rzo e;
    private final wzi<mqu> f;
    private final mqs g;
    private final Scheduler h;
    private mqu i;

    mpv(mpt mpt, rzo rzo, mqs mqs, wzi<mqu> wzi, Scheduler scheduler) {
        this.d = (mpt) fbp.a(mpt);
        this.e = (rzo) fbp.a(rzo);
        this.g = (mqs) fbp.a(mqs);
        this.f = (wzi) fbp.a(wzi);
        this.h = (Scheduler) fbp.a(scheduler);
        this.a = new CompositeDisposable();
        this.a.bd_();
    }

    /* access modifiers changed from: private */
    public void a(mqa mqa) {
        mqu mqu = this.i;
        if (mqu == null) {
            mqu = (mqu) this.f.get();
            this.i = mqu;
        }
        if (this.c) {
            if (mqa.b()) {
                mqu.a().a(mqu.a);
            } else {
                mqu.b().a(mqu.a);
            }
        }
        this.c = true;
        if (this.b.b()) {
            mqs mqs = this.g;
            DebugFlag debugFlag = DebugFlag.DATA_SAVER_MODE_SYNC_WITH_ANDROID;
            Observable c2 = Observable.c();
            rzo rzo = this.e;
            rzo.getClass();
            this.b = c2.a((Consumer<? super T>) new $$Lambda$ObmSc1cxAGgLJDP5d8P_bseDkhQ<Object>(rzo), (Consumer<? super Throwable>) $$Lambda$mpv$VrJvKJVkiMVs_4tH3qdJTERvbhk.INSTANCE);
        }
    }

    public final void a() {
        if (this.a.b()) {
            this.a = new CompositeDisposable();
            this.a.a(this.d.a.a((BiPredicate<? super T, ? super T>) $$Lambda$HUE1SOqgQnkGqEQoy_nblKkVPw.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$mpv$a8fMqkCWJEA2Ti6zXHjE2hO7KHY<Object>(this), (Consumer<? super Throwable>) $$Lambda$mpv$VUoAaTGBvXrusFEMs6g1Y3Z4Zu4.INSTANCE));
        }
    }
}
