package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: lsu reason: default package */
public final class lsu implements scp {
    private final Context b;
    private final gcb c;
    private final scu d;
    private final jty e;

    public lsu(Context context, gcb gcb, scu scu, jty jty) {
        this.b = context;
        this.c = gcb;
        this.d = scu;
        this.e = jty;
    }

    public final String a() {
        return "spotify_media_browser_root_android_auto";
    }

    public final scw a(String str, hpt hpt, String str2) {
        hqr a = hpt.a(new a("AndroidAuto").a(str).b("bluetooth_or_usb").c("car").a());
        hqr hqr = a;
        hpt hpt2 = hpt;
        lsz lsz = new lsz(hqr, hpt2, this.c, new hwi(), this.e);
        sdp sdp = new sdp(true, true, true);
        lsv lsv = new lsv(scn.a(str, "spotify_media_browser_root_android_auto"), str, this.b, hpt, a, lsz, sdp, b(), this.d.a(a.d(), hpt, str));
        return lsv;
    }

    public final boolean a(String str) {
        return ImmutableSet.d("com.google.android.projection.gearhead").contains(str);
    }

    public /* synthetic */ Set<Long> b() {
        return CC.$default$b(this);
    }
}
