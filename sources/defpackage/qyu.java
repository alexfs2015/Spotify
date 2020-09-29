package defpackage;

/* renamed from: qyu reason: default package */
public final class qyu {
    qyt a;
    private final who<qym> b;
    private final qyb c;

    public qyu(who<qym> who, qyb qyb) {
        this.c = qyb;
        this.b = who;
    }

    public final qyt a(hqr hqr, hpt hpt) {
        qyt qyt = this.a;
        if (qyt != null) {
            if (qyt.b.d().equals(hqr.d())) {
                return this.a;
            }
            this.a.b();
        }
        this.a = new qyt(hqr, hpt, (qym) this.b.get(), this.c);
        return this.a;
    }
}
