package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;

/* renamed from: tle reason: default package */
public final class tle {
    private final Flowable<PlayerState> a;

    public tle(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    public final wud<tld> a() {
        return vun.a((ObservableSource<T>) this.a.j(), BackpressureStrategy.BUFFER).f($$Lambda$tle$s0sNf1UFYef0eCeg0VeLToyQ1nw.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public static tld a(PlayerState playerState) {
        return new tko(playerState.contextUri());
    }
}
