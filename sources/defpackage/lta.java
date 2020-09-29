package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: lta reason: default package */
public final class lta implements scp {
    private final Context b;
    private final gcb c;
    private final scu d;
    private final jty e;

    public lta(Context context, gcb gcb, scu scu, jty jty) {
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
        hqr a = hpt2.a(new a("AndroidWear").a(str3).b("bluetooth_or_usb").c("wearable").a());
        hqr hqr = a;
        hpt hpt3 = hpt;
        scq scq = new scq(hqr, hpt3, this.c, this.e, new hwi());
        sdp sdp = new sdp(false, false, true);
        scm scm = new scm(scn.a(str3, "spotify_media_browser_root"), str3, this.b, hpt, a, scq, sdp, b(), str2, this.d.a(a.d(), hpt2, str3));
        return scm;
    }

    public final boolean a(String str) {
        return ImmutableSet.d("com.google.android.wearable.app").contains(str);
    }

    public /* synthetic */ Set<Long> b() {
        return CC.$default$b(this);
    }
}
