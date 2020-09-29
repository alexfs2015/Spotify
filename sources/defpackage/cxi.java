package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cxi reason: default package */
public final class cxi implements cwi {
    private static final byte[] a = new byte[0];
    private final czv b;
    private final cwi c;

    public cxi(czv czv, cwi cwi) {
        this.b = czv;
        this.c = cwi;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] g = cwy.b(this.b).g();
        byte[] a2 = this.c.a(g, a);
        byte[] a3 = ((cwi) cwy.a(this.b.zzdks, g)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
