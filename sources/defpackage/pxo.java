package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: pxo reason: default package */
public final class pxo implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<Map<String, gvk>> c;
    private final wlc<gvv> d;
    private final wlc<gyl> e;
    private final wlc<uoy> f;
    private final wlc<upa> g;

    private pxo(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5, wlc<uoy> wlc6, wlc<upa> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static pxo a(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5, wlc<uoy> wlc6, wlc<upa> wlc7) {
        pxo pxo = new pxo(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return pxo;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.d.get()).a((Context) this.a.get(), (a) this.b.get()).a(gxz.a).a((Map) this.c.get()).a((gyl) this.e.get()).a(R.id.hub_glue_background, new pwm()).a(R.id.hub_quac_suggestion_row, "search:autocompleteSuggestionRow", new pwn()).a(R.id.hub_clear_search_history_component, "search:clearSearchHistory", new pwl()).a(R.id.hub_trending_search_scrolling_component, "trendingSearch:scrollingComponent", (upa) this.g.get()).a(R.id.hub_trending_search_pill_component, "trendingSearch:pillComponent", (uoy) this.f.get()).a(R.id.shimmering_state, "search:shimmeringProgress", new qcn()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
