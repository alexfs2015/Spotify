package defpackage;

import java.util.Arrays;

/* renamed from: dgh reason: default package */
final class dgh {
    final int a;
    final byte[] b;

    dgh(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgh)) {
            return false;
        }
        dgh dgh = (dgh) obj;
        return this.a == dgh.a && Arrays.equals(this.b, dgh.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
