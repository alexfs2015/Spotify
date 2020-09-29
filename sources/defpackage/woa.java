package defpackage;

import java.nio.ByteOrder;

/* renamed from: woa reason: default package */
final class woa extends woq {
    private final wvp e;

    woa(wnh wnh, wvp wvp) {
        super(wnh);
        this.e = wvp;
    }

    public final boolean B() {
        boolean B = super.B();
        if (B) {
            this.e.b();
        }
        return B;
    }

    public final wnb a(ByteOrder byteOrder) {
        this.e.a();
        return E() == byteOrder ? this : new wnz(super.a(byteOrder), this.e);
    }

    public final wnb i(int i, int i2) {
        return new wnz(super.i(i, i2), this.e);
    }

    public final wnb j(int i, int i2) {
        return new wnz(super.j(i, i2), this.e);
    }

    public final wnb s() {
        return new wnz(super.s(), this.e);
    }

    public final wnb t() {
        return new wnz(super.t(), this.e);
    }

    public final wnb u() {
        return new wnz(super.u(), this.e);
    }

    public final wnb v(int i) {
        return new wnz(super.v(i), this.e);
    }
}
