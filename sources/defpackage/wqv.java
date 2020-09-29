package defpackage;

import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: wqv reason: default package */
public final class wqv extends wqt implements wqd {
    private static final BigInteger b = BigInteger.valueOf(-2147483648L);
    private static final BigInteger c = BigInteger.valueOf(2147483647L);
    private static final BigInteger d = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger e = BigInteger.valueOf(Long.MAX_VALUE);
    private final BigInteger a;

    public final wqd F() {
        return this;
    }

    public final wqg G() {
        return this;
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

    public wqv(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    static {
        BigInteger.valueOf(-128);
        BigInteger.valueOf(127);
        BigInteger.valueOf(-32768);
        BigInteger.valueOf(32767);
    }

    public final ValueType h() {
        return ValueType.INTEGER;
    }

    public final int bm_() {
        return this.a.intValue();
    }

    public final long bn_() {
        return this.a.longValue();
    }

    public final BigInteger bo_() {
        return this.a;
    }

    public final float bp_() {
        return this.a.floatValue();
    }

    public final double bq_() {
        return this.a.doubleValue();
    }

    public final boolean a() {
        return this.a.compareTo(b) >= 0 && this.a.compareTo(c) <= 0;
    }

    public final boolean br_() {
        return this.a.compareTo(d) >= 0 && this.a.compareTo(e) <= 0;
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
        return this.a.equals(wqq.v().bo_());
    }

    public final int hashCode() {
        long j;
        if (b.compareTo(this.a) <= 0 && this.a.compareTo(c) <= 0) {
            j = this.a.longValue();
        } else if (d.compareTo(this.a) > 0 || this.a.compareTo(e) > 0) {
            return this.a.hashCode();
        } else {
            long longValue = this.a.longValue();
            j = longValue ^ (longValue >>> 32);
        }
        return (int) j;
    }

    public final String D() {
        return this.a.toString();
    }

    public final String toString() {
        return this.a.toString();
    }
}
