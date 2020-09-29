package defpackage;

import java.nio.ByteBuffer;

/* renamed from: asm reason: default package */
public class asm extends asi {
    public final asj b = new asj();
    public ByteBuffer c;
    public long d;
    public final int e;

    public asm(int i) {
        this.e = i;
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

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
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
}
