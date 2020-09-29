package defpackage;

import java.io.EOFException;

/* renamed from: asy reason: default package */
public final class asy {
    private final bdj a = new bdj(10);

    public final awa a(asu asu, a aVar) {
        awa awa = null;
        int i = 0;
        while (true) {
            try {
                asu.c(this.a.a, 0, 10);
                this.a.c(0);
                if (this.a.f() != awo.a) {
                    break;
                }
                this.a.d(3);
                int m = this.a.m();
                int i2 = m + 10;
                if (awa == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    asu.c(bArr, 10, m);
                    awa = new awo(aVar).a(bArr, i2);
                } else {
                    asu.c(m);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        asu.a();
        asu.c(i);
        return awa;
    }
}
