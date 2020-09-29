package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: wqz reason: default package */
public final class wqz extends wqt implements wqb {
    private final byte a;
    private final byte[] b;

    public final /* bridge */ /* synthetic */ wpw C() {
        return this;
    }

    public final wqb c() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqj i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqc E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ wqd F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ wqg G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ wqa H() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ wqh b() {
        return super.x();
    }

    public final /* bridge */ /* synthetic */ wqe d() {
        return super.B();
    }

    public final /* bridge */ /* synthetic */ wpy e() {
        return super.A();
    }

    public final /* bridge */ /* synthetic */ wqi f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ wpz g() {
        return super.y();
    }

    public final /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ boolean r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    public wqz(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public final ValueType h() {
        return ValueType.EXTENSION;
    }

    public final byte a() {
        return this.a;
    }

    public final byte[] bs_() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (!wqq.s()) {
            return false;
        }
        wpw C = wqq.C();
        return this.a == C.a() && Arrays.equals(this.b, C.bs_());
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public final String D() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append(")");
        return sb.toString();
    }
}
