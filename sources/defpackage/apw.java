package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: apw reason: default package */
public final class apw implements aqg {
    private final bbq a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final bdm h;
    private final long i;
    private final boolean j;
    private int k;
    private boolean l;

    public apw() {
        this(new bbq(true, 65536));
    }

    @Deprecated
    private apw(bbq bbq) {
        this(bbq, 15000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, true);
    }

    @Deprecated
    private apw(bbq bbq, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(bbq, 15000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, true, null);
    }

    @Deprecated
    private apw(bbq bbq, int i2, int i3, int i4, int i5, int i6, boolean z, bdm bdm) {
        this(bbq, i2, i3, i4, i5, i6, z, null, 0, false);
    }

    private apw(bbq bbq, int i2, int i3, int i4, int i5, int i6, boolean z, bdm bdm, int i7, boolean z2) {
        String str = "bufferForPlaybackMs";
        String str2 = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        a(i4, 0, str, str2);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        a(i5, 0, str3, str2);
        String str4 = "minBufferMs";
        a(i2, i4, str4, str);
        a(i2, i5, str4, str3);
        a(i3, i2, "maxBufferMs", str4);
        a(0, 0, "backBufferDurationMs", str2);
        this.a = bbq;
        this.b = apv.b((long) i2);
        this.c = apv.b((long) i3);
        this.d = apv.b((long) i4);
        this.e = apv.b((long) i5);
        this.f = i6;
        this.g = z;
        this.h = bdm;
        this.i = apv.b(0);
        this.j = false;
    }

    public final void a() {
        a(false);
    }

    public final void a(aqo[] aqoArr, bbe bbe) {
        int i2 = this.f;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < aqoArr.length; i4++) {
                if (bbe.b[i4] != null) {
                    i3 += bdw.g(aqoArr[i4].a());
                }
            }
            i2 = i3;
        }
        this.k = i2;
        this.a.a(this.k);
    }

    public final void b() {
        a(true);
    }

    public final void c() {
        a(true);
    }

    public final bbi d() {
        return this.a;
    }

    public final long e() {
        return this.i;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean a(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.a.e() >= this.k;
        boolean z3 = this.l;
        long j3 = this.b;
        if (f2 > 1.0f) {
            j3 = Math.min(bdw.a(j3, f2), this.c);
        }
        if (j2 < j3) {
            if (!this.g && z2) {
                z = false;
            }
            this.l = z;
        } else if (j2 > this.c || z2) {
            this.l = false;
        }
        bdm bdm = this.h;
        if (bdm != null) {
            boolean z4 = this.l;
            if (z4 != z3) {
                if (z4) {
                    synchronized (bdm.a) {
                        bdm.b.add(Integer.valueOf(0));
                        bdm.c = Math.max(bdm.c, 0);
                    }
                } else {
                    bdm.a(0);
                }
            }
        }
        return this.l;
    }

    public final boolean a(long j2, float f2, boolean z) {
        long b2 = bdw.b(j2, f2);
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || b2 >= j3 || (!this.g && this.a.e() >= this.k);
    }

    private void a(boolean z) {
        this.k = 0;
        bdm bdm = this.h;
        if (bdm != null && this.l) {
            bdm.a(0);
        }
        this.l = false;
        if (z) {
            this.a.d();
        }
    }

    private static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        bcu.a(z, sb.toString());
    }
}
