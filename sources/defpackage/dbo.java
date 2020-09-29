package defpackage;

/* renamed from: dbo reason: default package */
public final class dbo {
    private final byte[] a;

    private dbo(byte[] bArr, int i) {
        this.a = new byte[i];
        System.arraycopy(bArr, 0, this.a, 0, i);
    }

    public static dbo a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new dbo(bArr, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
