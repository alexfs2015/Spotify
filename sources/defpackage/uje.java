package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: uje reason: default package */
public final class uje {
    private static final String a = ((String) ((juc) fay.a(jud.a(LinkType.HOME_ROOT))).a.get(0));

    private static String a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? "" : queryParameter;
    }

    static Uri a(Uri uri, Uri uri2) {
        String str;
        if (uri == null && uri2 == null) {
            return null;
        }
        String str2 = "adjust_campaign";
        String str3 = "adjust_tracker";
        if (uri2 != null) {
            Builder buildUpon = Uri.parse(jst.a(uri == null ? a : uri.toString()).i()).buildUpon();
            Builder appendQueryParameter = buildUpon.appendQueryParameter(str3, "ndjczk");
            if (!uri2.isHierarchical() || uri2.getAuthority() == null) {
                str = uri2.toString();
            } else {
                str = uri2.getAuthority();
            }
            appendQueryParameter.appendQueryParameter(str2, str);
            return buildUpon.build();
        }
        if (jst.a(uri.toString()).m()) {
            Builder buildUpon2 = Uri.parse(jst.a(uri.toString()).i()).buildUpon();
            buildUpon2.appendQueryParameter(str3, "6ypk9q").appendQueryParameter("adjust_adgroup", a(uri, "utm_source")).appendQueryParameter("adjust_creative", a(uri, "utm_medium")).appendQueryParameter(str2, a(uri, "utm_campaign"));
            uri = buildUpon2.build();
        }
        return uri;
    }
}
