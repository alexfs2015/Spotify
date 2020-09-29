package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.browser.RootListType;

/* renamed from: qpv reason: default package */
public final class qpv implements rti {
    private static final ImmutableSet<Long> a = ImmutableSet.a(Long.valueOf(4), Long.valueOf(2), Long.valueOf(1), Long.valueOf(1024), Long.valueOf(2048), Long.valueOf(32), Long.valueOf(16), Long.valueOf(4096), Long.valueOf(256), Long.valueOf(262144), Long.valueOf(8192), Long.valueOf(131072), Long.valueOf(2097152), Long.valueOf(128));
    private static final run b = new rud(true, true, true);
    private final Context c;
    private final qqf d;
    private final qqp e;
    private final gbd f;

    public final String a() {
        return "spotify_media_browser_root_empty";
    }

    public qpv(Context context, gbd gbd, qqf qqf, qqp qqp) {
        this.c = context;
        this.f = gbd;
        this.d = qqf;
        this.e = qqp;
    }

    public final boolean a(String str) {
        return this.e.a.keySet().contains(str);
    }

    public final rtm a(String str, hne hne, RootListType rootListType) {
        qqo qqo = (qqo) this.e.a.get(str);
        if (qqo != null) {
            hop a2 = hne.a(qqo.a());
            hop hop = a2;
            hne hne2 = hne;
            qpk qpk = new qpk(hop, hne2, this.f, new htw(), this.d);
            qpz qpz = new qpz(rtg.a(str, "spotify_media_browser_root_empty"), str, this.c, hne, a2, qpk, b, a, this.d);
            return qpz;
        }
        throw new IllegalArgumentException(String.format("Can not handle assistant %s", new Object[]{str}));
    }
}
