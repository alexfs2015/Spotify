package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.spotify.music.R;
import com.spotify.music.libs.web.RxWebToken;
import java.net.URI;

/* renamed from: hld reason: default package */
public final class hld {

    /* renamed from: hld$a */
    public static class a {
        public boolean a;
        public Uri b;
    }

    /* renamed from: hld$b */
    public static class b implements Callback, defpackage.jvj.a {
        private final Handler a = new Handler(this);
        private final Context b;
        private final Uri c;
        private final jvf d;
        private jvj e;

        public b(Context context, RxWebToken rxWebToken, Uri uri, jvf jvf) {
            this.b = context;
            this.c = uri;
            this.d = jvf;
            this.e = jvj.a(rxWebToken);
            this.e.a(uri.toString(), this);
            this.a.sendEmptyMessageDelayed(1, 500);
            this.a.sendEmptyMessageDelayed(2, 5000);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.d.a((int) R.string.toast_push_notification_slow_open, 1, new Object[0]);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                onWebTokenUriReady(this.c);
                return true;
            }
        }

        public final void onWebTokenUriReady(Uri uri) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            this.b.startActivity(intent);
            jvj jvj = this.e;
            if (jvj != null) {
                jvj.a();
                this.e = null;
            }
            this.a.removeMessages(1);
            this.a.removeMessages(2);
        }
    }

    private static Uri a(Uri uri, String str) {
        Builder builder = new Builder();
        builder.scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        for (gjs gjs : gjt.a(URI.create(uri.toString()), fbi.c)) {
            if (!gjs.a.equals(str)) {
                builder.appendQueryParameter(gjs.a, gjs.b == null ? "" : gjs.b);
            }
        }
        return builder.build();
    }

    public static a a(Uri uri) {
        a aVar = new a();
        aVar.b = uri;
        aVar.a = b(uri);
        if (uri.isHierarchical()) {
            String str = "sp_req_login_token";
            if (uri.getQueryParameter(str) != null) {
                aVar.a = true;
                aVar.b = a(aVar.b, str);
            }
        }
        return aVar;
    }

    private static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        String host = uri.getHost();
        return ("spotify.com".equals(host) || "www.spotify.com".equals(host)) && !uri.toString().contains("notoken");
    }
}
