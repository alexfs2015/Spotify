package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: awh reason: default package */
public final class awh implements atk {
    /* access modifiers changed from: private */
    public static final long a = ((long) ben.g("AC-3"));
    /* access modifiers changed from: private */
    public static final long b = ((long) ben.g("EAC3"));
    /* access modifiers changed from: private */
    public static final long c = ((long) ben.g("HEVC"));
    /* access modifiers changed from: private */
    public final int d;
    /* access modifiers changed from: private */
    public final List<bek> e;
    private final bea f;
    private final SparseIntArray g;
    /* access modifiers changed from: private */
    public final c h;
    /* access modifiers changed from: private */
    public final SparseArray<awi> i;
    /* access modifiers changed from: private */
    public final SparseBooleanArray j;
    /* access modifiers changed from: private */
    public final SparseBooleanArray k;
    private final awg l;
    private awf m;
    /* access modifiers changed from: private */
    public atm n;
    /* access modifiers changed from: private */
    public int o;
    /* access modifiers changed from: private */
    public boolean p;
    private boolean q;
    private boolean r;
    /* access modifiers changed from: private */
    public awi s;
    private int t;
    /* access modifiers changed from: private */
    public int u;

    /* renamed from: awh$a */
    class a implements awb {
        private final bdz a = new bdz(new byte[4]);

        public a() {
        }

        public final void a(bea bea) {
            if (bea.c() == 0) {
                bea.d(7);
                int b2 = bea.b() / 4;
                for (int i = 0; i < b2; i++) {
                    bea.a(this.a, 4);
                    int c = this.a.c(16);
                    this.a.b(3);
                    if (c == 0) {
                        this.a.b(13);
                    } else {
                        int c2 = this.a.c(13);
                        awh.this.i.put(c2, new awc(new b(c2)));
                        awh.this.o = awh.this.o + 1;
                    }
                }
                if (awh.this.d != 2) {
                    awh.this.i.remove(0);
                }
            }
        }

        public final void a(bek bek, atm atm, d dVar) {
        }
    }

