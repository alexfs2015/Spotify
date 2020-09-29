package defpackage;

/* renamed from: lnw reason: default package */
public final class lnw {
    private final boolean a;
    private final kf b;

    public lnw(kf kfVar, boolean z) {
        this.b = kfVar;
        this.a = z;
    }

    public final void a() {
        kf kfVar = this.b;
        if (kfVar != null && this.a) {
            kfVar.setRequestedOrientation(1);
        }
    }

    public final void b() {
        kf kfVar = this.b;
        if (kfVar != null && this.a) {
            kfVar.setRequestedOrientation(-1);
        }
    }
}
