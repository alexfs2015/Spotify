package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ual reason: default package */
public interface ual {

    /* renamed from: ual$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<ho<String, PlayerTrack>> a(Flowable<PlayerState> flowable) {
            return flowable.j().a(AndroidSchedulers.a()).a((Predicate<? super T>) $$Lambda$ual$oD_oYT9JS06queiBrABBP6Ss4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ual$s9B0xtnqAUNViLEZ6Ox8QnRUWfs.INSTANCE).a(Functions.a()).a(1).a();
        }

        public static /* synthetic */ boolean b(PlayerState playerState) {
            return (playerState == null || playerState.track() == null || playerState.playbackId() == null) ? false : true;
        }

        public static /* synthetic */ ho a(PlayerState playerState) {
            return new ho(playerState.playbackId(), playerState.track());
        }
    }
}
