package defpackage;

import com.spotify.music.trendingsearch.TrendingSearchLogger;

/* renamed from: vag reason: default package */
public final class vag implements wig<vaf> {
    private final wzi<TrendingSearchLogger> a;

    private vag(wzi<TrendingSearchLogger> wzi) {
        this.a = wzi;
    }

    public static vag a(wzi<TrendingSearchLogger> wzi) {
        return new vag(wzi);
    }

    public final /* synthetic */ Object get() {
        return new vaf((TrendingSearchLogger) this.a.get());
    }
}
