package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: sds reason: default package */
public final class sds implements scp {
    private static final ImmutableSet<String> b = ImmutableSet.a("com.samsung.android.app.spage", "com.sec.android.app.clockpackage", "com.samsung.android.app.galaxyfinder", "com.samsung.android.app.routines");
    private final Context c;
    private final gcb d;
    private final scu e;
    private final jty f;

    public sds(Context context, gcb gcb, scu scu, jty jty) {
        this.c = context;
        this.d = gcb;
        this.e = scu;
        this.f = jty;
    }

    public final String a() {
        return "spotify_media_browser_root_samsung";
    }

    public final scw a(String str, hpt hpt, String str2) {
        String str3 = str;
        hpt hpt2 = hpt;
        String a = scn.a(str3, "spotify_media_browser_root_samsung");
        hqr a2 = hpt2.a(new a("AndroidOther").a(str3).b("android_media_session").c("app").a());
        hqr hqr = a2;
        hpt hpt3 = hpt;
        scq scq = new scq(hqr, hpt3, this.d, this.f, new hwi());
        sdp sdp = new sdp(true, true, true);
        scm scm = new scm(a, str3, this.c, hpt, a2, scq, sdp, b(), str2, this.e.a(a2.d(), hpt2, str3));
        return scm;
    }

    public final boolean a(String str) {
        return b.contains(str);
    }

    public /* synthetic */ Set<Long> b() {
        return CC.$default$b(this);
    }
}
