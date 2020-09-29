package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: avq reason: default package */
public final class avq implements ast {
    /* access modifiers changed from: private */
    public static final long a = ((long) bdw.g("AC-3"));
    /* access modifiers changed from: private */
    public static final long b = ((long) bdw.g("EAC3"));
    /* access modifiers changed from: private */
    public static final long c = ((long) bdw.g("HEVC"));
    /* access modifiers changed from: private */
    public final int d;
    /* access modifiers changed from: private */
    public final List<bdt> e;
    private final bdj f;
    private final SparseIntArray g;
    /* access modifiers changed from: private */
    public final c h;
    /* access modifiers changed from: private */
    public final SparseArray<avr> i;
    /* access modifiers changed from: private */
    public final SparseBooleanArray j;
    /* access modifiers changed from: private */
    public final SparseBooleanArray k;
    private final avp l;
    private avo m;
    /* access modifiers changed from: private */
    public asv n;
    /* access modifiers changed from: private */
    public int o;
    /* access modifiers changed from: private */
    public boolean p;
    private boolean q;
    private boolean r;
    /* access modifiers changed from: private */
    public avr s;
    private int t;
    /* access modifiers changed from: private */
    public int u;

    /* renamed from: avq$a */
    class a implements avk {
        private final bdi a = new bdi(new byte[4]);

        public final void a(bdt bdt, asv asv, d dVar) {
        }

        public a() {
        }

        public final void a(bdj bdj) {
            if (bdj.c() == 0) {
                bdj.d(7);
                int b2 = bdj.b() / 4;
                for (int i = 0; i < b2; i++) {
                    bdj.a(this.a, 4);
                    int c = this.a.c(16);
                    this.a.b(3);
                    if (c == 0) {
                        this.a.b(13);
                    } else {
                        int c2 = this.a.c(13);
                        avq.this.i.put(c2, new avl(new b(c2)));
                        avq.this.o = avq.this.o + 1;
                    }
                }
                if (avq.this.d != 2) {
                    avq.this.i.remove(0);
                }
            }
        }
    }

    /* renamed from: avq$b */
    class b implements avk {
        private final bdi a = new bdi(new byte[5]);
        private final SparseArray<avr> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public final void a(bdt bdt, asv asv, d dVar) {
        }

        public b(int i) {
            this.d = i;
        }

