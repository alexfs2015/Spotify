package defpackage;

import java.util.UUID;

/* renamed from: aua reason: default package */
public final class aua {

    /* renamed from: aua$a */
    public static class a {
        public final UUID a;
        public final int b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static UUID a(byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        return b.a;
    }

    public static a b(byte[] bArr) {
        bdj bdj = new bdj(bArr);
        if (bdj.c < 32) {
            return null;
        }
        bdj.c(0);
        if (bdj.i() != bdj.b() + 4 || bdj.i() != att.U) {
            return null;
        }
        int a2 = att.a(bdj.i());
        if (a2 > 1) {
            StringBuilder sb = new StringBuilder("Unsupported pssh version: ");
            sb.append(a2);
            bdd.c("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(bdj.k(), bdj.k());
        if (a2 == 1) {
            bdj.d(bdj.n() * 16);
        }
        int n = bdj.n();
        if (n != bdj.b()) {
            return null;
        }
        byte[] bArr2 = new byte[n];
        bdj.a(bArr2, 0, n);
        return new a(uuid, a2, bArr2);
    }
}
