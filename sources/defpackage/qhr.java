package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: qhr reason: default package */
public final class qhr implements ujm {
    public static final b<Object, String> a = b.a("com.spotify.music.spotlets.tracker.adjust.adjustUri");
    public final SpSharedPreferences<Object> b;

    public qhr(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public final void a(Uri uri) {
        String uri2 = uri.toString();
        if (!fax.a(uri2) && jst.h(uri2) && uri2.contains("adjust_no_sdkclick=1") && uri2.contains("utm_medium=paidsocial")) {
            this.b.a().a(a, uri2).b();
        }
    }

    public String a() {
        return this.b.b(a, "");
    }
}
