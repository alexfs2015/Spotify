package defpackage;

import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: wra reason: default package */
public final class wra extends wqt implements wqd {
    private final long a;

    public final wqd F() {
        return this;
    }

    public final wqg G() {
        return this;
    }

    public final boolean br_() {
        return true;
    }

    public final /* bridge */ /* synthetic */ wqj i() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqn u() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqk v() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqc E() {
        return super.w();
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

    public wra(long j) {
        this.a = j;
    }

    public final ValueType h() {
        return ValueType.INTEGER;
    }

    public final int bm_() {
        return (int) this.a;
    }

    public final long bn_() {
        return this.a;
    }

    public final BigInteger bo_() {
        return BigInteger.valueOf(this.a);
    }

    public final float bp_() {
        return (float) this.a;
    }

    public final double bq_() {
        return (double) this.a;
    }

    public final boolean a() {
        long j = this.a;
        return -2147483648L <= j && j <= 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        if (!wqq.l()) {
            return false;
        }
        wqk v = wqq.v();
        return v.br_() && this.a == v.bn_();
    }

    public final int hashCode() {
        long j = this.a;
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        long j2 = this.a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String D() {
        return Long.toString(this.a);
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
