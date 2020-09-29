package defpackage;

import java.util.Arrays;

/* renamed from: eqs reason: default package */
final class eqs {
    final int a;
    final byte[] b;

    eqs(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqs)) {
            return false;
        }
        eqs eqs = (eqs) obj;
        return this.a == eqs.a && Arrays.equals(this.b, eqs.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
