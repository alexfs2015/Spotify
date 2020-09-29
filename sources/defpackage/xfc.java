package defpackage;

import org.msgpack.value.ValueType;

/* renamed from: xfc reason: default package */
public final class xfc extends xey implements xef {
    public static final xef a = new xfc(true);
    public static final xef b = new xfc(false);
    private final boolean c;

    private xfc(boolean z) {
        this.c = z;
    }

    public final String D() {
        return Boolean.toString(this.c);
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

    public final boolean a() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ xem b() {
        return super.x();
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
        return xev.k() && this.c == xev.t().a();
    }

    public final /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public final /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final ValueType h() {
        return ValueType.BOOLEAN;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
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
        return Boolean.toString(this.c);
    }
}
