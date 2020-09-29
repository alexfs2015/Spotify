package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pkb reason: default package */
public final class pkb implements vcs {
    private final Context a;
    private final hfx b;

    public final int a() {
        return R.drawable.icn_notification;
    }

    public pkb(Context context, hfx hfx) {
        this.a = context;
        this.b = hfx;
    }

    private PendingIntent a(Intent intent) {
        return PendingIntent.getService(this.a, 0, intent, 134217728);
    }

    public final PendingIntent a(int i, boolean z, String str, String str2, String str3) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        if (!fax.a(str)) {
            a2.setData(Uri.parse(str));
        }
        a2.putExtra("push_data", pkl.a(i, str2, str3, str, z));
        return a(a2);
    }

    public final PendingIntent a(int i, String str, String str2, String str3) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        if (!fax.a(str)) {
            a2.setData(Uri.parse(str));
        }
        a2.putExtra("push_data", pkn.create(i, str2, str3, str));
        return a(a2);
    }

    public final PendingIntent a(int i, String str, String str2) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        pkk a3 = pkk.a(i, str, str2);
        a2.setData(Uri.parse(ViewUris.bD.toString()));
        a2.putExtra("push_data", a3);
        return a(a2);
    }
}
