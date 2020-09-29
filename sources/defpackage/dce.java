package defpackage;

/* renamed from: dce reason: default package */
public final class dce {
    private final byte[] a = new byte[256];
    private int b;
    private int c;

    public dce(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        byte b2 = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.a;
            b2 = (b2 + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            byte b3 = bArr2[i2];
            bArr2[i2] = bArr2[b2];
            bArr2[b2] = b3;
        }
        this.b = 0;
        this.c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.b;
        int i2 = this.c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b2 = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.b = i;
        this.c = i2;
    }
}
