package defpackage;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.Flowable;

/* renamed from: iwa reason: default package */
public final class iwa implements vua<Flowable<NowPlayingMode>> {
    private final wlc<nwr> a;

    public static Flowable<NowPlayingMode> a(nwr nwr) {
        return (Flowable) vuf.a(nwr.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((nwr) this.a.get());
    }
}
