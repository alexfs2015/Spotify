package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: qyk reason: default package */
public final class qyk implements scp {
    private static final ImmutableSet<Long> b = ImmutableSet.a(Long.valueOf(8192), Long.valueOf(131072), Long.valueOf(2097152), Long.valueOf(128));
    private static final sdx c = new sdp(true, true, true);
    private final Context d;
    private final qyu e;
    private final qze f;
    private final gcb g;
    private final scu h;
    private final jty i;

    public qyk(Context context, gcb gcb, qyu qyu, qze qze, scu scu, jty jty) {
        this.d = context;
        this.g = gcb;
        this.e = qyu;
        this.f = qze;
        this.h = scu;
        this.i = jty;
    }

    public final String a() {
        return "spotify_media_browser_root_empty";
    }

    public final scw a(String str, hpt hpt, String str2) {
        String str3 = str;
        hpt hpt2 = hpt;
        qzd qzd = (qzd) this.f.a.get(str3);
        if (qzd != null) {
            hqr a = hpt2.a(qzd.a());
            hqr hqr = a;
            hpt hpt3 = hpt;
            qya qya = new qya(hqr, hpt3, this.g, new hwi(), this.e, this.i);
            qyo qyo = new qyo(scn.a(str3, "spotify_media_browser_root_empty"), str, this.d, hpt, a, qya, c, b(), this.e, this.h.a(a.d(), hpt2, str3));
            return qyo;
        }
        throw new IllegalArgumentException(String.format("Can not handle assistant %s", new Object[]{str3}));
    }

    public final boolean a(String str) {
        return this.f.a.keySet().contains(str);
    }

    public final Set<Long> b() {
        return ImmutableSet.j().a((Iterable<? extends E>) CC.$default$b(this)).a((Iterable<? extends E>) b).a();
    }
}
