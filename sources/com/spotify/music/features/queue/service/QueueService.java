package com.spotify.music.features.queue.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

public class QueueService extends whu {
    public pvv a;

    public QueueService() {
        super("QueueService");
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, QueueService.class);
        intent.setAction("add_album");
        intent.putExtra("album_uri", str);
        context.startService(intent);
    }

    public static void a(Context context, List<PlayerTrack> list, boolean z) {
        Intent intent = new Intent(context, QueueService.class);
        intent.setAction("add_tracks_or_episodes");
        intent.putParcelableArrayListExtra("items", new ArrayList(list));
        intent.putExtra("show_toast", z);
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("add_tracks_or_episodes".equals(action)) {
                this.a.a((List) fbp.a(intent.getParcelableArrayListExtra("items")), intent.getBooleanExtra("show_toast", true));
            } else if ("add_album".equals(action)) {
                this.a.a((String) fbp.a(intent.getStringExtra("album_uri")));
            }
        }
    }
}
