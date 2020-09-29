package defpackage;

import java.util.Arrays;

/* renamed from: eqb reason: default package */
final class eqb {
    final int a;
    final byte[] b;

    eqb(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqb)) {
            return false;
        }
        eqb eqb = (eqb) obj;
        return this.a == eqb.a && Arrays.equals(this.b, eqb.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
