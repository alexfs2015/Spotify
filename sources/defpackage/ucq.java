package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: ucq reason: default package */
public final class ucq implements jpo<Integer> {
    private final SpeedControlInteractor b;

    public ucq(SpeedControlInteractor speedControlInteractor) {
        this.b = speedControlInteractor;
    }

    public final xii<jqo<Integer>> load(RxResolver rxResolver, jqo<Integer> jqo) {
        return wit.a((ObservableSource<T>) this.b.a.a(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED, Integer.class), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$ucq$C3YDED7ZH02ROGxbHA5nuA5ju0M<Object,Object>(jqo));
    }
}
