package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: pmo reason: default package */
public final class pmo {
    final pmg a;
    final spi b;
    Disposable c = Disposables.b();
    private final pmp d;
    private final Flowable<PlayerState> e;
    private final Scheduler f;

    public pmo(pmp pmp, Flowable<PlayerState> flowable, Scheduler scheduler, pmg pmg, spi spi) {
        this.d = (pmp) fay.a(pmp);
        this.e = (Flowable) fay.a(flowable);
        this.f = (Scheduler) fay.a(scheduler);
        this.a = (pmg) fay.a(pmg);
        this.b = (spi) fay.a(spi);
    }

    public final void a() {
        Flowable a2 = this.e.a((Predicate<? super T>) $$Lambda$pmo$hQjOXKZFckBUNyNwteBTS_QjM.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pmo$7BtprwvwTNDJ5MLWHVbirinzbA.INSTANCE).a(this.f);
        pmp pmp = this.d;
        pmp.getClass();
        this.c = a2.a((Consumer<? super T>) new $$Lambda$8iVl20KBdtdRKUwr7K3p8l5Pwo<Object>(pmp), (Consumer<? super Throwable>) $$Lambda$pmo$Yya7dpfek5lckM2_OgED01tYs5E.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }
}
