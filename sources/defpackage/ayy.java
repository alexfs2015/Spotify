package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.b;
import com.google.android.exoplayer2.upstream.Loader.d;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ayy reason: default package */
final class ayy implements asv, b, axu, com.google.android.exoplayer2.upstream.Loader.a<ayc>, e {
    private final bby A;
    private final b B = new b();
    private final List<ayu> C = Collections.unmodifiableList(this.e);
    private final Runnable D = new $$Lambda$ayy$g0c2cjv0VgfM1z6G1li8ZXHwp0(this);
    private final Runnable E = new $$Lambda$ayy$VLK0BqligbrdMgcs4YhBMvMlc(this);
    private int[] F = new int[0];
    private boolean G;
    private int H = -1;
    private boolean I;
    private int J = -1;
    private int K;
    private axx L;
    private boolean M;
    private boolean[] N = new boolean[0];
    private long O;
    private boolean P;
    private long Q;
    private int R;
    final int a;
    final ayq b;
    final Loader c = new Loader("Loader:HlsSampleStreamWrapper");
    final defpackage.axq.a d;
    final ArrayList<ayu> e = new ArrayList<>();
    final Handler f = new Handler();
    final ArrayList<ayx> g = new ArrayList<>();
    axs[] h = new axs[0];
    int i;
    boolean j;
    boolean k;
    int l;
    aqe m;
    aqe n;
    boolean o;
    axx p;
    int[] q;
    int r;
    boolean[] s = new boolean[0];
    long t;
    boolean u;
    boolean v;
    boolean w;
    private final a x;
    private final bbi y;
    private final aqe z;

    /* renamed from: ayy$a */
    public interface a extends defpackage.axu.a<ayy> {
        void a(defpackage.azd.a aVar);

        void f();
    }

