package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;

/* renamed from: tiw reason: default package */
public final class tiw {
    public static Observable<PlayerTrack> a(Flowable<PlayerState> flowable, String str) {
        return flowable.j().a((Predicate<? super T>) new $$Lambda$tiw$oHm5lqDjfJdnTlMCC22VjgV2UBg<Object>(str)).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a((Predicate<? super T>) $$Lambda$tiw$6Ix0JNFoZ7xc6JNWLbf_6yJ11KA.INSTANCE).c(1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, PlayerState playerState) {
        if (playerState != null && str.equals(playerState.contextUri())) {
            Set featureClasses = playerState.playOrigin().featureClasses();
            if (!playerState.isPaused() && featureClasses != null && featureClasses.contains("social_play")) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerTrack playerTrack) {
        return playerTrack != null && !Boolean.valueOf((String) playerTrack.metadata().get("is_advertisement")).booleanValue();
    }
}
