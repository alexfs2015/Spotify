package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: xfb reason: default package */
public final class xfb extends xex implements xee {
    public xfb(byte[] bArr) {
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
        if (!xev.o()) {
            return false;
        }
        if (!(xev instanceof xfb)) {
            return Arrays.equals(this.a, xev.y().a());
        }
        return Arrays.equals(this.a, ((xfb) xev).a);
    }

    public final xee g() {
        return this;
    }

    public final ValueType h() {
        return ValueType.BINARY;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final /* bridge */ /* synthetic */ xeo i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xdz y() {
        return this;
    }
}
