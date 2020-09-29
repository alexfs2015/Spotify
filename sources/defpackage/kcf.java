package defpackage;

import android.os.Build.VERSION;
import android.view.Display;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.tracking.BufferEvent;
import com.spotify.mobile.android.video.tracking.BufferEvent.Kind;
import com.spotify.mobile.android.video.tracking.VideoSurfaceState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: kcf reason: default package */
public class kcf implements kah {
    private long A;
    private boolean B;
    private int C;
    private int D = -1;
    private Optional<VideoSurfaceView> E = Optional.e();
    private float F = 1.0f;
    private final jya a;
    private final jrp b;
    protected final List<BufferEvent> c = new ArrayList();
    protected final List<kch<kam>> d = new ArrayList();
    protected final List<kch<kac>> e = new ArrayList();
    protected Optional<Long> f = Optional.e();
    protected Optional<Long> g = Optional.e();
    protected Optional<Long> h = Optional.e();
    protected Optional<Long> i = Optional.e();
    protected Optional<EncryptionType> j = Optional.e();
    jyi k = jyi.a;
    long l;
    long m;
    int n;
    private final List<kci> o = new ArrayList();
    private final List<kcj> p = new ArrayList();
    private final List<kcg> q = new ArrayList();
    private boolean r;
    private boolean s;
    private long t;
    private long u;
    private Optional<BufferEvent> v = Optional.e();
    private Optional<kci> w = Optional.e();
    private Optional<kch<kam>> x = Optional.e();
    private Optional<kch<kac>> y = Optional.e();
    private boolean z = true;

