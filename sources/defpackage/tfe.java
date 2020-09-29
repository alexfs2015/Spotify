package defpackage;

import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendations;
import io.reactivex.Single;

/* renamed from: tfe reason: default package */
interface tfe {
    @xhn(a = "pivot-recs/v1/recommendations")
    Single<PivotRecommendations> a(@xib(a = "targets") String str, @xib(a = "limit") int i);
}
