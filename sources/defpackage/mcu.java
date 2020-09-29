package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;

/* renamed from: mcu reason: default package */
public final class mcu implements mco {
    public final boolean a(Uri uri) {
        if (ImmutableSet.b("http", "https").contains(uri.getScheme().toLowerCase(Locale.ENGLISH))) {
            if (!"open.spotify.com".equals(uri.getHost())) {
                return false;
            }
        }
        return true;
    }
}
