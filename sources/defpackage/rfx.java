package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: rfx reason: default package */
public final class rfx implements FlowableTransformer<Object, RemainingSkips> {
    private final gky<RemainingSkips> a;
    private final Scheduler b;

    public rfx(gky<RemainingSkips> gky, Scheduler scheduler) {
        this.a = gky;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public static boolean a(RemainingSkips remainingSkips) {
        return 3 == remainingSkips.getRemainingSkips() || remainingSkips.getRemainingSkips() == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(Object obj) {
        return vun.a(this.a.resolve(new Request(Request.GET, "sp://sequence_rules/v1/remaining_skips"))).a(this.b).a(0).a((Predicate<? super T>) $$Lambda$rfx$tu1I4fVVkFB23nvMiOlT6JLaX8.INSTANCE).b().b((wrf<? extends T>) Flowable.b());
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return flowable.b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$rfx$WwjwDm7MVtGHOokvuvYEltlIfg<Object,Object>(this));
    }
}
