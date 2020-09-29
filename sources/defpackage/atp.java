package defpackage;

import java.io.EOFException;

/* renamed from: atp reason: default package */
public final class atp {
    private final bea a = new bea(10);

    public final awr a(atl atl, a aVar) {
        awr awr = null;
        int i = 0;
        while (true) {
            try {
                atl.c(this.a.a, 0, 10);
                this.a.c(0);
                if (this.a.f() != axf.a) {
                    break;
                }
                this.a.d(3);
                int m = this.a.m();
                int i2 = m + 10;
                if (awr == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    atl.c(bArr, 10, m);
                    awr = new axf(aVar).a(bArr, i2);
                } else {
                    atl.c(m);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        atl.a();
        atl.c(i);
        return awr;
    }
}
