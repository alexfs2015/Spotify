package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.loginflow.LoginActivity;
import com.spotify.music.MainActivity;

/* renamed from: hno reason: default package */
public final class hno implements gox {
    public final Intent a(Context context) {
        return kpo.a(context).a;
    }

    public final Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("password_reset", true);
        intent.putExtra("password_reset_username", fbo.b(str));
        intent.putExtra("password_reset_auto_send_email", z);
        return LoginActivity.a(context, intent);
    }
}
