package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.exception.ManifestLoadException;
import com.spotify.mobile.android.video.exception.PlaybackException;
import com.spotify.mobile.android.video.exception.UnplayablePlaybackException;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import com.spotify.mobile.android.video.exo.ManifestResponseException;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: jxq reason: default package */
public final class jxq extends kan implements jxm, jyg, a, kbo, kbu {
    private static final Set<Integer> a;
    private boolean A;
    private final kag b;
    private final kbt c;
    private final boolean d;
    private final Cache e;
    private final kby f;
    private final String g;
    private aqt h;
    private jxz i;
    private WeakReference<aqo> j;
    private jzd k;
    private final bbr l;
    private kcs m;
    private VideoSurfaceView n;
    private final Picasso o;
    private int p;
    private int q;
    private volatile int r;
    private boolean s;
    private jyi t = jyi.a;
    private final kct u;
    private kat v;
    private bba w;
    private jyd x;
    private int y = 1;
    private boolean z;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(Integer.valueOf(2));
        a.add(Integer.valueOf(3));
    }

    public final void a(aqo[] aqoArr) {
        for (aqo aqo : aqoArr) {
            if (aqo.a() == 2) {
                this.j = new WeakReference<>(aqo);
            }
        }
    }

    jxq(Context context, Looper looper, wmb wmb, kag kag, jzd jzd, kct kct, Picasso picasso, String str, boolean z2, Cache cache, kby kby, List<kbm> list, kbt kbt, jyd jyd) {
        this.k = jzd;
        this.b = kag;
        this.u = kct;
        this.i = new jxz();
        this.o = picasso;
        this.g = str;
        this.d = z2;
        this.e = cache;
        this.f = kby;
        this.c = kbt;
        this.x = jyd;
        a aVar = new a();
        Handler handler = new Handler(looper);
        bcu.a(true);
        aVar.a = handler;
        aVar.b = this;
        this.l = aVar.a();
        new kaq();
        new kbj();
        new kau();
        jzq a2 = DrmUtil.a(looper, wmb, this, jyd.a());
        boolean z3 = a2 != null;
        this.w = new bba(new a());
        this.h = aqa.a(context, (aqr) new kbi(context, this.f, 1, this), (bbf) this.w, (aqg) new apw(), (asd<ash>) a2, (bbj) this.l);
        aqt aqt = this.h;
        aqt.f.retainAll(Collections.singleton(aqt.h));
        aqt.f.add(this);
        this.k.a.add(this);
        this.h.a((a) this);
        this.v = new kat((wmb) kau.a(wmb, 1), (kbo) kau.a(this, 2), z3, (List) kau.a(list, 4));
        this.r = 2;
    }

    public final void a(jyd jyd) {
        if (r()) {
            this.x = jyd;
        }
    }

    public final void al_() {
        a(jxr.a());
    }

    public final void a(jxr jxr) {
        this.r = 3;
        this.c.b(this);
        if (this.h != null) {
            this.b.a(Optional.c(this.i.a), ReasonEnd.PLAYER_RELEASED, jxr, o());
            this.h.b(this);
        }
        jzd jzd = this.k;
        if (jzd != null) {
            jzd.a((a) this);
        }
        m();
        aqt aqt = this.h;
        if (aqt != null) {
            aqt.b();
        }
        this.h = null;
        this.k = null;
        this.v = null;
        this.i = new jxz();
    }

    private void m() {
        WeakReference<aqo> weakReference = this.j;
        if (weakReference != null) {
            aqo aqo = (aqo) weakReference.get();
            if (aqo instanceof fal) {
                ((fal) aqo).x();
            }
            this.j.clear();
            this.j = null;
        }
    }

    public final void g() {
        d(false);
    }

    public final void h() {
        d(true);
    }

    private void d(boolean z2) {
        if (r()) {
            this.b.a(Optional.c(this.i.a), z2, o());
            e(n());
        }
    }

    private void e(boolean z2) {
        a(2, z2);
        jxz jxz = this.i;
        boolean z3 = (jxz == null || jxz.a == null || !this.i.a.b()) ? false : true;
        if (z2 && !z3) {
            an_();
        }
    }

    private boolean n() {
        return this.c.c() || this.A;
    }

    public final void a(VideoSurfaceView videoSurfaceView) {
        if (r()) {
            this.k.a(videoSurfaceView);
        }
    }

    public final void b(VideoSurfaceView videoSurfaceView) {
        if (r()) {
            this.k.b(videoSurfaceView);
        }
    }

    private long o() {
        return b(this.h.f());
    }

    private void a(BetamaxException betamaxException) {
        Logger.e(betamaxException, "Fatal error", new Object[0]);
        aqt aqt = this.h;
        boolean z2 = true;
        if (aqt == null || aqt.c() != 1) {
            z2 = false;
        }
        if (!z2) {
            this.b.b(Optional.c(this.i.a), betamaxException, o());
        }
        this.h.a(false);
        a(ReasonEnd.FATAL_ERROR);
    }

    private void a(jya jya, long j2, UnplayablePlaybackException unplayablePlaybackException) {
        this.b.b(Optional.b(jya), (BetamaxException) unplayablePlaybackException, j2);
        a(ReasonEnd.FATAL_ERROR);
    }

    private void a(ReasonEnd reasonEnd) {
        this.c.b(this);
        this.h.a();
        this.y = 1;
        g(false);
        this.b.a(Optional.c(this.i.a), reasonEnd, o());
        jxz jxz = this.i;
        jxz.b = false;
        jxz.c = o();
        if (this.n != null) {
            if (this.x.b()) {
                this.n.setKeepScreenOn(false);
            }
            this.n.b();
            b((Surface) null);
        }
        this.h.a((azq) this.n);
        this.n = null;
        if (this.m != null) {
            this.m = null;
        }
    }

    public final void i() {
        s();
    }

    public final void j() {
        s();
    }

    public final void c(VideoSurfaceView videoSurfaceView) {
        e(videoSurfaceView);
    }

    public final void d(VideoSurfaceView videoSurfaceView) {
        e(videoSurfaceView);
    }

    public final void k() {
        s();
    }

    public final void a(jyb jyb, jxx jxx) {
        boolean z2;
        fay.a(jyb);
        if (r()) {
            jya a2 = jya.a(jyb);
            this.b.a(a2, jxx, (apz) this.h, this.g, this.x);
            this.b.a(Optional.c(this.i.a), a2);
            a(ReasonEnd.END_REQUESTED);
            boolean c2 = this.c.c();
            this.i = new jxz(a2);
            this.b.a(a2, c2);
            if (!this.d && a2.c()) {
                a(a2, ((Long) jxx.a().a(Long.valueOf(0))).longValue(), new UnplayablePlaybackException("Unable to play royalty media without royalty support", ErrorType.ERROR_ROYALTY_MEDIA_UNSUPPORTED));
            } else if (!n() || a2.b()) {
                e(n());
                this.c.a(this);
                this.m = this.u.a(a2, this.k.a(a2));
                if (jxx.a().b()) {
                    this.h.a(((Long) jxx.a().c()).longValue());
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.z = false;
                try {
                    kbg a3 = this.v.a(a2, this.l, this.e);
                    this.h.a(jxx.b());
                    this.h.a((axp) a3, z2, true);
                    f(false);
                    p();
                    this.i.e = a3;
                } catch (Exception e2) {
                    Logger.e(e2, "Could not initiate video playback", new Object[0]);
                    a((BetamaxException) new UnplayablePlaybackException("Failed to start playback", ErrorType.ERROR_UNKNOWN, e2));
                }
            } else {
                a(a2, ((Long) jxx.a().a(Long.valueOf(0))).longValue(), new UnplayablePlaybackException("Unable to play media when ", ErrorType.ERROR_AUDIO_ONLY_NOT_ALLOWED));
            }
        }
    }

    public final void am_() {
        if (r()) {
            a(ReasonEnd.END_REQUESTED);
        }
    }

    public final void an_() {
        if (r() && this.h.l()) {
            this.h.a(false);
            this.b.c(Optional.c(this.i.a), o());
        }
    }

    public final void b() {
        if (r() && !this.h.l() && ((!n() || this.i.a.b()) && this.i.b)) {
            if (this.h.c() == 1) {
                this.h.a(this.i.c);
                this.h.a((axp) this.i.e, false, false);
                f(true);
            }
            this.h.a(true);
            this.b.c(Optional.c(this.i.a));
        }
    }

    public final void a(jyi jyi) {
        this.t = jyi;
        p();
    }

    private void p() {
        List<jyi> list;
        if (r()) {
            kbk a2 = this.i.a();
            if (a2 != null) {
                list = a2.a;
            } else {
                list = Collections.emptyList();
            }
            jyi a3 = this.t.a((Iterable<jyi>) list);
            String a4 = a3.a();
            g(!a4.isEmpty());
            bba bba = this.w;
            d a5 = bba.a();
            a5.d = a4;
            bba.a(a5);
            this.b.a(Optional.c(this.i.a), o(), a3);
        }
    }

    public final void a(long j2) {
        if (r()) {
            if (this.h.o() && j2 == Long.MAX_VALUE) {
                b q2 = q();
                j2 = q2 != null ? apv.a(q2.h) : 0;
            }
            this.b.a(Optional.c(this.i.a), o(), b(j2));
            this.s = true;
            this.h.a(j2);
        }
    }

    public final void a_(boolean z2) {
        fay.b(r(), "Video player not initialized");
        a(1, true);
    }

    public final void b(boolean z2) {
        this.A = z2;
        if (r()) {
            e(z2);
        }
    }

    public final void c(boolean z2) {
        aqt aqt = this.h;
        int i2 = z2 ? 2 : 0;
        aqt.p();
        aqb aqb = aqt.a;
        if (aqb.g != i2) {
            aqb.g = i2;
            aqb.c.a.a(12, i2, 0).sendToTarget();
            Iterator it = aqb.d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a_(i2);
            }
        }
    }

    public final void a(jya jya) {
        if (r() && b(jya)) {
            this.b.a(Optional.b(jya));
        }
    }

    public final void a(jya jya, List<jyi> list) {
        if (r() && b(jya)) {
            this.b.a(Optional.c(this.i.a), list);
            if (this.i.e != null) {
                kca a2 = this.i.e.a();
                if (a2 != null) {
                    this.i.d = new kcb(a2, this.o);
                }
                VideoSurfaceView videoSurfaceView = this.n;
                if (videoSurfaceView != null) {
                    videoSurfaceView.i = this.i.d;
                }
                p();
            }
        }
    }

    public final void a(jya jya, Exception exc) {
        BetamaxException betamaxException;
        fay.a(jya);
        if (r()) {
            if (!b(jya)) {
                Logger.d("Got renderers exception for video other than the current one, ignoring", new Object[0]);
            } else if (a((Throwable) exc)) {
                an_();
                this.h.a();
            } else {
                if (exc instanceof UnsupportedOperationException) {
                    betamaxException = new ManifestLoadException("Platform not supported", ErrorType.ERROR_UNSUPPORTED_PLATFORM_VERSION, exc);
                } else if (exc instanceof ManifestResponseException) {
                    betamaxException = new ManifestLoadException("Error loading manifest", ((ManifestResponseException) exc).a(), exc);
                } else if (exc instanceof DrmException) {
                    betamaxException = (BetamaxException) exc;
                } else {
                    betamaxException = new ManifestLoadException("Could not load manifest", ErrorType.ERROR_UNKNOWN, exc);
                }
                a(betamaxException);
            }
        }
    }

    public final void l() {
        if (r()) {
            this.b.b(Optional.c(this.i.a));
        }
    }

    public final void d() {
        aqe aqe;
        if (r()) {
            kag kag = this.b;
            Optional c2 = Optional.c(this.i.a);
            if (this.h.i != null) {
                aqe = this.h.i;
            } else {
                aqe = this.h.j;
            }
            UUID uuid = null;
            if (aqe != null) {
                uuid = DrmUtil.a(aqe);
            }
            kag.a(c2, EncryptionType.a(uuid));
        }
    }

    public final void a(Surface surface) {
        if (r()) {
            if (this.i.d != null) {
                kcb kcb = this.i.d;
                if (!(kcb.b == null || kcb.a == null)) {
                    kcb.a.a(kcb.b.a).i();
                }
            }
            VideoSurfaceView videoSurfaceView = this.n;
            if (!(videoSurfaceView == null || videoSurfaceView.d == null)) {
                videoSurfaceView.d.c();
            }
        }
    }

    public final void a(aqu aqu, int i2) {
        if (r()) {
            long e2 = this.h.e();
            if (e2 != -9223372036854775807L) {
                if (!this.h.o()) {
                    this.b.d(Optional.c(this.i.a), e2);
                }
                b q2 = q();
                if (q2 != null) {
                    this.b.a(Optional.c(this.i.a), new kal(apv.a(q2.j), apv.a(q2.i)));
                }
            }
        }
    }

    private b q() {
        if (this.h.k().a()) {
            return null;
        }
        return this.h.k().a(this.h.d(), new b(), false);
    }

    public final void a(boolean z2, int i2) {
        if (r()) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z2);
            String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Ended" : "Ready" : "Buffering" : "Idle";
            objArr[1] = str;
            Logger.b("BetamaxPlayer onPlayerStateChanged, playWhenReady: %b, playbackState: %s", objArr);
            t();
            if (i2 == 1) {
                this.i.c = o();
            } else if (i2 == 2) {
                this.b.a(Optional.c(this.i.a), o());
                VideoSurfaceView videoSurfaceView = this.n;
                if (videoSurfaceView != null) {
                    if (this.s) {
                        videoSurfaceView.a(true);
                    } else {
                        videoSurfaceView.b.setVisibility(0);
                    }
                }
            } else if (i2 == 3) {
                this.s = false;
                int i3 = this.y;
                if (i3 == 2 || i3 == 1) {
                    if (!this.z) {
                        this.z = true;
                        kag kag = this.b;
                        Optional c2 = Optional.c(this.i.a);
                        long o2 = o();
                        aqt aqt = this.h;
                        aqt.p();
                        kag.a(c2, o2, aqt.a.k.b);
                    }
                    this.b.b(Optional.c(this.i.a), o());
                }
            } else if (i2 == 4) {
                a(ReasonEnd.PLAYED_TO_END);
            }
            if (!z2 || i2 != 2) {
                VideoSurfaceView videoSurfaceView2 = this.n;
                if (videoSurfaceView2 != null) {
                    videoSurfaceView2.a(false);
                }
            }
            this.y = i2;
        }
    }

    public final void a(jya jya, int i2, aqe aqe, long j2) {
        if (r() && b(jya) && aqe != null) {
            if (i2 == 2) {
                this.b.a(Optional.c(this.i.a), aqe, j2);
            } else if (i2 == 1) {
                this.b.b(Optional.c(this.i.a), aqe, j2);
            } else {
                Logger.d("Unknown event source id for downstream format changed event", new Object[0]);
            }
        }
    }

    public final void b(int i2, long j2, long j3) {
        if (r()) {
            this.b.a(Optional.c(this.i.a), j2, j3, (long) i2);
        }
    }

    public final void a(int i2, long j2) {
        if (r()) {
            this.b.a(Optional.c(this.i.a), i2);
        }
    }

    public final void a(ExoPlaybackException exoPlaybackException) {
        if (r()) {
            Logger.e(exoPlaybackException, "Video playback error", new Object[0]);
            Throwable cause = exoPlaybackException.getCause();
            String str = "Error during playback";
            if (a(cause)) {
                this.b.a(Optional.c(this.i.a), (BetamaxException) cause.getCause() instanceof NetworkAccessWhileInOfflineModeException ? new PlaybackException(str, ErrorType.ERROR_IN_OFFLINE_MODE, exoPlaybackException) : new PlaybackException(str, ErrorType.ERROR_UNKNOWN, exoPlaybackException), o());
                an_();
                return;
            }
            a((BetamaxException) new PlaybackException(str, ErrorType.ERROR_UNKNOWN, exoPlaybackException));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r3 != -9223372036854775807L) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r8) {
        /*
            r7 = this;
            aqt r0 = r7.h
            r0.p()
            aqb r0 = r0.a
            int r0 = r0.g
            if (r0 == 0) goto L_0x0036
            if (r8 != 0) goto L_0x0036
            kag r1 = r7.b
            jxz r8 = r7.i
            jya r8 = r8.a
            com.google.common.base.Optional r2 = com.google.common.base.Optional.c(r8)
            aqt r8 = r7.h
            boolean r8 = r8.o()
            if (r8 != 0) goto L_0x002f
            aqt r8 = r7.h
            long r3 = r8.e()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = -1
        L_0x0031:
            r5 = 0
            r1.a(r2, r3, r5)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxq.b(int):void");
    }

    public final void a(int i2, int i3, int i4, float f2) {
        if (r()) {
            jxz jxz = this.i;
            if (!(jxz == null || jxz.a == null)) {
                this.q = i2;
                this.p = i3;
                VideoSurfaceView a2 = this.k.a(this.i.a);
                if (a2 != null) {
                    a2.a(i2, i3);
                }
            }
        }
    }

    private boolean r() {
        return this.r == 2;
    }

    private void s() {
        if (r()) {
            f(false);
        }
    }

    private static boolean a(Throwable th) {
        return (th instanceof HttpDataSourceException) && !(th.getCause() instanceof InvalidResponseCodeException);
    }

    private synchronized void e(VideoSurfaceView videoSurfaceView) {
        if (videoSurfaceView == this.n) {
            g(videoSurfaceView);
        }
    }

    private void f(VideoSurfaceView videoSurfaceView) {
        this.h.a((azq) this.n);
        if (videoSurfaceView != null) {
            aqt aqt = this.h;
            if (!aqt.o.isEmpty()) {
                videoSurfaceView.a(aqt.o);
            }
            aqt.d.add(videoSurfaceView);
        }
    }

    private void a(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.h.m(); i3++) {
            if (this.h.a(i3) == i2) {
                this.w.a(i3, z2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            jxz r0 = r5.i     // Catch:{ all -> 0x0097 }
            jya r0 = r0.a     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            jzd r0 = r5.k     // Catch:{ all -> 0x0097 }
            jxz r1 = r5.i     // Catch:{ all -> 0x0097 }
            jya r1 = r1.a     // Catch:{ all -> 0x0097 }
            com.spotify.mobile.android.video.VideoSurfaceView r0 = r0.a(r1)     // Catch:{ all -> 0x0097 }
            com.spotify.mobile.android.video.VideoSurfaceView r1 = r5.n     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x0019
            monitor-exit(r5)
            return
        L_0x0019:
            com.spotify.mobile.android.video.VideoSurfaceView r1 = r5.n     // Catch:{ all -> 0x0097 }
            r2 = 0
            if (r1 == r0) goto L_0x0034
            com.spotify.mobile.android.video.VideoSurfaceView r1 = r5.n     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0034
            jyd r1 = r5.x     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x002f
            com.spotify.mobile.android.video.VideoSurfaceView r1 = r5.n     // Catch:{ all -> 0x0097 }
            r1.setKeepScreenOn(r2)     // Catch:{ all -> 0x0097 }
        L_0x002f:
            com.spotify.mobile.android.video.VideoSurfaceView r1 = r5.n     // Catch:{ all -> 0x0097 }
            r1.b()     // Catch:{ all -> 0x0097 }
        L_0x0034:
            r1 = 1
            if (r0 != 0) goto L_0x0043
            aqt r6 = r5.h     // Catch:{ all -> 0x0097 }
            com.spotify.mobile.android.video.VideoSurfaceView r3 = r5.n     // Catch:{ all -> 0x0097 }
            r6.a(r3)     // Catch:{ all -> 0x0097 }
            r6 = 0
            r5.b(r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0079
        L_0x0043:
            r5.f(r0)     // Catch:{ all -> 0x0097 }
            int r3 = r5.q     // Catch:{ all -> 0x0097 }
            int r4 = r5.p     // Catch:{ all -> 0x0097 }
            r0.a(r3, r4)     // Catch:{ all -> 0x0097 }
            com.spotify.mobile.android.video.VideoSurfaceView r3 = r5.n     // Catch:{ all -> 0x0097 }
            if (r3 != r0) goto L_0x0053
            if (r6 == 0) goto L_0x0079
        L_0x0053:
            jxz r6 = r5.i     // Catch:{ all -> 0x0097 }
            kcb r6 = r6.d     // Catch:{ all -> 0x0097 }
            r0.i = r6     // Catch:{ all -> 0x0097 }
            com.spotify.mobile.android.video.SubtitlesView r6 = r0.a     // Catch:{ all -> 0x0097 }
            r6.c()     // Catch:{ all -> 0x0097 }
            jzc r6 = r0.d     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0067
            jzc r6 = r0.d     // Catch:{ all -> 0x0097 }
            r6.a()     // Catch:{ all -> 0x0097 }
        L_0x0067:
            aqt r6 = r5.h     // Catch:{ all -> 0x0097 }
            int r6 = r6.c()     // Catch:{ all -> 0x0097 }
            r3 = 2
            if (r6 != r3) goto L_0x0072
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            r0.a(r6)     // Catch:{ all -> 0x0097 }
            r5.g(r0)     // Catch:{ all -> 0x0097 }
        L_0x0079:
            com.spotify.mobile.android.video.VideoSurfaceView r6 = r5.n     // Catch:{ all -> 0x0097 }
            if (r6 == r0) goto L_0x0090
            if (r0 == 0) goto L_0x0084
            boolean r6 = r0.h     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            if (r0 == 0) goto L_0x0090
            kcs r6 = r5.m     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0090
            kcs r6 = r5.m     // Catch:{ all -> 0x0097 }
            r6.a(r0, r1)     // Catch:{ all -> 0x0097 }
        L_0x0090:
            r5.n = r0     // Catch:{ all -> 0x0097 }
            r5.t()     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxq.f(boolean):void");
    }

    private void g(boolean z2) {
        a(3, !z2);
    }

    private void g(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.a(this.q, this.p);
        f(videoSurfaceView);
        Surface surface = videoSurfaceView.f;
        if (surface == null || !surface.isValid()) {
            surface = null;
        }
        b(surface);
        this.b.a(Optional.c(this.i.a), Optional.c(videoSurfaceView), o());
    }

    private void b(Surface surface) {
        WeakReference<aqo> weakReference = this.j;
        if (weakReference != null) {
            aqo aqo = (aqo) weakReference.get();
            if (aqo != null) {
                this.h.a(new a(aqo, 1, surface));
            }
        }
    }

    private void t() {
        if (this.x.b()) {
            VideoSurfaceView videoSurfaceView = this.n;
            if (videoSurfaceView != null) {
                videoSurfaceView.setKeepScreenOn(u());
            }
        }
    }

    private boolean b(jya jya) {
        return jya.equals(this.i.a);
    }

    private boolean u() {
        return this.h.l() && a.contains(Integer.valueOf(this.h.c()));
    }

    private long b(long j2) {
        if (!this.h.o()) {
            return j2;
        }
        aqu k2 = this.h.k();
        if (k2.a()) {
            return j2;
        }
        a aVar = new a();
        k2.a(this.h.n(), aVar, false);
        return j2 - apv.a(aVar.e);
    }

    public final void a(jyb jyb) {
        a(jyb, jxx.c().c());
    }
}
