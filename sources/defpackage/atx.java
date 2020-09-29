package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: atx reason: default package */
public final class atx implements ast {
    private static final int a = bdw.g("seig");
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final aqe c = aqe.a(null, "application/x-emsg", Long.MAX_VALUE);
    private long A;
    private b B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private asv G;
    private atd[] H;
    private atd[] I;
    private boolean J;
    private final int d;
    private final auc e;
    private final List<aqe> f;
    private final asc g;
    private final SparseArray<b> h;
    private final bdj i;
    private final bdj j;
    private final bdj k;
    private final bdt l;
    private final bdj m;
    private final byte[] n;
    private final ArrayDeque<a> o;
    private final ArrayDeque<a> p;
    private final atd q;
    private int r;
    private int s;
    private long t;
    private int u;
    private bdj v;
    private long w;
    private int x;
    private long y;
    private long z;

    /* renamed from: atx$a */
    static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* renamed from: atx$b */
    static final class b {
        public final atd a;
        public final aue b = new aue();
        public auc c;
        public atv d;
        public int e;
        public int f;
        public int g;
        public int h;
        final bdj i = new bdj(1);
        final bdj j = new bdj();

        public b(atd atd) {
            this.a = atd;
        }

        public final void a(auc auc, atv atv) {
            this.c = (auc) bcu.a(auc);
            this.d = (atv) bcu.a(atv);
            this.a.a(auc.f);
            a();
        }

        public final void a(asc asc) {
            aud a2 = this.c.a(this.b.a.a);
            this.a.a(this.c.f.a(asc.a(a2 != null ? a2.b : null)));
        }

        public final void a() {
            this.b.a();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public final void a(long j2) {
            long a2 = apv.a(j2);
            int i2 = this.e;
            while (i2 < this.b.f && this.b.b(i2) < a2) {
                if (this.b.l[i2]) {
                    this.h = i2;
                }
                i2++;
            }
        }

        public final boolean b() {
            this.e++;
            this.f++;
            int i2 = this.f;
            int[] iArr = this.b.h;
            int i3 = this.g;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.g = i3 + 1;
            this.f = 0;
            return false;
        }

        /* access modifiers changed from: 0000 */
        public aud c() {
            aud aud;
            int i2 = this.b.a.a;
            if (this.b.o != null) {
                aud = this.b.o;
            } else {
                aud = this.c.a(i2);
            }
            if (aud == null || !aud.a) {
                return null;
            }
            return aud;
        }
    }

    static {
        $$Lambda$atx$Xip11LLZo3kHTIUIDHHAqBk42s r0 = $$Lambda$atx$Xip11LLZo3kHTIUIDHHAqBk42s.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] c() {
        return new ast[]{new atx()};
    }

    public atx() {
        this(0);
    }

    public atx(int i2) {
        this(i2, null);
    }

    private atx(int i2, bdt bdt) {
        this(i2, null, null, null);
    }

    private atx(int i2, bdt bdt, auc auc, asc asc) {
        this(i2, bdt, null, null, Collections.emptyList());
    }

    public atx(int i2, bdt bdt, auc auc, asc asc, List<aqe> list) {
        this(i2, bdt, auc, asc, list, null);
    }

    private atx(int i2, bdt bdt, auc auc, asc asc, List<aqe> list, atd atd) {
        this.d = i2 | (auc != null ? 8 : 0);
        this.l = bdt;
        this.e = auc;
        this.g = asc;
        this.f = Collections.unmodifiableList(list);
        this.q = null;
        this.m = new bdj(16);
        this.i = new bdj(bdh.a);
        this.j = new bdj(5);
        this.k = new bdj();
        this.n = new byte[16];
        this.o = new ArrayDeque<>();
        this.p = new ArrayDeque<>();
        this.h = new SparseArray<>();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        a();
    }

    public final boolean a(asu asu) {
        return aub.a(asu);
    }

    public final void a(asv asv) {
        this.G = asv;
        auc auc = this.e;
        if (auc != null) {
            b bVar = new b(asv.a(0, auc.b));
            bVar.a(this.e, new atv(0, 0, 0, 0));
            this.h.put(0, bVar);
            b();
            this.G.a();
        }
    }

