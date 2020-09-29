package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: kbq reason: default package */
public final class kbq extends DefaultDrmSessionManager<asy> {
    final a c;
    private final Handler d;

    /* renamed from: kbq$a */
    public interface a extends ass {
        void l();
    }

    public kbq(UUID uuid, asx<asy> asx, ata ata, HashMap<String, String> hashMap, Handler handler, a aVar) {
        super(uuid, asx, ata, null, handler, (asr) aVar);
        this.d = handler;
        this.c = aVar;
    }

    public final DrmSession<asy> a(Looper looper, ast ast) {
        Handler handler = this.d;
        if (!(handler == null || this.c == null)) {
            handler.post(new Runnable() {
                public final void run() {
                    kbq.this.c.l();
                }
            });
        }
        return super.a(looper, ast);
    }
}
