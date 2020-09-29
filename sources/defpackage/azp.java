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

/* renamed from: azp reason: default package */
final class azp implements atm, b, ayl, com.google.android.exoplayer2.upstream.Loader.a<ayt>, e {
    private final bcp A;
    private final b B = new b();
    private final List<azl> C = Collections.unmodifiableList(this.e);
    private final Runnable D = new $$Lambda$azp$OcGTSOybHVJXu1WGJXPuBDDN9mY(this);
    private final Runnable E = new $$Lambda$azp$XW4mNRH9QDXkOECwRsGkWw1Ke4E(this);
    private int[] F = new int[0];
    private boolean G;
    private int H = -1;
    private boolean I;
    private int J = -1;
    private int K;
    private ayo L;
    private boolean M;
    private boolean[] N = new boolean[0];
    private long O;
    private boolean P;
    private long Q;
    private int R;
    final int a;
    final azh b;
    final Loader c = new Loader("Loader:HlsSampleStreamWrapper");
    final defpackage.ayh.a d;
    final ArrayList<azl> e = new ArrayList<>();
    final Handler f = new Handler();
    final ArrayList<azo> g = new ArrayList<>();
    ayj[] h = new ayj[0];
    int i;
    boolean j;
    boolean k;
    int l;
    aqv m;
    aqv n;
    boolean o;
    ayo p;
    int[] q;
    int r;
    boolean[] s = new boolean[0];
    long t;
    boolean u;
    boolean v;
    boolean w;
    private final a x;
    private final bbz y;
    private final aqv z;

    /* renamed from: azp$a */
    public interface a extends defpackage.ayl.a<azp> {
        void a(defpackage.azu.a aVar);

        void f();
    }

    public azp(int i2, a aVar, azh azh, bbz bbz, long j2, aqv aqv, bcp bcp, defpackage.ayh.a aVar2) {
        this.a = i2;
        this.x = aVar;
        this.b = azh;
        this.y = bbz;
        this.z = aqv;
        this.A = bcp;
        this.d = aVar2;
        this.t = j2;
        this.O = j2;
    }

