package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.browser.RootListType;

/* renamed from: ruf reason: default package */
public final class ruf implements rti {
    private static final ImmutableSet<String> a = ImmutableSet.a("com.samsung.android.app.spage", "com.sec.android.app.clockpackage", "com.samsung.android.app.galaxyfinder", "com.samsung.android.app.routines", "com.spotify.mbscontroller");
    private static final ImmutableSet<Long> b = ImmutableSet.a(Long.valueOf(4), Long.valueOf(2), Long.valueOf(1), Long.valueOf(1024), Long.valueOf(2048), Long.valueOf(32), Long.valueOf(16), Long.valueOf(4096), Long.valueOf(256), Long.valueOf(262144));
    private final Context c;
    private final gbd d;

    public final String a() {
        return "spotify_media_browser_root";
    }

    public ruf(Context context, gbd gbd) {
        this.c = context;
        this.d = gbd;
    }

    public final rtm a(String str, hne hne, RootListType rootListType) {
        String a2 = rtg.a(str, "spotify_media_browser_root");
        hop a3 = hne.a(new a("AndroidOther").a(str).b("android_media_session").c("app").a());
        String str2 = str;
        hne hne2 = hne;
        rtf rtf = new rtf(a2, str2, this.c, hne2, a3, new rtj(a3, hne, this.d, new htw()), new rud(true, true, true), b, rootListType);
        return rtf;
    }

    public final boolean a(String str) {
        return a.contains(str);
    }
}
