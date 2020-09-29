package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: lti reason: default package */
public final class lti implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<Map<String, gvk>> c;
    private final wlc<gyl> d;
    private final wlc<gvv> e;
    private final wlc<lsu> f;

    private lti(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gyl> wlc4, wlc<gvv> wlc5, wlc<lsu> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static lti a(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gyl> wlc4, wlc<gvv> wlc5, wlc<lsu> wlc6) {
        lti lti = new lti(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return lti;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.e.get()).a((Context) this.a.get(), (a) this.b.get()).a(gxz.a).a((Map) this.c.get()).a((gyl) this.d.get()).a(R.id.hub_glue_background, new pwm()).a(R.id.hub_clear_search_history_component, "search:clearSearchHistory", new pwl()).a(R.id.hubs_assisted_curation_track, "ac:track", (lsu) this.f.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
