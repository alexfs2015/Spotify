package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;

/* renamed from: tha reason: default package */
public final class tha {
    private final Flowable<Ad> a;
    private final Flowable<PlayerState> b;

    public tha(Flowable<Ad> flowable, Flowable<PlayerState> flowable2) {
        this.a = flowable;
        this.b = flowable2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Ad ad, PlayerState playerState) {
        return Boolean.valueOf(playerState.restrictions().disallowSkippingNextReasons().isEmpty() && ad.skippable() && ad.getAdType() == AdType.NORMAL);
    }

    public final Flowable<Boolean> a() {
        return Flowable.a((xfk<? extends T1>) this.a, (xfk<? extends T2>) this.b, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tha$4AlwC4ol7ZNmVBIrpmsjm2q2paQ.INSTANCE);
    }
}
