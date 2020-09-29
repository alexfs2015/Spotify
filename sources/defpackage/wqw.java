package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: wqw reason: default package */
public final class wqw extends wqs implements wpz {
    public final wpz g() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqj i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wpu y() {
        return this;
    }

    public wqw(byte[] bArr) {
        super(bArr);
    }

    public final ValueType h() {
        return ValueType.BINARY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (!wqq.o()) {
            return false;
        }
        if (!(wqq instanceof wqw)) {
            return Arrays.equals(this.a, wqq.y().a());
        }
        return Arrays.equals(this.a, ((wqw) wqq).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
