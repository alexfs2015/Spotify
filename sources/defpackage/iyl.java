package defpackage;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.Flowable;

/* renamed from: iyl reason: default package */
public final class iyl implements wig<Flowable<NowPlayingMode>> {
    private final wzi<ode> a;

    public static Flowable<NowPlayingMode> a(ode ode) {
        return (Flowable) wil.a(ode.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ode) this.a.get());
    }
}
