package defpackage;

import android.content.Context;
import com.spotify.music.features.queue.service.QueueService;

/* renamed from: pmu reason: default package */
public final class pmu implements iqo {
    private final Context a;

    public pmu(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        QueueService.a(this.a, str);
    }
}
