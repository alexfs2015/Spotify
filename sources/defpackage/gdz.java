package defpackage;

/* renamed from: gdz reason: default package */
public abstract class gdz<T> {
    private gdy a;

    /* access modifiers changed from: protected */
    public abstract String c(T t);

    /* access modifiers changed from: protected */
    public abstract byte[] d(T t);

    public gdz(gdy gdy) {
        this.a = gdy;
    }

    public final void a(T t) {
        this.a.a(c(t), d(t));
    }

    public final void b(T t) {
        this.a.b(c(t), d(t));
    }
}
