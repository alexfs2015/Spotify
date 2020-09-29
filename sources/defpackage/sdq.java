package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: sdq reason: default package */
public final class sdq implements scp {
    private final Context b;
    private final gcb c;
    private final scu d;
    private final jty e;

    public sdq(Context context, gcb gcb, scu scu, jty jty) {
        this.b = context;
        this.c = gcb;
        this.d = scu;
        this.e = jty;
    }

    public final String a() {
        return "generic_root";
    }

    public final scw a(String str, hpt hpt, String str2) {
        String str3 = str;
        hpt hpt2 = hpt;
        String a = scn.a(str3, "generic_root");
        hqr a2 = hpt2.a(new a("AndroidOther").a(str3).b("android_media_session").c("app").a());
        hqr hqr = a2;
        hpt hpt3 = hpt;
        scq scq = new scq(hqr, hpt3, this.c, this.e, new hwi());
        sdp sdp = new sdp(true, true, true);
        scm scm = new scm(a, str3, this.b, hpt, a2, scq, sdp, b(), str2, this.d.a(a2.d(), hpt2, str3));
        return scm;
    }

    public final boolean a(String str) {
        return Collections.singleton("com.spotify.mbscontroller").contains(str);
    }

    public /* synthetic */ Set<Long> b() {
        return CC.$default$b(this);
    }
}
