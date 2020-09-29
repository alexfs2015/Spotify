package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ktv reason: default package */
public final class ktv {
    public static Observable<PlayerState> a(Observable<PlayerState> observable, Observable<PlayerState> observable2) {
        return observable.a((Predicate<? super T>) $$Lambda$ktv$vVMuwGePWVEgl9ir5BT3J_FmZU.INSTANCE).a((Function<? super T, K>) $$Lambda$BS8zy8vzlznFlCIBWrL6Vi295A.INSTANCE).h(new $$Lambda$ktv$sS9UlY6GDxmSjwX2XDvu12WWKgc(observable2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState, PlayerState playerState2) {
        String playbackId = playerState.playbackId();
        String playbackId2 = playerState2.playbackId();
        return playerState2.reverse().length == 0 && !fbo.a(playbackId2) && !fbo.a(playbackId) && !playbackId.equals(playbackId2) && playerState2.currentPlaybackPosition() == 0 && playerState2.timestamp() - playerState.timestamp() >= 5000;
    }
}
