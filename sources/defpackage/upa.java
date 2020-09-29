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

/* renamed from: upa reason: default package */
public final class upa extends defpackage.rev.a<a> {
    private final TrendingSearchLogger a;

    /* renamed from: upa$a */
    static class a extends defpackage.gui.c.a<LinearLayout> {
        final RecyclerView b;
        private final gut c;

        protected a(LinearLayout linearLayout, gum gum, final TrendingSearchLogger trendingSearchLogger) {
            super(linearLayout);
            this.b = (RecyclerView) linearLayout.findViewById(R.id.staggered_view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 0);
            staggeredGridLayoutManager.a(2);
            staggeredGridLayoutManager.o = false;
            this.c = new gut(gum);
            this.b.a((i) staggeredGridLayoutManager);
            this.b.a((androidx.recyclerview.widget.RecyclerView.a) this.c, false);
            this.b.a((m) new m() {
                public final void a(RecyclerView recyclerView, int i) {
                    super.a(recyclerView, i);
                    if (i == 1) {
                        TrendingSearchLogger trendingSearchLogger = trendingSearchLogger;
                        InteractionType interactionType = InteractionType.SWIPE;
                        UserIntent userIntent = UserIntent.SWIPE_SCROLLING_VIEW;
                        jjf jjf = trendingSearchLogger.c;
                        String a2 = trendingSearchLogger.d.a();
                        String sih = trendingSearchLogger.e.toString();
                        String str = interactionType.mType;
                        String str2 = userIntent.mIntent;
                        bh bhVar = r5;
                        bh bhVar2 = new bh(null, a2, sih, "mo-trending-searches-source", 0, "", str, str2, (double) trendingSearchLogger.f.a());
                        jjf.a(bhVar);
                        a.this.b.b((m) this);
                    }
                }
            });
            trendingSearchLogger.a(this.b);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.c.a(gzt.children());
            this.c.e();
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.b, aVar, iArr);
        }
    }

    public final int b() {
        return R.id.hub_trending_search_scrolling_component;
    }

    public upa(TrendingSearchLogger trendingSearchLogger) {
        this.a = (TrendingSearchLogger) fay.a(trendingSearchLogger);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE, Trait.SPACED_VERTICALLY);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trending_searches_scrolling_view, viewGroup, false), gum, this.a);
    }
}
