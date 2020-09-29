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

/* renamed from: igm reason: default package */
public final class igm implements kah {
    private final iga a;
    private final Map<String, String> b = b();
    private final idq c;
    private final kcs d;
    private final igu e;
    private final jya f;
    private igt g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final jyc k;

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(float f2, long j2, long j3) {
        CC.$default$a((kah) this, f2, j2, j3);
    }

    public /* synthetic */ void a(int i2) {
        CC.$default$a((kah) this, i2);
    }

    public /* synthetic */ void a(long j2) {
        CC.$default$a((kah) this, j2);
    }

    public /* synthetic */ void a(long j2, long j3, long j4) {
        CC.$default$a((kah) this, j2, j3, j4);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kah) this, encryptionType);
    }

    public /* synthetic */ void a(List<jyi> list) {
        CC.$default$a((kah) this, (List) list);
    }

    public /* synthetic */ void a(jya jya, long j2) {
        CC.$default$a((kah) this, jya, j2);
    }

    public /* synthetic */ void a(jyi jyi, long j2, long j3) {
        CC.$default$a((kah) this, jyi, j2, j3);
    }

    public /* synthetic */ void a(kac kac, long j2, long j3) {
        CC.$default$a((kah) this, kac, j2, j3);
    }

    public /* synthetic */ void a(kam kam, long j2, long j3) {
        CC.$default$a((kah) this, kam, j2, j3);
    }

    public /* synthetic */ void a(boolean z, long j2, long j3) {
        CC.$default$a((kah) this, z, j2, j3);
    }

    public /* synthetic */ void d(long j2, long j3) {
        CC.$default$d(this, j2, j3);
    }

    public /* synthetic */ void e(long j2, long j3) {
        CC.$default$e(this, j2, j3);
    }

    public igm(iga iga, jya jya, jyc jyc, idq idq, kct kct, igu igu) {
        this.a = (iga) fay.a(iga);
        this.f = jya;
        this.k = jyc;
        this.e = igu;
        fay.a(jya);
        this.c = idq;
        this.d = kct.a(jya, null);
    }

    public final void a(boolean z, long j2) {
        Logger.b("onPlaybackCreated with track %s", jzg.a(this.f));
        this.g = this.e.a(PlayerTrackUtil.getAdId(this.f.e()), b(), LogLevel.NONE, this.c.a, this.a, this.d);
    }

    public final void a(long j2, long j3) {
        Logger.b("onReady", new Object[0]);
        fay.a(this.g);
        this.g.a(true, j2);
        this.h = true;
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
            this.k.a(new long[]{0, (long) (0.25d * d2), (long) (0.5d * d2), (long) (0.75d * d2), (long) (d2 * 0.95d)}, new $$Lambda$igm$uI1Ln_i64ZXw026cICiC2j9FKqQ(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(long j2) {
        igt igt = this.g;
        if (igt != null) {
            igt.a(j2);
        }
    }

    public final void c(long j2, long j3) {
        Logger.b("onPause", new Object[0]);
        fay.a(this.g);
        this.g.a(false, j2);
    }

    public final void b(long j2) {
        Logger.b("onResume", new Object[0]);
        fay.a(this.g);
    }

    public final void a(BetamaxException betamaxException, long j2, long j3) {
        fay.a(this.g);
        this.g.a(Collections.emptyMap(), j2);
    }

    public final void b(BetamaxException betamaxException, long j2, long j3) {
        fay.a(this.g);
        this.g.a(Collections.emptyMap(), j2);
    }

    public final void a(Optional<VideoSurfaceView> optional, long j2, long j3) {
        boolean z = optional.b() && ((VideoSurfaceView) optional.c()).h;
        this.d.a((VideoSurfaceView) optional.d(), z);
        if (optional.b() && this.i != z) {
            this.a.a(z ? "expanded" : "collapsed", PlayerTrackUtil.getAdId(this.f.e()), String.valueOf(PlayerTrackUtil.getDuration(this.f.e()) / 1000), j2, this.b);
            this.i = z;
        }
    }

    public final void a(jxr jxr, ReasonEnd reasonEnd, long j2, long j3) {
        Logger.b("onPlaybackEnded() %s", reasonEnd);
        fay.a(this.g);
        if (!this.h || reasonEnd != ReasonEnd.PLAYED_TO_END) {
            this.g.a(Collections.emptyMap(), j2);
            return;
        }
        igt igt = this.g;
        Collections.emptyMap();
        igt.c(j2);
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap(1);
        Map e2 = this.f.e();
        String str = Metadata.IS_ACTIVE_PLAY_INTERRUPTION;
        hashMap.put(str, e2.get(str));
        return hashMap;
    }
}
