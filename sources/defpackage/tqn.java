package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: tqn reason: default package */
public final class tqn implements jnc<Integer> {
    private final SpeedControlInteractor b;

    public tqn(SpeedControlInteractor speedControlInteractor) {
        this.b = speedControlInteractor;
    }

    public final wud<joc<Integer>> load(RxResolver rxResolver, joc<Integer> joc) {
        return vun.a((ObservableSource<T>) this.b.a.a(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED, Integer.class), BackpressureStrategy.BUFFER).f(new $$Lambda$tqn$H5zojy7ZGGnAxLnOFOuSfpjBpus(joc));
    }
}
