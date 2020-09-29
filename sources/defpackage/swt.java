package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;

/* renamed from: swt reason: default package */
public final class swt {
    private final Flowable<Ad> a;
    private final Flowable<PlayerState> b;

    public swt(Flowable<Ad> flowable, Flowable<PlayerState> flowable2) {
        this.a = flowable;
        this.b = flowable2;
    }

    public final Flowable<Boolean> a() {
        return Flowable.a((wrf<? extends T1>) this.a, (wrf<? extends T2>) this.b, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$swt$QnMklU1hhZs8hIpdhIf9hnSR16w.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Ad ad, PlayerState playerState) {
        return Boolean.valueOf(playerState.restrictions().disallowSkippingNextReasons().isEmpty() && ad.skippable() && ad.getAdType() == AdType.NORMAL);
    }
}
