package defpackage;

/* renamed from: asi reason: default package */
public abstract class asi {
    public int a;

    public void a() {
        this.a = 0;
    }

    public final void a(int i) {
        this.a = i | this.a;
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final boolean c() {
        return b(4);
    }

    public final boolean d() {
        return b(1);
    }

    public final boolean n_() {
        return b(Integer.MIN_VALUE);
    }
}
