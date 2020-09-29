package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.loginflow.LoginActivity;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.music.MainActivity;

/* renamed from: hfy reason: default package */
public final class hfy implements hfx {
    public final Intent a(Context context, String str) {
        return new Intent(str).setClass((Context) fay.a(context), SpotifyService.class);
    }

    public final Intent a(Context context) {
        return new Intent((Context) fay.a(context), LoginActivity.class).addFlags(268435456).addFlags(65536);
    }

    public final Intent a(int i) {
        return new Intent("com.spotify.mobile.android.service.broadcast.session.LOGIN_ERROR").putExtra("error_code", i);
    }

    public final PendingIntent b(Context context) {
        return PendingIntent.getActivity(context, 0, kmf.a((Context) fay.a(context), "spotify:internal:preferences").a("Settings").a, 0);
    }

    public final Intent c(Context context) {
        return new Intent((Context) fay.a(context), MainActivity.class);
    }

    public final PendingIntent d(Context context) {
        return PendingIntent.getActivity(context, 0, new Intent((Context) fay.a(context), MainActivity.class), 0);
    }
}
