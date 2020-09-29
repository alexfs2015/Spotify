package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendation;
import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendations;
import io.reactivex.Single;

/* renamed from: tfc reason: default package */
public final class tfc {
    private final tfe a;

    public tfc(tfe tfe) {
        this.a = tfe;
    }

    /* access modifiers changed from: private */
    public static ImmutableList<tfb> a(PivotRecommendations pivotRecommendations) {
        a g = ImmutableList.g();
        for (PivotRecommendation pivotRecommendation : pivotRecommendations.getPivots()) {
            g.c(new a().d(pivotRecommendation.getUri()).b(pivotRecommendation.getSubtitle()).a(pivotRecommendation.getTitle()).c(pivotRecommendation.getImageUri()).a());
        }
        return g.a();
    }

    public final Single<ImmutableList<tfb>> a(ImmutableList<String> immutableList) {
        return this.a.a(fbl.a(",").a((Iterable<?>) immutableList), 3).a(2).f($$Lambda$tfc$wsdiUItvCnMjK0BlS5gOuxNnnMM.INSTANCE);
    }
}
