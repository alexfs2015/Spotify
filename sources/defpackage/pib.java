package defpackage;

import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* renamed from: pib reason: default package */
public final class pib implements wig<pia> {
    private final wzi<RxEpisodeDataLoader> a;
    private final wzi<pht> b;
    private final wzi<pkc> c;
    private final wzi<hhv<phz>> d;

    private pib(wzi<RxEpisodeDataLoader> wzi, wzi<pht> wzi2, wzi<pkc> wzi3, wzi<hhv<phz>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pib a(wzi<RxEpisodeDataLoader> wzi, wzi<pht> wzi2, wzi<pkc> wzi3, wzi<hhv<phz>> wzi4) {
        return new pib(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pia((RxEpisodeDataLoader) this.a.get(), (pht) this.b.get(), (pkc) this.c.get(), (hhv) this.d.get());
    }
}
