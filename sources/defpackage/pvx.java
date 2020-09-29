package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.queue.service.QueueService;
import java.util.List;

/* renamed from: pvx reason: default package */
public final class pvx implements ujp {
    public final void a(Context context, String str) {
        QueueService.a(context, str);
    }

    public final void a(Context context, List<PlayerTrack> list, boolean z) {
        QueueService.a(context, list, z);
    }
}
