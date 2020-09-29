package defpackage;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.b;
import com.google.android.exoplayer2.upstream.Loader.d;
import com.google.android.exoplayer2.upstream.Loader.e;
import defpackage.ayx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ayw reason: default package */
public final class ayw<T extends ayx> implements ayk, ayl, com.google.android.exoplayer2.upstream.Loader.a<ayt>, e {
    public final int a;
    public final boolean[] b;
    public final T c;
    public final ArrayList<ayq> d;
    public final ayj e;
    public final ayj[] f;
    public int g;
    private final int[] h;
    private final aqv[] i;
    private final defpackage.ayl.a<ayw<T>> j;
    private final defpackage.ayh.a k;
    private final bcp l;
    private final Loader m;
    private final ayv n;
    private final List<ayq> o;
    private final ays p;
    private aqv q;
    private a<T> r;
    private long s;
    private long t;
    private long u;
    private boolean v;

    /* renamed from: ayw$a */
    public interface a<T extends ayx> {
    }

    @Deprecated
    public ayw(int i2, int[] iArr, aqv[] aqvArr, T t2, defpackage.ayl.a<ayw<T>> aVar, bbz bbz, long j2, int i3, defpackage.ayh.a aVar2) {
        this(i2, (int[]) null, (aqv[]) null, t2, aVar, bbz, j2, (bcp) new bcn(i3), aVar2);
    }

