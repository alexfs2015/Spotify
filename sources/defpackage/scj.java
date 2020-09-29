package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: scj reason: default package */
public final class scj {
    private final Context a;
    private final hre b;
    private final Scheduler c;
    private final Scheduler d;
    private final Flowable<PlayerState> e;
    private hpt f;
    private final tvn g;

    public scj(Context context, hre hre, Scheduler scheduler, Scheduler scheduler2, Flowable<PlayerState> flowable, tvn tvn) {
        this.a = (Context) fbp.a(context);
        this.b = hre;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = flowable;
        this.g = tvn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ scl a(SessionState sessionState, Optional optional, Optional optional2, Optional optional3, Boolean bool, Integer num) {
        return scl.a(this.a, this.b, sessionState, (PlayerState) optional.d(), (usi) optional2.d(), (PlayerQueue) optional3.d(), bool.booleanValue(), this.g, num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f = null;
    }

    public final Flowable<scl> a(hpt hpt) {
        this.f = hpt;
        Flowable d2 = Flowable.a(hpt.g().a, this.e.c((Function<? super T, ? extends R>) $$Lambda$a9WrEozlR4ymmIt25PNEK9Owe3M.INSTANCE).c(Optional.e()), hpt.e().b().c((Function<? super T, ? extends R>) $$Lambda$LnlupQXUJbizlMkzHncLuGPXP3Y.INSTANCE).e(Optional.e()).a(BackpressureStrategy.LATEST), wit.a(hpt.h().a()).c((Function<? super T, ? extends R>) $$Lambda$1GincVFnfz6VGkd1LGSTDNbK7Sw.INSTANCE).c(Optional.e()), wit.a(hpt.c().d().c(Boolean.TRUE)), wit.a(hpt.d().d().c(Integer.valueOf(100))), new $$Lambda$scj$LwUzcApeR4bPXpZQe5acZl5a3_c(this)).d(250, TimeUnit.MILLISECONDS, this.d);
        $$Lambda$scj$w0pff2nywcL8702gvahfPMfsp1w r8 = $$Lambda$scj$w0pff2nywcL8702gvahfPMfsp1w.INSTANCE;
        BackpressureOverflowStrategy backpressureOverflowStrategy = BackpressureOverflowStrategy.DROP_OLDEST;
        ObjectHelper.a(backpressureOverflowStrategy, "overflowStrategy is null");
        ObjectHelper.a(10, "capacity");
        FlowableOnBackpressureBufferStrategy flowableOnBackpressureBufferStrategy = new FlowableOnBackpressureBufferStrategy(d2, 10, r8, backpressureOverflowStrategy);
        return RxJavaPlugins.a((Flowable<T>) flowableOnBackpressureBufferStrategy).a(this.c).a((Action) new $$Lambda$scj$e1jX8_we9db7et3JZCMvqY0rA6U(this));
    }

    public final boolean a() {
        return this.f != null;
    }
}
