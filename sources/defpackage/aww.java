package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aww reason: default package */
public final class aww implements awb {
    private final bdj a = new bdj();
    private final bdi b = new bdi();
    private bdt c;

    public final awa a(awd awd) {
        if (this.c == null || awd.f != this.c.a()) {
            this.c = new bdt(awd.d);
            this.c.c(awd.d - awd.f);
        }
        ByteBuffer byteBuffer = awd.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.a(array, limit);
        this.b.a(array, limit);
        this.b.b(39);
        long c2 = (((long) this.b.c(1)) << 32) | ((long) this.b.c(32));
        this.b.b(20);
        int c3 = this.b.c(12);
        int c4 = this.b.c(8);
        a aVar = null;
        this.a.d(14);
        if (c4 == 0) {
            aVar = new awy();
        } else if (c4 == 255) {
            aVar = awu.a(this.a, c3, c2);
        } else if (c4 == 4) {
            aVar = awz.a(this.a);
        } else if (c4 == 5) {
            aVar = awx.a(this.a, c2, this.c);
        } else if (c4 == 6) {
            aVar = axa.a(this.a, c2, this.c);
        }
        if (aVar == null) {
            return new awa(new a[0]);
        }
        return new awa(aVar);
    }
}
