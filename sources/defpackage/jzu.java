package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.endvideo.EndVideoReportException;
import com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent;
import com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.Kind;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.ui.actions.PendingMessageResponse;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: jzu reason: default package */
public final class jzu extends kcf {
    private kab A;
    private Optional<ConnectionType> B = Optional.e();
    private Optional<ConnectionType> C = Optional.e();
    private jya D;
    private final jyc E;
    private boolean F;
    private final wug G;
    private Optional<Long> H = Optional.e();
    volatile PendingMessageResponse a;
    volatile boolean b;
    private final jzs o;
    private final LinkedBlockingQueue<PendingEndVideoEvent> p = new LinkedBlockingQueue<>();
    private final wum q = new $$Lambda$jzu$9zFn6vGt37UCseTkKS03iTo7E2o(this);
    private final jya r;
    private final jrp s;
    private final jth t;
    private final jzy u;
    private final jzx v;
    private final String w;
    private final gdz<fko> x;
    private volatile wuk y;
    private long z = -1;

    /* renamed from: jzu$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[ReasonEnd.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.video.events.ReasonEnd[] r0 = com.spotify.mobile.android.video.events.ReasonEnd.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.PLAYED_TO_END     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.END_REQUESTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.PLAYER_RELEASED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.FATAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jzu.AnonymousClass4.<clinit>():void");
        }
    }

    public jzu(jya jya, jxx jxx, jyc jyc, String str, jrp jrp, jth jth, jzs jzs, gdz<fko> gdz, wug wug, jzy jzy, jzx jzx) {
        super(jya, jrp);
        this.r = jya;
        this.E = jyc;
        this.w = str;
        this.s = jrp;
        this.t = jth;
        this.o = jzs;
        this.x = gdz;
        this.G = wug;
        this.u = jzy;
        this.v = jzx;
        this.A = jxx.b() ? jzz.d : jzz.e;
    }

    public final void a(boolean z2, long j) {
        super.a(z2, j);
        this.B = Optional.b(this.t.c());
        a(Optional.e(), "started");
    }

    public final void a(long j, long j2) {
        super.a(j, j2);
        if (!this.H.b()) {
            this.H = Optional.b(Long.valueOf(j));
        }
        try {
            long parseLong = Long.parseLong((String) this.r.e().get("endvideo_command_initiated_time_ms"));
            this.z = parseLong > 0 ? this.s.a() - parseLong : -1;
        } catch (NumberFormatException e) {
            Logger.b(e, "Unparseable commandInitiatedTime in playback metadata", new Object[0]);
        }
        a(this.H, "started");
    }

    public final void b(long j, long j2) {
        super.b(j, j2);
        if (!this.F) {
            this.F = true;
            this.E.a(15, j, new $$Lambda$jzu$pOdPKatgrBJkHFB3XYWbAg0xn4(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(long j) {
        a(Optional.b(Long.valueOf(j)), "fiften-seconds");
    }

    public final void c(long j, long j2) {
        super.c(j, j2);
        this.A = jzz.e;
        a(Optional.b(Long.valueOf(j)), "paused");
    }

    public final void b(long j) {
        super.b(j);
        this.A = jzz.d;
        a(Optional.e(), "resumed");
    }

    public final void a(jya jya, long j) {
        super.a(jya, j);
        this.D = jya;
    }

    public final void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
        kab kab;
        super.a(jxr, reasonEnd, j, j2);
        this.C = Optional.b(this.t.c());
        kce a2 = a(Optional.b(Long.valueOf(j)));
        jya jya = this.D;
        if (jya != null) {
            String str = "endvideo_reason_start";
            if (jya.e().containsKey(str)) {
                kab = kaa.a((String) jya.e().get(str));
            } else {
                kab = jzz.f;
            }
        } else {
            int i = AnonymousClass4.a[reasonEnd.ordinal()];
            if (i == 1) {
                kab = jzz.b;
            } else if (i == 2 || i == 3) {
                kab = jzz.a;
            } else if (i != 4) {
                kab = jzz.f;
            } else {
                kab = jzz.c;
            }
        }
        jzw a3 = a(a2, kab);
        if (a3.a) {
            Logger.d("Empty report, no EndVideo to send.", new Object[0]);
        } else if (a3.a()) {
            a b2 = jxr.b();
            if (this.a == null) {
                this.p.add(PendingEndVideoEvent.a());
            }
            this.p.add(PendingEndVideoEvent.a(a3, "send-report"));
            this.p.add(new PendingEndVideoEvent(Kind.SEND, null, b2, ""));
            e();
        }
        this.t.a();
    }

    private void a(Optional<Long> optional, String str) {
        jzw a2 = a(a(optional), this.A);
        if (a2.a) {
            Logger.d("Empty report, no pending EndVideo to update.", new Object[0]);
        } else if (a2.a()) {
            if (this.a == null) {
                this.p.add(PendingEndVideoEvent.a());
            }
            this.p.add(PendingEndVideoEvent.a(a2, str));
            e();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void e() {
        /*
            r8 = this;
            monitor-enter(r8)
            wuk r0 = r8.y     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x000d
            wuk r0 = r8.y     // Catch:{ all -> 0x014d }
            boolean r0 = r0.isUnsubscribed()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0015
        L_0x000d:
            java.util.concurrent.LinkedBlockingQueue<com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent> r0 = r8.p     // Catch:{ all -> 0x014d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            monitor-exit(r8)
            return
        L_0x0017:
            java.util.concurrent.LinkedBlockingQueue<com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent> r0 = r8.p     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent r0 = (com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent) r0     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.ui.actions.PendingMessageResponse r1 = r8.a     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r2 = r0.a     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r3 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.Kind.CREATE_IF_NOT_EXISTS     // Catch:{ all -> 0x014d }
            if (r2 != r3) goto L_0x0071
            com.spotify.mobile.android.video.ui.actions.PendingMessageResponse r2 = r8.a     // Catch:{ all -> 0x014d }
            if (r2 != 0) goto L_0x0071
            jzs r0 = r8.o     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.LogParameters r1 = new com.spotify.mobile.android.video.endvideo.LogParameters     // Catch:{ all -> 0x014d }
            r1.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r2 = "EndVideo"
            r1.messageName = r2     // Catch:{ all -> 0x014d }
            r2 = 10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x014d }
            r1.messageVersion = r2     // Catch:{ all -> 0x014d }
            java.lang.String r2 = "create_pending_message"
            io.reactivex.Observable r1 = r0.a(r2, r1)     // Catch:{ all -> 0x014d }
            java.lang.Class<com.spotify.mobile.android.video.ui.actions.PendingMessageResponse> r2 = com.spotify.mobile.android.video.ui.actions.PendingMessageResponse.class
            com.fasterxml.jackson.databind.ObjectMapper r3 = r0.a     // Catch:{ all -> 0x014d }
            io.reactivex.Scheduler r0 = r0.b     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.cosmos.parser.JacksonResponseParser r0 = com.spotify.mobile.android.cosmos.parser.JacksonResponseParser.forClass(r2, r3, r0)     // Catch:{ all -> 0x014d }
            io.reactivex.Observable r0 = r1.a(r0)     // Catch:{ all -> 0x014d }
            io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.BUFFER     // Catch:{ all -> 0x014d }
            wud r0 = defpackage.vun.a(r0, r1)     // Catch:{ all -> 0x014d }
            wum r1 = r8.q     // Catch:{ all -> 0x014d }
            wud r0 = r0.b(r1)     // Catch:{ all -> 0x014d }
            wug r1 = r8.G     // Catch:{ all -> 0x014d }
            wud r0 = r0.a(r1)     // Catch:{ all -> 0x014d }
            jzu$1 r1 = new jzu$1     // Catch:{ all -> 0x014d }
            r1.<init>()     // Catch:{ all -> 0x014d }
            wuk r0 = defpackage.wud.a(r1, r0)     // Catch:{ all -> 0x014d }
            r8.y = r0     // Catch:{ all -> 0x014d }
            goto L_0x0148
        L_0x0071:
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r2 = r0.a     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r3 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.Kind.UPDATE     // Catch:{ all -> 0x014d }
            if (r2 != r3) goto L_0x00dd
            if (r1 == 0) goto L_0x00d2
            java.lang.String r2 = r1.sequenceId     // Catch:{ all -> 0x014d }
            if (r2 == 0) goto L_0x00d2
            java.lang.Long r2 = r1.sequenceNumber     // Catch:{ all -> 0x014d }
            if (r2 != 0) goto L_0x0082
            goto L_0x00d2
        L_0x0082:
            jzs r2 = r8.o     // Catch:{ all -> 0x014d }
            java.lang.Long r3 = r1.sequenceNumber     // Catch:{ all -> 0x014d }
            long r3 = r3.longValue()     // Catch:{ all -> 0x014d }
            jzw r5 = r0.b     // Catch:{ all -> 0x014d }
            java.lang.Long r6 = r1.sequenceNumber     // Catch:{ all -> 0x014d }
            long r6 = r6.longValue()     // Catch:{ all -> 0x014d }
            java.lang.String r1 = r1.sequenceId     // Catch:{ all -> 0x014d }
            hay$y r1 = r5.a(r6, r1)     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.LogParameters r5 = new com.spotify.mobile.android.video.endvideo.LogParameters     // Catch:{ all -> 0x014d }
            r5.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x014d }
            r5.message = r1     // Catch:{ all -> 0x014d }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x014d }
            r5.sequenceNumber = r1     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "EndVideo"
            r5.messageName = r1     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "update_pending_message"
            io.reactivex.Observable r1 = r2.a(r1, r5)     // Catch:{ all -> 0x014d }
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.BUFFER     // Catch:{ all -> 0x014d }
            wud r1 = defpackage.vun.a(r1, r2)     // Catch:{ all -> 0x014d }
            wum r2 = r8.q     // Catch:{ all -> 0x014d }
            wud r1 = r1.b(r2)     // Catch:{ all -> 0x014d }
            wug r2 = r8.G     // Catch:{ all -> 0x014d }
            wud r1 = r1.a(r2)     // Catch:{ all -> 0x014d }
            jzu$2 r2 = new jzu$2     // Catch:{ all -> 0x014d }
            r2.<init>(r0)     // Catch:{ all -> 0x014d }
            wuk r0 = defpackage.wud.a(r2, r1)     // Catch:{ all -> 0x014d }
            r8.y = r0     // Catch:{ all -> 0x014d }
            goto L_0x0148
        L_0x00d2:
            com.spotify.mobile.android.video.endvideo.EndVideoReportException r0 = new com.spotify.mobile.android.video.endvideo.EndVideoReportException     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "Could not update pending message because a previous creation of pending message failed."
            r0.<init>(r1)     // Catch:{ all -> 0x014d }
            r8.a(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0148
        L_0x00dd:
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r2 = r0.a     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent$Kind r3 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.Kind.SEND     // Catch:{ all -> 0x014d }
            if (r2 != r3) goto L_0x0148
            if (r1 == 0) goto L_0x013b
            java.lang.String r2 = r1.sequenceId     // Catch:{ all -> 0x014d }
            if (r2 == 0) goto L_0x013b
            java.lang.Long r2 = r1.sequenceNumber     // Catch:{ all -> 0x014d }
            if (r2 != 0) goto L_0x00ee
            goto L_0x013b
        L_0x00ee:
            boolean r2 = r8.b     // Catch:{ all -> 0x014d }
            if (r2 == 0) goto L_0x0100
            r0.b()     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.EndVideoReportException r0 = new com.spotify.mobile.android.video.endvideo.EndVideoReportException     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "Processing send event for EndVideo already sent."
            r0.<init>(r1)     // Catch:{ all -> 0x014d }
            r8.a(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0148
        L_0x0100:
            jzs r2 = r8.o     // Catch:{ all -> 0x014d }
            java.lang.Long r1 = r1.sequenceNumber     // Catch:{ all -> 0x014d }
            long r3 = r1.longValue()     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.LogParameters r1 = new com.spotify.mobile.android.video.endvideo.LogParameters     // Catch:{ all -> 0x014d }
            r1.<init>()     // Catch:{ all -> 0x014d }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x014d }
            r1.sequenceNumber = r3     // Catch:{ all -> 0x014d }
            java.lang.String r3 = "EndVideo"
            r1.messageName = r3     // Catch:{ all -> 0x014d }
            java.lang.String r3 = "send_pending_message"
            io.reactivex.Observable r1 = r2.a(r3, r1)     // Catch:{ all -> 0x014d }
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.BUFFER     // Catch:{ all -> 0x014d }
            wud r1 = defpackage.vun.a(r1, r2)     // Catch:{ all -> 0x014d }
            wum r2 = r8.q     // Catch:{ all -> 0x014d }
            wud r1 = r1.b(r2)     // Catch:{ all -> 0x014d }
            wug r2 = r8.G     // Catch:{ all -> 0x014d }
            wud r1 = r1.a(r2)     // Catch:{ all -> 0x014d }
            jzu$3 r2 = new jzu$3     // Catch:{ all -> 0x014d }
            r2.<init>(r0)     // Catch:{ all -> 0x014d }
            wuk r0 = defpackage.wud.a(r2, r1)     // Catch:{ all -> 0x014d }
            r8.y = r0     // Catch:{ all -> 0x014d }
            goto L_0x0148
        L_0x013b:
            r0.b()     // Catch:{ all -> 0x014d }
            com.spotify.mobile.android.video.endvideo.EndVideoReportException r0 = new com.spotify.mobile.android.video.endvideo.EndVideoReportException     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "Could not send pending message because a previous creation of pending message failed."
            r0.<init>(r1)     // Catch:{ all -> 0x014d }
            r8.a(r0)     // Catch:{ all -> 0x014d }
        L_0x0148:
            r8.e()     // Catch:{ all -> 0x014d }
            monitor-exit(r8)
            return
        L_0x014d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzu.e():void");
    }

    /* access modifiers changed from: 0000 */
    public void a(EndVideoReportException endVideoReportException) {
        this.x.a(kcn.a(this.r, this.w, (Throwable) endVideoReportException));
    }

