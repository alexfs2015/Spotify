package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: wqr reason: default package */
public final class wqr {
    public static wqa a(boolean z) {
        return z ? wqx.a : wqx.b;
    }

    public static wqd a(long j) {
        return new wra(j);
    }

    public static wqd a(BigInteger bigInteger) {
        return new wqv(bigInteger);
    }

    public static wqc a(double d) {
        return new wqy(d);
    }

    public static wpz a(byte[] bArr) {
        return new wqw(bArr);
    }

    public static wqi b(byte[] bArr) {
        return new wrd(bArr);
    }

    public static wqe a(wqq[] wqqArr) {
        if (wqqArr.length == 0) {
            return wrb.I();
        }
        return new wrb((wqq[]) Arrays.copyOf(wqqArr, wqqArr.length));
    }

    public static wqb a(byte b, byte[] bArr) {
        return new wqz(b, bArr);
    }
}
