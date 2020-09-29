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

/* renamed from: kej reason: default package */
public class kej implements kch {
    private long A;
    private boolean B;
    private int C;
    private int D = -1;
    private Optional<VideoSurfaceView> E = Optional.e();
    private float F = 1.0f;
    private final kaa a;
    private final jtz b;
    protected final List<BufferEvent> c = new ArrayList();
    protected final List<kel<kcm>> d = new ArrayList();
    protected final List<kel<kcc>> e = new ArrayList();
    protected Optional<Long> f = Optional.e();
    protected Optional<Long> g = Optional.e();
    protected Optional<Long> h = Optional.e();
    protected Optional<Long> i = Optional.e();
    protected Optional<EncryptionType> j = Optional.e();
    kai k = kai.a;
    long l;
    int m;
    int n;
    private final List<kem> o = new ArrayList();
    private final List<ken> p = new ArrayList();
    private final List<kek> q = new ArrayList();
    private boolean r;
    private boolean s;
    private long t;
    private long u;
    private Optional<BufferEvent> v = Optional.e();
    private Optional<kem> w = Optional.e();
    private Optional<kel<kcm>> x = Optional.e();
    private Optional<kel<kcc>> y = Optional.e();
    private boolean z = true;

    /* renamed from: kej$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kej.AnonymousClass1.<clinit>():void");
        }
    }

    public kej(kaa kaa, jtz jtz) {
        this.a = kaa;
        this.b = jtz;
    }

    private static int a(kel<kcm> kel) {
        Optional<T> optional = kel.a;
        if (optional.b()) {
            return ((kcm) optional.c()).a();
        }
        return -1;
    }

    private void a(long j2, long j3, Optional<kcm> optional) {
        kcm kcm;
        if (this.x.b()) {
            kcm = (kcm) ((kel) this.x.c()).a.d();
            this.d.add(((kel) this.x.c()).a(j2));
        } else {
            kcm = null;
        }
        if (optional.b()) {
            kcm = (kcm) optional.c();
        }
        this.x = Optional.b(new kel(Optional.c(kcm), j3));
    }

    private void b() {
        if (this.v.b()) {
            this.c.add(((BufferEvent) this.v.c()).a(this.b.c()));
            this.v = Optional.e();
        }
    }

    private void f(long j2, long j3) {
        if (this.w.b()) {
            this.o.add(((kem) this.w.c()).a(j2));
            kem kem = new kem(j3, this.F, VideoSurfaceState.a(this.r, this.s, this.D), this.k.a());
            this.w = Optional.b(kem);
        }
    }

    public final kef a(Optional<Long> optional) {
        long j2;
        float f2;
        int i2;
        int a2;
        int i3;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        List<kem> c2 = c(this.h.b() ? ((Long) this.h.c()).longValue() + 30000 : Long.MAX_VALUE);
        if (this.w.b() && optional.b()) {
            c2.add(((kem) this.w.c()).a(((Long) optional.c()).longValue()));
        }
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        for (kem kem : c2) {
            if (j12 != kem.b || kem.e <= 0.0f) {
                j10 = Math.max(j10, j11);
                j11 = kem.b();
            } else {
                j11 += kem.b();
            }
            j12 = kem.b + ((Long) kem.a().a(Long.valueOf(0))).longValue();
        }
        long max = Math.max(j10, j11);
        Collections.sort(c2, kem.a);
        Iterator it = c2.iterator();
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        while (it.hasNext()) {
            kem kem2 = (kem) it.next();
            Iterator it2 = it;
            long longValue = j13 + ((Long) kem2.a().a(Long.valueOf(j9))).longValue();
            long b2 = j14 + kem2.b();
            int i4 = AnonymousClass1.a[kem2.c.ordinal()];
            if (i4 == 1) {
                j16 += ((Long) kem2.a().a(Long.valueOf(j9))).longValue();
            } else if (i4 == 2 || i4 == 3 || i4 == 4) {
                j15 += ((Long) kem2.a().a(Long.valueOf(j9))).longValue();
            }
            long j20 = longValue;
            long j21 = kem2.b;
            long longValue2 = ((Long) kem2.a().a(Long.valueOf(j9))).longValue();
            long j22 = j17;
            if (j21 >= j22) {
                j5 = j16;
                long j23 = j18 + longValue2;
                j8 = j21 + longValue2;
                j3 = j15;
                j6 = 0;
                long j24 = b2;
                j7 = j23;
                j4 = j24;
            } else {
                j5 = j16;
                long j25 = j18;
                long j26 = j21 + longValue2;
                j4 = b2;
                j3 = j15;
                j6 = 0;
                j7 = Math.max(0, j26 - j22) + j25;
                j8 = Math.max(j22, j26);
            }
            if (!kem2.d.isEmpty()) {
                j19 += ((Long) kem2.a().a(Long.valueOf(j6))).longValue();
            } else {
                long j27 = j19;
            }
            j16 = j5;
            j13 = j20;
            j15 = j3;
            j17 = j8;
            it = it2;
            j9 = 0;
            long j28 = j7;
            j14 = j4;
            j18 = j28;
        }
        long j29 = j16;
        long j30 = j18;
        long j31 = j19;
        if (VERSION.SDK_INT <= 16) {
            f2 = -1.0f;
            j2 = max;
        } else {
            Iterator it3 = c2.iterator();
            float f3 = 0.0f;
            while (it3.hasNext()) {
                kem kem3 = (kem) it3.next();
                Iterator it4 = it3;
                VideoSurfaceState videoSurfaceState = kem3.c;
                long j32 = max;
                if ((videoSurfaceState == VideoSurfaceState.FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION || videoSurfaceState == VideoSurfaceState.FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION || videoSurfaceState == VideoSurfaceState.BACKGROUND) ? false : true) {
                    int i5 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.AnonymousClass1.a[kem3.c.ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        i3 = 1;
                    } else {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                i3 = -1;
                            }
                        }
                        i3 = 0;
                    }
                    f3 += (((float) i3) * ((float) ((Long) kem3.a().a(Long.valueOf(0))).longValue())) / ((float) j13);
                }
                it3 = it4;
                max = j32;
            }
            j2 = max;
            f2 = f3;
        }
        Iterator it5 = this.c.iterator();
        long j33 = j31;
        long j34 = j13;
        long j35 = j15;
        long j36 = j30;
        long j37 = 0;
        long j38 = 0;
        int i6 = 0;
        long j39 = 0;
        long j40 = -1;
        long j41 = 0;
        while (it5.hasNext()) {
            Iterator it6 = it5;
            BufferEvent bufferEvent = (BufferEvent) it5.next();
            float f4 = f2;
            long j42 = j14;
            Long l2 = (Long) bufferEvent.a().a(Long.valueOf(0));
            int i7 = AnonymousClass1.b[bufferEvent.a.ordinal()];
            if (i7 == 1) {
                j40 = l2.longValue();
            } else if (i7 == 2) {
                j41 += l2.longValue();
                j39 = Math.max(j39, l2.longValue());
            } else if (i7 == 3) {
                j37 += l2.longValue();
                i6++;
                j38 = Math.max(j38, l2.longValue());
            }
            it5 = it6;
            f2 = f4;
            j14 = j42;
        }
        float f5 = f2;
        long j43 = j14;
        Iterator it7 = this.p.iterator();
        long j44 = j40;
        int i8 = i6;
        long j45 = 0;
        long j46 = 0;
        int i9 = 0;
        int i10 = 0;
        while (it7.hasNext()) {
            Iterator it8 = it7;
            ken ken = (ken) it7.next();
            long j47 = j38;
            long j48 = j37;
            if (ken.a <= ken.b) {
                i9++;
                j46 += ken.a();
            } else {
                i10++;
                j45 += ken.a();
            }
            it7 = it8;
            j38 = j47;
            j37 = j48;
        }
        long j49 = j37;
        long j50 = j38;
        Optional f6 = fdd.f(this.d, $$Lambda$kej$LdtRIMggdNCTWDBEJeBr_aZzZaw.INSTANCE);
        if (f6.b()) {
            a2 = a((kel) f6.c());
        } else if (this.x.b()) {
            a2 = a((kel) this.x.c());
        } else {
            i2 = -1;
            return new a().i(j41).j(j39).k(j49).l(j50).h(j44).a(j43).b(j34).c(j29).d(j35).e(j33).f(j36).g(j2).c(i10).b(i9).n(j45).m(j46).a(i8).d(i2).o(this.l).a(f5).e(this.C).a();
        }
        i2 = a2;
        return new a().i(j41).j(j39).k(j49).l(j50).h(j44).a(j43).b(j34).c(j29).d(j35).e(j33).f(j36).g(j2).c(i10).b(i9).n(j45).m(j46).a(i8).d(i2).o(this.l).a(f5).e(this.C).a();
    }

    public final void a() {
        this.t = this.b.c();
    }

    public final void a(float f2, long j2, long j3) {
        this.F = f2;
        f(j2, j2);
    }

    public final void a(int i2) {
        this.n += i2;
    }

    public void a(long j2) {
        this.u = this.b.c();
    }

    public void a(long j2, long j3) {
        if (!this.i.b()) {
            this.i = Optional.b(Long.valueOf(this.b.c() - this.A));
        }
        if (!this.w.b()) {
            kem kem = new kem(j2, this.F, VideoSurfaceState.a(this.r, this.s, this.D), this.k.a());
            this.w = Optional.b(kem);
        }
        this.B = true;
        b();
        this.z = true;
    }

    public final void a(long j2, long j3, long j4) {
        f(j2, j3);
        a(j2, j3, Optional.e());
        this.p.add(new ken(j2, j3));
        this.z = false;
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

    public final void a(EncryptionType encryptionType) {
        if (!this.g.b()) {
            this.g = Optional.b(Long.valueOf(this.b.c() - this.u));
        }
        if (!this.j.b()) {
            this.j = Optional.b(encryptionType);
        }
    }

    public /* synthetic */ void a(BetamaxException betamaxException, long j2, long j3) {
        CC.$default$a((kch) this, betamaxException, j2, j3);
    }