    private jzw a(kce kce, kab kab) {
        String str = "";
        String str2 = "endvideo_feature_version";
        a g = new a((String) this.r.e().get("endvideo_playback_id")).b(this.r.a()).a(this.r.a("media.manifest_id", str)).f(this.r.a("endvideo_context_uri", str)).c(this.r.a("endvideo_feature_identifier", str)).d(this.r.a(str2, str)).g(this.r.a("endvideo_device_identifier", str));
        g.a = this.r.a("endvideo_track_uri", str);
        g.p = ((Long) this.H.a(Long.valueOf(0))).longValue();
        a a2 = g.h(this.r.a("endvideo_reason_start", str)).e(this.r.a("endvideo_view_uri", str)).k("com.spotify").i(this.r.a("endvideo_referrer_identifier", str)).j(this.r.a(str2, str)).m(this.r.a("endvideo_provider", str)).a(kab).a((EncryptionType) this.j.d());
        a2.c = c();
        a2.d = d();
        a2.t = kce.r();
        a2.w = this.s.a();
        a2.s = kce.l();
        a2.r = kce.j();
        a2.q = kce.h();
        a2.u = kce.d();
        Optional<Long> optional = this.i;
        Long valueOf = Long.valueOf(-1);
        a b2 = a2.b(((Long) optional.a(valueOf)).longValue());
        b2.e = kce.a();
        b2.x = kce.c();
        b2.g = (int) kce.o();
        b2.i = (int) kce.n();
        b2.h = kce.q();
        b2.j = kce.p();
        b2.n = (int) kce.m();
        b2.m = kce.f();
        b2.l = kce.g();
        b2.v = kce.s();
        b2.f = ((Long) this.h.a(valueOf)).longValue();
        a l = b2.a(((Long) this.f.a(valueOf)).longValue()).d(((Long) this.g.a(valueOf)).longValue()).c(this.z).a((ConnectionType) this.B.a(ConnectionType.CONNECTION_TYPE_UNKNOWN)).b((ConnectionType) this.C.a(ConnectionType.CONNECTION_TYPE_UNKNOWN)).l((String) this.u.a().a(str));
        l.b = this.v.d();
        l.k = false;
        l.o = d(kce.a());
        return l.a();
    }

    private long d(long j) {
        long j2 = 0;
        Long valueOf = Long.valueOf(0);
        long j3 = 0;
        for (kch kch : this.d) {
            if (!kch.a.b()) {
                j3 += ((Long) kch.a().a(valueOf)).longValue();
            }
        }
        long j4 = j - j3;
        if (j4 == 0) {
            return 0;
        }
        for (kch kch2 : this.d) {
            if (kch2.a.b()) {
                double a2 = (double) ((kam) kch2.a.c()).a();
                double longValue = (double) ((Long) kch2.a().a(valueOf)).longValue();
                double d = (double) j4;
                Double.isNaN(longValue);
                Double.isNaN(d);
                double d2 = longValue / d;
                Double.isNaN(a2);
                j2 += (long) (a2 * d2);
            }
        }
        return j2;
    }

    private String c() {
        for (kch kch : this.e) {
            if (kch.a.b()) {
                return ((kac) kch.a.c()).b();
            }
        }
        return "";
    }

    private String d() {
        for (kch kch : this.d) {
            if (kch.a.b()) {
                return ((kam) kch.a.c()).e();
            }
        }
        return "";
    }
}
