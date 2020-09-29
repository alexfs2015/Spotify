package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.Overridable;
import com.spotify.music.features.trendingsearch.util.TrendingSearchesBehaviorFlag;

/* renamed from: qws reason: default package */
public final class qws extends hmm {
    public static final fql<TrendingSearchesBehaviorFlag> a;
    public static final fqu[] b = {c, d, e};
    private static fqu c = hmh.b("ab-trending-search-rollout-1", Overridable.ALWAYS);
    private static fqu d = hmh.b("ab-trending-search-rollout-2", Overridable.ALWAYS);
    private static fqu e = hmh.b("ab-trending-search-rollout-3", Overridable.ALWAYS);

    static {
        fql<TrendingSearchesBehaviorFlag> a2 = hmh.a("ab-trending-search-click-behavior-test-1", TrendingSearchesBehaviorFlag.class, TrendingSearchesBehaviorFlag.CONTROL, Overridable.ALWAYS);
        a = a2;
        ImmutableList.a(a2);
    }
}
