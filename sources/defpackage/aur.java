package defpackage;

import java.util.UUID;

/* renamed from: aur reason: default package */
public final class aur {

    /* renamed from: aur$a */
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
        bea bea = new bea(bArr);
        if (bea.c < 32) {
            return null;
        }
        bea.c(0);
        if (bea.i() != bea.b() + 4 || bea.i() != auk.U) {
            return null;
        }
        int a2 = auk.a(bea.i());
        if (a2 > 1) {
            StringBuilder sb = new StringBuilder("Unsupported pssh version: ");
            sb.append(a2);
            bdu.c("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(bea.k(), bea.k());
        if (a2 == 1) {
            bea.d(bea.n() * 16);
        }
        int n = bea.n();
        if (n != bea.b()) {
            return null;
        }
        byte[] bArr2 = new byte[n];
        bea.a(bArr2, 0, n);
        return new a(uuid, a2, bArr2);
    }
}
