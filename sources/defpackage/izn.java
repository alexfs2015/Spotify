package defpackage;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: izn reason: default package */
public abstract class izn {

    /* renamed from: izn$a */
    public static abstract class a {
        public abstract a a(Uri uri);

        public abstract a a(ShareEventLogger shareEventLogger);

        public abstract a a(izo izo);

        public abstract a a(String str);

        public abstract izn a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    public abstract ShareEventLogger a();

    public abstract izo b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract Uri f();
}
