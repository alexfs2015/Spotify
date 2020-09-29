package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: maa reason: default package */
public final class maa {
    private final Observable<Boolean> a;
    private final kvb b;
    private final kvd c;
    private final Flowable<PlayerState> d;

    maa(wud<Boolean> wud, kvb kvb, kvd kvd, Flowable<PlayerState> flowable) {
        this.a = vun.b(wud);
        this.b = (kvb) fay.a(kvb);
        this.c = (kvd) fay.a(kvd);
        this.d = (Flowable) fay.a(flowable);
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.d.j().a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$maa$47PUIEltRlHKTWRd906si1Ouszg.INSTANCE).a(Functions.a()), (ObservableSource<? extends T2>) Observable.a((ObservableSource<? extends T>) this.c.b(), (ObservableSource<? extends T>) this.a.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$maa$6lvUT9FMgHIc4Gj9w69iScvcWUw<Object,Object>(this), false)).c((Function<? super T, ? extends R>) new $$Lambda$maa$Hx6_hBjwuYG4fBARxJ54uIWoQw<Object,Object>(this)).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$maa$QVyqi1MOXQU1TODcFufYQ7rs0.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$5qCnJVaZbjUVoKFCu7DS5KkC7o.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        return this.c.a().d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool) {
        return kvb.a() ? Boolean.valueOf(kvb.b()) : bool;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            return Optional.e();
        }
        return Optional.b(bool2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(PlayerTrackUtil.isAd(track) || InterruptionUtil.isInterruptionUri(track.uri()));
    }
}
