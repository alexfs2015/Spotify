package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: par reason: default package */
public final class par {
    private final RxEpisodeDataLoader a;
    private final pak b;
    private final pcq c;
    private final hez<paq> d;

    public par(RxEpisodeDataLoader rxEpisodeDataLoader, pak pak, pcq pcq, hez<paq> hez) {
        this.a = rxEpisodeDataLoader;
        this.b = pak;
        this.c = pcq;
        this.d = hez;
    }

    public final wud<paq> a(String str) {
        return wud.a(this.a.a(str), wuh.a(this.b.a(str)).c(new b()).h(new $$Lambda$par$yHlSpXRufj7hL6IKAgdRcazYW7A(str)), vun.a((ObservableSource<T>) this.c.fetch(str), BackpressureStrategy.BUFFER).c(new b()).h(new $$Lambda$par$jAHpHvy1VlAe9gBZF6_ME6OA1zc(str)), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$par$ZQskNfOPik08jDaew6R8_oic7mk.INSTANCE).b().a((c<? super T, ? extends R>) this.d);
    }

    /* access modifiers changed from: private */
    public static paq a(paq paq, pan pan, pcw pcw) {
        return paq instanceof c ? paq.a(((c) paq).a, (Optional) pan.a($$Lambda$par$dgG_gAL14mvrGRqHHHVahAGfY9I.INSTANCE, $$Lambda$par$kqP9GHuVvWoW6W9Zvs9VlmjUnM.INSTANCE, $$Lambda$par$UaENUoLkzak2EM7AHLiuRu7STio.INSTANCE), (Optional) pcw.a($$Lambda$par$SR6rjGuM0CCu5JVhA_OhxYbKUh0.INSTANCE, $$Lambda$par$rIKEPsV3STnPqhFviQ07ZwToebY.INSTANCE, $$Lambda$par$K4mRXSnOhUQOCrIhnl_MijZnpyM.INSTANCE)) : paq;
    }
}
