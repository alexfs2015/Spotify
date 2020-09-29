package defpackage;

/* renamed from: dax reason: default package */
public final class dax {
    private final byte[] a;

    private dax(byte[] bArr, int i) {
        this.a = new byte[i];
        System.arraycopy(bArr, 0, this.a, 0, i);
    }

    public static dax a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new dax(bArr, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
