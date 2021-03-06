package defpackage;

import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fdq reason: default package */
public abstract class fdq extends fdp {
    private final ByteBuffer a;
    private final int b;
    private final int c;

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract HashCode b();

    protected fdq(int i) {
        this(16, 16);
    }

    private fdq(int i, int i2) {
        fay.a(i2 % i == 0);
        this.a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.b = i2;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(this.c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.c;
            if (position < i) {
                byteBuffer.putLong(0);
            } else {
                byteBuffer.limit(i);
                byteBuffer.flip();
                a(byteBuffer);
                return;
            }
        }
    }

    public final fds b(byte[] bArr, int i, int i2) {
        ByteBuffer order = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.a.remaining()) {
            this.a.put(order);
            c();
            return this;
        }
        int position = this.b - this.a.position();
        for (int i3 = 0; i3 < position; i3++) {
            this.a.put(order.get());
        }
        d();
        while (order.remaining() >= this.c) {
            a(order);
        }
        this.a.put(order);
        return this;
    }

    public final fds b(byte b2) {
        this.a.put(b2);
        c();
        return this;
    }

    public final fds a(char c2) {
        this.a.putChar(c2);
        c();
        return this;
    }

    public final HashCode a() {
        d();
        this.a.flip();
        if (this.a.remaining() > 0) {
            b(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }

    private void c() {
        if (this.a.remaining() < 8) {
            d();
        }
    }

    private void d() {
        this.a.flip();
        while (this.a.remaining() >= this.c) {
            a(this.a);
        }
        this.a.compact();
    }
}
