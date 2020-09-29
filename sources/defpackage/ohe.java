package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ohe reason: default package */
public final class ohe {
    public static xii<Uri> a(hfz hfz) {
        return xii.a((Callable<? extends T>) new $$Lambda$ohe$wUSivOJMaJiOnpMwmAwyyqWzhyo<Object>(hfz));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Uri b(hfz hfz) {
        StringBuilder sb = new StringBuilder("tinkerbell_paymentfailure_");
        sb.append(hfz.b());
        return Uri.parse("https://www.spotify.com/redirect/generic").buildUpon().appendQueryParameter("redirect_key", "android_paymentfailure").appendQueryParameter("utm_source", "spotify-android-app").appendQueryParameter("utm_medium", "main-banner").appendQueryParameter("utm_campaign", sb.toString()).build();
    }
}