    private ayw(int i2, int[] iArr, aqv[] aqvArr, T t2, defpackage.ayl.a<ayw<T>> aVar, bbz bbz, long j2, bcp bcp, defpackage.ayh.a aVar2) {
        this.a = i2;
        this.h = iArr;
        this.i = aqvArr;
        this.c = t2;
        this.j = aVar;
        this.k = aVar2;
        this.l = bcp;
        this.m = new Loader("Loader:ChunkSampleStream");
        this.n = new ayv();
        this.d = new ArrayList<>();
        this.o = Collections.unmodifiableList(this.d);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f = new ayj[length];
        this.b = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        ayj[] ayjArr = new ayj[i4];
        this.e = new ayj(bbz);
        iArr2[0] = i2;
        ayjArr[0] = this.e;
        while (i3 < length) {
            ayj ayj = new ayj(bbz);
            this.f[i3] = ayj;
            int i5 = i3 + 1;
            ayjArr[i5] = ayj;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.p = new ays(iArr2, ayjArr);
        this.s = j2;
        this.t = j2;
    }

    private boolean a(int i2) {
        int b2;
        ayq ayq = (ayq) this.d.get(i2);
        if (this.e.a.b() > ayq.d[0]) {
            return true;
        }
        int i3 = 0;
        do {
            ayj[] ayjArr = this.f;
            if (i3 >= ayjArr.length) {
                return false;
            }
            b2 = ayjArr[i3].a.b();
            i3++;
        } while (b2 <= ayq.d[i3]);
        return true;
    }

    private void b(int i2) {
        ayq ayq = (ayq) this.d.get(i2);
        aqv aqv = ayq.g;
        if (!aqv.equals(this.q)) {
            this.k.a(this.a, aqv, ayq.h, ayq.i, ayq.j);
        }
        this.q = aqv;
    }

    private ayq c(int i2) {
        ayq ayq = (ayq) this.d.get(i2);
        ArrayList<ayq> arrayList = this.d;
        ben.a((List<T>) arrayList, i2, arrayList.size());
        this.g = Math.max(this.g, this.d.size());
        int i3 = 0;
        this.e.b(ayq.d[0]);
        while (true) {
            ayj[] ayjArr = this.f;
            if (i3 >= ayjArr.length) {
                return ayq;
            }
            ayj ayj = ayjArr[i3];
            i3++;
            ayj.b(ayq.d[i3]);
        }
    }

    private void h() {
        int a2 = a(this.e.a.b(), this.g - 1);
        while (true) {
            int i2 = this.g;
            if (i2 <= a2) {
                this.g = i2 + 1;
                b(i2);
            } else {
                return;
            }
        }
    }

    private ayq i() {
        ArrayList<ayq> arrayList = this.d;
        return (ayq) arrayList.get(arrayList.size() - 1);
    }

    public int a(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.d.size()) {
                return this.d.size() - 1;
            }
        } while (((ayq) this.d.get(i3)).d[0] <= i2);
        return i3 - 1;
    }

    public final int a(aqw aqw, asm asm, boolean z) {
        if (g()) {
            return -3;
        }
        h();
        return this.e.a(aqw, asm, z, this.v, this.u);
    }

    public final /* synthetic */ b a(d dVar, long j2, long j3, IOException iOException, int i2) {
        IOException iOException2 = iOException;
        ayt ayt = (ayt) dVar;
        long c2 = ayt.c();
        boolean z = ayt instanceof ayq;
        int size = this.d.size() - 1;
        boolean z2 = c2 == 0 || !z || !a(size);
        b bVar = null;
        if (this.c.a(ayt, z2, iOException2)) {
            if (z2) {
                bVar = Loader.a;
                if (z) {
                    bdl.b(c(size) == ayt);
                    if (this.d.isEmpty()) {
                        this.s = this.t;
                    }
                }
            } else {
                bdu.c("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (bVar == null) {
            long a2 = this.l.a(iOException2, i2);
            bVar = a2 != -9223372036854775807L ? Loader.a(false, a2) : Loader.b;
        }
        b bVar2 = bVar;
        boolean z3 = !bVar2.a();
        this.k.a(ayt.e, ayt.d(), ayt.e(), ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, j2, j3, c2, iOException, z3);
        if (z3) {
            this.j.a(this);
        }
        return bVar2;
    }

    public final void a(long j2) {
        if (!this.m.a() && !g()) {
            int size = this.d.size();
            int a2 = this.c.a(j2, this.o);
            if (size > a2) {
                while (true) {
                    if (a2 >= size) {
                        a2 = size;
                        break;
                    } else if (!a(a2)) {
                        break;
                    } else {
                        a2++;
                    }
                }
                if (a2 != size) {
                    long j3 = i().k;
                    ayq c2 = c(a2);
                    if (this.d.isEmpty()) {
                        this.s = this.t;
                    }
                    this.v = false;
                    this.k.a(this.a, c2.j, j3);
                }
            }
        }
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        ayt ayt = (ayt) dVar;
        this.c.a(ayt);
        defpackage.ayh.a aVar = this.k;
        aVar.a(ayt.e, ayt.d(), ayt.e(), ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, j4, j5, ayt.c());
        this.j.a(this);
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z) {
        long j4 = j2;
        long j5 = j3;
        ayt ayt = (ayt) dVar;
        this.k.b(ayt.e, ayt.d(), ayt.e(), ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, j4, j5, ayt.c());
        if (!z) {
            this.e.a(false);
            for (ayj a2 : this.f) {
                a2.a(false);
            }
            this.j.a(this);
        }
    }

    public final boolean a() {
        return this.v || (!g() && this.e.a.c());
    }

    public final void b() {
    }

    public final void b(long j2) {
        boolean z;
        ayj[] ayjArr;
        this.t = j2;
        if (g()) {
            this.s = j2;
            return;
        }
        ayq ayq = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.d.size()) {
                break;
            }
            ayq ayq2 = (ayq) this.d.get(i2);
            long j3 = ayq2.j;
            if (j3 != j2 || ayq2.a != -9223372036854775807L) {
                if (j3 > j2) {
                    break;
                }
                i2++;
            } else {
                ayq = ayq2;
                break;
            }
        }
        this.e.c();
        if (ayq != null) {
            z = this.e.a.b(ayq.d[0]);
            this.u = Long.MIN_VALUE;
        } else {
            z = this.e.b(j2, true, (j2 > e() ? 1 : (j2 == e() ? 0 : -1)) < 0) != -1;
            this.u = this.t;
        }
        if (z) {
            this.g = a(this.e.a.b(), 0);
            for (ayj ayj : this.f) {
                ayj.c();
                ayj.b(j2, true, false);
            }
            return;
        }
        this.s = j2;
        this.v = false;
        this.d.clear();
        this.g = 0;
        if (this.m.a()) {
            this.m.b();
            return;
        }
        this.e.a(false);
        for (ayj a2 : this.f) {
            a2.a(false);
        }
    }

    public final int b_(long j2) {
        int i2 = 0;
        if (g()) {
            return 0;
        }
        if (!this.v || j2 <= this.e.a.e()) {
            int b2 = this.e.b(j2, true, true);
            if (b2 != -1) {
                i2 = b2;
            }
        } else {
            i2 = this.e.a.h();
        }
        h();
        return i2;
    }

    public final void c() {
        this.r = null;
        this.e.d();
        for (ayj d2 : this.f) {
            d2.d();
        }
        this.m.a((e) this);
    }

    public final boolean c(long j2) {
        long j3;
        List<ayq> list;
        if (this.v || this.m.a()) {
            return false;
        }
        boolean g2 = g();
        if (g2) {
            list = Collections.emptyList();
            j3 = this.s;
        } else {
            list = this.o;
            j3 = i().k;
        }
        this.c.a(j2, j3, list, this.n);
        boolean z = this.n.b;
        ayt ayt = this.n.a;
        ayv ayv = this.n;
        ayv.a = null;
        ayv.b = false;
        if (z) {
            this.s = -9223372036854775807L;
            this.v = true;
            return true;
        } else if (ayt == null) {
            return false;
        } else {
            if (ayt instanceof ayq) {
                ayq ayq = (ayq) ayt;
                if (g2) {
                    this.u = (ayq.j > this.s ? 1 : (ayq.j == this.s ? 0 : -1)) == 0 ? Long.MIN_VALUE : this.s;
                    this.s = -9223372036854775807L;
                }
                ays ays = this.p;
                ayq.c = ays;
                int[] iArr = new int[ays.a.length];
                for (int i2 = 0; i2 < ays.a.length; i2++) {
                    if (ays.a[i2] != null) {
                        iArr[i2] = ays.a[i2].a.a();
                    }
                }
                ayq.d = iArr;
                this.d.add(ayq);
            }
            this.k.a(ayt.e, ayt.f, this.a, ayt.g, ayt.h, ayt.i, ayt.j, ayt.k, this.m.a(ayt, this, this.l.a(ayt.f)));
            return true;
        }
    }

    public final long d() {
        if (this.v) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.s;
        }
        long j2 = this.t;
        ayq i2 = i();
        if (!i2.g()) {
            if (this.d.size() > 1) {
                ArrayList<ayq> arrayList = this.d;
                i2 = (ayq) arrayList.get(arrayList.size() - 2);
            } else {
                i2 = null;
            }
        }
        if (i2 != null) {
            j2 = Math.max(j2, i2.k);
        }
        return Math.max(j2, this.e.a.e());
    }

    public final long e() {
        if (g()) {
            return this.s;
        }
        if (this.v) {
            return Long.MIN_VALUE;
        }
        return i().k;
    }

    public final void f() {
        this.e.a(false);
        for (ayj a2 : this.f) {
            a2.a(false);
        }
    }

    public final boolean g() {
        return this.s != -9223372036854775807L;
    }
}
