package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* renamed from: wok reason: default package */
final class wok extends woi {
    wok(wnc wnc, int i, int i2) {
        super(wnc, i, i2);
    }

    public final wnb C(int i) {
        x();
        if (i < 0 || i > b()) {
            StringBuilder sb = new StringBuilder("newCapacity: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int c = c();
        int d = d();
        int P = P();
        if (i > P) {
            a(PlatformDependent.a(this.e, i), false);
        } else if (i < P) {
            ByteBuffer byteBuffer = this.e;
            ByteBuffer a = PlatformDependent.a(i);
            if (c < i) {
                if (d > i) {
                    b(i);
                } else {
                    i = d;
                }
                byteBuffer.position(c).limit(i);
                a.position(c).limit(i);
                a.put(byteBuffer);
                a.clear();
            } else {
                a(i, i);
            }
            a(a, true);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer D(int i) {
        return PlatformDependent.a(i);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        PlatformDependent.c(byteBuffer);
    }
}
