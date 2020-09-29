package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.Overridable;
import com.spotify.music.features.trendingsearch.util.TrendingSearchesBehaviorFlag;

/* renamed from: qoj reason: default package */
public final class qoj extends hju {
    public static final fpr<TrendingSearchesBehaviorFlag> a;
    public static final fqa[] b = {c, d, e};
    private static fqa c = hjp.b("ab-trending-search-rollout-1", Overridable.ALWAYS);
    private static fqa d = hjp.b("ab-trending-search-rollout-2", Overridable.ALWAYS);
    private static fqa e = hjp.b("ab-trending-search-rollout-3", Overridable.ALWAYS);

    static {
        fpr<TrendingSearchesBehaviorFlag> a2 = hjp.a("ab-trending-search-click-behavior-test-1", TrendingSearchesBehaviorFlag.class, TrendingSearchesBehaviorFlag.CONTROL, Overridable.ALWAYS);
        a = a2;
        ImmutableList.a(a2);
    }
}
