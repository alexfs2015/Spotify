package defpackage;

import android.app.Activity;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: ltc reason: default package */
public final class ltc implements vua<gum> {
    private final wlc<Activity> a;
    private final wlc<a> b;
    private final wlc<gvv> c;
    private final wlc<Map<String, gvk>> d;
    private final wlc<gxz> e;
    private final wlc<lsu> f;

    private ltc(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4, wlc<gxz> wlc5, wlc<lsu> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ltc a(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4, wlc<gxz> wlc5, wlc<lsu> wlc6) {
        ltc ltc = new ltc(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ltc;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.c.get()).a((Activity) this.a.get(), (a) this.b.get()).a((gxz) this.e.get()).a((Map) this.d.get()).a.a(R.id.hubs_assisted_curation_track, "ac:track", (lsu) this.f.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
