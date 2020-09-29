package defpackage;

import java.util.Arrays;
import org.msgpack.value.ValueType;

/* renamed from: xfe reason: default package */
public final class xfe extends xey implements xeg {
    private final byte a;
    private final byte[] b;

    public xfe(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public final /* bridge */ /* synthetic */ xeb C() {
        return this;
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

    public final /* bridge */ /* synthetic */ xeh E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ xei F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ xel G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ xef H() {
        return super.t();
    }

    public final byte a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final byte[] bq_() {
        return this.b;
    }

    public final xeg c() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xej d() {
        return super.B();
    }

    public final /* bridge */ /* synthetic */ xed e() {
        return super.A();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xev)) {
            return false;
        }
        xev xev = (xev) obj;
        if (!xev.s()) {
            return false;
        }
        xeb C = xev.C();
        return this.a == C.a() && Arrays.equals(this.b, C.bq_());
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.EXTENSION;
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ xeo i() {
        return this;
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
