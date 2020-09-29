package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.loginflow.LoginActivity;
import com.spotify.music.MainActivity;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: hkw reason: default package */
public final class hkw implements gni {
    public final Intent a(Context context) {
        return kmf.a(context).a;
    }

    public final Intent b(Context context) {
        return kmf.a(context, ViewUris.af.toString()).a;
    }

    public final Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("password_reset", true);
        intent.putExtra("password_reset_username", fax.b(str));
        intent.putExtra("password_reset_auto_send_email", z);
        return LoginActivity.a(context, intent);
    }
}
