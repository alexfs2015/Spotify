package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ode reason: default package */
public final class ode {
    private final Flowable<PlayerState> a;
    private final hgy b;
    private final odf c;

    public ode(Flowable<PlayerState> flowable, hgy hgy, odf odf) {
        this.a = flowable;
        this.b = hgy;
        this.c = odf;
    }

    /* access modifiers changed from: private */
    public NowPlayingMode a(ho<PlayerState, fqn> hoVar) {
        PlayerState playerState = (PlayerState) fbp.a(hoVar.a);
        fqn fqn = (fqn) fbp.a(hoVar.b);
        odf odf = this.c;
        fbp.a(playerState);
        fbp.a(playerState.track());
        fbp.a(fqn);
        fdz R_ = odf.a.R_();
        while (R_.hasNext()) {
            NowPlayingMode nowPlayingMode = (NowPlayingMode) R_.next();
            if (((tml) odf.b.get(nowPlayingMode)).a(playerState, fqn)) {
                return nowPlayingMode;
            }
        }
        return NowPlayingMode.DEFAULT;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    public final Flowable<NowPlayingMode> a() {
        return Flowable.a((xfk<? extends T1>) this.a.a((Predicate<? super T>) $$Lambda$ode$7IIBAUpgkCJpHG6syv5UYugpWec.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE), (xfk<? extends T2>) this.b.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$GoiJkLx1xdhgWxCQodTIkgDTQyM.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$ode$wR3MI5gqfeTZ2FIrWNn9iYwMiHk<Object,Object>(this)).a(Functions.a());
    }
}
