package defpackage;

/* renamed from: vjp reason: default package */
public final class vjp {
    private final vfh a;
    private Boolean b;

    public vjp(vfh vfh) {
        this.a = vfh;
    }

    public final synchronized boolean a() {
        if (this.b == null) {
            this.b = Boolean.valueOf(this.a.a());
        }
        return this.b.booleanValue();
    }
}