    private static int b(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void a(long j2) {
    }

    public final void a(atb atb) {
    }

    public final /* synthetic */ b a(d dVar, long j2, long j3, IOException iOException, int i2) {
        boolean z2;
        b bVar;
        IOException iOException2 = iOException;
        ayc ayc = (ayc) dVar;
        long c2 = ayc.c();
        boolean z3 = ayc instanceof ayu;
        long a2 = this.A.a(iOException2);
        boolean z4 = false;
        if (a2 != -9223372036854775807L) {
            ayq ayq = this.b;
            z2 = ayq.f.a(ayq.f.c(ayq.a.a(ayc.g)), a2);
        } else {
            z2 = false;
        }
        if (z2) {
            if (z3 && c2 == 0) {
                ArrayList<ayu> arrayList = this.e;
                if (((ayu) arrayList.remove(arrayList.size() - 1)) == ayc) {
                    z4 = true;
                }
                bcu.b(z4);
                if (this.e.isEmpty()) {
                    this.O = this.t;
                }
            }
            bVar = Loader.a;
        } else {
            long a3 = this.A.a(iOException2, i2);
            bVar = a3 != -9223372036854775807L ? Loader.a(false, a3) : Loader.b;
        }
        b bVar2 = bVar;
        defpackage.axq.a aVar = this.d;
        bbp bbp = ayc.e;
        Uri d2 = ayc.d();
        Map e2 = ayc.e();
        int i3 = ayc.f;
        int i4 = this.a;
        aqe aqe = ayc.g;
        int i5 = ayc.h;
        Object obj = ayc.i;
        long j4 = ayc.j;
        bbp bbp2 = bbp;
        long j5 = ayc.k;
        aVar.a(bbp2, d2, e2, i3, i4, aqe, i5, obj, j4, j5, j2, j3, c2, iOException, !bVar2.a());
        if (z2) {
            if (!this.k) {
                c(this.t);
            } else {
                this.x.a(this);
            }
        }
        return bVar2;
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3) {
        ayc ayc = (ayc) dVar;
        ayq ayq = this.b;
        if (ayc instanceof a) {
            a aVar = (a) ayc;
            ayq.c = aVar.a;
            ayq.a(aVar.e.a, aVar.b, aVar.c);
        }
        this.d.a(ayc.e, ayc.d(), ayc.e(), ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, j2, j3, ayc.c());
        if (!this.k) {
            c(this.t);
        } else {
            this.x.a(this);
        }
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z2) {
        long j4 = j2;
        long j5 = j3;
        ayc ayc = (ayc) dVar;
        defpackage.axq.a aVar = this.d;
        aVar.b(ayc.e, ayc.d(), ayc.e(), ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, j4, j5, ayc.c());
        if (!z2) {
            c();
            if (this.l > 0) {
                this.x.a(this);
                return;
            }
            return;
        }
    }

    public ayy(int i2, a aVar, ayq ayq, bbi bbi, long j2, aqe aqe, bby bby, defpackage.axq.a aVar2) {
        this.a = i2;
        this.x = aVar;
        this.b = ayq;
        this.y = bbi;
        this.z = aqe;
        this.A = bby;
        this.d = aVar2;
        this.t = j2;
        this.O = j2;
    }

    public final void b() {
        if (!this.k) {
            c(this.t);
        }
    }

    public final void a(axx axx, int i2, axx axx2) {
        this.k = true;
        this.p = axx;
        this.L = axx2;
        this.r = 0;
        this.x.f();
    }

    public final int a(int i2) {
        int i3 = this.q[i2];
        if (i3 != -1) {
            boolean[] zArr = this.s;
            if (zArr[i3]) {
                return -2;
            }
            zArr[i3] = true;
            return i3;
        } else if (this.L.a(this.p.c[i2]) == -1) {
            return -2;
        } else {
            return -3;
        }
    }

    public final boolean a(long j2, boolean z2) {
        this.t = j2;
        if (i()) {
            this.O = j2;
            return true;
        } else if (this.j && !z2 && d(j2)) {
            return false;
        } else {
            this.O = j2;
            this.w = false;
            this.e.clear();
            if (this.c.a()) {
                this.c.b();
            } else {
                c();
            }
            return true;
        }
    }

    public final void f() {
        c();
    }

    public final void a(boolean z2) {
        this.b.b = z2;
    }

    public final long d() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.O;
        }
        long j2 = this.t;
        ayu g2 = g();
        if (!g2.c) {
            if (this.e.size() > 1) {
                ArrayList<ayu> arrayList = this.e;
                g2 = (ayu) arrayList.get(arrayList.size() - 2);
            } else {
                g2 = null;
            }
        }
        if (g2 != null) {
            j2 = Math.max(j2, g2.k);
        }
        if (this.j) {
            for (axs axs : this.h) {
                j2 = Math.max(j2, axs.a.e());
            }
        }
        return j2;
    }

    public final long e() {
        if (i()) {
            return this.O;
        }
        if (this.w) {
            return Long.MIN_VALUE;
        }
        return g().k;
    }

    public final boolean c(long j2) {
        List<ayu> list;
        long max;
        if (this.w || this.c.a()) {
            return false;
        }
        if (i()) {
            list = Collections.emptyList();
            max = this.O;
        } else {
            list = this.C;
            ayu g2 = g();
            if (g2.c) {
                max = g2.k;
            } else {
                max = Math.max(this.t, g2.j);
            }
        }
        this.b.a(j2, max, list, this.B);
        boolean z2 = this.B.b;
        ayc ayc = this.B.a;
        defpackage.azd.a aVar = this.B.c;
        this.B.a();
        if (z2) {
            this.O = -9223372036854775807L;
            this.w = true;
            return true;
        } else if (ayc == null) {
            if (aVar != null) {
                this.x.a(aVar);
            }
            return false;
        } else {
            if (ayc instanceof ayu) {
                this.O = -9223372036854775807L;
                ayu ayu = (ayu) ayc;
                ayu.b = this;
                this.e.add(ayu);
                this.m = ayu.g;
            }
            long a2 = this.c.a(ayc, this, this.A.a(ayc.f));
            this.d.a(ayc.e, ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, a2);
            return true;
        }
    }

    public final void a(int i2, boolean z2, boolean z3) {
        if (!z3) {
            this.G = false;
            this.I = false;
        }
        this.R = i2;
        for (axs a2 : this.h) {
            a2.a(i2);
        }
        if (z2) {
            for (axs axs : this.h) {
                axs.b = true;
            }
        }
    }

    public final atd a(int i2, int i3) {
        axs[] axsArr = this.h;
        int length = axsArr.length;
        boolean z2 = false;
        if (i3 == 1) {
            int i4 = this.H;
            if (i4 != -1) {
                if (!this.G) {
                    this.G = true;
                    this.F[i4] = i2;
                    return axsArr[i4];
                } else if (this.F[i4] == i2) {
                    return axsArr[i4];
                } else {
                    return b(i2, i3);
                }
            } else if (this.P) {
                return b(i2, i3);
            }
        } else if (i3 == 2) {
            int i5 = this.J;
            if (i5 != -1) {
                if (!this.I) {
                    this.I = true;
                    this.F[i5] = i2;
                    return axsArr[i5];
                } else if (this.F[i5] == i2) {
                    return axsArr[i5];
                } else {
                    return b(i2, i3);
                }
            } else if (this.P) {
                return b(i2, i3);
            }
        } else {
            for (int i6 = 0; i6 < length; i6++) {
                if (this.F[i6] == i2) {
                    return this.h[i6];
                }
            }
            if (this.P) {
                return b(i2, i3);
            }
        }
        axs axs = new axs(this.y);
        axs.a(this.Q);
        axs.a(this.R);
        axs.c = this;
        int i7 = length + 1;
        this.F = Arrays.copyOf(this.F, i7);
        this.F[length] = i2;
        this.h = (axs[]) Arrays.copyOf(this.h, i7);
        this.h[length] = axs;
        this.N = Arrays.copyOf(this.N, i7);
        boolean[] zArr = this.N;
        if (i3 == 1 || i3 == 2) {
            z2 = true;
        }
        zArr[length] = z2;
        this.M |= this.N[length];
        if (i3 == 1) {
            this.G = true;
            this.H = length;
        } else if (i3 == 2) {
            this.I = true;
            this.J = length;
        }
        if (b(i3) > b(this.K)) {
            this.i = length;
            this.K = i3;
        }
        this.s = Arrays.copyOf(this.s, i7);
        return axs;
    }

    public final void a() {
        this.P = true;
        this.f.post(this.E);
    }

    public final void h() {
        this.f.post(this.D);
    }

    public final void b(long j2) {
        this.Q = j2;
        for (axs a2 : this.h) {
            a2.a(j2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        for (axs a2 : this.h) {
            a2.a(this.u);
        }
        this.u = false;
    }

    /* access modifiers changed from: private */
    public void j() {
        this.j = true;
        k();
    }

    /* access modifiers changed from: private */
    public void k() {
        boolean z2;
        if (!this.o && this.q == null && this.j) {
            axs[] axsArr = this.h;
            int length = axsArr.length;
            boolean z3 = false;
            int i2 = 0;
            while (i2 < length) {
                if (axsArr[i2].a.d() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            axx axx = this.p;
            if (axx != null) {
                int i3 = axx.b;
                this.q = new int[i3];
                Arrays.fill(this.q, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        axs[] axsArr2 = this.h;
                        if (i5 >= axsArr2.length) {
                            break;
                        }
                        aqe d2 = axsArr2[i5].a.d();
                        aqe aqe = this.p.c[i4].b[0];
                        String str = d2.f;
                        String str2 = aqe.f;
                        int g2 = bdg.g(str);
                        if (g2 == 3 ? bdw.a((Object) str, (Object) str2) && ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || d2.x == aqe.x) : g2 == bdg.g(str2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            this.q[i4] = i5;
                            break;
                        }
                        i5++;
                    }
                }
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((ayx) it.next()).c();
                }
                return;
            }
            int length2 = this.h.length;
            int i6 = 0;
            int i7 = 6;
            int i8 = -1;
            while (true) {
                int i9 = 2;
                if (i6 >= length2) {
                    break;
                }
                String str3 = this.h[i6].a.d().f;
                if (!bdg.b(str3)) {
                    i9 = bdg.a(str3) ? 1 : bdg.c(str3) ? 3 : 6;
                }
                if (b(i9) > b(i7)) {
                    i8 = i6;
                    i7 = i9;
                } else if (i9 == i7 && i8 != -1) {
                    i8 = -1;
                }
                i6++;
            }
            axw axw = this.b.a;
            int i10 = axw.a;
            this.r = -1;
            this.q = new int[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                this.q[i11] = i11;
            }
            axw[] axwArr = new axw[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                aqe d3 = this.h[i12].a.d();
                if (i12 == i8) {
                    aqe[] aqeArr = new aqe[i10];
                    if (i10 == 1) {
                        aqeArr[0] = d3.a(axw.b[0]);
                    } else {
                        for (int i13 = 0; i13 < i10; i13++) {
                            aqeArr[i13] = a(axw.b[i13], d3, true);
                        }
                    }
                    axwArr[i12] = new axw(aqeArr);
                    this.r = i12;
                } else {
                    axwArr[i12] = new axw(a((i7 != 2 || !bdg.a(d3.f)) ? null : this.z, d3, false));
                }
            }
            this.p = new axx(axwArr);
            if (this.L == null) {
                z3 = true;
            }
            bcu.b(z3);
            this.L = axx.a;
            this.k = true;
            this.x.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public ayu g() {
        ArrayList<ayu> arrayList = this.e;
        return (ayu) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.O != -9223372036854775807L;
    }

    private boolean d(long j2) {
        int length = this.h.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            axs axs = this.h[i2];
            axs.c();
            if (axs.b(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!this.N[i2] && this.M)) {
                i2++;
            }
        }
        return false;
    }

    private static aqe a(aqe aqe, aqe aqe2, boolean z2) {
        if (aqe == null) {
            return aqe2;
        }
        int i2 = z2 ? aqe.c : -1;
        String a2 = bdw.a(aqe.d, bdg.g(aqe2.f));
        String f2 = bdg.f(a2);
        if (f2 == null) {
            f2 = aqe2.f;
        }
        return aqe2.a(aqe.a, aqe.b, f2, a2, i2, aqe.k, aqe.l, aqe.v, aqe.w);
    }

    private static ass b(int i2, int i3) {
        StringBuilder sb = new StringBuilder("Unmapped track with id ");
        sb.append(i2);
        sb.append(" of type ");
        sb.append(i3);
        bdd.c("HlsSampleStreamWrapper", sb.toString());
        return new ass();
    }
}
