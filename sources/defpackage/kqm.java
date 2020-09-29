package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: kqm reason: default package */
public final class kqm {
    public static Observable<PlayerState> a(Observable<PlayerState> observable, Observable<PlayerState> observable2) {
        return observable.a((Predicate<? super T>) $$Lambda$kqm$CMf9rvDoz9FF1iux5ZkMudSV_Q.INSTANCE).a((Function<? super T, K>) $$Lambda$BS8zy8vzlznFlCIBWrL6Vi295A.INSTANCE).h(new $$Lambda$kqm$t_zRPT9QW_zMErnKJ3TiDRyA2w(observable2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState, PlayerState playerState2) {
        String playbackId = playerState.playbackId();
        String playbackId2 = playerState2.playbackId();
        return playerState2.reverse().length == 0 && !fax.a(playbackId2) && !fax.a(playbackId) && !playbackId.equals(playbackId2) && playerState2.currentPlaybackPosition() == 0 && playerState2.timestamp() - playerState.timestamp() >= 5000;
    }
}
