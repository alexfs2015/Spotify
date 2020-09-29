package defpackage;

import io.netty.util.Recycler.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: vyp reason: default package */
abstract class vyp extends vyq {
    vym e;
    private final b<vyp> g;

    vyp(b<? extends vyp> bVar) {
        super(0);
        this.g = bVar;
    }

    /* access modifiers changed from: 0000 */
    public final <U extends vyp> U a(vym vym, vyv vyv, int i, int i2, int i3) {
        vyv.A();
        this.e = vym;
        try {
            this.d = i3;
            m(0, i2);
            this.f = 1;
            return this;
        } catch (Throwable th) {
            if (vyv != null) {
                this.e = null;
                vyv.B();
            }
            throw th;
        }
    }

    public final ByteBuffer n(int i, int i2) {
        return o(i, i2);
    }

    public final vyv u() {
        int c = c();
        return j(c, d() - c);
    }

    /* access modifiers changed from: protected */
    public final void aZ_() {
        vym vym = this.e;
        this.g.a(this);
        vym.B();
    }

    public final vyw D() {
        return this.e.D();
    }

    @Deprecated
    public final ByteOrder E() {
        return this.e.E();
    }

    public final boolean a() {
        return this.e.a();
    }

    public final boolean F() {
        return this.e.F();
    }

    public final boolean G() {
        return this.e.G();
    }

    public final byte[] H() {
        return this.e.H();
    }

    public final boolean I() {
        return this.e.I();
    }

    public final int J() {
        return this.e.J();
    }

    public final /* bridge */ /* synthetic */ vyv K() {
        return this.e;
    }
}
