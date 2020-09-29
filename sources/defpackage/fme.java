package defpackage;

/* renamed from: fme reason: default package */
final class fme extends fmg {
    private final short c;
    private final short d;

    fme(fmg fmg, int i, int i2) {
        super(fmg);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(fmh fmh, byte[] bArr) {
        fmh.a(this.c, this.d);
    }

    public final String toString() {
        short s = this.c;
        short s2 = this.d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s3 | (1 << this.d)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
