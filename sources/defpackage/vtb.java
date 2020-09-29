package defpackage;

import com.squareup.wire.FieldEncoding;
import okio.ByteString;

/* renamed from: vtb reason: default package */
public final class vtb {
    public final wol a;

    public static int a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int b(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int a(int i, FieldEncoding fieldEncoding) {
        return (i << 3) | fieldEncoding.value;
    }

    public vtb(wol wol) {
        this.a = wol;
    }

    public final void a(ByteString byteString) {
        this.a.b(byteString);
    }

    public final void c(int i) {
        while ((i & -128) != 0) {
            this.a.j((i & 127) | 128);
            i >>>= 7;
        }
        this.a.j(i);
    }

    public final void c(long j) {
        while ((-128 & j) != 0) {
            this.a.j((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.j((int) j);
    }

    public final void d(int i) {
        this.a.g(i);
    }

    public final void d(long j) {
        this.a.o(j);
    }
}
