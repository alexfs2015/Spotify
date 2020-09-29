package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ung reason: default package */
public interface ung {

    /* renamed from: ung$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ ho a(PlayerState playerState) {
            return new ho(playerState.playbackId(), playerState.track());
        }

        public static Observable<ho<String, PlayerTrack>> a(Flowable<PlayerState> flowable) {
            return flowable.j().a(AndroidSchedulers.a()).a((Predicate<? super T>) $$Lambda$ung$IGM7Gp5AZGzm1sn33E7lDKVxh5Y.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ung$12CMUeC5LO7S2UGzY2zlyt8tCfs.INSTANCE).a(Functions.a()).a(1).a();
        }

        public static /* synthetic */ boolean b(PlayerState playerState) {
            return (playerState == null || playerState.track() == null || playerState.playbackId() == null) ? false : true;
        }
    }
}
