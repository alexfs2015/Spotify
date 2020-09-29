package defpackage;

import android.net.Uri.Builder;
import android.util.SparseArray;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.R;

/* renamed from: ixf reason: default package */
public final class ixf {
    public final SparseArray<a> a = new SparseArray<>();
    public final FireAndForgetResolver b;
    final jsz c;

    /* renamed from: ixf$a */
    public static abstract class a {
        final String a;

        public abstract Request a(String str, String str2);

        /* access modifiers changed from: 0000 */
        public abstract String a(Response response);

        a(String str) {
            this.a = str;
        }
    }

    public ixf(FireAndForgetResolver fireAndForgetResolver, jsz jsz) {
        this.b = fireAndForgetResolver;
        this.c = jsz;
        this.a.append(R.id.share_app_snapchat, new a("snapchat/v1/filters") {
            /* access modifiers changed from: 0000 */
            public final Request a(String str, String str2) {
                Builder appendQueryParameter = new Builder().scheme("hm").authority("external-deeplinks").path(this.a).appendQueryParameter("uri", str);
                if (!fax.a(str2)) {
                    appendQueryParameter.appendQueryParameter("context", str2);
                }
                return RequestBuilder.get(appendQueryParameter.build().toString()).build();
            }

            /* access modifiers changed from: 0000 */
            public final String a(Response response) {
                return new String(response.getBody(), far.c);
            }
        });
    }
}
