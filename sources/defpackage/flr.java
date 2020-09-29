package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;

/* renamed from: flr reason: default package */
public final class flr {
    private static final flr b = new flr(0, new int[0], new Object[0], false);
    public boolean a;
    private int c;
    private int[] d;
    private Object[] e;
    private int f;

    private flr() {
        this(0, new int[8], new Object[8], true);
    }

    private flr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f = -1;
        this.c = i;
        this.d = iArr;
        this.e = objArr;
        this.a = z;
    }

    public static flr a() {
        return b;
    }

    private flr a(fkw fkw) {
        int a2;
        do {
            a2 = fkw.a();
            if (a2 == 0) {
                break;
            }
        } while (a(a2, fkw));
        return this;
    }

    public static flr a(flr flr, flr flr2) {
        int i = flr.c + flr2.c;
        int[] copyOf = Arrays.copyOf(flr.d, i);
        System.arraycopy(flr2.d, 0, copyOf, flr.c, flr2.c);
        Object[] copyOf2 = Arrays.copyOf(flr.e, i);
        System.arraycopy(flr2.e, 0, copyOf2, flr.c, flr2.c);
        return new flr(i, copyOf, copyOf2, true);
    }

    public static flr b() {
        return new flr();
    }

    private void e() {
        int i = this.c;
        if (i == this.d.length) {
            int i2 = this.c + (i < 4 ? 8 : i >> 1);
            this.d = Arrays.copyOf(this.d, i2);
            this.e = Arrays.copyOf(this.e, i2);
        }
    }

    public void a(int i, Object obj) {
        e();
        int[] iArr = this.d;
        int i2 = this.c;
        iArr[i2] = i;
        this.e[i2] = obj;
        this.c = i2 + 1;
    }

    public final void a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.d[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                codedOutputStream.a(i3, ((Long) this.e[i]).longValue());
            } else if (i4 == 1) {
                codedOutputStream.b(i3, ((Long) this.e[i]).longValue());
            } else if (i4 == 2) {
                codedOutputStream.a(i3, (ByteString) this.e[i]);
            } else if (i4 == 3) {
                codedOutputStream.a(i3, 3);
                ((flr) this.e[i]).a(codedOutputStream);
                codedOutputStream.a(i3, 4);
            } else if (i4 == 5) {
                codedOutputStream.e(i3, ((Integer) this.e[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.c; i2++) {
            flk.a(sb, i, String.valueOf(this.d[i2] >>> 3), this.e[i2]);
        }
    }

    public final boolean a(int i, fkw fkw) {
        c();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            a(i, (Object) Long.valueOf(fkw.h()));
            return true;
        } else if (i3 == 1) {
            a(i, (Object) Long.valueOf(fkw.j()));
            return true;
        } else if (i3 == 2) {
            a(i, (Object) fkw.e());
            return true;
        } else if (i3 == 3) {
            flr flr = new flr();
            flr.a(fkw);
            fkw.a((i2 << 3) | 4);
            a(i, (Object) flr);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                a(i, (Object) Integer.valueOf(fkw.i()));
                return true;
            }
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public final int d() {
        int i;
        int i2 = this.f;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = this.d[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = CodedOutputStream.d(i6, ((Long) this.e[i4]).longValue());
            } else if (i7 == 1) {
                i = CodedOutputStream.e(i6, ((Long) this.e[i4]).longValue());
            } else if (i7 == 2) {
                i = CodedOutputStream.b(i6, (ByteString) this.e[i4]);
            } else if (i7 == 3) {
                i = (CodedOutputStream.d(i6) << 1) + ((flr) this.e[i4]).d();
            } else if (i7 == 5) {
                i = CodedOutputStream.i(i6, ((Integer) this.e[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.f());
            }
            i3 += i;
        }
        this.f = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof flr)) {
            return false;
        }
        flr flr = (flr) obj;
        return this.c == flr.c && Arrays.equals(this.d, flr.d) && Arrays.deepEquals(this.e, flr.e);
    }

    public final int hashCode() {
        return ((((this.c + 527) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.deepHashCode(this.e);
    }
}
