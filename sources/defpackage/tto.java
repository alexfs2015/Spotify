package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;

/* renamed from: tto reason: default package */
public final class tto {
    public static Observable<PlayerTrack> a(Flowable<PlayerState> flowable, String str) {
        return flowable.j().a((Predicate<? super T>) new $$Lambda$tto$Acuq8JLnwHAGxYACg1_i9MooOH8<Object>(str)).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a((Predicate<? super T>) $$Lambda$tto$r3iJ3yxNiupoayxJ7rN3IRloVFg.INSTANCE).c(1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerTrack playerTrack) {
        return playerTrack != null && !Boolean.valueOf((String) playerTrack.metadata().get("is_advertisement")).booleanValue();
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
}
