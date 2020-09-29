package defpackage;

/* renamed from: vwv reason: default package */
public final class vwv {
    private final vsh a;
    private Boolean b;

    public vwv(vsh vsh) {
        this.a = vsh;
    }

    public final synchronized boolean a() {
        if (this.b == null) {
            this.b = Boolean.valueOf(this.a.a());
        }
        return this.b.booleanValue();
    }
}
