package defpackage;

import java.nio.ByteOrder;

/* renamed from: wnz reason: default package */
final class wnz extends wop {
    private final wvp b;

    wnz(wnb wnb, wvp wvp) {
        super(wnb);
        this.b = wvp;
    }

    public final boolean B() {
        boolean B = super.B();
        if (B) {
            this.b.b();
        }
        return B;
    }

    public final wnb a(Object obj) {
        return this;
    }

    public final wnb a(ByteOrder byteOrder) {
        this.b.a();
        return E() == byteOrder ? this : new wnz(super.a(byteOrder), this.b);
    }

    public final /* bridge */ /* synthetic */ wvo b(Object obj) {
        return this;
    }

    public final wnb i(int i, int i2) {
        return new wnz(super.i(i, i2), this.b);
    }

    public final wnb j(int i, int i2) {
        return new wnz(super.j(i, i2), this.b);
    }

    public final wnb s() {
        return new wnz(super.s(), this.b);
    }

    public final wnb t() {
        return new wnz(super.t(), this.b);
    }

    public final wnb u() {
        return new wnz(super.u(), this.b);
    }

    public final wnb v(int i) {
        return new wnz(super.v(i), this.b);
    }
}
