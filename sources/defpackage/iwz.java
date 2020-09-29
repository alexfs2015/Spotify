package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: iwz reason: default package */
public interface iwz {

    /* renamed from: iwz$a */
    public static class a {
        public final AndroidLibsShareProperties a;
        public final ShareEventLogger b;
        public final iwo c;
        public final ixe d;
        public final String e;
        private final PackageManager f;
        private final String g;
        private final String h;
        private final Uri i;

        public a(AndroidLibsShareProperties androidLibsShareProperties, ShareEventLogger shareEventLogger, iwo iwo, PackageManager packageManager, ixe ixe, String str, String str2, String str3, Uri uri) {
            this.a = androidLibsShareProperties;
            this.b = (ShareEventLogger) fay.a(shareEventLogger);
            this.c = (iwo) fay.a(iwo);
            this.f = (PackageManager) fay.a(packageManager);
            this.d = (ixe) fay.a(ixe);
            this.e = (String) fay.a(str);
            this.g = (String) fay.a(str2);
            this.h = (String) fay.a(str3);
            this.i = (Uri) fay.a(uri);
        }
    }

    void addMenuItem(a aVar, long j);
}
