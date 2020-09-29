package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: wnh reason: default package */
public class wnh extends wmw implements Iterable<wnb> {
    private static final ByteBuffer e = woc.a.v();
    private static final Iterator<wnb> g = Collections.emptyList().iterator();
    private static /* synthetic */ boolean m = (!wnh.class.desiredAssertionStatus());
    private final wnc h;
    private final boolean i;
    /* access modifiers changed from: private */
    public final List<a> j;
    private final int k;
    private boolean l;

    /* renamed from: wnh$a */
    static final class a {
        final wnb a;
        final int b;
        int c;
        int d;

        a(wnb wnb) {
            this.a = wnb;
            this.b = wnb.g();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a.B();
        }
    }

    /* renamed from: wnh$b */
    final class b implements Iterator<wnb> {
        private final int a;
        private int b;

        private b() {
            this.a = wnh.this.j.size();
        }

        /* synthetic */ b(wnh wnh, byte b2) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public wnb next() {
            if (this.a != wnh.this.j.size()) {
                throw new ConcurrentModificationException();
            } else if (hasNext()) {
                try {
                    List a2 = wnh.this.j;
                    int i = this.b;
                    this.b = i + 1;
                    return ((a) a2.get(i)).a;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new NoSuchElementException();
            }
        }

        public final boolean hasNext() {
            return this.a > this.b;
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read-Only");
        }
    }

    wnh(wnc wnc) {
        super(Integer.MAX_VALUE);
        this.h = wnc;
        this.i = false;
        this.k = 0;
        this.j = Collections.emptyList();
    }

