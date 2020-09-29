package defpackage;

import java.math.BigInteger;

@cfp
/* renamed from: cmc reason: default package */
public final class cmc {
    private BigInteger a = BigInteger.ONE;

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        return bigInteger;
    }
}
