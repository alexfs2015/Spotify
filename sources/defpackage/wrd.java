package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: wrd reason: default package */
public final class wrd extends wqs implements wqi {
    public final wqi f() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqj i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqp z() {
        return this;
    }

    public wrd(byte[] bArr) {
        super(bArr);
    }

    public final ValueType h() {
        return ValueType.STRING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (!wqq.p()) {
            return false;
        }
        if (!(wqq instanceof wrd)) {
            return Arrays.equals(this.a, wqq.z().a());
        }
        return Arrays.equals(this.a, ((wrd) wqq).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
