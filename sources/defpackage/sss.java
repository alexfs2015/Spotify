package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.Flowable;

/* renamed from: sss reason: default package */
public final class sss implements vua<Flowable<ImmutableList<NowPlayingWidget>>> {
    private final wlc<ssh> a;

    public static Flowable<ImmutableList<NowPlayingWidget>> a(ssh ssh) {
        return (Flowable) vuf.a(CC.a(ssh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ssh) this.a.get());
    }
}
