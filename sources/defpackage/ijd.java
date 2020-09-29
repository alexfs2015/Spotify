package defpackage;

import com.comscore.util.log.LogLevel;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.tracking.BufferEvent;
import com.spotify.mobile.android.video.tracking.BufferEvent.Kind;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ijd reason: default package */
public final class ijd extends kej {
    private final iin a;
    private final ijh b;
    private final kaa o;
    private final Map<String, String> p = c();
    private final igd q;
    private final ket r;
    private ijg s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final kac w;

    /* renamed from: ijd$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Kind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind[] r0 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind r1 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.INITIAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind r1 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.STALL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ijd.AnonymousClass1.<clinit>():void");
        }
    }

    public ijd(kaa kaa, kac kac, jtz jtz, iin iin, igd igd, keu keu, ijh ijh) {
        super(kaa, jtz);
        this.a = (iin) fbp.a(iin);
        this.b = ijh;
        fbp.a(kaa);
        this.o = kaa;
        this.w = kac;
        this.q = igd;
        this.r = keu.a(kaa, null);
    }

    private Map<String, String> b() {
        long j;
        long j2;
        long j3;
        Long l;
        long j4 = 0;
        Long valueOf = Long.valueOf(0);
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        for (BufferEvent bufferEvent : this.c) {
            Long l2 = (Long) bufferEvent.a().a(valueOf);
            int i = AnonymousClass1.a[bufferEvent.a.ordinal()];
            if (i == 1) {
                j8 = l2.longValue();
            } else if (i == 2) {
                j5 += l2.longValue();
                j6 = Math.max(j6, l2.longValue());
                j7++;
            }
        }
        long j9 = 0;
        for (kem a2 : c(this.h.b() ? ((Long) this.h.c()).longValue() + 30000 : Long.MAX_VALUE)) {
            j9 += ((Long) a2.a().a(valueOf)).longValue();
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            kel kel = (kel) it.next();
            Iterator it2 = it;
            if (kel.a.b()) {
                j3 = j7;
                double a3 = (double) ((kcm) kel.a.c()).a();
                j2 = j6;
                double longValue = (double) ((Long) kel.a().a(valueOf)).longValue();
                l = valueOf;
                j = j5;
                double d = (double) j9;
                Double.isNaN(longValue);
                Double.isNaN(d);
                double d2 = longValue / d;
                Double.isNaN(a3);
                j4 += (long) (a3 * d2);
            } else {
                l = valueOf;
                j = j5;
                j2 = j6;
                j3 = j7;
            }
            valueOf = l;
            it = it2;
            j7 = j3;
            j6 = j2;
            j5 = j;
        }
        long j10 = j5;
        long j11 = j6;
        long j12 = j7;
        HashMap hashMap = new HashMap();
        hashMap.put("ms_latency", String.valueOf(this.i));
        hashMap.put("ms_initial_buffering", String.valueOf(j8));
        hashMap.put("ms_stalled", String.valueOf(j10));
        hashMap.put("max_ms_stalled", String.valueOf(j11));
        hashMap.put("n_stalls", String.valueOf(j12));
        hashMap.put("ms_played", String.valueOf(j9));
        hashMap.put("time_weighted_bitrate", String.valueOf(j4));
        return hashMap;
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap(1);
        Map e = this.o.e();
        String str = Metadata.IS_ACTIVE_PLAY_INTERRUPTION;
        hashMap.put(str, e.get(str));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(long j) {
        ijg ijg = this.s;
        if (ijg != null) {
            ijg.a(j);
        }
    }

    public final void a(long j, long j2) {
        super.a(j, j2);
        Logger.b("onReady", new Object[0]);
        fbp.a(this.s);
        this.s.a(true, j);
        this.t = true;
    }

    public final void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        super.a(optional, j, j2);
        boolean z = optional.b() && ((VideoSurfaceView) optional.c()).h;
        this.r.a((VideoSurfaceView) optional.d(), z);
        if (optional.b() && this.u != z) {
            this.a.a(z ? "expanded" : "collapsed", PlayerTrackUtil.getAdId(this.o.e()), String.valueOf(PlayerTrackUtil.getDuration(this.o.e()) / 1000), j, this.p);
            this.u = z;
        }
    }

    public final void a(BetamaxException betamaxException, long j, long j2) {
        super.a(betamaxException, j, j2);
        this.s.a(b(), j);
    }

    public final void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
        super.a(jzr, reasonEnd, j, j2);
        if (!this.t || reasonEnd != ReasonEnd.PLAYED_TO_END) {
            this.s.a(b(), j);
            return;
        }
        ijg ijg = this.s;
        b();
        ijg.c(j);
    }

    public final void a(boolean z, long j) {
        super.a(z, j);
        Logger.b("onPlaybackCreated with track %s", kbg.a(this.o));
        this.s = this.b.a(PlayerTrackUtil.getAdId(this.o.e()), c(), LogLevel.NONE, this.q.a, this.a, this.r);
    }

    public final void b(long j, long j2) {
        super.b(j, j2);
        if (!this.v) {
            this.v = true;
            this.s.b(j);
            double d = (double) j;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.w.a(new long[]{0, (long) (0.25d * d), (long) (0.5d * d), (long) (0.75d * d), (long) (d * 0.95d)}, new $$Lambda$ijd$FE6pIoUqytTJP1MpKlnNKwXHBcc(this));
        }
    }

    public final void b(BetamaxException betamaxException, long j, long j2) {
        super.b(betamaxException, j, j2);
        this.s.a(b(), j);
    }

    public final void c(long j, long j2) {
        super.c(j, j2);
        Logger.b("onPause", new Object[0]);
        fbp.a(this.s);
        this.s.a(false, j);
    }
}
