package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: uup reason: default package */
public final class uup {
    private static final String a = ((String) ((jwk) fbp.a(jwl.a(LinkType.HOME_ROOT))).a.get(0));

    static Uri a(Uri uri, Uri uri2) {
        if (uri == null && uri2 == null) {
            return null;
        }
        String str = "adjust_campaign";
        String str2 = "adjust_tracker";
        if (uri2 != null) {
            Builder buildUpon = Uri.parse(jva.a(uri == null ? a : uri.toString()).i()).buildUpon();
            buildUpon.appendQueryParameter(str2, "ndjczk").appendQueryParameter(str, (!uri2.isHierarchical() || uri2.getAuthority() == null) ? uri2.toString() : uri2.getAuthority());
            return buildUpon.build();
        }
        if (jva.a(uri.toString()).m()) {
            Builder buildUpon2 = Uri.parse(jva.a(uri.toString()).i()).buildUpon();
            buildUpon2.appendQueryParameter(str2, "6ypk9q").appendQueryParameter("adjust_adgroup", a(uri, "utm_source")).appendQueryParameter("adjust_creative", a(uri, "utm_medium")).appendQueryParameter(str, a(uri, "utm_campaign"));
            uri = buildUpon2.build();
        }
        return uri;
    }

    private static String a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? "" : queryParameter;
    }
}
