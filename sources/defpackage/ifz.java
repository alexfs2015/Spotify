package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import com.spotify.mobile.android.spotlets.ads.model.AdProduct;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ifz reason: default package */
final class ifz implements Function<AdBreakState, Observable<Optional<AdProduct>>> {
    private final igb a;
    private final igf b;

    public ifz(igb igb, igf igf) {
        this.a = igb;
        this.b = igf;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getEvent() == Event.PLAY;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return ((AdBreakState) obj) == AdBreakState.IDLE ? Observable.b(Optional.e()) : this.b.b.a((Predicate<? super T>) $$Lambda$ifz$q4Ss62GzaI0CcAbMlqjvRn57p6A.INSTANCE).c((Function<? super T, ? extends R>) this.a).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$x2aPjnXBVgllyOzinqqdF4B7G9w.INSTANCE);
    }
}
