package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: xew reason: default package */
public final class xew {
    public static xee a(byte[] bArr) {
        return new xfb(bArr);
    }

    public static xef a(boolean z) {
        return z ? xfc.a : xfc.b;
    }

    public static xeg a(byte b, byte[] bArr) {
        return new xfe(b, bArr);
    }

    public static xeh a(double d) {
        return new xfd(d);
    }

    public static xei a(long j) {
        return new xff(j);
    }

    public static xei a(BigInteger bigInteger) {
        return new xfa(bigInteger);
    }

    public static xej a(xev[] xevArr) {
        return xevArr.length == 0 ? xfg.I() : new xfg((xev[]) Arrays.copyOf(xevArr, xevArr.length));
    }

    public static xen b(byte[] bArr) {
        return new xfi(bArr);
    }
}
