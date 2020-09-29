package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fee reason: default package */
public abstract class fee extends feh {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    protected fee() {
    }

    private fek a(int i) {
        try {
            a(this.a.array(), 0, 2);
            return this;
        } finally {
            this.a.clear();
        }
    }

    public final fek a(char c) {
        this.a.putChar(c);
        return a(2);
    }

    public final fek a(byte[] bArr) {
        fbp.a(bArr);
        a(bArr, 0, bArr.length);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte b);

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(bArr[i3]);
        }
    }

    public final fek b(byte b) {
        a(b);
        return this;
    }

    public final fek b(byte[] bArr, int i, int i2) {
        fbp.a(i, i + i2, bArr.length);
        a(bArr, i, i2);
        return this;
    }
}
