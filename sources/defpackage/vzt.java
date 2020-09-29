package defpackage;

import java.nio.ByteOrder;

/* renamed from: vzt reason: default package */
final class vzt extends waj {
    private final whj b;

    public final vyv a(Object obj) {
        return this;
    }

    public final /* bridge */ /* synthetic */ whi b(Object obj) {
        return this;
    }

    vzt(vyv vyv, whj whj) {
        super(vyv);
        this.b = whj;
    }

    public final boolean B() {
        boolean B = super.B();
        if (B) {
            this.b.b();
        }
        return B;
    }

    public final vyv a(ByteOrder byteOrder) {
        this.b.a();
        if (E() == byteOrder) {
            return this;
        }
        return new vzt(super.a(byteOrder), this.b);
    }

    public final vyv t() {
        return new vzt(super.t(), this.b);
    }

    public final vyv u() {
        return new vzt(super.u(), this.b);
    }

    public final vyv i(int i, int i2) {
        return new vzt(super.i(i, i2), this.b);
    }

    public final vyv j(int i, int i2) {
        return new vzt(super.j(i, i2), this.b);
    }

    public final vyv s() {
        return new vzt(super.s(), this.b);
    }

    public final vyv v(int i) {
        return new vzt(super.v(i), this.b);
    }
}
