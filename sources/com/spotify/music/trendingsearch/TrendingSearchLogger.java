package com.spotify.music.trendingsearch;

import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

public final class TrendingSearchLogger extends itf {
    public final jlr c;
    public final uqm d;
    public final sso e;
    public final jtz f;
    private final roi g;

    public enum InteractionType {
        SWIPE("swipe");
        
        public final String mType;

        private InteractionType(String str) {
            this.mType = str;
        }
    }

    public enum UserIntent {
        SWIPE_SCROLLING_VIEW("swipe-scrolling-view");
        
        public final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }
    }

    public TrendingSearchLogger(jlr jlr, uqm uqm, sso sso, jtz jtz, roi roi) {
        super(R.id.hub_trending_search);
        this.c = jlr;
        this.d = uqm;
        this.e = sso;
        this.f = jtz;
        this.g = roi;
    }

    public final void a(int i, u uVar) {
        hcj a = roi.a(uVar);
        String string = a.string("ui:uri");
        String string2 = a.string("ui:group");
        String string3 = a.string("ui:source");
        ImpressionType impressionType = ImpressionType.ITEM;
        RenderType renderType = RenderType.LIST;
        jlr jlr = this.c;
        be beVar = r3;
        be beVar2 = new be(string3, this.d.a(), this.e.toString(), string2, (long) i, string, impressionType.toString(), renderType.toString(), (double) this.f.a());
        jlr.a(beVar);
    }
}