        public final void a(bdj bdj) {
            bdt bdt;
            int i;
            bdt bdt2;
            avr avr;
            int i2;
            bdt bdt3;
            bdj bdj2 = bdj;
            if (bdj.c() == 2) {
                if (avq.this.d == 1 || avq.this.d == 2 || avq.this.o == 1) {
                    bdt = (bdt) avq.this.e.get(0);
                } else {
                    bdt = new bdt(((bdt) avq.this.e.get(0)).a);
                    avq.this.e.add(bdt);
                }
                bdj2.d(2);
                int d2 = bdj.d();
                int i3 = 3;
                bdj2.d(3);
                bdj2.a(this.a, 2);
                this.a.b(3);
                int i4 = 13;
                avq.this.u = this.a.c(13);
                bdj2.a(this.a, 2);
                int i5 = 4;
                this.a.b(4);
                int i6 = 12;
                bdj2.d(this.a.c(12));
                if (avq.this.d == 2 && avq.this.s == null) {
                    defpackage.avr.b bVar = new defpackage.avr.b(21, null, null, bdw.f);
                    avq avq = avq.this;
                    avq.s = avq.h.a(21, bVar);
                    avq.this.s.a(bdt, avq.this.n, new d(d2, 21, 8192));
                }
                this.b.clear();
                this.c.clear();
                int b2 = bdj.b();
                while (b2 > 0) {
                    int i7 = 5;
                    bdj2.a(this.a, 5);
                    int c2 = this.a.c(8);
                    this.a.b(i3);
                    int c3 = this.a.c(i4);
                    this.a.b(i5);
                    int c4 = this.a.c(i6);
                    int i8 = bdj2.b;
                    int i9 = i8 + c4;
                    String str = null;
                    int i10 = -1;
                    List list = null;
                    while (bdj2.b < i9) {
                        int c5 = bdj.c();
                        int c6 = bdj2.b + bdj.c();
                        if (c5 == i7) {
                            long g = bdj.g();
                            if (g != avq.a) {
                                if (g != avq.b) {
                                    if (g == avq.c) {
                                        i10 = 36;
                                    }
                                }
                                bdt3 = bdt;
                                i2 = d2;
                                i10 = 135;
                                bdj2.d(c6 - bdj2.b);
                                bdt = bdt3;
                                d2 = i2;
                                i7 = 5;
                            }
                            bdt3 = bdt;
                            i2 = d2;
                            i10 = 129;
                            bdj2.d(c6 - bdj2.b);
                            bdt = bdt3;
                            d2 = i2;
                            i7 = 5;
                        } else {
                            if (c5 != 106) {
                                if (c5 != 122) {
                                    if (c5 == 123) {
                                        bdt3 = bdt;
                                        i2 = d2;
                                        i10 = 138;
                                        bdj2.d(c6 - bdj2.b);
                                        bdt = bdt3;
                                        d2 = i2;
                                        i7 = 5;
                                    } else if (c5 == 10) {
                                        str = bdj2.e(3).trim();
                                    } else {
                                        int i11 = 3;
                                        if (c5 == 89) {
                                            ArrayList arrayList = new ArrayList();
                                            while (bdj2.b < c6) {
                                                String trim = bdj2.e(i11).trim();
                                                int c7 = bdj.c();
                                                bdt bdt4 = bdt;
                                                byte[] bArr = new byte[4];
                                                int i12 = d2;
                                                bdj2.a(bArr, 0, 4);
                                                arrayList.add(new defpackage.avr.a(trim, c7, bArr));
                                                bdt = bdt4;
                                                d2 = i12;
                                                i11 = 3;
                                            }
                                            bdt3 = bdt;
                                            i2 = d2;
                                            list = arrayList;
                                            i10 = 89;
                                            bdj2.d(c6 - bdj2.b);
                                            bdt = bdt3;
                                            d2 = i2;
                                            i7 = 5;
                                        }
                                    }
                                }
                                bdt3 = bdt;
                                i2 = d2;
                                i10 = 135;
                                bdj2.d(c6 - bdj2.b);
                                bdt = bdt3;
                                d2 = i2;
                                i7 = 5;
                            }
                            bdt3 = bdt;
                            i2 = d2;
                            i10 = 129;
                            bdj2.d(c6 - bdj2.b);
                            bdt = bdt3;
                            d2 = i2;
                            i7 = 5;
                        }
                        bdt3 = bdt;
                        i2 = d2;
                        bdj2.d(c6 - bdj2.b);
                        bdt = bdt3;
                        d2 = i2;
                        i7 = 5;
                    }
                    bdt bdt5 = bdt;
                    int i13 = d2;
                    bdj2.c(i9);
                    defpackage.avr.b bVar2 = new defpackage.avr.b(i10, str, list, Arrays.copyOfRange(bdj2.a, i8, i9));
                    if (c2 == 6) {
                        c2 = bVar2.a;
                    }
                    b2 -= c4 + 5;
                    int i14 = avq.this.d == 2 ? c2 : c3;
                    if (!avq.this.j.get(i14)) {
                        if (avq.this.d == 2) {
                            if (c2 == 21) {
                                avr = avq.this.s;
                                if (avq.this.d == 2 || c3 < this.c.get(i14, 8192)) {
                                    this.c.put(i14, c3);
                                    this.b.put(i14, avr);
                                }
                            }
                        }
                        avr = avq.this.h.a(c2, bVar2);
                        if (avq.this.d == 2) {
                        }
                        this.c.put(i14, c3);
                        this.b.put(i14, avr);
                    }
                    bdt = bdt5;
                    d2 = i13;
                    i3 = 3;
                    i5 = 4;
                    i4 = 13;
                    i6 = 12;
                }
                bdt bdt6 = bdt;
                int i15 = d2;
                int size = this.c.size();
                int i16 = 0;
                while (i16 < size) {
                    int keyAt = this.c.keyAt(i16);
                    int valueAt = this.c.valueAt(i16);
                    avq.this.j.put(keyAt, true);
                    avq.this.k.put(valueAt, true);
                    avr avr2 = (avr) this.b.valueAt(i16);
                    if (avr2 != null) {
                        if (avr2 != avq.this.s) {
                            asv h = avq.this.n;
                            i = i15;
                            d dVar = new d(i, keyAt, 8192);
                            bdt2 = bdt6;
                            avr2.a(bdt2, h, dVar);
                        } else {
                            bdt2 = bdt6;
                            i = i15;
                        }
                        avq.this.i.put(valueAt, avr2);
                    } else {
                        bdt2 = bdt6;
                        i = i15;
                    }
                    i16++;
                    bdt6 = bdt2;
                    i15 = i;
                }
                if (avq.this.d != 2) {
                    avq.this.i.remove(this.d);
                    avq avq2 = avq.this;
                    avq2.o = avq2.d == 1 ? 0 : avq.this.o - 1;
                    if (avq.this.o == 0) {
                        avq.this.n.a();
                        avq.this.p = true;
                    }
                } else if (!avq.this.p) {
                    avq.this.n.a();
                    avq.this.o = 0;
                    avq.this.p = true;
                }
            }
        }
    }

