package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: qqf reason: default package */
public final class qqf implements uux {
    public static final b<Object, String> a = b.a("com.spotify.music.spotlets.tracker.adjust.adjustUri");
    public final SpSharedPreferences<Object> b;

    public qqf(SpSharedPreferences<Object> spSharedPreferences) {
        this.b = spSharedPreferences;
    }

    public String a() {
        return this.b.b(a, "");
    }

    public final void a(Uri uri) {
        String uri2 = uri.toString();
        if (!fbo.a(uri2) && jva.h(uri2) && uri2.contains("adjust_no_sdkclick=1") && uri2.contains("utm_medium=paidsocial")) {
            this.b.a().a(a, uri2).b();
        }
    }
}