    public final void a(long j2, long j3) {
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.h.valueAt(i2)).a();
        }
        this.p.clear();
        this.x = 0;
        this.y = j3;
        this.o.clear();
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:288:0x0667 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x02bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.asu r25, defpackage.ata r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
        L_0x0004:
            int r2 = r0.r
            r3 = 2
            r4 = 0
            r5 = 8
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x04a5
            if (r2 == r6) goto L_0x031d
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x02c1
            if (r2 != r11) goto L_0x015a
            atx$b r2 = r0.B
            if (r2 != 0) goto L_0x0084
            android.util.SparseArray<atx$b> r2 = r0.h
            int r12 = r2.size()
            r13 = r9
            r9 = 0
            r10 = r4
        L_0x0027:
            if (r9 >= r12) goto L_0x004a
            java.lang.Object r15 = r2.valueAt(r9)
            atx$b r15 = (defpackage.atx.b) r15
            int r8 = r15.g
            aue r3 = r15.b
            int r3 = r3.e
            if (r8 == r3) goto L_0x0046
            aue r3 = r15.b
            long[] r3 = r3.g
            int r8 = r15.g
            r17 = r3[r8]
            int r3 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x0046
            r10 = r15
            r13 = r17
        L_0x0046:
            int r9 = r9 + 1
            r3 = 2
            goto L_0x0027
        L_0x004a:
            if (r10 != 0) goto L_0x0067
            long r2 = r0.w
            long r4 = r25.c()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005f
            r1.b(r3)
            r24.a()
            r6 = 0
            goto L_0x02bd
        L_0x005f:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            aue r2 = r10.b
            long[] r2 = r2.g
            int r3 = r10.g
            r8 = r2[r3]
            long r2 = r25.c()
            long r8 = r8 - r2
            int r2 = (int) r8
            if (r2 >= 0) goto L_0x007f
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            defpackage.bdd.c(r2, r3)
            r2 = 0
        L_0x007f:
            r1.b(r2)
            r0.B = r10
        L_0x0084:
            atx$b r2 = r0.B
            aue r2 = r2.b
            int[] r2 = r2.i
            atx$b r3 = r0.B
            int r3 = r3.e
            r2 = r2[r3]
            r0.C = r2
            atx$b r2 = r0.B
            int r2 = r2.e
            atx$b r3 = r0.B
            int r3 = r3.h
            if (r2 >= r3) goto L_0x00d7
            int r2 = r0.C
            r1.b(r2)
            atx$b r2 = r0.B
            aud r3 = r2.c()
            if (r3 == 0) goto L_0x00c9
            aue r5 = r2.b
            bdj r5 = r5.q
            int r8 = r3.d
            if (r8 == 0) goto L_0x00b6
            int r3 = r3.d
            r5.d(r3)
        L_0x00b6:
            aue r3 = r2.b
            int r2 = r2.e
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L_0x00c9
            int r2 = r5.d()
            int r2 = r2 * 6
            r5.d(r2)
        L_0x00c9:
            atx$b r2 = r0.B
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x00d3
            r0.B = r4
        L_0x00d3:
            r0.r = r11
            goto L_0x02bd
        L_0x00d7:
            atx$b r2 = r0.B
            auc r2 = r2.c
            int r2 = r2.g
            if (r2 != r6) goto L_0x00e7
            int r2 = r0.C
            int r2 = r2 - r5
            r0.C = r2
            r1.b(r5)
        L_0x00e7:
            atx$b r2 = r0.B
            aud r3 = r2.c()
            if (r3 != 0) goto L_0x00f1
            r2 = 0
            goto L_0x014c
        L_0x00f1:
            int r5 = r3.d
            if (r5 == 0) goto L_0x00fc
            aue r5 = r2.b
            bdj r5 = r5.q
            int r3 = r3.d
            goto L_0x0107
        L_0x00fc:
            byte[] r3 = r3.e
            bdj r5 = r2.j
            int r8 = r3.length
            r5.a(r3, r8)
            bdj r5 = r2.j
            int r3 = r3.length
        L_0x0107:
            aue r8 = r2.b
            int r9 = r2.e
            boolean r8 = r8.c(r9)
            bdj r9 = r2.i
            byte[] r9 = r9.a
            if (r8 == 0) goto L_0x0118
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x0119
        L_0x0118:
            r10 = 0
        L_0x0119:
            r10 = r10 | r3
            byte r10 = (byte) r10
            r9[r7] = r10
            bdj r9 = r2.i
            r9.c(r7)
            atd r9 = r2.a
            bdj r10 = r2.i
            r9.a(r10, r6)
            atd r9 = r2.a
            r9.a(r5, r3)
            if (r8 != 0) goto L_0x0133
            int r2 = r3 + 1
            goto L_0x014c
        L_0x0133:
            aue r5 = r2.b
            bdj r5 = r5.q
            int r8 = r5.d()
            r9 = -2
            r5.d(r9)
            int r8 = r8 * 6
            r9 = 2
            int r8 = r8 + r9
            atd r2 = r2.a
            r2.a(r5, r8)
            int r3 = r3 + 1
            int r2 = r3 + r8
        L_0x014c:
            r0.D = r2
            int r2 = r0.C
            int r3 = r0.D
            int r2 = r2 + r3
            r0.C = r2
            r2 = 4
            r0.r = r2
            r0.E = r7
        L_0x015a:
            atx$b r2 = r0.B
            aue r2 = r2.b
            atx$b r3 = r0.B
            auc r3 = r3.c
            atx$b r5 = r0.B
            atd r5 = r5.a
            atx$b r8 = r0.B
            int r8 = r8.e
            long r9 = r2.b(r8)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r12
            bdt r12 = r0.l
            if (r12 == 0) goto L_0x017a
            long r9 = r12.c(r9)
        L_0x017a:
            int r12 = r3.j
            if (r12 == 0) goto L_0x0237
            bdj r12 = r0.j
            byte[] r12 = r12.a
            r12[r7] = r7
            r12[r6] = r7
            r13 = 2
            r12[r13] = r7
            int r13 = r3.j
            int r13 = r13 + r6
            int r14 = r3.j
            r15 = 4
            int r14 = 4 - r14
        L_0x0191:
            int r15 = r0.D
            int r11 = r0.C
            if (r15 >= r11) goto L_0x0249
            int r11 = r0.E
            if (r11 != 0) goto L_0x01df
            r1.b(r12, r14, r13)
            bdj r11 = r0.j
            r11.c(r7)
            bdj r11 = r0.j
            int r11 = r11.n()
            int r11 = r11 - r6
            r0.E = r11
            bdj r11 = r0.i
            r11.c(r7)
            bdj r11 = r0.i
            r15 = 4
            r5.a(r11, r15)
            bdj r11 = r0.j
            r5.a(r11, r6)
            atd[] r11 = r0.I
            int r11 = r11.length
            if (r11 <= 0) goto L_0x01cf
            aqe r11 = r3.f
            java.lang.String r11 = r11.f
            byte r6 = r12[r15]
            boolean r6 = defpackage.bdh.a(r11, r6)
            if (r6 == 0) goto L_0x01cf
            r6 = 1
            goto L_0x01d0
        L_0x01cf:
            r6 = 0
        L_0x01d0:
            r0.F = r6
            int r6 = r0.D
            int r6 = r6 + 5
            r0.D = r6
            int r6 = r0.C
            int r6 = r6 + r14
            r0.C = r6
            r6 = 1
            goto L_0x0234
        L_0x01df:
            boolean r6 = r0.F
            if (r6 == 0) goto L_0x0222
            bdj r6 = r0.k
            r6.a(r11)
            bdj r6 = r0.k
            byte[] r6 = r6.a
            int r11 = r0.E
            r1.b(r6, r7, r11)
            bdj r6 = r0.k
            int r11 = r0.E
            r5.a(r6, r11)
            int r6 = r0.E
            bdj r11 = r0.k
            byte[] r11 = r11.a
            bdj r15 = r0.k
            int r15 = r15.c
            int r11 = defpackage.bdh.a(r11, r15)
            bdj r15 = r0.k
            aqe r4 = r3.f
            java.lang.String r4 = r4.f
            java.lang.String r7 = "video/hevc"
            boolean r4 = r7.equals(r4)
            r15.c(r4)
            bdj r4 = r0.k
            r4.b(r11)
            bdj r4 = r0.k
            atd[] r7 = r0.I
            defpackage.azy.a(r9, r4, r7)
            goto L_0x0227
        L_0x0222:
            r4 = 0
            int r6 = r5.a(r1, r11, r4)
        L_0x0227:
            int r4 = r0.D
            int r4 = r4 + r6
            r0.D = r4
            int r4 = r0.E
            int r4 = r4 - r6
            r0.E = r4
            r4 = 0
            r6 = 1
            r7 = 0
        L_0x0234:
            r11 = 3
            goto L_0x0191
        L_0x0237:
            int r3 = r0.D
            int r4 = r0.C
            if (r3 >= r4) goto L_0x0249
            int r4 = r4 - r3
            r3 = 0
            int r4 = r5.a(r1, r4, r3)
            int r3 = r0.D
            int r3 = r3 + r4
            r0.D = r3
            goto L_0x0237
        L_0x0249:
            boolean[] r2 = r2.l
            boolean r2 = r2[r8]
            atx$b r3 = r0.B
            aud r3 = r3.c()
            if (r3 == 0) goto L_0x025f
            r4 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r4
            atd$a r4 = r3.c
            r20 = r2
            r23 = r4
            goto L_0x0263
        L_0x025f:
            r20 = r2
            r23 = 0
        L_0x0263:
            int r2 = r0.C
            r22 = 0
            r17 = r5
            r18 = r9
            r21 = r2
            r17.a(r18, r20, r21, r22, r23)
        L_0x0270:
            java.util.ArrayDeque<atx$a> r2 = r0.p
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x02ae
            java.util.ArrayDeque<atx$a> r2 = r0.p
            java.lang.Object r2 = r2.removeFirst()
            atx$a r2 = (defpackage.atx.a) r2
            int r3 = r0.x
            int r4 = r2.b
            int r3 = r3 - r4
            r0.x = r3
            long r3 = r2.a
            long r3 = r3 + r9
            bdt r5 = r0.l
            if (r5 == 0) goto L_0x0292
            long r3 = r5.c(r3)
        L_0x0292:
            atd[] r5 = r0.H
            int r6 = r5.length
            r7 = 0
        L_0x0296:
            if (r7 >= r6) goto L_0x0270
            r17 = r5[r7]
            r20 = 1
            int r8 = r2.b
            int r11 = r0.x
            r23 = 0
            r18 = r3
            r21 = r8
            r22 = r11
            r17.a(r18, r20, r21, r22, r23)
            int r7 = r7 + 1
            goto L_0x0296
        L_0x02ae:
            atx$b r2 = r0.B
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x02b9
            r2 = 0
            r0.B = r2
        L_0x02b9:
            r2 = 3
            r0.r = r2
            r6 = 1
        L_0x02bd:
            if (r6 == 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x02c1:
            android.util.SparseArray<atx$b> r2 = r0.h
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x02c9:
            if (r3 >= r2) goto L_0x02ee
            android.util.SparseArray<atx$b> r5 = r0.h
            java.lang.Object r5 = r5.valueAt(r3)
            atx$b r5 = (defpackage.atx.b) r5
            aue r5 = r5.b
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x02eb
            long r6 = r5.d
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02eb
            long r4 = r5.d
            android.util.SparseArray<atx$b> r6 = r0.h
            java.lang.Object r6 = r6.valueAt(r3)
            atx$b r6 = (defpackage.atx.b) r6
            r9 = r4
            r4 = r6
        L_0x02eb:
            int r3 = r3 + 1
            goto L_0x02c9
        L_0x02ee:
            if (r4 != 0) goto L_0x02f5
            r2 = 3
            r0.r = r2
            goto L_0x0004
        L_0x02f5:
            long r2 = r25.c()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 < 0) goto L_0x0315
            r1.b(r2)
            aue r2 = r4.b
            bdj r3 = r2.q
            byte[] r3 = r3.a
            int r4 = r2.p
            r5 = 0
            r1.b(r3, r5, r4)
            bdj r3 = r2.q
            r3.c(r5)
            r2.r = r5
            goto L_0x0004
        L_0x0315:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x031d:
            long r2 = r0.t
            int r3 = (int) r2
            int r2 = r0.u
            int r3 = r3 - r2
            bdj r2 = r0.v
            if (r2 == 0) goto L_0x0495
            byte[] r2 = r2.a
            r1.b(r2, r5, r3)
            att$b r2 = new att$b
            int r3 = r0.s
            bdj r4 = r0.v
            r2.<init>(r3, r4)
            long r3 = r25.c()
            java.util.ArrayDeque<att$a> r6 = r0.o
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0350
            java.util.ArrayDeque<att$a> r3 = r0.o
            java.lang.Object r3 = r3.peek()
            att$a r3 = (defpackage.att.a) r3
            r3.a(r2)
            r4 = r0
            r0 = r1
            goto L_0x049a
        L_0x0350:
            int r6 = r2.aQ
            int r7 = defpackage.att.A
            if (r6 != r7) goto L_0x041c
            bdj r2 = r2.aR
            r2.c(r5)
            int r5 = r2.i()
            int r5 = defpackage.att.a(r5)
            r6 = 4
            r2.d(r6)
            long r13 = r2.g()
            if (r5 != 0) goto L_0x0376
            long r5 = r2.g()
            long r7 = r2.g()
            goto L_0x037e
        L_0x0376:
            long r5 = r2.p()
            long r7 = r2.p()
        L_0x037e:
            long r3 = r3 + r7
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r5
            r11 = r13
            long r17 = defpackage.bdw.b(r7, r9, r11)
            r7 = 2
            r2.d(r7)
            int r15 = r2.d()
            int[] r11 = new int[r15]
            long[] r12 = new long[r15]
            long[] r9 = new long[r15]
            long[] r10 = new long[r15]
            r19 = r5
            r6 = r17
            r4 = r3
            r3 = 0
        L_0x039e:
            if (r3 >= r15) goto L_0x03f1
            int r8 = r2.i()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x03e9
            long r21 = r2.g()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r16
            r11[r3] = r8
            r12[r3] = r4
            r10[r3] = r6
            long r19 = r19 + r21
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r19
            r6 = r9
            r16 = r15
            r15 = r10
            r9 = r21
            r1 = r11
            r0 = r12
            r11 = r13
            long r7 = defpackage.bdw.b(r7, r9, r11)
            r9 = r15[r3]
            long r9 = r7 - r9
            r6[r3] = r9
            r9 = 4
            r2.d(r9)
            r10 = r1[r3]
            long r10 = (long) r10
            long r4 = r4 + r10
            int r3 = r3 + 1
            r12 = r0
            r11 = r1
            r9 = r6
            r6 = r7
            r10 = r15
            r15 = r16
            r0 = r24
            r1 = r25
            goto L_0x039e
        L_0x03e9:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Unhandled indirect reference"
            r0.<init>(r1)
            throw r0
        L_0x03f1:
            r6 = r9
            r15 = r10
            r1 = r11
            r0 = r12
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            aso r3 = new aso
            r3.<init>(r1, r0, r6, r15)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4 = r24
            r4.A = r1
            asv r1 = r4.G
            java.lang.Object r0 = r0.second
            atb r0 = (defpackage.atb) r0
            r1.a(r0)
            r0 = 1
            r4.J = r0
            goto L_0x0492
        L_0x041c:
            r4 = r0
            int r0 = r2.aQ
            int r1 = defpackage.att.aF
            if (r0 != r1) goto L_0x0492
            bdj r0 = r2.aR
            atd[] r1 = r4.H
            if (r1 == 0) goto L_0x0492
            int r1 = r1.length
            if (r1 != 0) goto L_0x042d
            goto L_0x0492
        L_0x042d:
            r1 = 12
            r0.c(r1)
            int r2 = r0.b()
            r0.q()
            r0.q()
            long r9 = r0.g()
            long r5 = r0.g()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = defpackage.bdw.b(r5, r7, r9)
            atd[] r3 = r4.H
            int r7 = r3.length
            r8 = 0
        L_0x044f:
            if (r8 >= r7) goto L_0x045c
            r9 = r3[r8]
            r0.c(r1)
            r9.a(r0, r2)
            int r8 = r8 + 1
            goto L_0x044f
        L_0x045c:
            long r0 = r4.A
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0483
            long r0 = r0 + r5
            bdt r3 = r4.l
            if (r3 == 0) goto L_0x0470
            long r0 = r3.c(r0)
        L_0x0470:
            atd[] r3 = r4.H
            int r12 = r3.length
            r13 = 0
        L_0x0474:
            if (r13 >= r12) goto L_0x0492
            r5 = r3[r13]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r0
            r9 = r2
            r5.a(r6, r8, r9, r10, r11)
            int r13 = r13 + 1
            goto L_0x0474
        L_0x0483:
            java.util.ArrayDeque<atx$a> r0 = r4.p
            atx$a r1 = new atx$a
            r1.<init>(r5, r2)
            r0.addLast(r1)
            int r0 = r4.x
            int r0 = r0 + r2
            r4.x = r0
        L_0x0492:
            r0 = r25
            goto L_0x049a
        L_0x0495:
            r4 = r0
            r0 = r1
            r0.b(r3)
        L_0x049a:
            long r1 = r25.c()
            r4.a(r1)
        L_0x04a1:
            r1 = r0
            r0 = r4
            goto L_0x0004
        L_0x04a5:
            r4 = r0
            r0 = r1
            int r1 = r4.u
            if (r1 != 0) goto L_0x04d1
            bdj r1 = r4.m
            byte[] r1 = r1.a
            r2 = 1
            r3 = 0
            boolean r1 = r0.a(r1, r3, r5, r2)
            if (r1 != 0) goto L_0x04ba
            r1 = 0
            goto L_0x0665
        L_0x04ba:
            r4.u = r5
            bdj r1 = r4.m
            r1.c(r3)
            bdj r1 = r4.m
            long r1 = r1.g()
            r4.t = r1
            bdj r1 = r4.m
            int r1 = r1.i()
            r4.s = r1
        L_0x04d1:
            long r1 = r4.t
            r6 = 1
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x04ee
            bdj r1 = r4.m
            byte[] r1 = r1.a
            r0.b(r1, r5, r5)
            int r1 = r4.u
            int r1 = r1 + r5
            r4.u = r1
            bdj r1 = r4.m
            long r1 = r1.p()
            r4.t = r1
            goto L_0x051f
        L_0x04ee:
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x051f
            long r1 = r25.d()
            r6 = -1
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0510
            java.util.ArrayDeque<att$a> r3 = r4.o
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0510
            java.util.ArrayDeque<att$a> r1 = r4.o
            java.lang.Object r1 = r1.peek()
            att$a r1 = (defpackage.att.a) r1
            long r1 = r1.aR
        L_0x0510:
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x051f
            long r6 = r25.c()
            long r1 = r1 - r6
            int r3 = r4.u
            long r6 = (long) r3
            long r1 = r1 + r6
            r4.t = r1
        L_0x051f:
            long r1 = r4.t
            int r3 = r4.u
            long r6 = (long) r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0671
            long r1 = r25.c()
            int r3 = r4.u
            long r6 = (long) r3
            long r1 = r1 - r6
            int r3 = r4.s
            int r6 = defpackage.att.K
            if (r3 != r6) goto L_0x0552
            android.util.SparseArray<atx$b> r3 = r4.h
            int r3 = r3.size()
            r6 = 0
        L_0x053d:
            if (r6 >= r3) goto L_0x0552
            android.util.SparseArray<atx$b> r7 = r4.h
            java.lang.Object r7 = r7.valueAt(r6)
            atx$b r7 = (defpackage.atx.b) r7
            aue r7 = r7.b
            r7.b = r1
            r7.d = r1
            r7.c = r1
            int r6 = r6 + 1
            goto L_0x053d
        L_0x0552:
            int r3 = r4.s
            int r6 = defpackage.att.h
            if (r3 != r6) goto L_0x0579
            r3 = 0
            r4.B = r3
            long r5 = r4.t
            long r5 = r5 + r1
            r4.w = r5
            boolean r3 = r4.J
            if (r3 != 0) goto L_0x0573
            asv r3 = r4.G
            atb$b r5 = new atb$b
            long r6 = r4.z
            r5.<init>(r6, r1)
            r3.a(r5)
            r1 = 1
            r4.J = r1
        L_0x0573:
            r1 = 2
            r4.r = r1
        L_0x0576:
            r1 = 1
            goto L_0x0665
        L_0x0579:
            int r1 = r4.s
            int r2 = defpackage.att.B
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.D
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.E
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.F
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.G
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.K
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.L
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.M
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.att.P
            if (r1 != r2) goto L_0x05a0
            goto L_0x05a2
        L_0x05a0:
            r1 = 0
            goto L_0x05a3
        L_0x05a2:
            r1 = 1
        L_0x05a3:
            if (r1 == 0) goto L_0x05cc
            long r1 = r25.c()
            long r5 = r4.t
            long r1 = r1 + r5
            r5 = 8
            long r1 = r1 - r5
            java.util.ArrayDeque<att$a> r3 = r4.o
            att$a r5 = new att$a
            int r6 = r4.s
            r5.<init>(r6, r1)
            r3.push(r5)
            long r5 = r4.t
            int r3 = r4.u
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x05c8
            r4.a(r1)
            goto L_0x0576
        L_0x05c8:
            r24.a()
            goto L_0x0576
        L_0x05cc:
            int r1 = r4.s
            int r2 = defpackage.att.S
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.R
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.C
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.A
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.T
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.w
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.x
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.O
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.y
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.z
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.U
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.ac
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.ad
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.ah
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.ag
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.ae
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.af
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.Q
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.N
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.att.aF
            if (r1 != r2) goto L_0x061f
            goto L_0x0621
        L_0x061f:
            r1 = 0
            goto L_0x0622
        L_0x0621:
            r1 = 1
        L_0x0622:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0659
            int r1 = r4.u
            if (r1 != r5) goto L_0x0651
            long r6 = r4.t
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0649
            bdj r1 = new bdj
            int r2 = (int) r6
            r1.<init>(r2)
            r4.v = r1
            bdj r1 = r4.m
            byte[] r1 = r1.a
            bdj r2 = r4.v
            byte[] r2 = r2.a
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r5)
            r1 = 1
            r4.r = r1
            goto L_0x0665
        L_0x0649:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0651:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0659:
            long r5 = r4.t
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0669
            r1 = 0
            r4.v = r1
            r1 = 1
            r4.r = r1
        L_0x0665:
            if (r1 != 0) goto L_0x04a1
            r0 = -1
            return r0
        L_0x0669:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0671:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0.<init>(r1)
            goto L_0x067a
        L_0x0679:
            throw r0
        L_0x067a:
            goto L_0x0679
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atx.a(asu, ata):int");
    }

    private void a() {
        this.r = 0;
        this.u = 0;
    }

    private void a(long j2) {
        while (!this.o.isEmpty() && ((a) this.o.peek()).aR == j2) {
            a((a) this.o.pop());
        }
        a();
    }

    private void a(a aVar) {
        if (aVar.aQ == att.B) {
            b(aVar);
        } else if (aVar.aQ == att.K) {
            c(aVar);
        } else {
            if (!this.o.isEmpty()) {
                ((a) this.o.peek()).a(aVar);
            }
        }
    }

    private void b(a aVar) {
        int i2;
        int i3;
        a aVar2 = aVar;
        boolean z2 = true;
        int i4 = 0;
        bcu.b(this.e == null, "Unexpected moov box.");
        asc asc = this.g;
        if (asc == null) {
            asc = a(aVar2.aS);
        }
        a e2 = aVar2.e(att.M);
        SparseArray sparseArray = new SparseArray();
        int size = e2.aS.size();
        long j2 = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) e2.aS.get(i5);
            if (bVar.aQ == att.y) {
                Pair a2 = a(bVar.aR);
                sparseArray.put(((Integer) a2.first).intValue(), a2.second);
            } else if (bVar.aQ == att.N) {
                j2 = b(bVar.aR);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.aT.size();
        int i6 = 0;
        while (i6 < size2) {
            a aVar3 = (a) aVar2.aT.get(i6);
            if (aVar3.aQ == att.D) {
                i2 = i6;
                i3 = size2;
                auc a3 = atu.a(aVar3, aVar2.d(att.C), j2, asc, (this.d & 16) != 0, false);
                if (a3 != null) {
                    sparseArray2.put(a3.a, a3);
                }
            } else {
                i2 = i6;
                i3 = size2;
            }
            i6 = i2 + 1;
            size2 = i3;
        }
        int size3 = sparseArray2.size();
        if (this.h.size() == 0) {
            while (i4 < size3) {
                auc auc = (auc) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.G.a(i4, auc.b));
                bVar2.a(auc, a(sparseArray, auc.a));
                this.h.put(auc.a, bVar2);
                this.z = Math.max(this.z, auc.e);
                i4++;
            }
            b();
            this.G.a();
            return;
        }
        if (this.h.size() != size3) {
            z2 = false;
        }
        bcu.b(z2);
        while (i4 < size3) {
            auc auc2 = (auc) sparseArray2.valueAt(i4);
            ((b) this.h.get(auc2.a)).a(auc2, a(sparseArray, auc2.a));
            i4++;
        }
    }

    private static atv a(SparseArray<atv> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (atv) sparseArray.valueAt(0);
        }
        return (atv) bcu.a(sparseArray.get(i2));
    }

    private void c(a aVar) {
        asc asc;
        a(aVar, this.h, this.d, this.n);
        if (this.g != null) {
            asc = null;
        } else {
            asc = a(aVar.aS);
        }
        if (asc != null) {
            int size = this.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.h.valueAt(i2)).a(asc);
            }
        }
        if (this.y != -9223372036854775807L) {
            int size2 = this.h.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((b) this.h.valueAt(i3)).a(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }

    private void b() {
        int i2;
        if (this.H == null) {
            this.H = new atd[2];
            atd atd = this.q;
            if (atd != null) {
                this.H[0] = atd;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.d & 4) != 0) {
                int i3 = i2 + 1;
                this.H[i2] = this.G.a(this.h.size(), 4);
                i2 = i3;
            }
            this.H = (atd[]) Arrays.copyOf(this.H, i2);
            for (atd a2 : this.H) {
                a2.a(c);
            }
        }
        if (this.I == null) {
            this.I = new atd[this.f.size()];
            for (int i4 = 0; i4 < this.I.length; i4++) {
                atd a3 = this.G.a(this.h.size() + 1 + i4, 3);
                a3.a((aqe) this.f.get(i4));
                this.I[i4] = a3;
            }
        }
    }

    private static Pair<Integer, atv> a(bdj bdj) {
        bdj.c(12);
        return Pair.create(Integer.valueOf(bdj.i()), new atv(bdj.n() - 1, bdj.n(), bdj.n(), bdj.i()));
    }

    private static long b(bdj bdj) {
        bdj.c(8);
        return att.a(bdj.i()) == 0 ? bdj.g() : bdj.p();
    }

    private static void a(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        int size = aVar.aT.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar2 = (a) aVar.aT.get(i3);
            if (aVar2.aQ == att.L) {
                b(aVar2, sparseArray, i2, bArr);
            }
        }
    }

    private static void b(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        b a2 = a(aVar.d(att.x).aR, sparseArray);
        if (a2 != null) {
            aue aue = a2.b;
            long j2 = aue.s;
            a2.a();
            if (aVar.d(att.w) != null && (i2 & 2) == 0) {
                j2 = c(aVar.d(att.w).aR);
            }
            a(aVar, a2, j2, i2);
            aud a3 = a2.c.a(aue.a.a);
            b d2 = aVar.d(att.ac);
            if (d2 != null) {
                a(a3, d2.aR, aue);
            }
            b d3 = aVar.d(att.ad);
            if (d3 != null) {
                a(d3.aR, aue);
            }
            b d4 = aVar.d(att.ah);
            if (d4 != null) {
                a(d4.aR, 0, aue);
            }
            b d5 = aVar.d(att.ae);
            b d6 = aVar.d(att.af);
            if (!(d5 == null || d6 == null)) {
                a(d5.aR, d6.aR, a3 != null ? a3.b : null, aue);
            }
            int size = aVar.aS.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = (b) aVar.aS.get(i3);
                if (bVar.aQ == att.ag) {
                    a(bVar.aR, aue, bArr);
                }
            }
        }
    }

    private static void a(a aVar, b bVar, long j2, int i2) {
        List<b> list = aVar.aS;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar2 = (b) list.get(i5);
            if (bVar2.aQ == att.z) {
                bdj bdj = bVar2.aR;
                bdj.c(12);
                int n2 = bdj.n();
                if (n2 > 0) {
                    i4 += n2;
                    i3++;
                }
            }
        }
        bVar.g = 0;
        bVar.f = 0;
        bVar.e = 0;
        bVar.b.a(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            b bVar3 = (b) list.get(i8);
            if (bVar3.aQ == att.z) {
                int i9 = i6 + 1;
                i7 = a(bVar, i6, j2, i2, bVar3.aR, i7);
                i6 = i9;
            }
        }
    }

    private static void a(aud aud, bdj bdj, aue aue) {
        int i2;
        int i3 = aud.d;
        bdj.c(8);
        boolean z2 = true;
        if ((att.b(bdj.i()) & 1) == 1) {
            bdj.d(8);
        }
        int c2 = bdj.c();
        int n2 = bdj.n();
        if (n2 == aue.f) {
            if (c2 == 0) {
                boolean[] zArr = aue.n;
                i2 = 0;
                for (int i4 = 0; i4 < n2; i4++) {
                    int c3 = bdj.c();
                    i2 += c3;
                    zArr[i4] = c3 > i3;
                }
            } else {
                if (c2 <= i3) {
                    z2 = false;
                }
                i2 = (c2 * n2) + 0;
                Arrays.fill(aue.n, 0, n2, z2);
            }
            aue.a(i2);
            return;
        }
        StringBuilder sb = new StringBuilder("Length mismatch: ");
        sb.append(n2);
        sb.append(", ");
        sb.append(aue.f);
        throw new ParserException(sb.toString());
    }

    private static void a(bdj bdj, aue aue) {
        long j2;
        bdj.c(8);
        int i2 = bdj.i();
        if ((att.b(i2) & 1) == 1) {
            bdj.d(8);
        }
        int n2 = bdj.n();
        if (n2 == 1) {
            int a2 = att.a(i2);
            long j3 = aue.d;
            if (a2 == 0) {
                j2 = bdj.g();
            } else {
                j2 = bdj.p();
            }
            aue.d = j3 + j2;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected saio entry count: ");
        sb.append(n2);
        throw new ParserException(sb.toString());
    }

    private static b a(bdj bdj, SparseArray<b> sparseArray) {
        bdj.c(8);
        int b2 = att.b(bdj.i());
        b b3 = b(sparseArray, bdj.i());
        if (b3 == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long p2 = bdj.p();
            b3.b.c = p2;
            b3.b.d = p2;
        }
        atv atv = b3.d;
        b3.b.a = new atv((b2 & 2) != 0 ? bdj.n() - 1 : atv.a, (b2 & 8) != 0 ? bdj.n() : atv.b, (b2 & 16) != 0 ? bdj.n() : atv.c, (b2 & 32) != 0 ? bdj.n() : atv.d);
        return b3;
    }

    private static b b(SparseArray<b> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (b) sparseArray.valueAt(0);
        }
        return (b) sparseArray.get(i2);
    }

    private static long c(bdj bdj) {
        bdj.c(8);
        return att.a(bdj.i()) == 1 ? bdj.p() : bdj.g();
    }

    private static int a(b bVar, int i2, long j2, int i3, bdj bdj, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        b bVar2 = bVar;
        bdj.c(8);
        int b2 = att.b(bdj.i());
        auc auc = bVar2.c;
        aue aue = bVar2.b;
        atv atv = aue.a;
        aue.h[i2] = bdj.n();
        aue.g[i2] = aue.c;
        if ((b2 & 1) != 0) {
            long[] jArr = aue.g;
            jArr[i2] = jArr[i2] + ((long) bdj.i());
        }
        boolean z7 = (b2 & 4) != 0;
        int i7 = atv.d;
        if (z7) {
            i7 = bdj.n();
        }
        boolean z8 = (b2 & 256) != 0;
        boolean z9 = (b2 & 512) != 0;
        boolean z10 = (b2 & 1024) != 0;
        boolean z11 = (b2 & 2048) != 0;
        long j3 = 0;
        if (auc.h != null && auc.h.length == 1 && auc.h[0] == 0) {
            j3 = bdw.b(auc.i[0], 1000, auc.c);
        }
        int[] iArr = aue.i;
        int[] iArr2 = aue.j;
        long[] jArr2 = aue.k;
        boolean[] zArr = aue.l;
        int i8 = i7;
        boolean z12 = auc.b == 2 && (i3 & 1) != 0;
        int i9 = i4 + aue.h[i2];
        long j4 = j3;
        boolean[] zArr2 = zArr;
        long j5 = auc.c;
        boolean[] zArr3 = zArr2;
        long[] jArr3 = jArr2;
        long j6 = i2 > 0 ? aue.s : j2;
        int i10 = i4;
        while (i10 < i9) {
            int n2 = z8 ? bdj.n() : atv.b;
            if (z9) {
                z2 = z8;
                i5 = bdj.n();
            } else {
                z2 = z8;
                i5 = atv.c;
            }
            if (i10 == 0 && z7) {
                z3 = z7;
                i6 = i8;
            } else if (z10) {
                z3 = z7;
                i6 = bdj.i();
            } else {
                z3 = z7;
                i6 = atv.d;
            }
            if (z11) {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = (int) ((((long) bdj.i()) * 1000) / j5);
            } else {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = 0;
            }
            jArr3[i10] = bdw.b(j6, 1000, j5) - j4;
            iArr[i10] = i5;
            zArr3[i10] = ((i6 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            i10++;
            j6 += (long) n2;
            z8 = z2;
            z7 = z3;
            z11 = z6;
            z9 = z5;
            z10 = z4;
            i9 = i9;
        }
        int i11 = i9;
        aue.s = j6;
        return i11;
    }

    private static void a(bdj bdj, aue aue, byte[] bArr) {
        bdj.c(8);
        bdj.a(bArr, 0, 16);
        if (Arrays.equals(bArr, b)) {
            a(bdj, 16, aue);
        }
    }

    private static void a(bdj bdj, int i2, aue aue) {
        bdj.c(i2 + 8);
        int b2 = att.b(bdj.i());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int n2 = bdj.n();
            if (n2 == aue.f) {
                Arrays.fill(aue.n, 0, n2, z2);
                aue.a(bdj.b());
                aue.a(bdj);
                return;
            }
            StringBuilder sb = new StringBuilder("Length mismatch: ");
            sb.append(n2);
            sb.append(", ");
            sb.append(aue.f);
            throw new ParserException(sb.toString());
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(bdj bdj, bdj bdj2, String str, aue aue) {
        byte[] bArr;
        bdj.c(8);
        int i2 = bdj.i();
        if (bdj.i() == a) {
            if (att.a(i2) == 1) {
                bdj.d(4);
            }
            if (bdj.i() == 1) {
                bdj2.c(8);
                int i3 = bdj2.i();
                if (bdj2.i() == a) {
                    int a2 = att.a(i3);
                    if (a2 == 1) {
                        if (bdj2.g() == 0) {
                            throw new ParserException("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (a2 >= 2) {
                        bdj2.d(4);
                    }
                    if (bdj2.g() == 1) {
                        bdj2.d(1);
                        int c2 = bdj2.c();
                        int i4 = (c2 & 240) >> 4;
                        int i5 = c2 & 15;
                        if (bdj2.c() == 1) {
                            int c3 = bdj2.c();
                            byte[] bArr2 = new byte[16];
                            bdj2.a(bArr2, 0, 16);
                            if (c3 == 0) {
                                int c4 = bdj2.c();
                                byte[] bArr3 = new byte[c4];
                                bdj2.a(bArr3, 0, c4);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            aue.m = true;
                            aud aud = new aud(true, str, c3, bArr2, i4, i5, bArr);
                            aue.o = aud;
                            return;
                        }
                        return;
                    }
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static asc a(List<b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) list.get(i2);
            if (bVar.aQ == att.U) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aR.a;
                UUID a2 = aua.a(bArr);
                if (a2 == null) {
                    bdd.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new defpackage.asc.a(a2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new asc((List<defpackage.asc.a>) arrayList);
    }
}
