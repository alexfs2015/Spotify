package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: thf reason: default package */
public final class thf implements vua<Flowable<OrientationMode>> {
    private final wlc<Flowable<Boolean>> a;

    private thf(wlc<Flowable<Boolean>> wlc) {
        this.a = wlc;
    }

    public static thf a(wlc<Flowable<Boolean>> wlc) {
        return new thf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
