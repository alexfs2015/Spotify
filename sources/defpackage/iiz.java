package defpackage;

import com.comscore.util.log.LogLevel;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: iiz reason: default package */
public final class iiz implements kch {
    private final iin a;
    private final Map<String, String> b = b();
    private final igd c;
    private final ket d;
    private final ijh e;
    private final kaa f;
    private ijg g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final kac k;

    public iiz(iin iin, kaa kaa, kac kac, igd igd, keu keu, ijh ijh) {
        this.a = (iin) fbp.a(iin);
        this.f = kaa;
        this.k = kac;
        this.e = ijh;
        fbp.a(kaa);
        this.c = igd;
        this.d = keu.a(kaa, null);
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap(1);
        Map e2 = this.f.e();
        String str = Metadata.IS_ACTIVE_PLAY_INTERRUPTION;
        hashMap.put(str, e2.get(str));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(long j2) {
        ijg ijg = this.g;
        if (ijg != null) {
            ijg.a(j2);
        }
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(float f2, long j2, long j3) {
        CC.$default$a((kch) this, f2, j2, j3);
    }

    public /* synthetic */ void a(int i2) {
        CC.$default$a((kch) this, i2);
    }

    public /* synthetic */ void a(long j2) {
        CC.$default$a((kch) this, j2);
    }

    public final void a(long j2, long j3) {
        Logger.b("onReady", new Object[0]);
        fbp.a(this.g);
        this.g.a(true, j2);
        this.h = true;
    }

    public /* synthetic */ void a(long j2, long j3, long j4) {
        CC.$default$a((kch) this, j2, j3, j4);
    }

    public final void a(Optional<VideoSurfaceView> optional, long j2, long j3) {
        boolean z = optional.b() && ((VideoSurfaceView) optional.c()).h;
        this.d.a((VideoSurfaceView) optional.d(), z);
        if (optional.b() && this.i != z) {
            this.a.a(z ? "expanded" : "collapsed", PlayerTrackUtil.getAdId(this.f.e()), String.valueOf(PlayerTrackUtil.getDuration(this.f.e()) / 1000), j2, this.b);
            this.i = z;
        }
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kch) this, encryptionType);
    }

    public final void a(BetamaxException betamaxException, long j2, long j3) {
        fbp.a(this.g);
        this.g.a(Collections.emptyMap(), j2);
    }

    public /* synthetic */ void a(List<kai> list) {
        CC.$default$a((kch) this, (List) list);
    }

    public final void a(jzr jzr, ReasonEnd reasonEnd, long j2, long j3) {
        Logger.b("onPlaybackEnded() %s", reasonEnd);
        fbp.a(this.g);
        if (!this.h || reasonEnd != ReasonEnd.PLAYED_TO_END) {
            this.g.a(Collections.emptyMap(), j2);
            return;
        }
        ijg ijg = this.g;
        Collections.emptyMap();
        ijg.c(j2);
    }

    public /* synthetic */ void a(kaa kaa, long j2) {
        CC.$default$a((kch) this, kaa, j2);
    }

    public /* synthetic */ void a(kai kai, long j2, long j3) {
        CC.$default$a((kch) this, kai, j2, j3);
    }

    public /* synthetic */ void a(kcc kcc, long j2, long j3) {
        CC.$default$a((kch) this, kcc, j2, j3);
    }

    public /* synthetic */ void a(kcm kcm, long j2, long j3) {
        CC.$default$a((kch) this, kcm, j2, j3);
    }

    public final void a(boolean z, long j2) {
        Logger.b("onPlaybackCreated with track %s", kbg.a(this.f));
        this.g = this.e.a(PlayerTrackUtil.getAdId(this.f.e()), b(), LogLevel.NONE, this.c.a, this.a, this.d);
    }

    public /* synthetic */ void a(boolean z, long j2, long j3) {
        CC.$default$a((kch) this, z, j2, j3);
    }

    public final void b(long j2) {
        Logger.b("onResume", new Object[0]);
        fbp.a(this.g);
    }

    public final void b(long j2, long j3) {
        if (!this.j) {
            this.j = true;
            this.g.b(j2);
            double d2 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            this.k.a(new long[]{0, (long) (0.25d * d2), (long) (0.5d * d2), (long) (0.75d * d2), (long) (d2 * 0.95d)}, new $$Lambda$iiz$l1y4XRGFhiJO4Ibj4AaFUek0NA(this));
        }
    }

    public final void b(BetamaxException betamaxException, long j2, long j3) {
        fbp.a(this.g);
        this.g.a(Collections.emptyMap(), j2);
    }

    public final void c(long j2, long j3) {
        Logger.b("onPause", new Object[0]);
        fbp.a(this.g);
        this.g.a(false, j2);
    }

    public /* synthetic */ void d(long j2, long j3) {
        CC.$default$d(this, j2, j3);
    }

    public /* synthetic */ void e(long j2, long j3) {
        CC.$default$e(this, j2, j3);
    }
}
