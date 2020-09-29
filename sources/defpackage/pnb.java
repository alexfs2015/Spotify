package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.queue.service.QueueService;
import java.util.List;

/* renamed from: pnb reason: default package */
public final class pnb implements txm {
    public final void a(Context context, List<PlayerTrack> list, boolean z) {
        QueueService.a(context, list, z);
    }

    public final void a(Context context, String str) {
        QueueService.a(context, str);
    }
}
