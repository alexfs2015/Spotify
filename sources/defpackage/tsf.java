package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.spotlets.ads.model.VideoType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: tsf reason: default package */
public final class tsf {
    private final igd a;
    private final Flowable<PlayerTrack> b;

    public tsf(igd igd, Flowable<PlayerTrack> flowable) {
        this.a = igd;
        this.b = flowable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(AdSlotEvent adSlotEvent) {
        return Boolean.valueOf(adSlotEvent.getAd().getVideoType() == VideoType.PORTRAIT);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.VIDEO;
    }

    public final Flowable<Boolean> a() {
        return Flowable.a((xfk<? extends T>) this.a.a.a(BackpressureStrategy.LATEST).a((Predicate<? super T>) $$Lambda$tsf$N_6zLXIRI0dZJ2LjvOmRBkT5M.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$tsf$juHGHamzR2FIRFMaAyL8d4jaHqI.INSTANCE), (xfk<? extends T>) this.b.a((Predicate<? super T>) $$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$tsf$Esf2jJektV6mE8I0JT8wG3p2Xts.INSTANCE));
    }
}
