package defpackage;

/* renamed from: ljw reason: default package */
public final class ljw {
    private final boolean a;
    private final ka b;

    public ljw(ka kaVar, boolean z) {
        this.b = kaVar;
        this.a = z;
    }

    public final void a() {
        ka kaVar = this.b;
        if (kaVar != null && this.a) {
            kaVar.setRequestedOrientation(1);
        }
    }

    public final void b() {
        ka kaVar = this.b;
        if (kaVar != null && this.a) {
            kaVar.setRequestedOrientation(-1);
        }
    }
}
