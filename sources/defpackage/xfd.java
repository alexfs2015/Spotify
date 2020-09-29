package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: xfd reason: default package */
public final class xfd extends xey implements xeh {
    private final double a;

    public xfd(double d) {
        this.a = d;
    }

    public final String D() {
        return (Double.isNaN(this.a) || Double.isInfinite(this.a)) ? "null" : Double.toString(this.a);
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

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final int bk_() {
        return (int) this.a;
    }

    public final long bl_() {
        return (long) this.a;
    }

    public final BigInteger bm_() {
        return new BigDecimal(this.a).toBigInteger();
    }

    public final float bn_() {
        return (float) this.a;
    }

    public final double bo_() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ xeg c() {
        return super.C();
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
        return xev.m() && this.a == xev.w().bo_();
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.FLOAT;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
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
        return Double.toString(this.a);
    }
}
