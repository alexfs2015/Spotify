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

/* renamed from: auo reason: default package */
public final class auo implements atk {
    private static final int a = ben.g("seig");
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final aqv c = aqv.a(null, "application/x-emsg", Long.MAX_VALUE);
    private long A;
    private b B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private atm G;
    private atu[] H;
    private atu[] I;
    private boolean J;
    private final int d;
    private final aut e;
    private final List<aqv> f;
    private final ast g;
    private final SparseArray<b> h;
    private final bea i;
    private final bea j;
    private final bea k;
    private final bek l;
    private final bea m;
    private final byte[] n;
    private final ArrayDeque<a> o;
    private final ArrayDeque<a> p;
    private final atu q;
    private int r;
    private int s;
    private long t;
    private int u;
    private bea v;
    private long w;
    private int x;
    private long y;
    private long z;

    /* renamed from: auo$a */
    static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* renamed from: auo$b */
    static final class b {
        public final atu a;
        public final auv b = new auv();
        public aut c;
        public aum d;
        public int e;
        public int f;
        public int g;
        public int h;
        final bea i = new bea(1);
        final bea j = new bea();

        public b(atu atu) {
            this.a = atu;
        }

        public final void a() {
            this.b.a();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public final void a(long j2) {
            long a2 = aqm.a(j2);
            int i2 = this.e;
            while (i2 < this.b.f && this.b.b(i2) < a2) {
                if (this.b.l[i2]) {
                    this.h = i2;
                }
                i2++;
            }
        }

        public final void a(ast ast) {
            auu a2 = this.c.a(this.b.a.a);
            this.a.a(this.c.f.a(ast.a(a2 != null ? a2.b : null)));
        }

        public final void a(aut aut, aum aum) {
            this.c = (aut) bdl.a(aut);
            this.d = (aum) bdl.a(aum);
            this.a.a(aut.f);
            a();
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
        public auu c() {
            auu a2 = this.b.o != null ? this.b.o : this.c.a(this.b.a.a);
            if (a2 == null || !a2.a) {
                return null;
            }
            return a2;
        }
    }

    static {
        $$Lambda$auo$XbXT1xWqRZRl5vrCvNkkFyqbgJk r0 = $$Lambda$auo$XbXT1xWqRZRl5vrCvNkkFyqbgJk.INSTANCE;
    }

    public auo() {
        this(0);
    }

    public auo(int i2) {
        this(i2, null);
    }

    private auo(int i2, bek bek) {
        this(i2, null, null, null);
    }

    private auo(int i2, bek bek, aut aut, ast ast) {
        this(i2, bek, null, null, Collections.emptyList());
    }

    public auo(int i2, bek bek, aut aut, ast ast, List<aqv> list) {
        this(i2, bek, aut, ast, list, null);
    }

    private auo(int i2, bek bek, aut aut, ast ast, List<aqv> list, atu atu) {
        this.d = i2 | (aut != null ? 8 : 0);
        this.l = bek;
        this.e = aut;
        this.g = ast;
        this.f = Collections.unmodifiableList(list);
        this.q = null;
        this.m = new bea(16);
        this.i = new bea(bdy.a);
        this.j = new bea(5);
        this.k = new bea();
        this.n = new byte[16];
        this.o = new ArrayDeque<>();
        this.p = new ArrayDeque<>();
        this.h = new SparseArray<>();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        a();
    }

    private static int a(b bVar, int i2, long j2, int i3, bea bea, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        b bVar2 = bVar;
        bea.c(8);
        int b2 = auk.b(bea.i());
        aut aut = bVar2.c;
        auv auv = bVar2.b;
        aum aum = auv.a;
        auv.h[i2] = bea.n();
        auv.g[i2] = auv.c;
        if ((b2 & 1) != 0) {
            long[] jArr = auv.g;
            jArr[i2] = jArr[i2] + ((long) bea.i());
        }
        boolean z7 = (b2 & 4) != 0;
        int i7 = aum.d;
        if (z7) {
            i7 = bea.n();
        }
        boolean z8 = (b2 & 256) != 0;
        boolean z9 = (b2 & 512) != 0;
        boolean z10 = (b2 & 1024) != 0;
        boolean z11 = (b2 & 2048) != 0;
        long j3 = 0;
        if (aut.h != null && aut.h.length == 1 && aut.h[0] == 0) {
            j3 = ben.b(aut.i[0], 1000, aut.c);
        }
        int[] iArr = auv.i;
        int[] iArr2 = auv.j;
        long[] jArr2 = auv.k;
        boolean[] zArr = auv.l;
        int i8 = i7;
        boolean z12 = aut.b == 2 && (i3 & 1) != 0;
        int i9 = i4 + auv.h[i2];
        long j4 = j3;
        boolean[] zArr2 = zArr;
        long j5 = aut.c;
        boolean[] zArr3 = zArr2;
        long[] jArr3 = jArr2;
        long j6 = i2 > 0 ? auv.s : j2;
        int i10 = i4;
        while (i10 < i9) {
            int n2 = z8 ? bea.n() : aum.b;
            if (z9) {
                z2 = z8;
                i5 = bea.n();
            } else {
                z2 = z8;
                i5 = aum.c;
            }
            if (i10 == 0 && z7) {
                z3 = z7;
                i6 = i8;
            } else if (z10) {
                z3 = z7;
                i6 = bea.i();
            } else {
                z3 = z7;
                i6 = aum.d;
            }
            if (z11) {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = (int) ((((long) bea.i()) * 1000) / j5);
            } else {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = 0;
            }
            jArr3[i10] = ben.b(j6, 1000, j5) - j4;
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
        auv.s = j6;
        return i11;
    }

    private static Pair<Integer, aum> a(bea bea) {
        bea.c(12);
        return Pair.create(Integer.valueOf(bea.i()), new aum(bea.n() - 1, bea.n(), bea.n(), bea.i()));
    }

    private static ast a(List<b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) list.get(i2);
            if (bVar.aQ == auk.U) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aR.a;
                UUID a2 = aur.a(bArr);
                if (a2 == null) {
                    bdu.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new defpackage.ast.a(a2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new ast((List<defpackage.ast.a>) arrayList);
    }

    private static aum a(SparseArray<aum> sparseArray, int i2) {
        return sparseArray.size() == 1 ? (aum) sparseArray.valueAt(0) : (aum) bdl.a(sparseArray.get(i2));
    }

    private static b a(bea bea, SparseArray<b> sparseArray) {
        bea.c(8);
        int b2 = auk.b(bea.i());
        b b3 = b(sparseArray, bea.i());
        if (b3 == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long p2 = bea.p();
            b3.b.c = p2;
            b3.b.d = p2;
        }
        aum aum = b3.d;
        b3.b.a = new aum((b2 & 2) != 0 ? bea.n() - 1 : aum.a, (b2 & 8) != 0 ? bea.n() : aum.b, (b2 & 16) != 0 ? bea.n() : aum.c, (b2 & 32) != 0 ? bea.n() : aum.d);
        return b3;
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
        if (aVar.aQ == auk.B) {
            b(aVar);
        } else if (aVar.aQ == auk.K) {
            c(aVar);
        } else {
            if (!this.o.isEmpty()) {
                ((a) this.o.peek()).a(aVar);
            }
        }
    }

    private static void a(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        int size = aVar.aT.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar2 = (a) aVar.aT.get(i3);
            if (aVar2.aQ == auk.L) {
                b(aVar2, sparseArray, i2, bArr);
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
            if (bVar2.aQ == auk.z) {
                bea bea = bVar2.aR;
                bea.c(12);
                int n2 = bea.n();
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
            if (bVar3.aQ == auk.z) {
                int i9 = i6 + 1;
                i7 = a(bVar, i6, j2, i2, bVar3.aR, i7);
                i6 = i9;
            }
        }
    }

    private static void a(auu auu, bea bea, auv auv) {
        int i2;
        int i3 = auu.d;
        bea.c(8);
        boolean z2 = true;
        if ((auk.b(bea.i()) & 1) == 1) {
            bea.d(8);
        }
        int c2 = bea.c();
        int n2 = bea.n();
        if (n2 == auv.f) {
            if (c2 == 0) {
                boolean[] zArr = auv.n;
                i2 = 0;
                for (int i4 = 0; i4 < n2; i4++) {
                    int c3 = bea.c();
                    i2 += c3;
                    zArr[i4] = c3 > i3;
                }
            } else {
                if (c2 <= i3) {
                    z2 = false;
                }
                i2 = (c2 * n2) + 0;
                Arrays.fill(auv.n, 0, n2, z2);
            }
            auv.a(i2);
            return;
        }
        StringBuilder sb = new StringBuilder("Length mismatch: ");
        sb.append(n2);
        sb.append(", ");
        sb.append(auv.f);
        throw new ParserException(sb.toString());
    }

    private static void a(bea bea, int i2, auv auv) {
        bea.c(i2 + 8);
        int b2 = auk.b(bea.i());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int n2 = bea.n();
            if (n2 == auv.f) {
                Arrays.fill(auv.n, 0, n2, z2);
                auv.a(bea.b());
                auv.a(bea);
                return;
            }
            StringBuilder sb = new StringBuilder("Length mismatch: ");
            sb.append(n2);
            sb.append(", ");
            sb.append(auv.f);
            throw new ParserException(sb.toString());
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(bea bea, auv auv) {
        bea.c(8);
        int i2 = bea.i();
        if ((auk.b(i2) & 1) == 1) {
            bea.d(8);
        }
        int n2 = bea.n();
        if (n2 == 1) {
            auv.d += auk.a(i2) == 0 ? bea.g() : bea.p();
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected saio entry count: ");
        sb.append(n2);
        throw new ParserException(sb.toString());
    }

    private static void a(bea bea, auv auv, byte[] bArr) {
        bea.c(8);
        bea.a(bArr, 0, 16);
        if (Arrays.equals(bArr, b)) {
            a(bea, 16, auv);
        }
    }

    private static void a(bea bea, bea bea2, String str, auv auv) {
        byte[] bArr;
        bea.c(8);
        int i2 = bea.i();
        if (bea.i() == a) {
            if (auk.a(i2) == 1) {
                bea.d(4);
            }
            if (bea.i() == 1) {
                bea2.c(8);
                int i3 = bea2.i();
                if (bea2.i() == a) {
                    int a2 = auk.a(i3);
                    if (a2 == 1) {
                        if (bea2.g() == 0) {
                            throw new ParserException("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (a2 >= 2) {
                        bea2.d(4);
                    }
                    if (bea2.g() == 1) {
                        bea2.d(1);
                        int c2 = bea2.c();
                        int i4 = (c2 & 240) >> 4;
                        int i5 = c2 & 15;
                        if (bea2.c() == 1) {
                            int c3 = bea2.c();
                            byte[] bArr2 = new byte[16];
                            bea2.a(bArr2, 0, 16);
                            if (c3 == 0) {
                                int c4 = bea2.c();
                                byte[] bArr3 = new byte[c4];
                                bea2.a(bArr3, 0, c4);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            auv.m = true;
                            auu auu = new auu(true, str, c3, bArr2, i4, i5, bArr);
                            auv.o = auu;
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

    private static long b(bea bea) {
        bea.c(8);
        return auk.a(bea.i()) == 0 ? bea.g() : bea.p();
    }

    private static b b(SparseArray<b> sparseArray, int i2) {
        return sparseArray.size() == 1 ? (b) sparseArray.valueAt(0) : (b) sparseArray.get(i2);
    }

    private void b() {
        int i2;
        if (this.H == null) {
            this.H = new atu[2];
            atu atu = this.q;
            if (atu != null) {
                this.H[0] = atu;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.d & 4) != 0) {
                int i3 = i2 + 1;
                this.H[i2] = this.G.a(this.h.size(), 4);
                i2 = i3;
            }
            this.H = (atu[]) Arrays.copyOf(this.H, i2);
            for (atu a2 : this.H) {
                a2.a(c);
            }
        }
        if (this.I == null) {
            this.I = new atu[this.f.size()];
            for (int i4 = 0; i4 < this.I.length; i4++) {
                atu a3 = this.G.a(this.h.size() + 1 + i4, 3);
                a3.a((aqv) this.f.get(i4));
                this.I[i4] = a3;
            }
        }
    }

    private void b(a aVar) {
        int i2;
        int i3;
        a aVar2 = aVar;
        boolean z2 = true;
        int i4 = 0;
        bdl.b(this.e == null, "Unexpected moov box.");
        ast ast = this.g;
        if (ast == null) {
            ast = a(aVar2.aS);
        }
        a e2 = aVar2.e(auk.M);
        SparseArray sparseArray = new SparseArray();
        int size = e2.aS.size();
        long j2 = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) e2.aS.get(i5);
            if (bVar.aQ == auk.y) {
                Pair a2 = a(bVar.aR);
                sparseArray.put(((Integer) a2.first).intValue(), a2.second);
            } else if (bVar.aQ == auk.N) {
                j2 = b(bVar.aR);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.aT.size();
        int i6 = 0;
        while (i6 < size2) {
            a aVar3 = (a) aVar2.aT.get(i6);
            if (aVar3.aQ == auk.D) {
                i2 = i6;
                i3 = size2;
                aut a3 = aul.a(aVar3, aVar2.d(auk.C), j2, ast, (this.d & 16) != 0, false);
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
                aut aut = (aut) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.G.a(i4, aut.b));
                bVar2.a(aut, a(sparseArray, aut.a));
                this.h.put(aut.a, bVar2);
                this.z = Math.max(this.z, aut.e);
                i4++;
            }
            b();
            this.G.a();
            return;
        }
        if (this.h.size() != size3) {
            z2 = false;
        }
        bdl.b(z2);
        while (i4 < size3) {
            aut aut2 = (aut) sparseArray2.valueAt(i4);
            ((b) this.h.get(aut2.a)).a(aut2, a(sparseArray, aut2.a));
            i4++;
        }
    }

    private static void b(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        b a2 = a(aVar.d(auk.x).aR, sparseArray);
        if (a2 != null) {
            auv auv = a2.b;
            long j2 = auv.s;
            a2.a();
            if (aVar.d(auk.w) != null && (i2 & 2) == 0) {
                j2 = c(aVar.d(auk.w).aR);
            }
            a(aVar, a2, j2, i2);
            auu a3 = a2.c.a(auv.a.a);
            b d2 = aVar.d(auk.ac);
            if (d2 != null) {
                a(a3, d2.aR, auv);
            }
            b d3 = aVar.d(auk.ad);
            if (d3 != null) {
                a(d3.aR, auv);
            }
            b d4 = aVar.d(auk.ah);
            if (d4 != null) {
                a(d4.aR, 0, auv);
            }
            b d5 = aVar.d(auk.ae);
            b d6 = aVar.d(auk.af);
            if (!(d5 == null || d6 == null)) {
                a(d5.aR, d6.aR, a3 != null ? a3.b : null, auv);
            }
            int size = aVar.aS.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = (b) aVar.aS.get(i3);
                if (bVar.aQ == auk.ag) {
                    a(bVar.aR, auv, bArr);
                }
            }
        }
    }

    private static long c(bea bea) {
        bea.c(8);
        return auk.a(bea.i()) == 1 ? bea.p() : bea.g();
    }

    private void c(a aVar) {
        a(aVar, this.h, this.d, this.n);
        ast a2 = this.g != null ? null : a(aVar.aS);
        if (a2 != null) {
            int size = this.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.h.valueAt(i2)).a(a2);
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

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] c() {
        return new atk[]{new auo()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:288:0x0667 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x02bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.atl r25, defpackage.atr r26) {
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
            auo$b r2 = r0.B
            if (r2 != 0) goto L_0x0084
            android.util.SparseArray<auo$b> r2 = r0.h
            int r12 = r2.size()
            r13 = r9
            r9 = 0
            r10 = r4
        L_0x0027:
            if (r9 >= r12) goto L_0x004a
            java.lang.Object r15 = r2.valueAt(r9)
            auo$b r15 = (defpackage.auo.b) r15
            int r8 = r15.g
            auv r3 = r15.b
            int r3 = r3.e
            if (r8 == r3) goto L_0x0046
            auv r3 = r15.b
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
            auv r2 = r10.b
            long[] r2 = r2.g
            int r3 = r10.g
            r8 = r2[r3]
            long r2 = r25.c()
            long r8 = r8 - r2
            int r2 = (int) r8
            if (r2 >= 0) goto L_0x007f
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            defpackage.bdu.c(r2, r3)
            r2 = 0
        L_0x007f:
            r1.b(r2)
            r0.B = r10
        L_0x0084:
            auo$b r2 = r0.B
            auv r2 = r2.b
            int[] r2 = r2.i
            auo$b r3 = r0.B
            int r3 = r3.e
            r2 = r2[r3]
            r0.C = r2
            auo$b r2 = r0.B
            int r2 = r2.e
            auo$b r3 = r0.B
            int r3 = r3.h
            if (r2 >= r3) goto L_0x00d7
            int r2 = r0.C
            r1.b(r2)
            auo$b r2 = r0.B
            auu r3 = r2.c()
            if (r3 == 0) goto L_0x00c9
            auv r5 = r2.b
            bea r5 = r5.q
            int r8 = r3.d
            if (r8 == 0) goto L_0x00b6
            int r3 = r3.d
            r5.d(r3)
        L_0x00b6:
            auv r3 = r2.b
            int r2 = r2.e
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L_0x00c9
            int r2 = r5.d()
            int r2 = r2 * 6
            r5.d(r2)
        L_0x00c9:
            auo$b r2 = r0.B
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x00d3
            r0.B = r4
        L_0x00d3:
            r0.r = r11
            goto L_0x02bd
        L_0x00d7:
            auo$b r2 = r0.B
            aut r2 = r2.c
            int r2 = r2.g
            if (r2 != r6) goto L_0x00e7
            int r2 = r0.C
            int r2 = r2 - r5
            r0.C = r2
            r1.b(r5)
        L_0x00e7:
            auo$b r2 = r0.B
            auu r3 = r2.c()
            if (r3 != 0) goto L_0x00f1
            r2 = 0
            goto L_0x014c
        L_0x00f1:
            int r5 = r3.d
            if (r5 == 0) goto L_0x00fc
            auv r5 = r2.b
            bea r5 = r5.q
            int r3 = r3.d
            goto L_0x0107
        L_0x00fc:
            byte[] r3 = r3.e
            bea r5 = r2.j
            int r8 = r3.length
            r5.a(r3, r8)
            bea r5 = r2.j
            int r3 = r3.length
        L_0x0107:
            auv r8 = r2.b
            int r9 = r2.e
            boolean r8 = r8.c(r9)
            bea r9 = r2.i
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
            bea r9 = r2.i
            r9.c(r7)
            atu r9 = r2.a
            bea r10 = r2.i
            r9.a(r10, r6)
            atu r9 = r2.a
            r9.a(r5, r3)
            if (r8 != 0) goto L_0x0133
            int r2 = r3 + 1
            goto L_0x014c
        L_0x0133:
            auv r5 = r2.b
            bea r5 = r5.q
            int r8 = r5.d()
            r9 = -2
            r5.d(r9)
            int r8 = r8 * 6
            r9 = 2
            int r8 = r8 + r9
            atu r2 = r2.a
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
            auo$b r2 = r0.B
            auv r2 = r2.b
            auo$b r3 = r0.B
            aut r3 = r3.c
            auo$b r5 = r0.B
            atu r5 = r5.a
            auo$b r8 = r0.B
            int r8 = r8.e
            long r9 = r2.b(r8)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r12
            bek r12 = r0.l
            if (r12 == 0) goto L_0x017a
            long r9 = r12.c(r9)
        L_0x017a:
            int r12 = r3.j
            if (r12 == 0) goto L_0x0237
            bea r12 = r0.j
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
            bea r11 = r0.j
            r11.c(r7)
            bea r11 = r0.j
            int r11 = r11.n()
            int r11 = r11 - r6
            r0.E = r11
            bea r11 = r0.i
            r11.c(r7)
            bea r11 = r0.i
            r15 = 4
            r5.a(r11, r15)
            bea r11 = r0.j
            r5.a(r11, r6)
            atu[] r11 = r0.I
            int r11 = r11.length
            if (r11 <= 0) goto L_0x01cf
            aqv r11 = r3.f
            java.lang.String r11 = r11.f
            byte r6 = r12[r15]
            boolean r6 = defpackage.bdy.a(r11, r6)
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
            bea r6 = r0.k
            r6.a(r11)
            bea r6 = r0.k
            byte[] r6 = r6.a
            int r11 = r0.E
            r1.b(r6, r7, r11)
            bea r6 = r0.k
            int r11 = r0.E
            r5.a(r6, r11)
            int r6 = r0.E
            bea r11 = r0.k
            byte[] r11 = r11.a
            bea r15 = r0.k
            int r15 = r15.c
            int r11 = defpackage.bdy.a(r11, r15)
            bea r15 = r0.k
            aqv r4 = r3.f
            java.lang.String r4 = r4.f
            java.lang.String r7 = "video/hevc"
            boolean r4 = r7.equals(r4)
            r15.c(r4)
            bea r4 = r0.k
            r4.b(r11)
            bea r4 = r0.k
            atu[] r7 = r0.I
            defpackage.bap.a(r9, r4, r7)
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
            auo$b r3 = r0.B
            auu r3 = r3.c()
            if (r3 == 0) goto L_0x025f
            r4 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r4
            atu$a r4 = r3.c
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
            java.util.ArrayDeque<auo$a> r2 = r0.p
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x02ae
            java.util.ArrayDeque<auo$a> r2 = r0.p
            java.lang.Object r2 = r2.removeFirst()
            auo$a r2 = (defpackage.auo.a) r2
            int r3 = r0.x
            int r4 = r2.b
            int r3 = r3 - r4
            r0.x = r3
            long r3 = r2.a
            long r3 = r3 + r9
            bek r5 = r0.l
            if (r5 == 0) goto L_0x0292
            long r3 = r5.c(r3)
        L_0x0292:
            atu[] r5 = r0.H
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
            auo$b r2 = r0.B
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
            android.util.SparseArray<auo$b> r2 = r0.h
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x02c9:
            if (r3 >= r2) goto L_0x02ee
            android.util.SparseArray<auo$b> r5 = r0.h
            java.lang.Object r5 = r5.valueAt(r3)
            auo$b r5 = (defpackage.auo.b) r5
            auv r5 = r5.b
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x02eb
            long r6 = r5.d
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02eb
            long r4 = r5.d
            android.util.SparseArray<auo$b> r6 = r0.h
            java.lang.Object r6 = r6.valueAt(r3)
            auo$b r6 = (defpackage.auo.b) r6
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
            auv r2 = r4.b
            bea r3 = r2.q
            byte[] r3 = r3.a
            int r4 = r2.p
            r5 = 0
            r1.b(r3, r5, r4)
            bea r3 = r2.q
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
            bea r2 = r0.v
            if (r2 == 0) goto L_0x0495
            byte[] r2 = r2.a
            r1.b(r2, r5, r3)
            auk$b r2 = new auk$b
            int r3 = r0.s
            bea r4 = r0.v
            r2.<init>(r3, r4)
            long r3 = r25.c()
            java.util.ArrayDeque<auk$a> r6 = r0.o
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0350
            java.util.ArrayDeque<auk$a> r3 = r0.o
            java.lang.Object r3 = r3.peek()
            auk$a r3 = (defpackage.auk.a) r3
            r3.a(r2)
            r4 = r0
            r0 = r1
            goto L_0x049a
        L_0x0350:
            int r6 = r2.aQ
            int r7 = defpackage.auk.A
            if (r6 != r7) goto L_0x041c
            bea r2 = r2.aR
            r2.c(r5)
            int r5 = r2.i()
            int r5 = defpackage.auk.a(r5)
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
            long r17 = defpackage.ben.b(r7, r9, r11)
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
            long r7 = defpackage.ben.b(r7, r9, r11)
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
            atf r3 = new atf
            r3.<init>(r1, r0, r6, r15)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4 = r24
            r4.A = r1
            atm r1 = r4.G
            java.lang.Object r0 = r0.second
            ats r0 = (defpackage.ats) r0
            r1.a(r0)
            r0 = 1
            r4.J = r0
            goto L_0x0492
        L_0x041c:
            r4 = r0
            int r0 = r2.aQ
            int r1 = defpackage.auk.aF
            if (r0 != r1) goto L_0x0492
            bea r0 = r2.aR
            atu[] r1 = r4.H
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
            long r5 = defpackage.ben.b(r5, r7, r9)
            atu[] r3 = r4.H
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
            bek r3 = r4.l
            if (r3 == 0) goto L_0x0470
            long r0 = r3.c(r0)
        L_0x0470:
            atu[] r3 = r4.H
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
            java.util.ArrayDeque<auo$a> r0 = r4.p
            auo$a r1 = new auo$a
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
            bea r1 = r4.m
            byte[] r1 = r1.a
            r2 = 1
            r3 = 0
            boolean r1 = r0.a(r1, r3, r5, r2)
            if (r1 != 0) goto L_0x04ba
            r1 = 0
            goto L_0x0665
        L_0x04ba:
            r4.u = r5
            bea r1 = r4.m
            r1.c(r3)
            bea r1 = r4.m
            long r1 = r1.g()
            r4.t = r1
            bea r1 = r4.m
            int r1 = r1.i()
            r4.s = r1
        L_0x04d1:
            long r1 = r4.t
            r6 = 1
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x04ee
            bea r1 = r4.m
            byte[] r1 = r1.a
            r0.b(r1, r5, r5)
            int r1 = r4.u
            int r1 = r1 + r5
            r4.u = r1
            bea r1 = r4.m
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
            java.util.ArrayDeque<auk$a> r3 = r4.o
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0510
            java.util.ArrayDeque<auk$a> r1 = r4.o
            java.lang.Object r1 = r1.peek()
            auk$a r1 = (defpackage.auk.a) r1
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
            int r6 = defpackage.auk.K
            if (r3 != r6) goto L_0x0552
            android.util.SparseArray<auo$b> r3 = r4.h
            int r3 = r3.size()
            r6 = 0
        L_0x053d:
            if (r6 >= r3) goto L_0x0552
            android.util.SparseArray<auo$b> r7 = r4.h
            java.lang.Object r7 = r7.valueAt(r6)
            auo$b r7 = (defpackage.auo.b) r7
            auv r7 = r7.b
            r7.b = r1
            r7.d = r1
            r7.c = r1
            int r6 = r6 + 1
            goto L_0x053d
        L_0x0552:
            int r3 = r4.s
            int r6 = defpackage.auk.h
            if (r3 != r6) goto L_0x0579
            r3 = 0
            r4.B = r3
            long r5 = r4.t
            long r5 = r5 + r1
            r4.w = r5
            boolean r3 = r4.J
            if (r3 != 0) goto L_0x0573
            atm r3 = r4.G
            ats$b r5 = new ats$b
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
            int r2 = defpackage.auk.B
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.D
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.E
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.F
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.G
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.K
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.L
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.M
            if (r1 == r2) goto L_0x05a2
            int r2 = defpackage.auk.P
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
            java.util.ArrayDeque<auk$a> r3 = r4.o
            auk$a r5 = new auk$a
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
            int r2 = defpackage.auk.S
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.R
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.C
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.A
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.T
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.w
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.x
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.O
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.y
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.z
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.U
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.ac
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.ad
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.ah
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.ag
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.ae
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.af
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.Q
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.N
            if (r1 == r2) goto L_0x0621
            int r2 = defpackage.auk.aF
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
            bea r1 = new bea
            int r2 = (int) r6
            r1.<init>(r2)
            r4.v = r1
            bea r1 = r4.m
            byte[] r1 = r1.a
            bea r2 = r4.v
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auo.a(atl, atr):int");
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

    public final void a(atm atm) {
        this.G = atm;
        aut aut = this.e;
        if (aut != null) {
            b bVar = new b(atm.a(0, aut.b));
            bVar.a(this.e, new aum(0, 0, 0, 0));
            this.h.put(0, bVar);
            b();
            this.G.a();
        }
    }

    public final boolean a(atl atl) {
        return aus.a(atl);
    }
}
