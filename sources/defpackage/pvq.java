package defpackage;

import android.content.Context;
import com.spotify.music.features.queue.service.QueueService;

/* renamed from: pvq reason: default package */
public final class pvq implements itb {
    private final Context a;

    public pvq(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        QueueService.a(this.a, str);
    }
}
