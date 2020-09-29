package defpackage;

import java.io.IOException;

/* renamed from: iiw reason: default package */
public final class iiw implements ihz, iiu {
    private final iit a;
    private final iiv b;
    private a c;

    public iiw(iit iit, iiv iiv) {
        this.a = iit;
        this.b = iiv;
    }

    public final void a(byte b2, byte[] bArr) {
        this.b.a(b2);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(bArr);
        }
    }

    public final void a(byte b2) {
        this.b.b(b2);
    }

    public final void a(int i, byte[] bArr) {
        this.b.a(i, bArr);
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void a() {
        iit iit = this.a;
        iit.e = this;
        iit.c.execute(iit.g);
    }

    public final void close() {
        this.a.a();
        iiv iiv = this.b;
        iiv.a();
        try {
            iiv.a.close();
        } catch (IOException e) {
            iiv.a(e);
        }
        iiv.b.shutdown();
    }
}
