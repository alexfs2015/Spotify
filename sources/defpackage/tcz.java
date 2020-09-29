package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.Flowable;

/* renamed from: tcz reason: default package */
public final class tcz implements wig<Flowable<ImmutableList<NowPlayingWidget>>> {
    private final wzi<tco> a;

    public static Flowable<ImmutableList<NowPlayingWidget>> a(tco tco) {
        return (Flowable) wil.a(CC.a(tco), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tco) this.a.get());
    }
}
