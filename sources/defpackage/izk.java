package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: izk reason: default package */
public interface izk {

    /* renamed from: izk$a */
    public static class a {
        public final AndroidLibsShareProperties a;
        public final ShareEventLogger b;
        public final iyz c;
        public final izp d;
        public final String e;
        private final PackageManager f;
        private final String g;
        private final String h;
        private final Uri i;

        public a(AndroidLibsShareProperties androidLibsShareProperties, ShareEventLogger shareEventLogger, iyz iyz, PackageManager packageManager, izp izp, String str, String str2, String str3, Uri uri) {
            this.a = androidLibsShareProperties;
            this.b = (ShareEventLogger) fbp.a(shareEventLogger);
            this.c = (iyz) fbp.a(iyz);
            this.f = (PackageManager) fbp.a(packageManager);
            this.d = (izp) fbp.a(izp);
            this.e = (String) fbp.a(str);
            this.g = (String) fbp.a(str2);
            this.h = (String) fbp.a(str3);
            this.i = (Uri) fbp.a(uri);
        }
    }

    void addMenuItem(a aVar, long j);
}
