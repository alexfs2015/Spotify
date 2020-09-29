package defpackage;

import com.spotify.music.newplaying.scroll.widgets.pivots.datasource.PivotRecommendations;
import io.reactivex.Single;

/* renamed from: sux reason: default package */
interface sux {
    @wti(a = "pivot-recs/v1/recommendations")
    Single<PivotRecommendations> a(@wtw(a = "targets") String str, @wtw(a = "limit") int i);
}
