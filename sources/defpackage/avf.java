package defpackage;

import java.util.Arrays;

/* renamed from: avf reason: default package */
final class avf {
    boolean a;
    public byte[] b = new byte[131];
    public int c;
    private final int d;
    private boolean e;

    public avf(int i, int i2) {
        this.d = i;
        this.b[2] = 1;
    }

    public final void a() {
        this.e = false;
        this.a = false;
    }

    public final void a(int i) {
        boolean z = true;
        bcu.b(!this.e);
        if (i != this.d) {
            z = false;
        }
        this.e = z;
        if (this.e) {
            this.c = 3;
            this.a = false;
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.b;
            int length = bArr2.length;
            int i4 = this.c;
            if (length < i4 + i3) {
                this.b = Arrays.copyOf(bArr2, (i4 + i3) << 1);
            }
            System.arraycopy(bArr, i, this.b, this.c, i3);
            this.c += i3;
        }
    }

    public final boolean b(int i) {
        if (!this.e) {
            return false;
        }
        this.c -= i;
        this.e = false;
        this.a = true;
        return true;
    }
}
