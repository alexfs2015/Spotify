package defpackage;

import java.nio.ByteOrder;

/* renamed from: waf reason: default package */
final class waf extends waj {
    private vzv b;

    public final vyv A() {
        return this;
    }

    public final boolean B() {
        return false;
    }

    public final vyv a(Object obj) {
        return this;
    }

    public final /* bridge */ /* synthetic */ whi b(Object obj) {
        return this;
    }

    waf(vyv vyv) {
        super(vyv);
    }

    public final vyv a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == E()) {
            return this;
        } else {
            vzv vzv = this.b;
            if (vzv == null) {
                vzv = new vzv(this);
                this.b = vzv;
            }
            return vzv;
        }
    }

    public final vyv v(int i) {
        return new waf(this.a.v(i));
    }

    public final vyv t() {
        return new waf(this.a.t());
    }

    public final vyv u() {
        return new waf(this.a.u());
    }

    public final vyv i(int i, int i2) {
        return new waf(this.a.i(i, i2));
    }

    public final vyv j(int i, int i2) {
        return new waf(this.a.j(i, i2));
    }

    public final vyv s() {
        return new waf(this.a.s());
    }
}
