package defpackage;

import java.math.BigInteger;
import org.msgpack.value.ValueType;

/* renamed from: xfa reason: default package */
public final class xfa extends xey implements xei {
    private static final BigInteger b = BigInteger.valueOf(-2147483648L);
    private static final BigInteger c = BigInteger.valueOf(2147483647L);
    private static final BigInteger d = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger e = BigInteger.valueOf(Long.MAX_VALUE);
    private final BigInteger a;

    static {
        BigInteger.valueOf(-128);
        BigInteger.valueOf(127);
        BigInteger.valueOf(-32768);
        BigInteger.valueOf(32767);
    }

    public xfa(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final String D() {
        return this.a.toString();
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
        return this.a.compareTo(b) >= 0 && this.a.compareTo(c) <= 0;
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
    }

    public final int bk_() {
        return this.a.intValue();
    }

    public final long bl_() {
        return this.a.longValue();
    }

    public final BigInteger bm_() {
        return this.a;
    }

    public final float bn_() {
        return this.a.floatValue();
    }

    public final double bo_() {
        return this.a.doubleValue();
    }

    public final boolean bp_() {
        return this.a.compareTo(d) >= 0 && this.a.compareTo(e) <= 0;
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
        return this.a.equals(xev.v().bm_());
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
        return this.a.toString();
    }

    public final /* bridge */ /* synthetic */ xes u() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xep v() {
        return this;
    }
}
