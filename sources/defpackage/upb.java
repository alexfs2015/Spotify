package defpackage;

import com.spotify.music.trendingsearch.TrendingSearchLogger;

/* renamed from: upb reason: default package */
public final class upb implements vua<upa> {
    private final wlc<TrendingSearchLogger> a;

    private upb(wlc<TrendingSearchLogger> wlc) {
        this.a = wlc;
    }

    public static upb a(wlc<TrendingSearchLogger> wlc) {
        return new upb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new upa((TrendingSearchLogger) this.a.get());
    }
}
