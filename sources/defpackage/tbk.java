package defpackage;

/* renamed from: tbk reason: default package */
public final class tbk {
    private final tbi a;
    private boolean b;

    public tbk(tbi tbi) {
        this.a = tbi;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        this.b = true;
        return this.a.a;
    }
}
