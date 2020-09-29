package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: tcq reason: default package */
public final class tcq implements vua<Flowable<OrientationMode>> {
    private final wlc<Boolean> a;

    private tcq(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static tcq a(wlc<Boolean> wlc) {
        return new tcq(wlc);
    }

    public final /* synthetic */ Object get() {
        OrientationMode orientationMode;
        if (((Boolean) this.a.get()).booleanValue()) {
            orientationMode = OrientationMode.UNSPECIFIED;
        } else {
            orientationMode = OrientationMode.PORTRAIT_ONLY;
        }
        return (Flowable) vuf.a(Flowable.b(orientationMode), "Cannot return null from a non-@Nullable @Provides method");
    }
}