    private static aqv a(aqv aqv, aqv aqv2, boolean z2) {
        if (aqv == null) {
            return aqv2;
        }
        int i2 = z2 ? aqv.c : -1;
        String a2 = ben.a(aqv.d, bdx.g(aqv2.f));
        String f2 = bdx.f(a2);
        if (f2 == null) {
            f2 = aqv2.f;
        }
        return aqv2.a(aqv.a, aqv.b, f2, a2, i2, aqv.k, aqv.l, aqv.v, aqv.w);
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

    private static atj b(int i2, int i3) {
        StringBuilder sb = new StringBuilder("Unmapped track with id ");
        sb.append(i2);
        sb.append(" of type ");
        sb.append(i3);
        bdu.c("HlsSampleStreamWrapper", sb.toString());
        return new atj();
    }

    private boolean d(long j2) {
        int length = this.h.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            ayj ayj = this.h[i2];
            ayj.c();
            if (ayj.b(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!this.N[i2] && this.M)) {
                i2++;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void j() {
        this.j = true;
        k();
    }

    /* access modifiers changed from: private */
    public void k() {
        if (!this.o && this.q == null && this.j) {
            ayj[] ayjArr = this.h;
            int length = ayjArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (i2 < length) {
                if (ayjArr[i2].a.d() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            ayo ayo = this.p;
            if (ayo != null) {
                int i3 = ayo.b;
                this.q = new int[i3];
                Arrays.fill(this.q, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        ayj[] ayjArr2 = this.h;
                        if (i5 >= ayjArr2.length) {
                            break;
                        }
                        aqv d2 = ayjArr2[i5].a.d();
                        aqv aqv = this.p.c[i4].b[0];
                        String str = d2.f;
                        String str2 = aqv.f;
                        int g2 = bdx.g(str);
                        if (g2 == 3 ? ben.a((Object) str, (Object) str2) && ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || d2.x == aqv.x) : g2 == bdx.g(str2)) {
                            this.q[i4] = i5;
                            break;
                        }
                        i5++;
                    }
                }
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((azo) it.next()).c();
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
                if (!bdx.b(str3)) {
                    i9 = bdx.a(str3) ? 1 : bdx.c(str3) ? 3 : 6;
                }
                if (b(i9) > b(i7)) {
                    i8 = i6;
                    i7 = i9;
                } else if (i9 == i7 && i8 != -1) {
                    i8 = -1;
                }
                i6++;
            }
            ayn ayn = this.b.a;
            int i10 = ayn.a;
            this.r = -1;
            this.q = new int[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                this.q[i11] = i11;
            }
            ayn[] aynArr = new ayn[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                aqv d3 = this.h[i12].a.d();
                if (i12 == i8) {
                    aqv[] aqvArr = new aqv[i10];
                    if (i10 == 1) {
                        aqvArr[0] = d3.a(ayn.b[0]);
                    } else {
                        for (int i13 = 0; i13 < i10; i13++) {
                            aqvArr[i13] = a(ayn.b[i13], d3, true);
                        }
                    }
                    aynArr[i12] = new ayn(aqvArr);
                    this.r = i12;
                } else {
                    aynArr[i12] = new ayn(a((i7 != 2 || !bdx.a(d3.f)) ? null : this.z, d3, false));
                }
            }
            this.p = new ayo(aynArr);
            if (this.L == null) {
                z2 = true;
            }
            bdl.b(z2);
            this.L = ayo.a;
            this.k = true;
            this.x.f();
        }
    }

    public final int a(int i2) {
        int i3 = this.q[i2];
        if (i3 == -1) {
            return this.L.a(this.p.c[i2]) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.s;
        if (zArr[i3]) {
            return -2;
        }
        zArr[i3] = true;
        return i3;
    }

    public final atu a(int i2, int i3) {
        ayj[] ayjArr = this.h;
        int length = ayjArr.length;
        boolean z2 = false;
        if (i3 == 1) {
            int i4 = this.H;
            if (i4 != -1) {
                if (this.G) {
                    return this.F[i4] == i2 ? ayjArr[i4] : b(i2, i3);
                }
                this.G = true;
                this.F[i4] = i2;
                return ayjArr[i4];
            } else if (this.P) {
                return b(i2, i3);
            }
        } else if (i3 == 2) {
            int i5 = this.J;
            if (i5 != -1) {
                if (this.I) {
                    return this.F[i5] == i2 ? ayjArr[i5] : b(i2, i3);
                }
                this.I = true;
                this.F[i5] = i2;
                return ayjArr[i5];
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
        ayj ayj = new ayj(this.y);
        ayj.a(this.Q);
        ayj.a(this.R);
        ayj.c = this;
        int i7 = length + 1;
        this.F = Arrays.copyOf(this.F, i7);
        this.F[length] = i2;
        this.h = (ayj[]) Arrays.copyOf(this.h, i7);
        this.h[length] = ayj;
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
        return ayj;
    }

    public final /* synthetic */ b a(d dVar, long j2, long j3, IOException iOException, int i2) {
        boolean z2;
        b bVar;
        IOException iOException2 = iOException;
        ayt ayt = (ayt) dVar;
        long c2 = ayt.c();
        boolean z3 = ayt instanceof azl;
        long a2 = this.A.a(iOException2);
        boolean z4 = false;
        if (a2 != -9223372036854775807L) {
            azh azh = this.b;
            z2 = azh.f.a(azh.f.c(azh.a.a(ayt.g)), a2);
        } else {
            z2 = false;
        }
        if (z2) {
            if (z3 && c2 == 0) {
                ArrayList<azl> arrayList = this.e;
                if (((azl) arrayList.remove(arrayList.size() - 1)) == ayt) {
                    z4 = true;
                }
                bdl.b(z4);
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
        defpackage.ayh.a aVar = this.d;
        bcg bcg = ayt.e;
        Uri d2 = ayt.d();
        Map e2 = ayt.e();
        int i3 = ayt.f;
        int i4 = this.a;
        aqv aqv = ayt.g;
        int i5 = ayt.h;
        Object obj = ayt.i;
        long j4 = ayt.j;
        bcg bcg2 = bcg;
        long j5 = ayt.k;
        aVar.a(bcg2, d2, e2, i3, i4, aqv, i5, obj, j4, j5, j2, j3, c2, iOException, !bVar2.a());
        if (z2) {
            if (!this.k) {
                c(this.t);
            } else {
                this.x.a(this);
            }
        }
        return bVar2;
    }

    public final void a() {
        this.P = true;
        this.f.post(this.E);
    }

    public final void a(int i2, boolean z2, boolean z3) {
        if (!z3) {
            this.G = false;
            this.I = false;
        }
        this.R = i2;
        for (ayj a2 : this.h) {
            a2.a(i2);
        }
        if (z2) {
            for (ayj ayj : this.h) {
                ayj.b = true;
            }
        }
    }

    public final void a(long j2) {
    }

    public final void a(ats ats) {
    }

    public final void a(ayo ayo, int i2, ayo ayo2) {
        this.k = true;
        this.p = ayo;
        this.L = ayo2;
        this.r = 0;
        this.x.f();
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3) {
        ayt ayt = (ayt) dVar;
        azh azh = this.b;
        if (ayt instanceof a) {
            a aVar = (a) ayt;
            azh.c = aVar.a;
            azh.a(aVar.e.a, aVar.b, aVar.c);
        }
        this.d.a(ayt.e, ayt.d(), ayt.e(), ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, j2, j3, ayt.c());
        if (!this.k) {
            c(this.t);
        } else {
            this.x.a(this);
        }
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z2) {
        long j4 = j2;
        long j5 = j3;
        ayt ayt = (ayt) dVar;
        defpackage.ayh.a aVar = this.d;
        aVar.b(ayt.e, ayt.d(), ayt.e(), ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, j4, j5, ayt.c());
        if (!z2) {
            c();
            if (this.l > 0) {
                this.x.a(this);
                return;
            }
            return;
        }
    }

    public final void a(boolean z2) {
        this.b.b = z2;
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

    public final void b() {
        if (!this.k) {
            c(this.t);
        }
    }

    public final void b(long j2) {
        this.Q = j2;
        for (ayj a2 : this.h) {
            a2.a(j2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        for (ayj a2 : this.h) {
            a2.a(this.u);
        }
        this.u = false;
    }

    public final boolean c(long j2) {
        List<azl> list;
        long max;
        if (this.w || this.c.a()) {
            return false;
        }
        if (i()) {
            list = Collections.emptyList();
            max = this.O;
        } else {
            list = this.C;
            azl g2 = g();
            max = g2.c ? g2.k : Math.max(this.t, g2.j);
        }
        this.b.a(j2, max, list, this.B);
        boolean z2 = this.B.b;
        ayt ayt = this.B.a;
        defpackage.azu.a aVar = this.B.c;
        this.B.a();
        if (z2) {
            this.O = -9223372036854775807L;
            this.w = true;
            return true;
        } else if (ayt == null) {
            if (aVar != null) {
                this.x.a(aVar);
            }
            return false;
        } else {
            if (ayt instanceof azl) {
                this.O = -9223372036854775807L;
                azl azl = (azl) ayt;
                azl.b = this;
                this.e.add(azl);
                this.m = azl.g;
            }
            this.d.a(ayt.e, ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, this.c.a(ayt, this, this.A.a(ayt.f)));
            return true;
        }
    }

    public final long d() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.O;
        }
        long j2 = this.t;
        azl g2 = g();
        if (!g2.c) {
            if (this.e.size() > 1) {
                ArrayList<azl> arrayList = this.e;
                g2 = (azl) arrayList.get(arrayList.size() - 2);
            } else {
                g2 = null;
            }
        }
        if (g2 != null) {
            j2 = Math.max(j2, g2.k);
        }
        if (this.j) {
            for (ayj ayj : this.h) {
                j2 = Math.max(j2, ayj.a.e());
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

    public final void f() {
        c();
    }

    /* access modifiers changed from: 0000 */
    public azl g() {
        ArrayList<azl> arrayList = this.e;
        return (azl) arrayList.get(arrayList.size() - 1);
    }

    public final void h() {
        this.f.post(this.D);
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.O != -9223372036854775807L;
    }
}
