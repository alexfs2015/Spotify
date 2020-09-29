package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: lsy reason: default package */
public final class lsy implements scp {
    private final Context b;
    private final gcb c;
    private final scu d;
    private final jty e;

    public lsy(Context context, gcb gcb, scu scu, jty jty) {
        this.b = context;
        this.c = gcb;
        this.d = scu;
        this.e = jty;
    }

    public final String a() {
        return "spotify_media_browser_root";
    }

    public final scw a(String str, hpt hpt, String str2) {
        String str3 = str;
        hpt hpt2 = hpt;
        hqr a = hpt2.a(new a("AndroidOther").a(str3).c("unknown").a());
        hqr hqr = a;
        hpt hpt3 = hpt;
        lsz lsz = new lsz(hqr, hpt3, this.c, new hwi(), this.e);
        sdp sdp = new sdp(true, true, true);
        scm scm = new scm(scn.a(str3, "spotify_media_browser_root"), str3, this.b, hpt, a, lsz, sdp, b(), str2, this.d.a(a.d(), hpt2, str3));
        return scm;
    }

    public final boolean a(String str) {
        return ImmutableSet.a("de.audi.aed.mediacenter", "com.carconnectivity.mlmediaplayer", "com.volvocars.launcher").contains(str);
    }

    public /* synthetic */ Set<Long> b() {
        return CC.$default$b(this);
    }
}
