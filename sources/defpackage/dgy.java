package defpackage;

import java.util.Arrays;

/* renamed from: dgy reason: default package */
final class dgy {
    final int a;
    final byte[] b;

    dgy(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgy)) {
            return false;
        }
        dgy dgy = (dgy) obj;
        return this.a == dgy.a && Arrays.equals(this.b, dgy.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
