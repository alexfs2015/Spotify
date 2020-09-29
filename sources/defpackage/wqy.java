package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: wqy reason: default package */
public final class wqy extends wqt implements wqc {
    private final double a;

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

    public final /* bridge */ /* synthetic */ wqb c() {
        return super.C();
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

    public wqy(double d) {
        this.a = d;
    }

    public final ValueType h() {
        return ValueType.FLOAT;
    }

    public final int bm_() {
        return (int) this.a;
    }

    public final long bn_() {
        return (long) this.a;
    }

    public final BigInteger bo_() {
        return new BigDecimal(this.a).toBigInteger();
    }

    public final float bp_() {
        return (float) this.a;
    }

    public final double bq_() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        return wqq.m() && this.a == wqq.w().bq_();
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String D() {
        return (Double.isNaN(this.a) || Double.isInfinite(this.a)) ? "null" : Double.toString(this.a);
    }

    public final String toString() {
        return Double.toString(this.a);
    }
}
