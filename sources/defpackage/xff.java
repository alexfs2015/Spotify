package defpackage;

import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: xff reason: default package */
public final class xff extends xey implements xei {
    private final long a;

    public xff(long j) {
        this.a = j;
    }

    public final String D() {
        return Long.toString(this.a);
    }

    public final /* bridge */ /* synthetic */ xeh E() {
        return super.w();
    }

    public final xei F() {
        return this;
    }

    public final xel G() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xef H() {
        return super.t();
    }

    public final boolean a() {
        long j = this.a;
        return -2147483648L <= j && j <= 2147483647L;
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final int bk_() {
        return (int) this.a;
    }

    public final long bl_() {
        return this.a;
    }

    public final BigInteger bm_() {
        return BigInteger.valueOf(this.a);
    }

    public final float bn_() {
        return (float) this.a;
    }

    public final double bo_() {
        return (double) this.a;
    }

    public final boolean bp_() {
        return true;
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
        if (!xev.l()) {
            return false;
        }
        xep v = xev.v();
        return v.bp_() && this.a == v.bl_();
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.INTEGER;
    }

    public final int hashCode() {
        long j = this.a;
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        long j2 = this.a;
        return (int) (j2 ^ (j2 >>> 32));
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
        return Long.toString(this.a);
    }

    public final /* bridge */ /* synthetic */ xes u() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xep v() {
        return this;
    }
}
