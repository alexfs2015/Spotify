package defpackage;

import java.nio.ByteOrder;

/* renamed from: wol reason: default package */
final class wol extends wop {
    private wob b;

    wol(wnb wnb) {
        super(wnb);
    }

    public final wnb A() {
        return this;
    }

    public final boolean B() {
        return false;
    }

    public final wnb a(Object obj) {
        return this;
    }

    public final wnb a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == E()) {
            return this;
        } else {
            wob wob = this.b;
            if (wob == null) {
                wob = new wob(this);
                this.b = wob;
            }
            return wob;
        }
    }

    public final /* bridge */ /* synthetic */ wvo b(Object obj) {
        return this;
    }

    public final wnb i(int i, int i2) {
        return new wol(this.a.i(i, i2));
    }

    public final wnb j(int i, int i2) {
        return new wol(this.a.j(i, i2));
    }

    public final wnb s() {
        return new wol(this.a.s());
    }

    public final wnb t() {
        return new wol(this.a.t());
    }

    public final wnb u() {
        return new wol(this.a.u());
    }

    public final wnb v(int i) {
        return new wol(this.a.v(i));
    }
}
