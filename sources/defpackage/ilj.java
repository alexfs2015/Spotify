package defpackage;

import java.io.IOException;

/* renamed from: ilj reason: default package */
public final class ilj implements ikm, ilh {
    private final ilg a;
    private final ili b;
    private a c;

    public ilj(ilg ilg, ili ili) {
        this.a = ilg;
        this.b = ili;
    }

    public final void a() {
        ilg ilg = this.a;
        ilg.e = this;
        ilg.c.execute(ilg.g);
    }

    public final void a(byte b2) {
        this.b.b(b2);
    }

    public final void a(byte b2, byte[] bArr) {
        this.b.a(b2);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(bArr);
        }
    }

    public final void a(int i, byte[] bArr) {
        this.b.a(i, bArr);
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void close() {
        this.a.a();
        ili ili = this.b;
        ili.a();
        try {
            ili.a.close();
        } catch (IOException e) {
            ili.a(e);
        }
        ili.b.shutdown();
    }
}
