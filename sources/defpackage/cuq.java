package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.spotify.cosmos.router.Request;
import java.util.Collections;
import java.util.Map;

@cey
/* renamed from: cuq reason: default package */
public final class cuq {
    public final String a;
    public final Uri b;
    public final Map<String, String> c;
    private final String d;

    public cuq(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public cuq(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private cuq(String str, Uri uri, String str2, Map<String, String> map) {
        this.a = str;
        this.b = uri;
        if (str2 == null) {
            str2 = Request.GET;
        }
        this.d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.c = map;
    }
}
