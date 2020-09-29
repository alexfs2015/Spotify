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

/* renamed from: rtc reason: default package */
public final class rtc {
    private final Context a;
    private final hpg b;
    private final Scheduler c;
    private final Scheduler d;
    private final Flowable<PlayerState> e;
    private hne f;
    private final tjv g;

    public rtc(Context context, hpg hpg, Scheduler scheduler, Scheduler scheduler2, Flowable<PlayerState> flowable, tjv tjv) {
        this.a = (Context) fay.a(context);
        this.b = hpg;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = flowable;
        this.g = tjv;
    }

    public final Flowable<rte> a(hne hne) {
        this.f = hne;
        Flowable d2 = Flowable.a(hne.g().a, this.e.c((Function<? super T, ? extends R>) $$Lambda$a9WrEozlR4ymmIt25PNEK9Owe3M.INSTANCE).c(Optional.e()), hne.e().b().c((Function<? super T, ? extends R>) $$Lambda$9AwRXorfegDJI1Q8yBAAc7xzwx8.INSTANCE).e(Optional.e()).a(BackpressureStrategy.LATEST), vun.a(hne.h().a()).c((Function<? super T, ? extends R>) $$Lambda$1GincVFnfz6VGkd1LGSTDNbK7Sw.INSTANCE).c(Optional.e()), vun.a(hne.c().d().c(Boolean.TRUE)), vun.a(hne.d().d().c(Integer.valueOf(100))), new $$Lambda$rtc$V3Vb020PmjtQDpFVWJL0LkEuyHA(this)).d(250, TimeUnit.MILLISECONDS, this.d);
        $$Lambda$rtc$njJCys9RvgNMh5A3RYxYK3B1BeU r8 = $$Lambda$rtc$njJCys9RvgNMh5A3RYxYK3B1BeU.INSTANCE;
        BackpressureOverflowStrategy backpressureOverflowStrategy = BackpressureOverflowStrategy.DROP_OLDEST;
        ObjectHelper.a(backpressureOverflowStrategy, "overflowStrategy is null");
        ObjectHelper.a(10, "capacity");
        FlowableOnBackpressureBufferStrategy flowableOnBackpressureBufferStrategy = new FlowableOnBackpressureBufferStrategy(d2, 10, r8, backpressureOverflowStrategy);
        return RxJavaPlugins.a((Flowable<T>) flowableOnBackpressureBufferStrategy).a(this.c).a((Action) new $$Lambda$rtc$Tn2a6Hqy6sRVinCJI3PvtxTBNU(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rte a(SessionState sessionState, Optional optional, Optional optional2, Optional optional3, Boolean bool, Integer num) {
        return rte.a(this.a, this.b, sessionState, (PlayerState) optional.d(), (ugu) optional2.d(), (PlayerQueue) optional3.d(), bool.booleanValue(), this.g, num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f = null;
    }

    public final boolean a() {
        return this.f != null;
    }
}
