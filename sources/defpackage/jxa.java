package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Random;

/* renamed from: jxa reason: default package */
public final class jxa {
    public static PendingIntent a(Context context) {
        return a(context, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED", (Bundle) null);
    }

    public static PendingIntent a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        return a(context, "com.spotify.mobile.android.service.action.player.SEEK_RELATIVE", bundle);
    }

    private static PendingIntent a(Context context, String str, Bundle bundle) {
        Intent a = new hiu().a(context, str);
        if (bundle != null) {
            a.putExtras(bundle);
        }
        return PendingIntent.getService(context, ((Random) gih.a(Random.class)).nextInt(), a, 134217728);
    }

    public static PendingIntent a(Context context, String str, String str2) {
        Intent a = new hiu().a(context, "com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION");
        a.putExtra("uri", str);
        a.putExtra("context_source", str2);
        return PendingIntent.getService(context, 0, a, 134217728);
    }

    public static PendingIntent b(Context context) {
        return a(context, "com.spotify.mobile.android.service.action.player.PREVIOUS", (Bundle) null);
    }

    public static PendingIntent b(Context context, String str, String str2) {
        Intent a = new hiu().a(context, "com.spotify.mobile.android.service.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION");
        a.putExtra("uri", str);
        a.putExtra("context_source", str2);
        return PendingIntent.getService(context, 0, a, 134217728);
    }

    public static PendingIntent c(Context context) {
        return a(context, "com.spotify.mobile.android.service.action.player.NEXT", (Bundle) null);
    }

    public static PendingIntent c(Context context, String str, String str2) {
        Intent a = new hiu().a(context, "com.spotify.mobile.android.service.action.player.NOTIFICATION_BAN");
        a.putExtra("uri", str);
        a.putExtra("context_source", str2);
        return PendingIntent.getService(context, 0, a, 134217728);
    }

    public static PendingIntent d(Context context, String str, String str2) {
        Intent a = new hiu().a(context, "com.spotify.mobile.android.service.action.player.NOTIFICATION_UNBAN");
        a.putExtra("uri", str);
        a.putExtra("context_source", str2);
        return PendingIntent.getService(context, 0, a, 134217728);
    }
}
