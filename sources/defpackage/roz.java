package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.music.freetiercommon.models.RemainingSkips;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: roz reason: default package */
public final class roz implements FlowableTransformer<Object, RemainingSkips> {
    private final gmm<RemainingSkips> a;
    private final Scheduler b;

    public roz(gmm<RemainingSkips> gmm, Scheduler scheduler) {
        this.a = gmm;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(Object obj) {
        return wit.a(this.a.resolve(new Request(Request.GET, "sp://sequence_rules/v1/remaining_skips"))).a(this.b).a(0).a((Predicate<? super T>) $$Lambda$roz$nMkzWb2UOjOeGTk4586BdY4quE.INSTANCE).b().b((xfk<? extends T>) Flowable.b());
    }

    /* access modifiers changed from: private */
    public static boolean a(RemainingSkips remainingSkips) {
        return 3 == remainingSkips.getRemainingSkips() || remainingSkips.getRemainingSkips() == 0;
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$roz$CwkM56hV3vlZOyzzAgvsC2lCYr4<Object,Object>(this));
    }
}
