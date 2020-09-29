package com.spotify.mobile.android.shortcut;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class ShortcutPinnedReceiver extends vtm {
    public jsz a;
    public Handler b;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.spotify.mobile.android.shortcut.SHORTCUT_PINNED".equals(intent.getAction())) {
            this.b.post(new Runnable() {
                public final void run() {
                    ShortcutPinnedReceiver.this.a.a(SpotifyIconV2.DEVICE_MOBILE, (int) R.string.toast_added_to_home_screen, 0);
                }
            });
        }
    }

    public static PendingIntent a(Context context) {
        Intent intent = new Intent("com.spotify.mobile.android.shortcut.SHORTCUT_PINNED");
        intent.setComponent(new ComponentName(context, ShortcutPinnedReceiver.class));
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }
}
