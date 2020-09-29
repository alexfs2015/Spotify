package defpackage;

/* renamed from: flm reason: default package */
abstract class flm {
    static final flm a = new flk(null, 0, 0);
    final flm b;

    /* access modifiers changed from: 0000 */
    public abstract void a(fln fln, byte[] bArr);

    flm(flm flm) {
        this.b = flm;
    }

    /* access modifiers changed from: 0000 */
    public final flm a(int i, int i2) {
        return new flk(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    public final flm b(int i, int i2) {
        return new flh(this, i, i2);
    }
}
