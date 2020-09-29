package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.internal.receiver.MediaButtonReceiver;

/* renamed from: rut reason: default package */
public final class rut {
    private final Context a;

    public rut(Context context) {
        this.a = context;
    }

    public final rus a(ruq ruq) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(new ComponentName(this.a.getPackageName(), MediaButtonReceiver.class.getName()));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a.getApplicationContext(), 0, intent, 0);
        return new ruw(new ruo(this.a, new MediaSessionCompat(this.a, "spotify-media-session", new ComponentName(this.a, MediaButtonReceiver.class), broadcast), broadcast, ruq));
    }
}
