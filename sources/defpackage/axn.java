package defpackage;

import java.nio.ByteBuffer;

/* renamed from: axn reason: default package */
public final class axn implements aws {
    private final bea a = new bea();
    private final bdz b = new bdz();
    private bek c;

    public final awr a(awu awu) {
        if (this.c == null || awu.f != this.c.a()) {
            this.c = new bek(awu.d);
            this.c.c(awu.d - awu.f);
        }
        ByteBuffer byteBuffer = awu.c;
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
            aVar = new axp();
        } else if (c4 == 255) {
            aVar = axl.a(this.a, c3, c2);
        } else if (c4 == 4) {
            aVar = axq.a(this.a);
        } else if (c4 == 5) {
            aVar = axo.a(this.a, c2, this.c);
        } else if (c4 == 6) {
            aVar = axr.a(this.a, c2, this.c);
        }
        if (aVar == null) {
            return new awr(new a[0]);
        }
        return new awr(aVar);
    }
}
