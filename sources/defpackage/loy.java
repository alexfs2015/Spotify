package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.browser.RootListType;

/* renamed from: loy reason: default package */
public final class loy implements rti {
    private final Context a;
    private final gbd b;

    public final String a() {
        return "spotify_media_browser_root";
    }

    public loy(Context context, gbd gbd) {
        this.a = context;
        this.b = gbd;
    }

    public final boolean a(String str) {
        return ImmutableSet.a("de.audi.aed.mediacenter", "com.carconnectivity.mlmediaplayer", "com.volvocars.launcher").contains(str);
    }

    public final rtm a(String str, hne hne, RootListType rootListType) {
        String str2 = str;
        hne hne2 = hne;
        hop a2 = hne2.a(new a("AndroidOther").a(str2).c("unknown").a());
        loz loz = new loz(a2, hne2, this.b, new htw());
        rud rud = new rud(true, true, true);
        rtf rtf = new rtf(rtg.a(str2, "spotify_media_browser_root"), str2, this.a, hne2, a2, loz, rud, ImmutableSet.a(Long.valueOf(4), Long.valueOf(2), Long.valueOf(1), Long.valueOf(1024), Long.valueOf(2048), Long.valueOf(32), Long.valueOf(16), Long.valueOf(4096), Long.valueOf(256), Long.valueOf(262144)), rootListType);
        return rtf;
    }
}
