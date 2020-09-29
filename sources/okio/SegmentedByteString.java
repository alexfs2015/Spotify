package okio;

import java.util.Arrays;

public final class SegmentedByteString extends ByteString {
    private transient byte[][] c;
    private transient int[] d;

    public SegmentedByteString(xcq xcq, int i) {
        super(null);
        xdi.a(xcq.b, 0, (long) i);
        int i2 = 0;
        xdd xdd = xcq.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (xdd.c != xdd.b) {
                i3 += xdd.c - xdd.b;
                i4++;
                xdd = xdd.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.c = new byte[i4][];
        this.d = new int[(i4 << 1)];
        xdd xdd2 = xcq.a;
        int i5 = 0;
        while (i2 < i) {
            this.c[i5] = xdd2.a;
            i2 += xdd2.c - xdd2.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.d;
            iArr[i5] = i2;
            iArr[this.c.length + i5] = xdd2.b;
            xdd2.d = true;
            i5++;
            xdd2 = xdd2.f;
        }
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.d, 0, this.c.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private ByteString j() {
        return new ByteString(i());
    }

    private Object writeReplace() {
        return j();
    }

    public final byte a(int i) {
        xdi.a((long) this.d[this.c.length - 1], (long) i, 1);
        int b = b(i);
        int i2 = b == 0 ? 0 : this.d[b - 1];
        int[] iArr = this.d;
        byte[][] bArr = this.c;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    public final String a() {
        return j().a();
    }

    public final ByteString a(int i, int i2) {
        return j().a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(xcq xcq) {
        int length = this.c.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.d;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            xdd xdd = new xdd(this.c[i], i3, (i3 + i4) - i2, true, false);
            if (xcq.a == null) {
                xdd.g = xdd;
                xdd.f = xdd;
                xcq.a = xdd;
            } else {
                xcq.a.g.a(xdd);
            }
            i++;
            i2 = i4;
        }
        xcq.b += (long) i2;
    }

    public final boolean a(int i, ByteString byteString, int i2, int i3) {
        if (h() - i3 < 0) {
            return false;
        }
        int b = b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.d[b - 1];
            int min = Math.min(i3, ((this.d[b] - i4) + i4) - i);
            int[] iArr = this.d;
            byte[][] bArr = this.c;
            if (!byteString.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.d[b - 1];
            int min = Math.min(i3, ((this.d[b] - i4) + i4) - i);
            int[] iArr = this.d;
            byte[][] bArr2 = this.c;
            if (!xdi.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final String b() {
        return j().b();
    }

    public final ByteString c() {
        return j().c();
    }

    public final ByteString d() {
        return j().d();
    }

    public final ByteString e() {
        return j().e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            return byteString.h() == h() && a(0, byteString, 0, h());
        }
    }

    public final String f() {
        return j().f();
    }

    public final ByteString g() {
        return j().g();
    }

    public final int h() {
        return this.d[this.c.length - 1];
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int length = this.c.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.c[i2];
            int[] iArr = this.d;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    public final byte[] i() {
        int[] iArr = this.d;
        byte[][] bArr = this.c;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.d;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.c[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final String toString() {
        return j().toString();
    }
}
