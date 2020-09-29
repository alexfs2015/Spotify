package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: jzq reason: default package */
public final class jzq extends DefaultDrmSessionManager<ash> {
    final a c;
    private final Handler d;

    /* renamed from: jzq$a */
    public interface a extends asb {
        void l();
    }

    public jzq(UUID uuid, asg<ash> asg, asj asj, HashMap<String, String> hashMap, Handler handler, a aVar) {
        super(uuid, asg, asj, null, handler, (asa) aVar);
        this.d = handler;
        this.c = aVar;
    }

    public final DrmSession<ash> a(Looper looper, asc asc) {
        Handler handler = this.d;
        if (!(handler == null || this.c == null)) {
            handler.post(new Runnable() {
                public final void run() {
                    jzq.this.c.l();
                }
            });
        }
        return super.a(looper, asc);
    }
}
