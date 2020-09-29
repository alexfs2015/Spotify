package defpackage;

/* renamed from: ehy reason: default package */
final class ehy implements Runnable {
    private final /* synthetic */ ehs a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    ehy(ehs ehs, String str, String str2) {
        this.a = ehs;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        e eVar;
        synchronized (this.a.q) {
            eVar = (e) this.a.q.get(this.b);
        }
        if (eVar != null) {
            eVar.a(this.a.o, this.c);
            return;
        }
        ehs.a.a("Discarded message for unknown namespace '%s'", this.b);
    }
}
