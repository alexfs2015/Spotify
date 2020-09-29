package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.browser.RootListType;

/* renamed from: lou reason: default package */
public final class lou implements rti {
    private final Context a;
    private final gbd b;
    private final lpb c;

    public final String a() {
        return "spotify_media_browser_root_android_auto";
    }

    public lou(Context context, gbd gbd, lpb lpb) {
        this.a = context;
        this.b = gbd;
        this.c = lpb;
    }

    public final boolean a(String str) {
        return ImmutableSet.d("com.google.android.projection.gearhead").contains(str);
    }

    public final rtm a(String str, hne hne, RootListType rootListType) {
        String str2 = str;
        hne hne2 = hne;
        hop a2 = hne2.a(new a("AndroidAuto").a(str2).b("bluetooth_or_usb").c("car").a());
        loz loz = new loz(a2, hne2, this.b, new htw());
        rud rud = new rud(true, true, true);
        String a3 = rtg.a(str2, "spotify_media_browser_root_android_auto");
        Context context = this.a;
        ImmutableSet a4 = ImmutableSet.a(Long.valueOf(4), Long.valueOf(2), Long.valueOf(1), Long.valueOf(1024), Long.valueOf(2048), Long.valueOf(32), Long.valueOf(16), Long.valueOf(4096), Long.valueOf(256), Long.valueOf(262144));
        lpb lpb = this.c;
        lpa lpa = new lpa((String) lpb.a(a2.d(), 1), (hne) lpb.a(hne2, 2), (String) lpb.a(str2, 3), (Context) lpb.a(lpb.a.get(), 4), (hec) lpb.a(lpb.b.get(), 5), (wug) lpb.a(lpb.c.get(), 6), (wug) lpb.a(lpb.d.get(), 7), (hrp) lpb.a(lpb.e.get(), 8));
        lov lov = new lov(a3, str2, context, hne2, a2, loz, rud, a4, lpa);
        return lov;
    }
}
