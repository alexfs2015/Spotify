package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: krm reason: default package */
public final class krm {
    public static kmv<krc> a(Flowable<PlayerState> flowable, jtz jtz) {
        return koj.a(flowable.j().a((Predicate<? super T>) $$Lambda$krm$6UqjL8SMusrip5ckwyeAXXjtQ.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$krm$KEgZZiRc7j2BtNtDKlYwDSMVqqI<Object,Object>(jtz)).a((Function<? super T, K>) $$Lambda$xLg4UGxovz3Kg5_LpCd1c_OThhw.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ krc a(jtz jtz, PlayerState playerState) {
        if (playerState.isPaused()) {
            return new h();
        }
        if (playerState.playbackSpeed() == 0.0f) {
            return new g();
        }
        i iVar = new i(playerState.currentPlaybackPosition(), playerState.duration(), jtz.a());
        return iVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return (playerState == null || playerState.track() == null) ? false : true;
    }
}
