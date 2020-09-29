package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* renamed from: pat reason: default package */
public final class pat implements vua<RxEpisodeDataLoader> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    private pat(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pat a(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        return new pat(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new RxEpisodeDataLoader((RxResolver) this.a.get(), (rnf) this.b.get());
    }
}
