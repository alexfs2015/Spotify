package com.spotify.music.trendingsearch;

import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

public final class TrendingSearchLogger extends iqs {
    public final jjf c;
    public final udr d;
    public final sih e;
    public final jrp f;
    private final rfg g;

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

    public TrendingSearchLogger(jjf jjf, udr udr, sih sih, jrp jrp, rfg rfg) {
        super(R.id.hub_trending_search);
        this.c = jjf;
        this.d = udr;
        this.e = sih;
        this.f = jrp;
        this.g = rfg;
    }

    public final void a(int i, u uVar) {
        gzq a = rfg.a(uVar);
        String string = a.string("ui:uri");
        String string2 = a.string("ui:group");
        String string3 = a.string("ui:source");
        ImpressionType impressionType = ImpressionType.ITEM;
        RenderType renderType = RenderType.LIST;
        jjf jjf = this.c;
        bf bfVar = r3;
        bf bfVar2 = new bf(string3, this.d.a(), this.e.toString(), string2, (long) i, string, impressionType.toString(), renderType.toString(), (double) this.f.a());
        jjf.a(bfVar);
    }
}
