package defpackage;

import java.nio.ByteBuffer;

/* renamed from: arv reason: default package */
public class arv extends arr {
    public final ars b = new ars();
    public ByteBuffer c;
    public long d;
    public final int e;

    public arv(int i) {
        this.e = i;
    }

    public final void c(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = d(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer d2 = d(i2);
            if (position > 0) {
                this.c.position(0);
                this.c.limit(position);
                d2.put(this.c);
            }
            this.c = d2;
        }
    }

    public final boolean e() {
        return b(1073741824);
    }

    public final void f() {
        this.c.flip();
    }

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private ByteBuffer d(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
