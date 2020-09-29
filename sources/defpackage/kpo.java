package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: kpo reason: default package */
public final class kpo {

    /* renamed from: kpo$a */
    public static final class a {
        public final Intent a;

        private a(Context context, Intent intent) {
            this.a = (Intent) fbp.a(intent);
            this.a.setExtrasClassLoader(context.getClassLoader());
            this.a.setClass(context, MainActivity.class);
        }

        public /* synthetic */ a(Context context, Intent intent, byte b) {
            this(context, intent);
        }

        public final a a() {
            this.a.putExtra("extra_crossfade", true);
            return this;
        }

        public final a a(String str) {
            this.a.putExtra("title", (String) fbp.a(str));
            return this;
        }
    }

    public static a a(Context context) {
        return a((Context) fbp.a(context), ViewUris.s.toString());
    }

    public static a a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) fbp.a(str)));
        intent.setFlags(67108864);
        return new a((Context) fbp.a(context), intent, 0);
    }

    public static a b(Context context) {
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
        intent.setFlags(805306368);
        return new a((Context) fbp.a(context), intent, 0);
    }
}
