package defpackage;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.b;
import com.google.android.exoplayer2.upstream.Loader.d;
import com.google.android.exoplayer2.upstream.Loader.e;
import defpackage.ayg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ayf reason: default package */
public final class ayf<T extends ayg> implements axt, axu, com.google.android.exoplayer2.upstream.Loader.a<ayc>, e {
    public final int a;
    public final boolean[] b;
    public final T c;
    public final ArrayList<axz> d;
    public final axs e;
    public final axs[] f;
    public int g;
    private final int[] h;
    private final aqe[] i;
    private final defpackage.axu.a<ayf<T>> j;
    private final defpackage.axq.a k;
    private final bby l;
    private final Loader m;
    private final aye n;
    private final List<axz> o;
    private final ayb p;
    private aqe q;
    private a<T> r;
    private long s;
    private long t;
    private long u;
    private boolean v;

    /* renamed from: ayf$a */
    public interface a<T extends ayg> {
    }

    public final void b() {
    }

    public final /* synthetic */ b a(d dVar, long j2, long j3, IOException iOException, int i2) {
        IOException iOException2 = iOException;
        ayc ayc = (ayc) dVar;
        long c2 = ayc.c();
        boolean z = ayc instanceof axz;
        int size = this.d.size() - 1;
        boolean z2 = c2 == 0 || !z || !a(size);
        b bVar = null;
        if (this.c.a(ayc, z2, iOException2)) {
            if (z2) {
                bVar = Loader.a;
                if (z) {
                    bcu.b(c(size) == ayc);
                    if (this.d.isEmpty()) {
                        this.s = this.t;
                    }
                }
            } else {
                bdd.c("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (bVar == null) {
            long a2 = this.l.a(iOException2, i2);
            bVar = a2 != -9223372036854775807L ? Loader.a(false, a2) : Loader.b;
        }
        b bVar2 = bVar;
        boolean z3 = !bVar2.a();
        this.k.a(ayc.e, ayc.d(), ayc.e(), ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, j2, j3, c2, iOException, z3);
        if (z3) {
            this.j.a(this);
        }
        return bVar2;
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        ayc ayc = (ayc) dVar;
        this.c.a(ayc);
        defpackage.axq.a aVar = this.k;
        aVar.a(ayc.e, ayc.d(), ayc.e(), ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, j4, j5, ayc.c());
        this.j.a(this);
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z) {
        long j4 = j2;
        long j5 = j3;
        ayc ayc = (ayc) dVar;
        this.k.b(ayc.e, ayc.d(), ayc.e(), ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, j4, j5, ayc.c());
        if (!z) {
            this.e.a(false);
            for (axs a2 : this.f) {
                a2.a(false);
            }
            this.j.a(this);
        }
    }

    @Deprecated
    public ayf(int i2, int[] iArr, aqe[] aqeArr, T t2, defpackage.axu.a<ayf<T>> aVar, bbi bbi, long j2, int i3, defpackage.axq.a aVar2) {
        this(i2, (int[]) null, (aqe[]) null, t2, aVar, bbi, j2, (bby) new bbw(i3), aVar2);
    }

    private ayf(int i2, int[] iArr, aqe[] aqeArr, T t2, defpackage.axu.a<ayf<T>> aVar, bbi bbi, long j2, bby bby, defpackage.axq.a aVar2) {
        int i3;
        this.a = i2;
        this.h = iArr;
        this.i = aqeArr;
        this.c = t2;
        this.j = aVar;
        this.k = aVar2;
        this.l = bby;
        this.m = new Loader("Loader:ChunkSampleStream");
        this.n = new aye();
        this.d = new ArrayList<>();
        this.o = Collections.unmodifiableList(this.d);
        int i4 = 0;
        if (iArr == null) {
            i3 = 0;
        } else {
            i3 = iArr.length;
        }
        this.f = new axs[i3];
        this.b = new boolean[i3];
        int i5 = i3 + 1;
        int[] iArr2 = new int[i5];
        axs[] axsArr = new axs[i5];
        this.e = new axs(bbi);
        iArr2[0] = i2;
        axsArr[0] = this.e;
        while (i4 < i3) {
            axs axs = new axs(bbi);
            this.f[i4] = axs;
            int i6 = i4 + 1;
            axsArr[i6] = axs;
            iArr2[i6] = iArr[i4];
            i4 = i6;
        }
        this.p = new ayb(iArr2, axsArr);
        this.s = j2;
        this.t = j2;
    }

    public final long d() {
        if (this.v) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.s;
        }
        long j2 = this.t;
        axz i2 = i();
        if (!i2.g()) {
            if (this.d.size() > 1) {
                ArrayList<axz> arrayList = this.d;
                i2 = (axz) arrayList.get(arrayList.size() - 2);
            } else {
                i2 = null;
            }
        }
        if (i2 != null) {
            j2 = Math.max(j2, i2.k);
        }
        return Math.max(j2, this.e.a.e());
    }

    public final void b(long j2) {
        boolean z;
        axs[] axsArr;
        this.t = j2;
        if (g()) {
            this.s = j2;
            return;
        }
        axz axz = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.d.size()) {
                break;
            }
            axz axz2 = (axz) this.d.get(i2);
            long j3 = axz2.j;
            if (j3 != j2 || axz2.a != -9223372036854775807L) {
                if (j3 > j2) {
                    break;
                }
                i2++;
            } else {
                axz = axz2;
                break;
            }
        }
        this.e.c();
        if (axz != null) {
            z = this.e.a.b(axz.d[0]);
            this.u = Long.MIN_VALUE;
        } else {
            z = this.e.b(j2, true, (j2 > e() ? 1 : (j2 == e() ? 0 : -1)) < 0) != -1;
            this.u = this.t;
        }
        if (z) {
            this.g = a(this.e.a.b(), 0);
            for (axs axs : this.f) {
                axs.c();
                axs.b(j2, true, false);
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
        for (axs a2 : this.f) {
            a2.a(false);
        }
    }

    public final void f() {
        this.e.a(false);
        for (axs a2 : this.f) {
            a2.a(false);
        }
    }

    public final boolean a() {
        return this.v || (!g() && this.e.a.c());
    }

    public final int a(aqf aqf, arv arv, boolean z) {
        if (g()) {
            return -3;
        }
        h();
        return this.e.a(aqf, arv, z, this.v, this.u);
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

    public final boolean c(long j2) {
        long j3;
        List<axz> list;
        long j4;
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
        long j5 = j2;
        this.c.a(j5, j3, list, this.n);
        boolean z = this.n.b;
        ayc ayc = this.n.a;
        aye aye = this.n;
        aye.a = null;
        aye.b = false;
        if (z) {
            this.s = -9223372036854775807L;
            this.v = true;
            return true;
        } else if (ayc == null) {
            return false;
        } else {
            if (ayc instanceof axz) {
                axz axz = (axz) ayc;
                if (g2) {
                    if (axz.j == this.s) {
                        j4 = Long.MIN_VALUE;
                    } else {
                        j4 = this.s;
                    }
                    this.u = j4;
                    this.s = -9223372036854775807L;
                }
                ayb ayb = this.p;
                axz.c = ayb;
                int[] iArr = new int[ayb.a.length];
                for (int i2 = 0; i2 < ayb.a.length; i2++) {
                    if (ayb.a[i2] != null) {
                        iArr[i2] = ayb.a[i2].a.a();
                    }
                }
                axz.d = iArr;
                this.d.add(axz);
            }
            this.k.a(ayc.e, ayc.f, this.a, ayc.g, ayc.h, ayc.i, ayc.j, ayc.k, this.m.a(ayc, this, this.l.a(ayc.f)));
            return true;
        }
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
                    axz c2 = c(a2);
                    if (this.d.isEmpty()) {
                        this.s = this.t;
                    }
                    this.v = false;
                    this.k.a(this.a, c2.j, j3);
                }
            }
        }
    }

    private boolean a(int i2) {
        int b2;
        axz axz = (axz) this.d.get(i2);
        if (this.e.a.b() > axz.d[0]) {
            return true;
        }
        int i3 = 0;
        do {
            axs[] axsArr = this.f;
            if (i3 >= axsArr.length) {
                return false;
            }
            b2 = axsArr[i3].a.b();
            i3++;
        } while (b2 <= axz.d[i3]);
        return true;
    }

    public final boolean g() {
        return this.s != -9223372036854775807L;
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

    private void b(int i2) {
        axz axz = (axz) this.d.get(i2);
        aqe aqe = axz.g;
        if (!aqe.equals(this.q)) {
            this.k.a(this.a, aqe, axz.h, axz.i, axz.j);
        }
        this.q = aqe;
    }

    public int a(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.d.size()) {
                return this.d.size() - 1;
            }
        } while (((axz) this.d.get(i3)).d[0] <= i2);
        return i3 - 1;
    }

    private axz i() {
        ArrayList<axz> arrayList = this.d;
        return (axz) arrayList.get(arrayList.size() - 1);
    }

    private axz c(int i2) {
        axz axz = (axz) this.d.get(i2);
        ArrayList<axz> arrayList = this.d;
        bdw.a((List<T>) arrayList, i2, arrayList.size());
        this.g = Math.max(this.g, this.d.size());
        int i3 = 0;
        this.e.b(axz.d[0]);
        while (true) {
            axs[] axsArr = this.f;
            if (i3 >= axsArr.length) {
                return axz;
            }
            axs axs = axsArr[i3];
            i3++;
            axs.b(axz.d[i3]);
        }
    }

    public final void c() {
        this.r = null;
        this.e.d();
        for (axs d2 : this.f) {
            d2.d();
        }
        this.m.a((e) this);
    }
}
