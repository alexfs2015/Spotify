package defpackage;

import android.app.Activity;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: lxb reason: default package */
public final class lxb implements wig<gwm> {
    private final wzi<Activity> a;
    private final wzi<a> b;
    private final wzi<gxw> c;
    private final wzi<Map<String, gxk>> d;
    private final wzi<has> e;
    private final wzi<lwt> f;

    private lxb(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4, wzi<has> wzi5, wzi<lwt> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static lxb a(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4, wzi<has> wzi5, wzi<lwt> wzi6) {
        lxb lxb = new lxb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return lxb;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.c.get()).a((Activity) this.a.get(), (a) this.b.get()).a((has) this.e.get()).a((Map) this.d.get()).a.a(R.id.hubs_assisted_curation_track, "ac:track", (lwt) this.f.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
