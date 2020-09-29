package defpackage;

import org.msgpack.value.ValueType;

/* renamed from: wqx reason: default package */
public final class wqx extends wqt implements wqa {
    public static final wqa a = new wqx(true);
    public static final wqa b = new wqx(false);
    private final boolean c;

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

    private wqx(boolean z) {
        this.c = z;
    }

    public final ValueType h() {
        return ValueType.BOOLEAN;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqq = (wqq) obj;
        return wqq.k() && this.c == wqq.t().a();
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String D() {
        return Boolean.toString(this.c);
    }

    public final String toString() {
        return Boolean.toString(this.c);
    }
}