    /* renamed from: awh$b */
    class b implements awb {
        private final bdz a = new bdz(new byte[5]);
        private final SparseArray<awi> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        public final void a(bea bea) {
            bek bek;
            int i;
            bek bek2;
            awi awi;
            int i2;
            bek bek3;
            bea bea2 = bea;
            if (bea.c() == 2) {
                if (awh.this.d == 1 || awh.this.d == 2 || awh.this.o == 1) {
                    bek = (bek) awh.this.e.get(0);
                } else {
                    bek = new bek(((bek) awh.this.e.get(0)).a);
                    awh.this.e.add(bek);
                }
                bea2.d(2);
                int d2 = bea.d();
                int i3 = 3;
                bea2.d(3);
                bea2.a(this.a, 2);
                this.a.b(3);
                int i4 = 13;
                awh.this.u = this.a.c(13);
                bea2.a(this.a, 2);
                int i5 = 4;
                this.a.b(4);
                int i6 = 12;
                bea2.d(this.a.c(12));
                if (awh.this.d == 2 && awh.this.s == null) {
                    defpackage.awi.b bVar = new defpackage.awi.b(21, null, null, ben.f);
                    awh awh = awh.this;
                    awh.s = awh.h.a(21, bVar);
                    awh.this.s.a(bek, awh.this.n, new d(d2, 21, 8192));
                }
                this.b.clear();
                this.c.clear();
                int b2 = bea.b();
                while (b2 > 0) {
                    int i7 = 5;
                    bea2.a(this.a, 5);
                    int c2 = this.a.c(8);
                    this.a.b(i3);
                    int c3 = this.a.c(i4);
                    this.a.b(i5);
                    int c4 = this.a.c(i6);
                    int i8 = bea2.b;
                    int i9 = i8 + c4;
                    String str = null;
                    int i10 = -1;
                    List list = null;
                    while (bea2.b < i9) {
                        int c5 = bea.c();
                        int c6 = bea2.b + bea.c();
                        if (c5 == i7) {
                            long g = bea.g();
                            if (g != awh.a) {
                                if (g != awh.b) {
                                    if (g == awh.c) {
                                        i10 = 36;
                                    }
                                }
                                bek3 = bek;
                                i2 = d2;
                                i10 = 135;
                                bea2.d(c6 - bea2.b);
                                bek = bek3;
                                d2 = i2;
                                i7 = 5;
                            }
                            bek3 = bek;
                            i2 = d2;
                            i10 = 129;
                            bea2.d(c6 - bea2.b);
                            bek = bek3;
                            d2 = i2;
                            i7 = 5;
                        } else {
                            if (c5 != 106) {
                                if (c5 != 122) {
                                    if (c5 == 123) {
                                        bek3 = bek;
                                        i2 = d2;
                                        i10 = 138;
                                        bea2.d(c6 - bea2.b);
                                        bek = bek3;
                                        d2 = i2;
                                        i7 = 5;
                                    } else if (c5 == 10) {
                                        str = bea2.e(3).trim();
                                    } else {
                                        int i11 = 3;
                                        if (c5 == 89) {
                                            ArrayList arrayList = new ArrayList();
                                            while (bea2.b < c6) {
                                                String trim = bea2.e(i11).trim();
                                                int c7 = bea.c();
                                                bek bek4 = bek;
                                                byte[] bArr = new byte[4];
                                                int i12 = d2;
                                                bea2.a(bArr, 0, 4);
                                                arrayList.add(new defpackage.awi.a(trim, c7, bArr));
                                                bek = bek4;
                                                d2 = i12;
                                                i11 = 3;
                                            }
                                            bek3 = bek;
                                            i2 = d2;
                                            list = arrayList;
                                            i10 = 89;
                                            bea2.d(c6 - bea2.b);
                                            bek = bek3;
                                            d2 = i2;
                                            i7 = 5;
                                        }
                                    }
                                }
                                bek3 = bek;
                                i2 = d2;
                                i10 = 135;
                                bea2.d(c6 - bea2.b);
                                bek = bek3;
                                d2 = i2;
                                i7 = 5;
                            }
                            bek3 = bek;
                            i2 = d2;
                            i10 = 129;
                            bea2.d(c6 - bea2.b);
                            bek = bek3;
                            d2 = i2;
                            i7 = 5;
                        }
                        bek3 = bek;
                        i2 = d2;
                        bea2.d(c6 - bea2.b);
                        bek = bek3;
                        d2 = i2;
                        i7 = 5;
                    }
                    bek bek5 = bek;
                    int i13 = d2;
                    bea2.c(i9);
                    defpackage.awi.b bVar2 = new defpackage.awi.b(i10, str, list, Arrays.copyOfRange(bea2.a, i8, i9));
                    if (c2 == 6) {
                        c2 = bVar2.a;
                    }
                    b2 -= c4 + 5;
                    int i14 = awh.this.d == 2 ? c2 : c3;
                    if (!awh.this.j.get(i14)) {
                        if (awh.this.d == 2) {
                            if (c2 == 21) {
                                awi = awh.this.s;
                                if (awh.this.d == 2 || c3 < this.c.get(i14, 8192)) {
                                    this.c.put(i14, c3);
                                    this.b.put(i14, awi);
                                }
                            }
                        }
                        awi = awh.this.h.a(c2, bVar2);
                        if (awh.this.d == 2) {
                        }
                        this.c.put(i14, c3);
                        this.b.put(i14, awi);
                    }
                    bek = bek5;
                    d2 = i13;
                    i3 = 3;
                    i5 = 4;
                    i4 = 13;
                    i6 = 12;
                }
                bek bek6 = bek;
                int i15 = d2;
                int size = this.c.size();
                int i16 = 0;
                while (i16 < size) {
                    int keyAt = this.c.keyAt(i16);
                    int valueAt = this.c.valueAt(i16);
                    awh.this.j.put(keyAt, true);
                    awh.this.k.put(valueAt, true);
                    awi awi2 = (awi) this.b.valueAt(i16);
                    if (awi2 != null) {
                        if (awi2 != awh.this.s) {
                            atm h = awh.this.n;
                            i = i15;
                            d dVar = new d(i, keyAt, 8192);
                            bek2 = bek6;
                            awi2.a(bek2, h, dVar);
                        } else {
                            bek2 = bek6;
                            i = i15;
                        }
                        awh.this.i.put(valueAt, awi2);
                    } else {
                        bek2 = bek6;
                        i = i15;
                    }
                    i16++;
                    bek6 = bek2;
                    i15 = i;
                }
                if (awh.this.d != 2) {
                    awh.this.i.remove(this.d);
                    awh awh2 = awh.this;
                    awh2.o = awh2.d == 1 ? 0 : awh.this.o - 1;
                    if (awh.this.o == 0) {
                        awh.this.n.a();
                        awh.this.p = true;
                    }
                } else if (!awh.this.p) {
                    awh.this.n.a();
                    awh.this.o = 0;
                    awh.this.p = true;
                }
            }
        }

