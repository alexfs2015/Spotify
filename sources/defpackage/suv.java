package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendation;
import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendations;
import io.reactivex.Single;

/* renamed from: suv reason: default package */
public final class suv {
    private final sux a;

    public suv(sux sux) {
        this.a = sux;
    }

    public final Single<ImmutableList<suu>> a(ImmutableList<String> immutableList) {
        return this.a.a(fau.a(",").a((Iterable<?>) immutableList), 3).a(2).f($$Lambda$suv$4zGYLWmoR5RfNgTb6AqFXa1vtjo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ImmutableList<suu> a(PivotRecommendations pivotRecommendations) {
        a g = ImmutableList.g();
        for (PivotRecommendation pivotRecommendation : pivotRecommendations.getPivots()) {
            g.c(new a().d(pivotRecommendation.getUri()).b(pivotRecommendation.getSubtitle()).a(pivotRecommendation.getTitle()).c(pivotRecommendation.getImageUri()).a());
        }
        return g.a();
    }
}
