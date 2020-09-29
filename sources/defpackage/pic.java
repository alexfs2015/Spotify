package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* renamed from: pic reason: default package */
public final class pic implements wig<RxEpisodeDataLoader> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    private pic(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pic a(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        return new pic(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new RxEpisodeDataLoader((RxResolver) this.a.get(), (rwl) this.b.get());
    }
}
