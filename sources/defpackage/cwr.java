package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cwr reason: default package */
public final class cwr implements cvr {
    private static final byte[] a = new byte[0];
    private final cze b;
    private final cvr c;

    public cwr(cze cze, cvr cvr) {
        this.b = cze;
        this.c = cvr;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] g = cwh.b(this.b).g();
        byte[] a2 = this.c.a(g, a);
        byte[] a3 = ((cvr) cwh.a(this.b.zzdks, g)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
