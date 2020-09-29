package defpackage;

/* renamed from: fnv reason: default package */
final class fnv {
    private final byte[] a;
    private int b = 0;

    fnv(int i) {
        this.a = new byte[i];
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            this.a[i3] = z ? (byte) 1 : 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(int i) {
        byte[] bArr = new byte[(this.a.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.a[i2 / i];
        }
        return bArr;
    }
}
