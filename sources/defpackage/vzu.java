package defpackage;

import java.nio.ByteOrder;

/* renamed from: vzu reason: default package */
final class vzu extends wak {
    private final whj e;

    vzu(vzb vzb, whj whj) {
        super(vzb);
        this.e = whj;
    }

    public final boolean B() {
        boolean B = super.B();
        if (B) {
            this.e.b();
        }
        return B;
    }

    public final vyv a(ByteOrder byteOrder) {
        this.e.a();
        if (E() == byteOrder) {
            return this;
        }
        return new vzt(super.a(byteOrder), this.e);
    }

    public final vyv t() {
        return new vzt(super.t(), this.e);
    }

    public final vyv u() {
        return new vzt(super.u(), this.e);
    }

    public final vyv i(int i, int i2) {
        return new vzt(super.i(i, i2), this.e);
    }

    public final vyv j(int i, int i2) {
        return new vzt(super.j(i, i2), this.e);
    }

    public final vyv s() {
        return new vzt(super.s(), this.e);
    }

    public final vyv v(int i) {
        return new vzt(super.v(i), this.e);
    }
}