    /* renamed from: kcf$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[VideoSurfaceState.values().length];
        static final /* synthetic */ int[] b = new int[Kind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        static {
            /*
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind[] r0 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind r2 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.INITIAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind r3 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.SEEK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.video.tracking.BufferEvent$Kind r4 = com.spotify.mobile.android.video.tracking.BufferEvent.Kind.STALL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.mobile.android.video.tracking.VideoSurfaceState[] r3 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r4 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r3 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_FULLSCREEN_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_FULLSCREEN_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kcf.AnonymousClass1.<clinit>():void");
        }
    }

    public /* synthetic */ void a(BetamaxException betamaxException, long j2, long j3) {
        CC.$default$a((kah) this, betamaxException, j2, j3);
    }

    public /* synthetic */ void a(jya jya, long j2) {
        CC.$default$a((kah) this, jya, j2);
    }

    public /* synthetic */ void b(long j2) {
        CC.$default$b(this, j2);
    }

    public /* synthetic */ void b(BetamaxException betamaxException, long j2, long j3) {
        CC.$default$b(this, betamaxException, j2, j3);
    }

    public kcf(jya jya, jrp jrp) {
        this.a = jya;
        this.b = jrp;
    }

    public void a(boolean z2, long j2) {
        this.r = z2;
        this.A = this.b.c();
    }

    public void a(jxr jxr, ReasonEnd reasonEnd, long j2, long j3) {
        if (this.w.b()) {
            this.o.add(((kci) this.w.c()).a(j2));
            this.w = Optional.e();
        }
        if (this.y.b()) {
            this.e.add(((kch) this.y.c()).a(j2));
            this.y = Optional.e();
        }
        if (this.x.b()) {
            this.d.add(((kch) this.x.c()).a(j2));
            this.x = Optional.e();
        }
        b();
        long j4 = this.l;
        List<kcg> list = this.q;
        long j5 = 0;
        if (j4 != 0) {
            for (kcg kcg : list) {
                j5 += (kcg.a() * kcg.b()) / j4;
            }
            j5 /= 1000;
        }
        this.m = j5;
    }

    public final void a() {
        this.t = this.b.c();
    }

    public final void a(List<jyi> list) {
        if (!this.f.b()) {
            this.f = Optional.b(Long.valueOf(this.b.c() - this.t));
        }
    }

    public void a(long j2) {
        this.u = this.b.c();
    }

    public final void a(EncryptionType encryptionType) {
        if (!this.g.b()) {
            this.g = Optional.b(Long.valueOf(this.b.c() - this.u));
        }
        if (!this.j.b()) {
            this.j = Optional.b(encryptionType);
        }
    }

    public final void a(boolean z2, long j2, long j3) {
        this.r = z2;
        f(j2, j2);
    }

    public void a(Optional<VideoSurfaceView> optional, long j2, long j3) {
        boolean z2 = false;
        int i2 = -1;
        if ((VERSION.SDK_INT > 16) && optional.b()) {
            Display display = ((VideoSurfaceView) optional.c()).getDisplay();
            if (display != null) {
                int rotation = display.getRotation();
                i2 = (rotation == 0 || rotation == 2) ? 0 : 1;
            }
        }
        this.D = i2;
        if (optional.b()) {
            z2 = ((VideoSurfaceView) optional.c()).h;
        }
        this.s = z2;
        f(j2, j2);
        if (!this.E.equals(optional)) {
            this.C++;
        }
        this.E = optional;
    }

    public final void e(long j2, long j3) {
        this.l += j2;
        this.q.add(new kcd(j3, j2));
    }

    public final void a(int i2) {
        this.n += i2;
    }

    public final void a(float f2, long j2, long j3) {
        this.F = f2;
        f(j2, j2);
    }

    public final void a(jyi jyi, long j2, long j3) {
        this.k = jyi;
        f(j2, j2);
    }

    public final void a(long j2, long j3, long j4) {
        f(j2, j3);
        a(j2, j3, Optional.e());
        this.p.add(new kcj(j2, j3));
        this.z = false;
    }

    public void a(long j2, long j3) {
        if (!this.i.b()) {
            this.i = Optional.b(Long.valueOf(this.b.c() - this.A));
        }
        if (!this.w.b()) {
            kci kci = new kci(j2, this.F, VideoSurfaceState.a(this.r, this.s, this.D), this.k.a());
            this.w = Optional.b(kci);
        }
        this.B = true;
        b();
        this.z = true;
    }

    public void b(long j2, long j3) {
        this.h = Optional.b(Long.valueOf(j2));
    }

    public void c(long j2, long j3) {
        f(j2, j2);
    }

    public final void d(long j2, long j3) {
        if (this.B || this.v.b()) {
            if (this.B) {
                b();
                BufferEvent bufferEvent = new BufferEvent(this.z ? Kind.STALL : Kind.SEEK, j2, this.b.c());
                this.v = Optional.b(bufferEvent);
            }
            return;
        }
        BufferEvent bufferEvent2 = new BufferEvent(Kind.INITIAL, j2, this.b.c());
        this.v = Optional.b(bufferEvent2);
    }

    public void a(kam kam, long j2, long j3) {
        a(j2, j2, Optional.b(kam));
    }

    public final void a(kac kac, long j2, long j3) {
        kac kac2;
        Optional b2 = Optional.b(kac);
        if (this.y.b()) {
            kac2 = (kac) ((kch) this.y.c()).a.d();
            this.e.add(((kch) this.y.c()).a(j2));
        } else {
            kac2 = null;
        }
        if (b2.b()) {
            kac2 = (kac) b2.c();
        }
        this.y = Optional.b(new kch(Optional.c(kac2), j2));
    }

    /* access modifiers changed from: protected */
    public final List<kci> c(long j2) {
        ArrayList arrayList = new ArrayList();
        for (kci kci : this.o) {
            if (kci.c()) {
                if (((Long) kci.a().c()).longValue() < 0 || kci.b + ((Long) kci.a().c()).longValue() >= j2) {
                    Logger.e("Found invalid play range, length: %d, end position: %d", kci.a().a(Long.valueOf(-1)), Long.valueOf(kci.b + ((Long) kci.a().a(Long.valueOf(-1))).longValue()));
                } else {
                    arrayList.add(kci);
                }
            }
        }
        return arrayList;
    }

    private void b() {
        if (this.v.b()) {
            this.c.add(((BufferEvent) this.v.c()).a(this.b.c()));
            this.v = Optional.e();
        }
    }

    private void f(long j2, long j3) {
        if (this.w.b()) {
            this.o.add(((kci) this.w.c()).a(j2));
            kci kci = new kci(j3, this.F, VideoSurfaceState.a(this.r, this.s, this.D), this.k.a());
            this.w = Optional.b(kci);
        }
    }

    private void a(long j2, long j3, Optional<kam> optional) {
        kam kam;
        if (this.x.b()) {
            kam = (kam) ((kch) this.x.c()).a.d();
            this.d.add(((kch) this.x.c()).a(j2));
        } else {
            kam = null;
        }
        if (optional.b()) {
            kam = (kam) optional.c();
        }
        this.x = Optional.b(new kch(Optional.c(kam), j3));
    }

    public final kce a(Optional<Long> optional) {
        long j2;
        float f2;
        long j3;
        int a2;
        int i2;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        List<kci> c2 = c(this.h.b() ? ((Long) this.h.c()).longValue() + 30000 : Long.MAX_VALUE);
        if (this.w.b() && optional.b()) {
            c2.add(((kci) this.w.c()).a(((Long) optional.c()).longValue()));
        }
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (kci kci : c2) {
            if (j13 != kci.b || kci.e <= 0.0f) {
                j11 = Math.max(j11, j12);
                j12 = kci.b();
            } else {
                j12 += kci.b();
            }
            j13 = kci.b + ((Long) kci.a().a(Long.valueOf(0))).longValue();
        }
        long max = Math.max(j11, j12);
        Collections.sort(c2, kci.a);
        Iterator it = c2.iterator();
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        while (it.hasNext()) {
            kci kci2 = (kci) it.next();
            Iterator it2 = it;
            long longValue = j14 + ((Long) kci2.a().a(Long.valueOf(j10))).longValue();
            long b2 = j15 + kci2.b();
            int i3 = AnonymousClass1.a[kci2.c.ordinal()];
            if (i3 == 1) {
                j17 += ((Long) kci2.a().a(Long.valueOf(j10))).longValue();
            } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                j16 += ((Long) kci2.a().a(Long.valueOf(j10))).longValue();
            }
            long j21 = longValue;
            long j22 = kci2.b;
            long longValue2 = ((Long) kci2.a().a(Long.valueOf(j10))).longValue();
            long j23 = j18;
            if (j22 >= j23) {
                j6 = j17;
                long j24 = j19 + longValue2;
                j9 = j22 + longValue2;
                j4 = j16;
                j7 = 0;
                long j25 = b2;
                j8 = j24;
                j5 = j25;
            } else {
                j6 = j17;
                long j26 = j19;
                long j27 = j22 + longValue2;
                j5 = b2;
                j4 = j16;
                j7 = 0;
                j8 = Math.max(0, j27 - j23) + j26;
                j9 = Math.max(j23, j27);
            }
            if (!kci2.d.isEmpty()) {
                j20 += ((Long) kci2.a().a(Long.valueOf(j7))).longValue();
            } else {
                long j28 = j20;
            }
            j17 = j6;
            j14 = j21;
            j16 = j4;
            j18 = j9;
            it = it2;
            j10 = 0;
            long j29 = j8;
            j15 = j5;
            j19 = j29;
        }
        long j30 = j17;
        long j31 = j19;
        long j32 = j20;
        if (VERSION.SDK_INT <= 16) {
            f2 = -1.0f;
            j2 = max;
        } else {
            Iterator it3 = c2.iterator();
            float f3 = 0.0f;
            while (it3.hasNext()) {
                kci kci3 = (kci) it3.next();
                Iterator it4 = it3;
                VideoSurfaceState videoSurfaceState = kci3.c;
                long j33 = max;
                if ((videoSurfaceState == VideoSurfaceState.FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION || videoSurfaceState == VideoSurfaceState.FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION || videoSurfaceState == VideoSurfaceState.BACKGROUND) ? false : true) {
                    int i4 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.AnonymousClass1.a[kci3.c.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        i2 = 1;
                    } else {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                i2 = -1;
                            }
                        }
                        i2 = 0;
                    }
                    f3 += (((float) i2) * ((float) ((Long) kci3.a().a(Long.valueOf(0))).longValue())) / ((float) j14);
                }
                it3 = it4;
                max = j33;
            }
            j2 = max;
            f2 = f3;
        }
        Iterator it5 = this.c.iterator();
        long j34 = j32;
        long j35 = j14;
        long j36 = j15;
        long j37 = j16;
        long j38 = j31;
        long j39 = 0;
        long j40 = 0;
        long j41 = 0;
        long j42 = -1;
        long j43 = 0;
        long j44 = 0;
        while (it5.hasNext()) {
            BufferEvent bufferEvent = (BufferEvent) it5.next();
            Iterator it6 = it5;
            float f4 = f2;
            Long l2 = (Long) bufferEvent.a().a(Long.valueOf(0));
            int i5 = AnonymousClass1.b[bufferEvent.a.ordinal()];
            if (i5 == 1) {
                j42 = l2.longValue();
            } else if (i5 == 2) {
                j40 += l2.longValue();
                j44 = Math.max(j44, l2.longValue());
            } else if (i5 == 3) {
                j39 += l2.longValue();
                j41++;
                j43 = Math.max(j43, l2.longValue());
            }
            it5 = it6;
            f2 = f4;
        }
        float f5 = f2;
        long j45 = j39;
        long j46 = j41;
        long j47 = j43;
        long j48 = 0;
        long j49 = 0;
        long j50 = 0;
        long j51 = j42;
        long j52 = 0;
        for (kcj kcj : this.p) {
            long j53 = j44;
            long j54 = j40;
            if (kcj.a <= kcj.b) {
                j49++;
                j50 += kcj.a();
            } else {
                j52++;
                j48 += kcj.a();
            }
            j44 = j53;
            j40 = j54;
        }
        long j55 = j40;
        long j56 = j44;
        Optional f6 = fcl.f(this.d, $$Lambda$kcf$IJlzmZJWdBNBBspgxrKqgymH8Q4.INSTANCE);
        if (f6.b()) {
            a2 = a((kch) f6.c());
        } else if (this.x.b()) {
            a2 = a((kch) this.x.c());
        } else {
            j3 = -1;
            return new a().i(j55).j(j56).k(j45).l(j47).h(j51).a(j36).b(j35).c(j30).d(j37).e(j34).f(j38).g(j2).o(j52).n(j49).q(j48).p(j50).m(j46).r(j3).s(this.l).a(f5).a(this.C).a();
        }
        j3 = (long) a2;
        return new a().i(j55).j(j56).k(j45).l(j47).h(j51).a(j36).b(j35).c(j30).d(j37).e(j34).f(j38).g(j2).o(j52).n(j49).q(j48).p(j50).m(j46).r(j3).s(this.l).a(f5).a(this.C).a();
    }

    private static int a(kch<kam> kch) {
        Optional<T> optional = kch.a;
        if (optional.b()) {
            return ((kam) optional.c()).a();
        }
        return -1;
    }
}