    public final void a(List<kai> list) {
        if (!this.f.b()) {
            this.f = Optional.b(Long.valueOf(this.b.c() - this.t));
        }
    }

    public void a(jzr jzr, ReasonEnd reasonEnd, long j2, long j3) {
        int i2;
        if (this.w.b()) {
            this.o.add(((kem) this.w.c()).a(j2));
            this.w = Optional.e();
        }
        if (this.y.b()) {
            this.e.add(((kel) this.y.c()).a(j2));
            this.y = Optional.e();
        }
        if (this.x.b()) {
            this.d.add(((kel) this.x.c()).a(j2));
            this.x = Optional.e();
        }
        b();
        long j4 = this.l;
        List<kek> list = this.q;
        long j5 = 0;
        if (j4 == 0) {
            i2 = 0;
        } else {
            for (kek kek : list) {
                j5 += (kek.a() * kek.b()) / j4;
            }
            i2 = (int) (j5 / 1000);
        }
        this.m = i2;
    }

    public /* synthetic */ void a(kaa kaa, long j2) {
        CC.$default$a((kch) this, kaa, j2);
    }

    public final void a(kai kai, long j2, long j3) {
        this.k = kai;
        f(j2, j2);
    }

    public final void a(kcc kcc, long j2, long j3) {
        kcc kcc2;
        Optional b2 = Optional.b(kcc);
        if (this.y.b()) {
            kcc2 = (kcc) ((kel) this.y.c()).a.d();
            this.e.add(((kel) this.y.c()).a(j2));
        } else {
            kcc2 = null;
        }
        if (b2.b()) {
            kcc2 = (kcc) b2.c();
        }
        this.y = Optional.b(new kel(Optional.c(kcc2), j2));
    }

