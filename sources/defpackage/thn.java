package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.spotlets.ads.model.VideoType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: thn reason: default package */
public final class thn {
    private final idq a;
    private final Flowable<PlayerTrack> b;

    public thn(idq idq, Flowable<PlayerTrack> flowable) {
        this.a = idq;
        this.b = flowable;
    }

    public final Flowable<Boolean> a() {
        return Flowable.a((wrf<? extends T>) this.a.a.a(BackpressureStrategy.LATEST).a((Predicate<? super T>) $$Lambda$thn$_bGUc3Tlma8KyiMuSyuTvHiQkPs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$thn$6LUDRzl9lQ68VQ9tVUopAa4XI2Q.INSTANCE), (wrf<? extends T>) this.b.a((Predicate<? super T>) $$Lambda$thn$6i8_A5Okjtm4MVDIHWIhFaPJ70.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$thn$9B2NvNdz3hyAQACybk4vQhcVRU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.VIDEO;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(AdSlotEvent adSlotEvent) {
        return Boolean.valueOf(adSlotEvent.getAd().getVideoType() == VideoType.PORTRAIT);
    }
}
