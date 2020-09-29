package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;

/* renamed from: tww reason: default package */
public final class tww {
    private final Flowable<PlayerState> a;

    public tww(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    /* access modifiers changed from: private */
    public static twv a(PlayerState playerState) {
        return new twg(playerState.contextUri());
    }

    public final xii<twv> a() {
        return wit.a((ObservableSource<T>) this.a.j(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$tww$zc7HaRaWU70318GT5PZmquLJLWQ.INSTANCE).b();
    }
}
