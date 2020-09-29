package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: lxh reason: default package */
public final class lxh implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Map<String, gxk>> c;
    private final wzi<hbe> d;
    private final wzi<gxw> e;
    private final wzi<lwt> f;

    private lxh(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<hbe> wzi4, wzi<gxw> wzi5, wzi<lwt> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static lxh a(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<hbe> wzi4, wzi<gxw> wzi5, wzi<lwt> wzi6) {
        lxh lxh = new lxh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return lxh;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.e.get()).a((Context) this.a.get(), (a) this.b.get()).a(has.a).a((Map) this.c.get()).a((hbe) this.d.get()).a(R.id.hub_glue_background, new qfi()).a(R.id.hub_clear_search_history_component, "search:clearSearchHistory", new qfh()).a(R.id.hubs_assisted_curation_track, "ac:track", (lwt) this.f.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
