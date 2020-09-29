package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: kod reason: default package */
public final class kod {
    public static kjm<knt> a(Flowable<PlayerState> flowable, jrp jrp) {
        return kla.a(flowable.j().a((Predicate<? super T>) $$Lambda$kod$iK3R1y8pmZljJvxvuO4HO6By_r0.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$kod$GjhxUuk4rtX23MyYHV3FU3p9BZY<Object,Object>(jrp)).a((Function<? super T, K>) $$Lambda$ZO27JqYkOgKOrp1cF_FD7Eoz2DU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return (playerState == null || playerState.track() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ knt a(jrp jrp, PlayerState playerState) {
        if (playerState.isPaused()) {
            return new h();
        }
        if (playerState.playbackSpeed() == 0.0f) {
            return new g();
        }
        i iVar = new i(playerState.currentPlaybackPosition(), playerState.duration(), jrp.a());
        return iVar;
    }
}
