package defpackage;

/* renamed from: flk reason: default package */
final class flk extends flm {
    private final short c;
    private final short d;

    flk(flm flm, int i, int i2) {
        super(flm);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(fln fln, byte[] bArr) {
        fln.a(this.c, this.d);
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
