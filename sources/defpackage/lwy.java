package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: lwy reason: default package */
public final class lwy implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<Map<String, gxk>> c;
    private final wzi<hbe> d;
    private final wzi<gxw> e;
    private final wzi<lwt> f;

    private lwy(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<hbe> wzi4, wzi<gxw> wzi5, wzi<lwt> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static lwy a(wzi<Context> wzi, wzi<a> wzi2, wzi<Map<String, gxk>> wzi3, wzi<hbe> wzi4, wzi<gxw> wzi5, wzi<lwt> wzi6) {
        lwy lwy = new lwy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return lwy;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.e.get()).a((Context) this.a.get(), (a) this.b.get()).a(has.a).a((Map) this.c.get()).a((hbe) this.d.get()).a(R.id.hubs_assisted_curation_track, "ac:track", (lwt) this.f.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
