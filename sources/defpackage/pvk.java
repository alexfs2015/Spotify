package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: pvk reason: default package */
public final class pvk {
    final pvc a;
    final szp b;
    Disposable c = Disposables.b();
    private final pvl d;
    private final Flowable<PlayerState> e;
    private final Scheduler f;

    public pvk(pvl pvl, Flowable<PlayerState> flowable, Scheduler scheduler, pvc pvc, szp szp) {
        this.d = (pvl) fbp.a(pvl);
        this.e = (Flowable) fbp.a(flowable);
        this.f = (Scheduler) fbp.a(scheduler);
        this.a = (pvc) fbp.a(pvc);
        this.b = (szp) fbp.a(szp);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.track() != null;
    }

    public final void a() {
        Flowable a2 = this.e.a((Predicate<? super T>) $$Lambda$pvk$RjXdcHsfnVbT8Nihej29IOYEf5o.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pvk$tQwTIOUXcyOJ0ga5rrvV8K8l66U.INSTANCE).a(this.f);
        pvl pvl = this.d;
        pvl.getClass();
        this.c = a2.a((Consumer<? super T>) new $$Lambda$mypkUlnLq6qWxlBEynhSoC6yVVU<Object>(pvl), (Consumer<? super Throwable>) $$Lambda$pvk$lsmFL05fE6BE81VPNDGem_F14xM.INSTANCE);
    }
}
