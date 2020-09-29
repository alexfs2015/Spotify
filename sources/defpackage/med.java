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

/* renamed from: med reason: default package */
public final class med {
    private final Observable<Boolean> a;
    private final kyk b;
    private final kym c;
    private final Flowable<PlayerState> d;

    med(xii<Boolean> xii, kyk kyk, kym kym, Flowable<PlayerState> flowable) {
        this.a = wit.b(xii);
        this.b = (kyk) fbp.a(kyk);
        this.c = (kym) fbp.a(kym);
        this.d = (Flowable) fbp.a(flowable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(Boolean bool, Boolean bool2) {
        return bool.booleanValue() ? Optional.e() : Optional.b(bool2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(PlayerTrackUtil.isAd(track) || InterruptionUtil.isInterruptionUri(track.uri()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool) {
        return kyk.a() ? Boolean.valueOf(kyk.b()) : bool;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        return this.c.a().d();
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableSource<? extends T1>) this.d.j().a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$med$qm2K3h8uMbreDdsU4NRHBsUQlpQ.INSTANCE).a(Functions.a()), (ObservableSource<? extends T2>) Observable.b((ObservableSource<? extends T>) this.c.b(), (ObservableSource<? extends T>) this.a.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$med$vRfaCt8GXbqfl_dsvEaVtPb1wiQ<Object,Object>(this), false)).c((Function<? super T, ? extends R>) new $$Lambda$med$NS_SRQZzdWcKXLm6UcEQAQCRbw<Object,Object>(this)).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$med$uKwd_3_zDDWLTGf4Tmn8Y4_wA.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$5qCnJVaZbjUVoKFCu7DS5KkC7o.INSTANCE).a(Functions.a());
    }
}
