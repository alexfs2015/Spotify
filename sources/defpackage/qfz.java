package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: qfz reason: default package */
public final class qfz implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Map<String, gxk>> c;
    private final wzi<gxw> d;
    private final wzi<hbe> e;
    private final wzi<uju> f;
    private final wzi<ujw> g;
    private final wzi<ujy> h;

    private qfz(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<uju> wzi6, wzi<ujw> wzi7, wzi<ujy> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static qfz a(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<gxw> wzi4, wzi<hbe> wzi5, wzi<uju> wzi6, wzi<ujw> wzi7, wzi<ujy> wzi8) {
        qfz qfz = new qfz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return qfz;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.d.get()).a((Context) this.a.get(), (a) this.b.get()).a(has.a).a((Map) this.c.get()).a((hbe) this.e.get()).a(R.id.search_podcast_episode_row, "search:podcastEpisodeRow", (uju) this.f.get()).a(R.id.search_podcast_episode_row_tag, "search:podcastTag", (ujy) this.h.get()).a(R.id.search_podcast_show_row, "search:podcastShowRow", (ujw) this.g.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
