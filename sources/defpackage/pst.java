package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

/* renamed from: pst reason: default package */
public final class pst implements vpq {
    private final Context a;
    private final hit b;

    public pst(Context context, hit hit) {
        this.a = context;
        this.b = hit;
    }

    private PendingIntent a(Intent intent) {
        return PendingIntent.getService(this.a, UUID.randomUUID().hashCode(), intent, 134217728);
    }

    public final int a() {
        return R.drawable.icn_notification;
    }

    public final PendingIntent a(int i, String str, String str2) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        ptc a3 = ptc.a(i, str, str2);
        a2.setData(Uri.parse(ViewUris.bC.toString()));
        a2.putExtra("push_data", a3);
        return a(a2);
    }

    public final PendingIntent a(int i, String str, String str2, String str3) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        if (!fbo.a(str)) {
            a2.setData(Uri.parse(str));
        }
        a2.putExtra("push_data", ptf.create(i, str2, str3, str));
        return a(a2);
    }

    public final PendingIntent a(int i, boolean z, String str, String str2, String str3) {
        Intent a2 = this.b.a(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        if (!fbo.a(str)) {
            a2.setData(Uri.parse(str));
        }
        a2.putExtra("push_data", ptd.a(i, str2, str3, str, z));
        return a(a2);
    }
}
