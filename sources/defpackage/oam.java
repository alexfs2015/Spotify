package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: oam reason: default package */
public final class oam {
    public static wud<Uri> a(hdd hdd) {
        return wud.a((Callable<? extends T>) new $$Lambda$oam$uoI4c5BXCs6Wr0w4_dFls4r_dtc<Object>(hdd));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Uri b(hdd hdd) {
        StringBuilder sb = new StringBuilder("tinkerbell_paymentfailure_");
        sb.append(hdd.b());
        return Uri.parse("https://www.spotify.com/redirect/generic").buildUpon().appendQueryParameter("redirect_key", "android_paymentfailure").appendQueryParameter("utm_source", "spotify-android-app").appendQueryParameter("utm_medium", "main-banner").appendQueryParameter("utm_campaign", sb.toString()).build();
    }
}
