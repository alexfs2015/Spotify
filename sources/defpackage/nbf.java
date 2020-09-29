package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: nbf reason: default package */
public final class nbf {
    private final foa<Boolean> a;
    private final foa<Boolean> b;
    private final nbg c;
    private final Flowable<PlayerState> d;
    private final kxz e;

    public nbf(foa<Boolean> foa, foa<Boolean> foa2, nbg nbg, Flowable<PlayerState> flowable, kxz kxz) {
        this.a = foa;
        this.b = foa2;
        this.c = nbg;
        this.d = flowable;
        this.e = kxz;
    }

    public final kjm<naw> a() {
        return kla.a(this.a.c((Function<? super T, ? extends R>) $$Lambda$nbf$wye3fdG3P74zLPtt6f_PvzGxRrU.INSTANCE), this.b.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$GniywafJE7te8aHVXndlQGVFsFI.INSTANCE), this.c.a.c((Function<? super T, ? extends R>) $$Lambda$nbf$jvn620trCdKK03Ij4dpW9k43aQQ.INSTANCE), this.d.j().c((Function<? super T, ? extends R>) $$Lambda$nbf$EPI4WTXbr9Tg_i48UJuKgSTOSU.INSTANCE), this.e.a().c((Function<? super T, ? extends R>) $$Lambda$17sE6K00O5HgZHCdsL2dgSoEyE.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ naw a(nbb nbb) {
        return (naw) nbb.a($$Lambda$ZWpAOwRprI5sCjDaxZ8z5wDSsOI.INSTANCE, $$Lambda$JqeCY40zxnN0gSPoZhTylbOxzuo.INSTANCE, $$Lambda$oooVVOEnbtVGgt4_5Z1qUfWwzFc.INSTANCE, $$Lambda$nbf$ZY4sF7HSabDNl9z08YccBakKX4.INSTANCE, $$Lambda$nbf$q1IKr7QFUQxI0OpHUiNmZJiZW0A.INSTANCE, $$Lambda$nbf$PMPh82FCk1GG67UGgRUK_9Ppm4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ naw a(PlayerState playerState) {
        return new h(!playerState.isPaused() && playerState.isPlaying());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ naw a(a aVar) {
        return new b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ naw a(Boolean bool) {
        return new a();
    }
}
