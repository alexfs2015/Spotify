package defpackage;

/* renamed from: wui reason: default package */
public abstract class wui<T> implements wuk {
    private final wxu a = new wxu();

    public abstract void a(T t);

    public abstract void a(Throwable th);

    public final void a(wuk wuk) {
        this.a.a(wuk);
    }

    public final void unsubscribe() {
        this.a.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }
}
