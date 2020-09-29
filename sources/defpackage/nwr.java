package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: nwr reason: default package */
public final class nwr {
    private final Flowable<PlayerState> a;
    private final hec b;
    private final nws c;

    public nwr(Flowable<PlayerState> flowable, hec hec, nws nws) {
        this.a = flowable;
        this.b = hec;
        this.c = nws;
    }

    public final Flowable<NowPlayingMode> a() {
        return Flowable.a((wrf<? extends T1>) this.a.a((Predicate<? super T>) $$Lambda$nwr$137OXWxHq1JAuTRY1WIjekvnSg.INSTANCE).a((Function<? super T, K>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE), (wrf<? extends T2>) this.b.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$oiH9DxkvZHNneCsAIASy9aUjqbw.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$nwr$G7xgAEDJtWvPxn2DUb_hprTze4<Object,Object>(this)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public NowPlayingMode a(ho<PlayerState, fpt> hoVar) {
        PlayerState playerState = (PlayerState) fay.a(hoVar.a);
        fpt fpt = (fpt) fay.a(hoVar.b);
        nws nws = this.c;
        fay.a(playerState);
        fay.a(playerState.track());
        fay.a(fpt);
        fdh R_ = nws.a.R_();
        while (R_.hasNext()) {
            NowPlayingMode nowPlayingMode = (NowPlayingMode) R_.next();
            if (((tce) nws.b.get(nowPlayingMode)).a(playerState, fpt)) {
                return nowPlayingMode;
            }
        }
        return NowPlayingMode.DEFAULT;
    }
}
