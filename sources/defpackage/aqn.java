package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: aqn reason: default package */
public final class aqn implements aqx {
    private final bch a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final bed h;
    private final long i;
    private final boolean j;
    private int k;
    private boolean l;

    public aqn() {
        this(new bch(true, 65536));
    }

    @Deprecated
    private aqn(bch bch) {
        this(bch, 15000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, true);
    }

    @Deprecated
    private aqn(bch bch, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(bch, 15000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, true, null);
    }

    @Deprecated
    private aqn(bch bch, int i2, int i3, int i4, int i5, int i6, boolean z, bed bed) {
        this(bch, i2, i3, i4, i5, i6, z, null, 0, false);
    }

    private aqn(bch bch, int i2, int i3, int i4, int i5, int i6, boolean z, bed bed, int i7, boolean z2) {
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
        this.a = bch;
        this.b = aqm.b((long) i2);
        this.c = aqm.b((long) i3);
        this.d = aqm.b((long) i4);
        this.e = aqm.b((long) i5);
        this.f = i6;
        this.g = z;
        this.h = bed;
        this.i = aqm.b(0);
        this.j = false;
    }

    private static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        bdl.a(z, sb.toString());
    }

    private void a(boolean z) {
        this.k = 0;
        bed bed = this.h;
        if (bed != null && this.l) {
            bed.a(0);
        }
        this.l = false;
        if (z) {
            this.a.d();
        }
    }

    public final void a() {
        a(false);
    }

    public final void a(arf[] arfArr, bbv bbv) {
        int i2 = this.f;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < arfArr.length; i4++) {
                if (bbv.b[i4] != null) {
                    i3 += ben.g(arfArr[i4].a());
                }
            }
            i2 = i3;
        }
        this.k = i2;
        this.a.a(this.k);
    }

    public final boolean a(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.a.e() >= this.k;
        boolean z3 = this.l;
        long j3 = this.b;
        if (f2 > 1.0f) {
            j3 = Math.min(ben.a(j3, f2), this.c);
        }
        if (j2 < j3) {
            if (!this.g && z2) {
                z = false;
            }
            this.l = z;
        } else if (j2 > this.c || z2) {
            this.l = false;
        }
        bed bed = this.h;
        if (bed != null) {
            boolean z4 = this.l;
            if (z4 != z3) {
                if (z4) {
                    synchronized (bed.a) {
                        bed.b.add(Integer.valueOf(0));
                        bed.c = Math.max(bed.c, 0);
                    }
                } else {
                    bed.a(0);
                }
            }
        }
        return this.l;
    }

    public final boolean a(long j2, float f2, boolean z) {
        long b2 = ben.b(j2, f2);
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || b2 >= j3 || (!this.g && this.a.e() >= this.k);
    }

    public final void b() {
        a(true);
    }

    public final void c() {
        a(true);
    }

    public final bbz d() {
        return this.a;
    }

    public final long e() {
        return this.i;
    }

    public final boolean f() {
        return this.j;
    }
}
