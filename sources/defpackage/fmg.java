package defpackage;

/* renamed from: fmg reason: default package */
abstract class fmg {
    static final fmg a = new fme(null, 0, 0);
    final fmg b;

    fmg(fmg fmg) {
        this.b = fmg;
    }

    /* access modifiers changed from: 0000 */
    public final fmg a(int i, int i2) {
        return new fme(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(fmh fmh, byte[] bArr);

    /* access modifiers changed from: 0000 */
    public final fmg b(int i, int i2) {
        return new fmb(this, i, i2);
    }
}