    static {
        $$Lambda$avq$4SrjazA3c4x43PBsw7vD5HWhg r0 = $$Lambda$avq$4SrjazA3c4x43PBsw7vD5HWhg.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] e() {
        return new ast[]{new avq()};
    }

    public avq() {
        this(0);
    }

    private avq(int i2) {
        this(1, 0);
    }

    public avq(int i2, int i3) {
        this(i2, new bdt(0), new auv(i3));
    }

    public avq(int i2, bdt bdt, c cVar) {
        this.h = (c) bcu.a(cVar);
        this.d = i2;
        if (i2 == 1 || i2 == 2) {
            this.e = Collections.singletonList(bdt);
        } else {
            this.e = new ArrayList();
            this.e.add(bdt);
        }
        this.f = new bdj(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray<>();
        this.g = new SparseIntArray();
        this.l = new avp();
        this.u = -1;
        d();
    }

    public final boolean a(asu asu) {
        boolean z;
        byte[] bArr = this.f.a;
        asu.c(bArr, 0, 940);
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
                asu.b(i2);
                return true;
            }
        }
        return false;
    }

    public final void a(asv asv) {
        this.n = asv;
    }

    public final void a(long j2, long j3) {
        bcu.b(this.d != 2);
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            bdt bdt = (bdt) this.e.get(i2);
            if ((bdt.a() == -9223372036854775807L) || !(bdt.a() == 0 || bdt.a == j3)) {
                bdt.c = -9223372036854775807L;
                bdt.a(j3);
            }
        }
        if (j3 != 0) {
            avo avo = this.m;
            if (avo != null) {
                avo.a(j3);
            }
        }
        this.f.a();
        this.g.clear();
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            ((avr) this.i.valueAt(i3)).a();
        }
        this.t = 0;
    }

    public final int a(asu asu, ata ata) {
        boolean z;
        avr avr;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        long j4;
        asu asu2 = asu;
        ata ata2 = ata;
        long d2 = asu.d();
        int i2 = 1;
        if (this.p) {
            if (!((d2 == -1 || this.d == 2) ? false : true) || this.l.c) {
                if (!this.q) {
                    this.q = true;
                    if (this.l.h != -9223372036854775807L) {
                        j2 = 0;
                        avo avo = r3;
                        z = false;
                        avo avo2 = new avo(this.l.a, this.l.h, d2, this.u);
                        this.m = avo;
                        this.n.a(this.m.a());
                    } else {
                        j2 = 0;
                        z = false;
                        this.n.a(new defpackage.atb.b(this.l.h));
                    }
                } else {
                    j2 = 0;
                    z = false;
                }
                if (this.r) {
                    this.r = z;
                    a(j2, j2);
                    if (asu.c() != j2) {
                        ata2.a = j2;
                        return 1;
                    }
                }
                z2 = true;
                avo avo3 = this.m;
                if (avo3 != null && avo3.b()) {
                    return this.m.a(asu2, ata2, (c) null);
                }
                avr = null;
            } else {
                avp avp = this.l;
                int i3 = this.u;
                if (i3 <= 0) {
                    return avp.a(asu2);
                }
                if (!avp.e) {
                    int min = (int) Math.min(37600, asu.d());
                    long d3 = asu.d() - ((long) min);
                    if (asu.c() != d3) {
                        ata2.a = d3;
                    } else {
                        asu.a();
                        asu2.c(avp.b.a, 0, min);
                        avp.b.c(0);
                        avp.b.b(min);
                        bdj bdj = avp.b;
                        int i4 = bdj.b;
                        int i5 = bdj.c - 1;
                        while (true) {
                            if (i5 < i4) {
                                j4 = -9223372036854775807L;
                                break;
                            }
                            if (bdj.a[i5] == 71) {
                                j4 = avs.a(bdj, i5, i3);
                                if (j4 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i5--;
                        }
                        avp.g = j4;
                        avp.e = true;
                        return 0;
                    }
                } else if (avp.g == -9223372036854775807L) {
                    return avp.a(asu2);
                } else {
                    if (!avp.d) {
                        if (asu.c() != 0) {
                            ata2.a = 0;
                        } else {
                            int min2 = (int) Math.min(37600, asu.d());
                            asu.a();
                            asu2.c(avp.b.a, 0, min2);
                            avp.b.c(0);
                            avp.b.b(min2);
                            bdj bdj2 = avp.b;
                            int i6 = bdj2.b;
                            int i7 = bdj2.c;
                            while (true) {
                                if (i6 >= i7) {
                                    j3 = -9223372036854775807L;
                                    break;
                                }
                                if (bdj2.a[i6] == 71) {
                                    j3 = avs.a(bdj2, i6, i3);
                                    if (j3 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i6++;
                            }
                            avp.f = j3;
                            avp.d = true;
                            return 0;
                        }
                    } else if (avp.f == -9223372036854775807L) {
                        return avp.a(asu2);
                    } else {
                        avp.h = avp.a.b(avp.g) - avp.a.b(avp.f);
                        i2 = avp.a(asu2);
                    }
                }
                return i2;
            }
        } else {
            z2 = true;
            avr = null;
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
            int a2 = asu2.a(bArr, i8, 9400 - i8);
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
        int a3 = avs.a(this.f.a, i9, i10);
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
            avr = (avr) this.i.get(i14);
        }
        if (avr == null) {
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
                avr.a();
            }
        }
        if (z5) {
            this.f.d(this.f.c());
        }
        boolean z6 = this.p;
        if (this.d == 2 || z6 || !this.k.get(i14, z)) {
            this.f.b(i11);
            avr.a(this.f, z4);
            this.f.b(i12);
        }
        if (this.d != 2 && !z6 && this.p && d2 != -1) {
            this.r = z2;
        }
        this.f.c(i11);
        return z ? 1 : 0;
    }

    private void d() {
        this.j.clear();
        this.i.clear();
        SparseArray a2 = this.h.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.put(a2.keyAt(i2), a2.valueAt(i2));
        }
        this.i.put(0, new avl(new a()));
        this.s = null;
    }
}
