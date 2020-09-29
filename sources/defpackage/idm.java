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

/* renamed from: idm reason: default package */
final class idm implements Function<AdBreakState, Observable<Optional<AdProduct>>> {
    private final ido a;
    private final ids b;

    public final /* synthetic */ Object apply(Object obj) {
        if (((AdBreakState) obj) == AdBreakState.IDLE) {
            return Observable.b(Optional.e());
        }
        return this.b.b.a((Predicate<? super T>) $$Lambda$idm$VanrZOYAffjl2Ds8JAJF9ajXDi0.INSTANCE).c((Function<? super T, ? extends R>) this.a).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$x2aPjnXBVgllyOzinqqdF4B7G9w.INSTANCE);
    }

    public idm(ido ido, ids ids) {
        this.a = ido;
        this.b = ids;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getEvent() == Event.PLAY;
    }
}
