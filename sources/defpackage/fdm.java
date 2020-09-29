package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fdm reason: default package */
public abstract class fdm extends fdp {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* access modifiers changed from: protected */
    public abstract void a(byte b);

    protected fdm() {
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(bArr[i3]);
        }
    }

    private fds a(int i) {
        try {
            a(this.a.array(), 0, 2);
            return this;
        } finally {
            this.a.clear();
        }
    }

    public final fds b(byte b) {
        a(b);
        return this;
    }

    public final fds a(byte[] bArr) {
        fay.a(bArr);
        a(bArr, 0, bArr.length);
        return this;
    }

    public final fds b(byte[] bArr, int i, int i2) {
        fay.a(i, i + i2, bArr.length);
        a(bArr, i, i2);
        return this;
    }

    public final fds a(char c) {
        this.a.putChar(c);
        return a(2);
    }
}
