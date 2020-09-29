package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: kmf reason: default package */
public final class kmf {

    /* renamed from: kmf$a */
    public static final class a {
        public final Intent a;

        public /* synthetic */ a(Context context, Intent intent, byte b) {
            this(context, intent);
        }

        private a(Context context, Intent intent) {
            this.a = (Intent) fay.a(intent);
            this.a.setExtrasClassLoader(context.getClassLoader());
            this.a.setClass(context, MainActivity.class);
        }

        public final a a() {
            this.a.putExtra("extra_crossfade", true);
            return this;
        }

        public final a a(String str) {
            this.a.putExtra("title", (String) fay.a(str));
            return this;
        }
    }

    public static a a(Context context) {
        return a((Context) fay.a(context), ViewUris.t.toString());
    }

    public static a b(Context context) {
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
        intent.setFlags(805306368);
        return new a((Context) fay.a(context), intent, 0);
    }

    public static a a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fay.a(str)));
        intent.setFlags(67108864);
        return new a((Context) fay.a(context), intent, 0);
    }
}