    public wnh(wnc wnc, boolean z, int i2) {
        super(Integer.MAX_VALUE);
        this.h = wnc;
        this.i = z;
        this.k = i2;
        this.j = new ArrayList(Math.min(16, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(int r5) {
        /*
            r4 = this;
            java.util.List<wnh$a> r0 = r4.j
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0009
            return
        L_0x0009:
            java.util.List<wnh$a> r1 = r4.j
            java.lang.Object r1 = r1.get(r5)
            wnh$a r1 = (defpackage.wnh.a) r1
            if (r5 != 0) goto L_0x001b
            r2 = 0
            r1.c = r2
            int r2 = r1.b
            r1.d = r2
            goto L_0x003a
        L_0x001b:
            if (r5 >= r0) goto L_0x003d
            java.util.List<wnh$a> r1 = r4.j
            int r2 = r5 + -1
            java.lang.Object r1 = r1.get(r2)
            wnh$a r1 = (defpackage.wnh.a) r1
            java.util.List<wnh$a> r2 = r4.j
            java.lang.Object r2 = r2.get(r5)
            wnh$a r2 = (defpackage.wnh.a) r2
            int r1 = r1.d
            r2.c = r1
            int r1 = r2.c
            int r3 = r2.b
            int r1 = r1 + r3
            r2.d = r1
        L_0x003a:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnh.M(int):void");
    }

    private a N(int i2) {
        A(i2);
        int size = this.j.size();
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            a aVar = (a) this.j.get(i4);
            if (i2 >= aVar.d) {
                i3 = i4 + 1;
            } else if (i2 < aVar.c) {
                size = i4 - 1;
            } else if (m || aVar.b != 0) {
                return aVar;
            } else {
                throw new AssertionError();
            }
        }
        throw new Error("should not reach here");
    }

    private wnb O(int i2) {
        return this.i ? D().d(i2) : D().c(i2);
    }

    private void U() {
        int size = this.j.size();
        if (size > this.k) {
            wnb O = O(((a) this.j.get(size - 1)).d);
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.j.get(i2);
                O.a(aVar.a);
                aVar.a();
            }
            a aVar2 = new a(O);
            aVar2.d = aVar2.b;
            this.j.clear();
            this.j.add(aVar2);
        }
    }

    private int a(boolean z, int i2, wnb wnb) {
        if (m || wnb != null) {
            boolean z2 = false;
            try {
                x();
                if (i2 < 0 || i2 > this.j.size()) {
                    throw new IndexOutOfBoundsException(String.format("cIndex: %d (expected: >= 0 && <= numComponents(%d))", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.j.size())}));
                }
                int g2 = wnb.g();
                a aVar = new a(wnb.a(ByteOrder.BIG_ENDIAN).t());
                if (i2 == this.j.size()) {
                    z2 = this.j.add(aVar);
                    if (i2 == 0) {
                        aVar.d = g2;
                    } else {
                        aVar.c = ((a) this.j.get(i2 - 1)).d;
                        aVar.d = aVar.c + g2;
                    }
                } else {
                    this.j.add(i2, aVar);
                    if (g2 != 0) {
                        try {
                            M(i2);
                        } catch (Throwable th) {
                            th = th;
                            z2 = true;
                        }
                    }
                    z2 = true;
                }
                if (z) {
                    b(d() + wnb.g());
                }
                if (!z2) {
                    wnb.B();
                }
                return i2;
            } catch (Throwable th2) {
                th = th2;
                if (!z2) {
                    wnb.B();
                }
                throw th;
            }
        } else {
            throw new AssertionError();
        }
    }

    public int C() {
        int size = this.j.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return ((a) this.j.get(0)).a.C();
        }
        throw new UnsupportedOperationException();
    }

    public wnc D() {
        return this.h;
    }

    /* renamed from: D */
    public wnh d(int i2) {
        return (wnh) super.d(i2);
    }

    public ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: E */
    public wnh w(int i2) {
        return (wnh) super.w(i2);
    }

    /* renamed from: F */
    public wnh x(int i2) {
        return (wnh) super.x(i2);
    }

    public boolean F() {
        int size = this.j.size();
        if (size == 0) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!((a) this.j.get(i2)).a.F()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public wnh y(int i2) {
        return (wnh) super.y(i2);
    }

    public boolean G() {
        int size = this.j.size();
        if (size == 0) {
            return true;
        }
        if (size != 1) {
            return false;
        }
        return ((a) this.j.get(0)).a.G();
    }

    /* renamed from: H */
    public wnh z(int i2) {
        return (wnh) super.z(i2);
    }

    public byte[] H() {
        int size = this.j.size();
        if (size == 0) {
            return wxg.a;
        }
        if (size == 1) {
            return ((a) this.j.get(0)).a.H();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: I */
    public wnh C(int i2) {
        x();
        if (i2 < 0 || i2 > b()) {
            StringBuilder sb = new StringBuilder("newCapacity: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        int P = P();
        if (i2 > P) {
            int i3 = i2 - P;
            if (this.j.size() < this.k) {
                wnb O = O(i3);
                O.a(0, i3);
                a(false, this.j.size(), O);
            } else {
                wnb O2 = O(i3);
                O2.a(0, i3);
                a(false, this.j.size(), O2);
                U();
            }
        } else if (i2 < P) {
            int i4 = P - i2;
            List<a> list = this.j;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                a aVar = (a) listIterator.previous();
                if (i4 < aVar.b) {
                    a aVar2 = new a(aVar.a.i(0, aVar.b - i4));
                    aVar2.c = aVar.c;
                    aVar2.d = aVar2.c + aVar2.b;
                    listIterator.set(aVar2);
                    break;
                }
                i4 -= aVar.b;
                listIterator.remove();
            }
            if (c() > i2) {
                a(i2, i2);
            } else if (d() > i2) {
                b(i2);
            }
        }
        return this;
    }

    public boolean I() {
        int size = this.j.size();
        if (size == 0) {
            return woc.a.I();
        }
        if (size != 1) {
            return false;
        }
        return ((a) this.j.get(0)).a.I();
    }

    public int J() {
        int size = this.j.size();
        if (size == 0) {
            return 1;
        }
        if (size == 1) {
            return ((a) this.j.get(0)).a.J();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            i2 += ((a) this.j.get(i3)).a.J();
        }
        return i2;
    }

    public int J(int i2) {
        A(i2);
        int size = this.j.size();
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            a aVar = (a) this.j.get(i4);
            if (i2 >= aVar.d) {
                i3 = i4 + 1;
            } else if (i2 >= aVar.c) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        throw new Error("should not reach here");
    }

    public wnb K() {
        return null;
    }

    /* renamed from: K */
    public wnh a(int i2) {
        return (wnh) super.a(i2);
    }

    public long L() {
        int size = this.j.size();
        if (size == 0) {
            return woc.a.L();
        }
        if (size == 1) {
            return ((a) this.j.get(0)).a.L();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: L */
    public wnh b(int i2) {
        return (wnh) super.b(i2);
    }

    /* renamed from: M */
    public wnh l() {
        return N();
    }

    public wnh N() {
        x();
        int c = c();
        if (c == 0) {
            return this;
        }
        int d = d();
        if (c == d && d == P()) {
            for (a a2 : this.j) {
                a2.a();
            }
            this.j.clear();
            a(0, 0);
            c(c);
            return this;
        }
        int J = J(c);
        for (int i2 = 0; i2 < J; i2++) {
            ((a) this.j.get(i2)).a();
        }
        this.j.subList(0, J).clear();
        int i3 = ((a) this.j.get(0)).c;
        M(0);
        a(c - i3, d - i3);
        c(i3);
        return this;
    }

    /* renamed from: O */
    public wnh A() {
        return (wnh) super.A();
    }

    public int P() {
        int size = this.j.size();
        if (size == 0) {
            return 0;
        }
        return ((a) this.j.get(size - 1)).d;
    }

    /* renamed from: Q */
    public wnh e() {
        return (wnh) super.e();
    }

    /* renamed from: R */
    public wnh i() {
        return (wnh) super.i();
    }

    /* renamed from: S */
    public wnh j() {
        return (wnh) super.j();
    }

    /* renamed from: T */
    public wnh k() {
        return (wnh) super.k();
    }

    public int a(int i2, GatheringByteChannel gatheringByteChannel, int i3) {
        if (J() == 1) {
            return gatheringByteChannel.write(n(i2, i3));
        }
        long write = gatheringByteChannel.write(p(i2, i3));
        if (write > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) write;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[EDGE_INSN: B:20:0x0044->B:18:0x0044 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(int r6, java.nio.channels.ScatteringByteChannel r7, int r8) {
        /*
            r5 = this;
            r5.k(r6, r8)
            if (r8 != 0) goto L_0x000c
            java.nio.ByteBuffer r6 = e
            int r6 = r7.read(r6)
            return r6
        L_0x000c:
            int r0 = r5.J(r6)
            r1 = 0
        L_0x0011:
            java.util.List<wnh$a> r2 = r5.j
            java.lang.Object r2 = r2.get(r0)
            wnh$a r2 = (defpackage.wnh.a) r2
            wnb r3 = r2.a
            int r2 = r2.c
            int r4 = r3.P()
            int r2 = r6 - r2
            int r4 = r4 - r2
            int r4 = java.lang.Math.min(r8, r4)
            if (r4 != 0) goto L_0x002d
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0042
        L_0x002d:
            int r2 = r3.a(r2, r7, r4)
            if (r2 == 0) goto L_0x0044
            if (r2 >= 0) goto L_0x0039
            if (r1 != 0) goto L_0x0044
            r6 = -1
            return r6
        L_0x0039:
            if (r2 != r4) goto L_0x003f
            int r6 = r6 + r4
            int r8 = r8 - r4
            int r1 = r1 + r4
            goto L_0x002a
        L_0x003f:
            int r6 = r6 + r2
            int r8 = r8 - r2
            int r1 = r1 + r2
        L_0x0042:
            if (r8 > 0) goto L_0x0011
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnh.a(int, java.nio.channels.ScatteringByteChannel, int):int");
    }

    public wnh a(boolean z, wnb wnb) {
        wxq.a(wnb, "buffer");
        a(z, this.j.size(), wnb);
        U();
        return this;
    }

    /* access modifiers changed from: protected */
    public void aX_() {
        if (!this.l) {
            this.l = true;
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((a) this.j.get(i2)).a();
            }
        }
    }

    /* renamed from: b */
    public wnh a(long j2) {
        return (wnh) super.a(j2);
    }

    /* renamed from: b */
    public wnh a(wnb wnb, int i2) {
        return (wnh) super.a(wnb, i2);
    }

    /* renamed from: b */
    public wnh a(wnb wnb, int i2, int i3) {
        return (wnh) super.a(wnb, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void b(int i2, long j2) {
        a N = N(i2);
        if (i2 + 8 <= N.d) {
            N.a.a(i2 - N.c, j2);
        } else if (E() == ByteOrder.BIG_ENDIAN) {
            g(i2, (int) (j2 >>> 32));
            g(i2 + 4, (int) j2);
        } else {
            g(i2, (int) j2);
            g(i2 + 4, (int) (j2 >>> 32));
        }
    }

    /* renamed from: c */
    public wnh a(int i2, long j2) {
        return (wnh) super.a(i2, j2);
    }

    /* renamed from: c */
    public wnh a(int i2, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        k(i2, remaining);
        if (remaining == 0) {
            return this;
        }
        int J = J(i2);
        while (remaining > 0) {
            try {
                a aVar = (a) this.j.get(J);
                wnb wnb = aVar.a;
                int i3 = i2 - aVar.c;
                int min = Math.min(remaining, wnb.P() - i3);
                byteBuffer.limit(byteBuffer.position() + min);
                wnb.a(i3, byteBuffer);
                i2 += min;
                remaining -= min;
                J++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    /* renamed from: c */
    public wnh a(int i2, wnb wnb, int i3, int i4) {
        b(i2, i4, i3, wnb.P());
        if (i4 == 0) {
            return this;
        }
        int J = J(i2);
        while (i4 > 0) {
            a aVar = (a) this.j.get(J);
            wnb wnb2 = aVar.a;
            int i5 = i2 - aVar.c;
            int min = Math.min(i4, wnb2.P() - i5);
            wnb2.a(i5, wnb, i3, min);
            i2 += min;
            i3 += min;
            i4 -= min;
            J++;
        }
        return this;
    }

    /* renamed from: c */
    public wnh a(int i2, byte[] bArr, int i3, int i4) {
        b(i2, i4, i3, bArr.length);
        if (i4 == 0) {
            return this;
        }
        int J = J(i2);
        while (i4 > 0) {
            a aVar = (a) this.j.get(J);
            wnb wnb = aVar.a;
            int i5 = i2 - aVar.c;
            int min = Math.min(i4, wnb.P() - i5);
            wnb.a(i5, bArr, i3, min);
            i2 += min;
            i3 += min;
            i4 -= min;
            J++;
        }
        return this;
    }

    /* renamed from: c */
    public wnh b(Object obj) {
        return this;
    }

    /* renamed from: c */
    public wnh a(wnb wnb) {
        return (wnh) super.a(wnb);
    }

    /* renamed from: c */
    public wnh a(byte[] bArr) {
        return (wnh) super.a(bArr);
    }

    /* renamed from: c */
    public wnh a(byte[] bArr, int i2, int i3) {
        return (wnh) super.a(bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void c(int i2, int i3) {
        b(i2, i3);
    }

    /* renamed from: d */
    public wnh b(int i2, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        k(i2, remaining);
        if (remaining == 0) {
            return this;
        }
        int J = J(i2);
        while (remaining > 0) {
            try {
                a aVar = (a) this.j.get(J);
                wnb wnb = aVar.a;
                int i3 = i2 - aVar.c;
                int min = Math.min(remaining, wnb.P() - i3);
                byteBuffer.limit(byteBuffer.position() + min);
                wnb.b(i3, byteBuffer);
                i2 += min;
                remaining -= min;
                J++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    /* renamed from: d */
    public wnh b(int i2, wnb wnb, int i3, int i4) {
        a(i2, i4, i3, wnb.P());
        if (i4 == 0) {
            return this;
        }
        int J = J(i2);
        while (i4 > 0) {
            a aVar = (a) this.j.get(J);
            wnb wnb2 = aVar.a;
            int i5 = i2 - aVar.c;
            int min = Math.min(i4, wnb2.P() - i5);
            wnb2.b(i5, wnb, i3, min);
            i2 += min;
            i3 += min;
            i4 -= min;
            J++;
        }
        return this;
    }

    /* renamed from: d */
    public wnh b(int i2, byte[] bArr, int i3, int i4) {
        a(i2, i4, i3, bArr.length);
        if (i4 == 0) {
            return this;
        }
        int J = J(i2);
        while (i4 > 0) {
            a aVar = (a) this.j.get(J);
            wnb wnb = aVar.a;
            int i5 = i2 - aVar.c;
            int min = Math.min(i4, wnb.P() - i5);
            wnb.b(i5, bArr, i3, min);
            i2 += min;
            i3 += min;
            i4 -= min;
            J++;
        }
        return this;
    }

    /* renamed from: d */
    public wnh b(byte[] bArr) {
        return (wnh) super.b(bArr);
    }

    /* renamed from: d */
    public wnh b(byte[] bArr, int i2, int i3) {
        return (wnh) super.b(bArr, i2, i3);
    }

    public byte e(int i2) {
        return f(i2);
    }

    /* access modifiers changed from: protected */
    public void e(int i2, int i3) {
        a N = N(i2);
        if (i2 + 2 <= N.d) {
            N.a.d(i2 - N.c, i3);
        } else if (E() == ByteOrder.BIG_ENDIAN) {
            c(i2, (int) (byte) (i3 >>> 8));
            c(i2 + 1, (int) (byte) i3);
        } else {
            c(i2, (int) (byte) i3);
            c(i2 + 1, (int) (byte) (i3 >>> 8));
        }
    }

    /* access modifiers changed from: protected */
    public byte f(int i2) {
        a N = N(i2);
        return N.a.e(i2 - N.c);
    }

    /* access modifiers changed from: protected */
    public void g(int i2, int i3) {
        a N = N(i2);
        if (i2 + 4 <= N.d) {
            N.a.f(i2 - N.c, i3);
        } else if (E() == ByteOrder.BIG_ENDIAN) {
            e(i2, (short) (i3 >>> 16));
            e(i2 + 2, (short) i3);
        } else {
            e(i2, (short) i3);
            e(i2 + 2, (short) (i3 >>> 16));
        }
    }

    /* access modifiers changed from: protected */
    public short i(int i2) {
        a N = N(i2);
        if (i2 + 2 <= N.d) {
            return N.a.h(i2 - N.c);
        }
        if (E() == ByteOrder.BIG_ENDIAN) {
            return (short) ((f(i2 + 1) & 255) | ((f(i2) & 255) << 8));
        }
        return (short) (((f(i2 + 1) & 255) << 8) | (f(i2) & 255));
    }

    public Iterator<wnb> iterator() {
        x();
        return this.j.isEmpty() ? g : new b(this, 0);
    }

    /* access modifiers changed from: protected */
    public short k(int i2) {
        a N = N(i2);
        if (i2 + 2 <= N.d) {
            return N.a.j(i2 - N.c);
        }
        if (E() == ByteOrder.BIG_ENDIAN) {
            return (short) (((f(i2 + 1) & 255) << 8) | (f(i2) & 255));
        }
        return (short) ((f(i2 + 1) & 255) | ((f(i2) & 255) << 8));
    }

    /* access modifiers changed from: protected */
    public int n(int i2) {
        a N = N(i2);
        if (i2 + 4 <= N.d) {
            return N.a.m(i2 - N.c);
        }
        if (E() == ByteOrder.BIG_ENDIAN) {
            return (i(i2 + 2) & 65535) | ((i(i2) & 65535) << 16);
        }
        return ((i(i2 + 2) & 65535) << 16) | (i(i2) & 65535);
    }

    public ByteBuffer n(int i2, int i3) {
        int size = this.j.size();
        if (size == 0) {
            return e;
        }
        if (size == 1) {
            return ((a) this.j.get(0)).a.n(i2, i3);
        }
        throw new UnsupportedOperationException();
    }

    public ByteBuffer o(int i2, int i3) {
        k(i2, i3);
        int size = this.j.size();
        if (size == 0) {
            return e;
        }
        if (size == 1 && ((a) this.j.get(0)).a.J() == 1) {
            return ((a) this.j.get(0)).a.o(i2, i3);
        }
        ByteBuffer order = ByteBuffer.allocate(i3).order(E());
        for (ByteBuffer put : p(i2, i3)) {
            order.put(put);
        }
        order.flip();
        return order;
    }

    /* access modifiers changed from: protected */
    public int p(int i2) {
        a N = N(i2);
        if (i2 + 4 <= N.d) {
            return N.a.o(i2 - N.c);
        }
        if (E() == ByteOrder.BIG_ENDIAN) {
            return ((k(i2 + 2) & 65535) << 16) | (k(i2) & 65535);
        }
        return (k(i2 + 2) & 65535) | ((k(i2) & 65535) << 16);
    }

    public ByteBuffer[] p(int i2, int i3) {
        k(i2, i3);
        if (i3 == 0) {
            return new ByteBuffer[]{e};
        }
        ArrayList arrayList = new ArrayList(this.j.size());
        int J = J(i2);
        while (i3 > 0) {
            a aVar = (a) this.j.get(J);
            wnb wnb = aVar.a;
            int i4 = i2 - aVar.c;
            int min = Math.min(i3, wnb.P() - i4);
            int J2 = wnb.J();
            if (J2 != 0) {
                if (J2 != 1) {
                    Collections.addAll(arrayList, wnb.p(i4, min));
                } else {
                    arrayList.add(wnb.o(i4, min));
                }
                i2 += min;
                i3 -= min;
                J++;
            } else {
                throw new UnsupportedOperationException();
            }
        }
        return (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
    }

    /* renamed from: q */
    public wnh b(int i2, int i3) {
        a N = N(i2);
        N.a.b(i2 - N.c, i3);
        return this;
    }

    /* renamed from: r */
    public wnh d(int i2, int i3) {
        return (wnh) super.d(i2, i3);
    }

    /* renamed from: s */
    public wnh f(int i2, int i3) {
        return (wnh) super.f(i2, i3);
    }

    /* access modifiers changed from: protected */
    public long t(int i2) {
        a N = N(i2);
        return i2 + 8 <= N.d ? N.a.s(i2 - N.c) : E() == ByteOrder.BIG_ENDIAN ? ((((long) n(i2)) & 4294967295L) << 32) | (4294967295L & ((long) n(i2 + 4))) : (((long) n(i2)) & 4294967295L) | ((4294967295L & ((long) n(i2 + 4))) << 32);
    }

    /* renamed from: t */
    public wnh h(int i2, int i3) {
        return (wnh) super.h(i2, i3);
    }

    public String toString() {
        String wmw = super.toString();
        String substring = wmw.substring(0, wmw.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(", components=");
        sb.append(this.j.size());
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: u */
    public wnh a(int i2, int i3) {
        return (wnh) super.a(i2, i3);
    }

    public ByteBuffer[] w() {
        return p(c(), g());
    }
}
