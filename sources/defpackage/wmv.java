package defpackage;

import io.netty.util.Recycler.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: wmv reason: default package */
abstract class wmv extends wmw {
    wms e;
    private final b<wmv> g;

    wmv(b<? extends wmv> bVar) {
        super(0);
        this.g = bVar;
    }

    public final wnc D() {
        return this.e.D();
    }

    @Deprecated
    public final ByteOrder E() {
        return this.e.E();
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

    public final /* bridge */ /* synthetic */ wnb K() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final <U extends wmv> U a(wms wms, wnb wnb, int i, int i2, int i3) {
        wnb.A();
        this.e = wms;
        try {
            this.d = i3;
            m(0, i2);
            this.f = 1;
            return this;
        } catch (Throwable th) {
            if (wnb != null) {
                this.e = null;
                wnb.B();
            }
            throw th;
        }
    }

    public final boolean a() {
        return this.e.a();
    }

    /* access modifiers changed from: protected */
    public final void aX_() {
        wms wms = this.e;
        this.g.a(this);
        wms.B();
    }

    public final ByteBuffer n(int i, int i2) {
        return o(i, i2);
    }

    public final wnb u() {
        int c = c();
        return j(c, d() - c);
    }
}