        public final void a(bek bek, atm atm, d dVar) {
        }
    }

    static {
        $$Lambda$awh$uPxN2FbWRYwCbLNGShYkH0e7RQI r0 = $$Lambda$awh$uPxN2FbWRYwCbLNGShYkH0e7RQI.INSTANCE;
    }

    public awh() {
        this(0);
    }

    private awh(int i2) {
        this(1, 0);
    }

    public awh(int i2, int i3) {
        this(i2, new bek(0), new avm(i3));
    }

    public awh(int i2, bek bek, c cVar) {
        this.h = (c) bdl.a(cVar);
        this.d = i2;
        if (i2 == 1 || i2 == 2) {
            this.e = Collections.singletonList(bek);
        } else {
            this.e = new ArrayList();
            this.e.add(bek);
        }
        this.f = new bea(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray<>();
        this.g = new SparseIntArray();
        this.l = new awg();
        this.u = -1;
        d();
    }

    private void d() {
        this.j.clear();
        this.i.clear();
        SparseArray a2 = this.h.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.put(a2.keyAt(i2), a2.valueAt(i2));
        }
        this.i.put(0, new awc(new a()));
        this.s = null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] e() {
        return new atk[]{new awh()};
    }

    public final int a(atl atl, atr atr) {
        boolean z;
        awi awi;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        long j4;
        atl atl2 = atl;
        atr atr2 = atr;
        long d2 = atl.d();
        int i2 = 1;
        if (this.p) {
            if (!((d2 == -1 || this.d == 2) ? false : true) || this.l.c) {
                if (!this.q) {
                    this.q = true;
                    if (this.l.h != -9223372036854775807L) {
                        j2 = 0;
                        awf awf = r3;
                        z = false;
                        awf awf2 = new awf(this.l.a, this.l.h, d2, this.u);
                        this.m = awf;
                        this.n.a(this.m.a());
                    } else {
                        j2 = 0;
                        z = false;
                        this.n.a(new defpackage.ats.b(this.l.h));
                    }
                } else {
                    j2 = 0;
                    z = false;
                }
                if (this.r) {
                    this.r = z;
                    a(j2, j2);
                    if (atl.c() != j2) {
                        atr2.a = j2;
                        return 1;
                    }
                }
                z2 = true;
                awf awf3 = this.m;
                if (awf3 != null && awf3.b()) {
                    return this.m.a(atl2, atr2, (c) null);
                }
                awi = null;
            } else {
                awg awg = this.l;
                int i3 = this.u;
                if (i3 <= 0) {
                    return awg.a(atl2);
                }
                if (!awg.e) {
                    int min = (int) Math.min(37600, atl.d());
                    long d3 = atl.d() - ((long) min);
                    if (atl.c() != d3) {
                        atr2.a = d3;
                    } else {
                        atl.a();
                        atl2.c(awg.b.a, 0, min);
                        awg.b.c(0);
                        awg.b.b(min);
                        bea bea = awg.b;
                        int i4 = bea.b;
                        int i5 = bea.c - 1;
                        while (true) {
                            if (i5 < i4) {
                                j4 = -9223372036854775807L;
                                break;
                            }
                            if (bea.a[i5] == 71) {
                                j4 = awj.a(bea, i5, i3);
                                if (j4 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i5--;
                        }
                        awg.g = j4;
                        awg.e = true;
                        return 0;
                    }
                } else if (awg.g == -9223372036854775807L) {
                    return awg.a(atl2);
                } else {
                    if (!awg.d) {
                        if (atl.c() != 0) {
                            atr2.a = 0;
                        } else {
                            int min2 = (int) Math.min(37600, atl.d());
                            atl.a();
                            atl2.c(awg.b.a, 0, min2);
                            awg.b.c(0);
                            awg.b.b(min2);
                            bea bea2 = awg.b;
                            int i6 = bea2.b;
                            int i7 = bea2.c;
                            while (true) {
                                if (i6 >= i7) {
                                    j3 = -9223372036854775807L;
                                    break;
                                }
                                if (bea2.a[i6] == 71) {
                                    j3 = awj.a(bea2, i6, i3);
                                    if (j3 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i6++;
                            }
                            awg.f = j3;
                            awg.d = true;
                            return 0;
                        }
                    } else if (awg.f == -9223372036854775807L) {
                        return awg.a(atl2);
                    } else {
                        awg.h = awg.a.b(awg.g) - awg.a.b(awg.f);
                        i2 = awg.a(atl2);
                    }
                }
                return i2;
            }
        } else {
            z2 = true;
            awi = null;
            z = false;
        }
        byte[] bArr = this.f.a;
        if (9400 - this.f.b < 188) {
            int b2 = this.f.b();
            if (b2 > 0) {
                System.arraycopy(bArr, this.f.b, bArr, z, b2);
            }
            this.f.a(bArr, b2);
        }
        while (true) {
            if (this.f.b() >= 188) {
                z3 = true;
                break;
            }
            int i8 = this.f.c;
            int a2 = atl2.a(bArr, i8, 9400 - i8);
            if (a2 == -1) {
                z3 = false;
                break;
            }
            this.f.b(i8 + a2);
        }
        if (!z3) {
            return -1;
        }
        int i9 = this.f.b;
        int i10 = this.f.c;
        int a3 = awj.a(this.f.a, i9, i10);
        this.f.c(a3);
        int i11 = a3 + 188;
        if (i11 > i10) {
            this.t += a3 - i9;
            if (this.d == 2 && this.t > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.t = z;
        }
        int i12 = this.f.c;
        if (i11 > i12) {
            return z;
        }
        int i13 = this.f.i();
        if ((8388608 & i13) != 0) {
            this.f.c(i11);
            return z;
        }
        boolean z4 = (4194304 & i13) != 0;
        int i14 = (2096896 & i13) >> 8;
        boolean z5 = (i13 & 32) != 0;
        if ((i13 & 16) != 0) {
            awi = (awi) this.i.get(i14);
        }
        if (awi == null) {
            this.f.c(i11);
            return z;
        }
        if (this.d != 2) {
            int i15 = i13 & 15;
            int i16 = this.g.get(i14, i15 - 1);
            this.g.put(i14, i15);
            if (i16 == i15) {
                this.f.c(i11);
                return z;
            } else if (i15 != ((i16 + (z2 ? 1 : 0)) & 15)) {
                awi.a();
            }
        }
        if (z5) {
            this.f.d(this.f.c());
        }
        boolean z6 = this.p;
        if (this.d == 2 || z6 || !this.k.get(i14, z)) {
            this.f.b(i11);
            awi.a(this.f, z4);
            this.f.b(i12);
        }
        if (this.d != 2 && !z6 && this.p && d2 != -1) {
            this.r = z2;
        }
        this.f.c(i11);
        return z ? 1 : 0;
    }

    public final void a(long j2, long j3) {
        bdl.b(this.d != 2);
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            bek bek = (bek) this.e.get(i2);
            if ((bek.a() == -9223372036854775807L) || !(bek.a() == 0 || bek.a == j3)) {
                bek.c = -9223372036854775807L;
                bek.a(j3);
            }
        }
        if (j3 != 0) {
            awf awf = this.m;
            if (awf != null) {
                awf.a(j3);
            }
        }
        this.f.a();
        this.g.clear();
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            ((awi) this.i.valueAt(i3)).a();
        }
        this.t = 0;
    }

    public final void a(atm atm) {
        this.n = atm;
    }

    public final boolean a(atl atl) {
        boolean z;
        byte[] bArr = this.f.a;
        atl.c(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                atl.b(i2);
                return true;
            }
        }
        return false;
    }
}
