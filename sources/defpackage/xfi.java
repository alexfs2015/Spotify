package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: xfi reason: default package */
public final class xfi extends xex implements xen {
    public xfi(byte[] bArr) {
        super(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xev)) {
            return false;
        }
        xev xev = (xev) obj;
        if (!xev.p()) {
            return false;
        }
        if (!(xev instanceof xfi)) {
            return Arrays.equals(this.a, xev.z().a());
        }
        return Arrays.equals(this.a, ((xfi) xev).a);
    }

    public final xen f() {
        return this;
    }

    public final ValueType h() {
        return ValueType.STRING;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final /* bridge */ /* synthetic */ xeo i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xeu z() {
        return this;
    }
}
