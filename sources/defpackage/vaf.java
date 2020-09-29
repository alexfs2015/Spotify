package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.trendingsearch.TrendingSearchLogger;
import com.spotify.music.trendingsearch.TrendingSearchLogger.InteractionType;
import com.spotify.music.trendingsearch.TrendingSearchLogger.UserIntent;
import java.util.EnumSet;

/* renamed from: vaf reason: default package */
public final class vaf extends defpackage.rnx.a<a> {
    private final TrendingSearchLogger a;

    /* renamed from: vaf$a */
    static class a extends defpackage.gwi.c.a<LinearLayout> {
        final RecyclerView b;
        private final gwt c;

        protected a(LinearLayout linearLayout, gwm gwm, final TrendingSearchLogger trendingSearchLogger) {
            super(linearLayout);
            this.b = (RecyclerView) linearLayout.findViewById(R.id.staggered_view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 0);
            staggeredGridLayoutManager.a(2);
            staggeredGridLayoutManager.p = false;
            this.c = new gwt(gwm);
            this.b.a((i) staggeredGridLayoutManager);
            this.b.a((androidx.recyclerview.widget.RecyclerView.a) this.c, false);
            this.b.a((m) new m() {
                public final void a(RecyclerView recyclerView, int i) {
                    super.a(recyclerView, i);
                    if (i == 1) {
                        TrendingSearchLogger trendingSearchLogger = trendingSearchLogger;
                        InteractionType interactionType = InteractionType.SWIPE;
                        UserIntent userIntent = UserIntent.SWIPE_SCROLLING_VIEW;
                        jlr jlr = trendingSearchLogger.c;
                        String a2 = trendingSearchLogger.d.a();
                        String sso = trendingSearchLogger.e.toString();
                        String str = interactionType.mType;
                        String str2 = userIntent.mIntent;
                        bg bgVar = r5;
                        bg bgVar2 = new bg(null, a2, sso, "mo-trending-searches-source", 0, "", str, str2, (double) trendingSearchLogger.f.a());
                        jlr.a(bgVar);
                        a.this.b.b((m) this);
                    }
                }
            });
            trendingSearchLogger.a(this.b);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.b, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.c.a(hcm.children());
            this.c.e();
        }
    }

    public vaf(TrendingSearchLogger trendingSearchLogger) {
        this.a = (TrendingSearchLogger) fbp.a(trendingSearchLogger);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final int b() {
        return R.id.hub_trending_search_scrolling_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trending_searches_scrolling_view, viewGroup, false), gwm, this.a);
    }
}
