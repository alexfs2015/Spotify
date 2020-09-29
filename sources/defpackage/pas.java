package defpackage;

import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* renamed from: pas reason: default package */
public final class pas implements vua<par> {
    private final wlc<RxEpisodeDataLoader> a;
    private final wlc<pak> b;
    private final wlc<pcq> c;
    private final wlc<hez<paq>> d;

    private pas(wlc<RxEpisodeDataLoader> wlc, wlc<pak> wlc2, wlc<pcq> wlc3, wlc<hez<paq>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pas a(wlc<RxEpisodeDataLoader> wlc, wlc<pak> wlc2, wlc<pcq> wlc3, wlc<hez<paq>> wlc4) {
        return new pas(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new par((RxEpisodeDataLoader) this.a.get(), (pak) this.b.get(), (pcq) this.c.get(), (hez) this.d.get());
    }
}
