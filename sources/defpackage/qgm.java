package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: qgm reason: default package */
public final class qgm implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Map<String, gxk>> c;
    private final wzi<gxw> d;
    private final wzi<hbe> e;
    private final wzi<vad> f;
    private final wzi<vaf> g;
    private final wzi<uju> h;
    private final wzi<ujw> i;
    private final wzi<ujy> j;

    private qgm(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<vad> wzi6, wzi<vaf> wzi7, wzi<uju> wzi8, wzi<ujw> wzi9, wzi<ujy> wzi10) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
    }

    public static qgm a(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<vad> wzi6, wzi<vaf> wzi7, wzi<uju> wzi8, wzi<ujw> wzi9, wzi<ujy> wzi10) {
        qgm qgm = new qgm(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return qgm;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.d.get()).a((Context) this.a.get(), (a) this.b.get()).a(has.a).a((Map) this.c.get()).a((hbe) this.e.get()).a(R.id.hub_glue_background, new qfi()).a(R.id.hub_quac_suggestion_row, "search:autocompleteSuggestionRow", new qfj()).a(R.id.hub_clear_search_history_component, "search:clearSearchHistory", new qfh()).a(R.id.hub_trending_search_scrolling_component, "trendingSearch:scrollingComponent", (vaf) this.g.get()).a(R.id.hub_trending_search_pill_component, "trendingSearch:pillComponent", (vad) this.f.get()).a(R.id.shimmering_state, "search:shimmeringProgress", new qlq()).a(R.id.search_podcast_episode_row, "search:podcastEpisodeRow", (uju) this.h.get()).a(R.id.search_podcast_episode_row_tag, "search:podcastTag", (ujy) this.j.get()).a(R.id.search_podcast_show_row, "search:podcastShowRow", (ujw) this.i.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