    public void a(kcm kcm, long j2, long j3) {
        a(j2, j2, Optional.b(kcm));
    }

    public void a(boolean z2, long j2) {
        this.r = z2;
        this.A = this.b.c();
    }

    public final void a(boolean z2, long j2, long j3) {
        this.r = z2;
        f(j2, j2);
    }

    public /* synthetic */ void b(long j2) {
        CC.$default$b(this, j2);
    }

    public void b(long j2, long j3) {
        this.h = Optional.b(Long.valueOf(j2));
    }

    public /* synthetic */ void b(BetamaxException betamaxException, long j2, long j3) {
        CC.$default$b(this, betamaxException, j2, j3);
    }

    /* access modifiers changed from: protected */
    public final List<kem> c(long j2) {
        ArrayList arrayList = new ArrayList();
        for (kem kem : this.o) {
            if (kem.c()) {
                if (((Long) kem.a().c()).longValue() < 0 || kem.b + ((Long) kem.a().c()).longValue() >= j2) {
                    Logger.e("Found invalid play range, length: %d, end position: %d", kem.a().a(Long.valueOf(-1)), Long.valueOf(kem.b + ((Long) kem.a().a(Long.valueOf(-1))).longValue()));
                } else {
                    arrayList.add(kem);
                }
            }
        }
        return arrayList;
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

    public final void e(long j2, long j3) {
        this.l += j2;
        this.q.add(new kee(j3, j2));
    }
}
